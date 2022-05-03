/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package cscountdown;

import com.mycompany.cscountdown.CountDown;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
*
* @author lbren
*/
public class Server {
ServerSocket ss;
Socket so;
BufferedWriter bw;
BufferedReader br;
public Server(int porta){
try {
//apertura del server socket
ss = new ServerSocket(porta);
System.out.println("il server è' in ascolto");
CountDown c = new CountDown(1000);
c.start();

} catch (IOException ex) {
Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
}
}
public void inAscolto(){
try {
so = ss.accept();
System.out.println("connessione stabilita");
} catch (IOException ex) {
Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
}
}
public void Scrivi(String messaggio){
try {
bw = new BufferedWriter(new OutputStreamWriter(so.getOutputStream()));
bw.write(messaggio+"\n");
bw.flush();
} catch (IOException ex) {
Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
}
}
}