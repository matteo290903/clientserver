/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.cscountdown;

/**
 *
 * @author Studente
 */
public class StartServer  {

    public static void main(String[] args) {
        Server srv = new Server(2000);
        srv.ascolto();
        srv.scrivi("benvenuto client");
                
    }
}
