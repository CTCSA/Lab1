package Q2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Client {
    
    public void doAction(){
        /* Q1
        System.out.println("Client: doAction");
                Server s = new Server2();
                s.doService();
        */
        ServerInterface si = new Server();
        System.out.println("Client: do Action");
        si.doService();
    }
    }
    
