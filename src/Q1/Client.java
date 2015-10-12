package Q1;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Client {
    
    public void doAction(){
        System.out.println("Client: doAction");
                Server s = new Server2();
                s.doService();
    }
    }
    
