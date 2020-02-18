/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_learning;

/**
 *
 * @author john
 */
public class NewThread extends Thread{
    public void run(){
        for(int i =0;i<10;i++){
            
    System.out.println("thread");
        }
    }
    public static void main(String args[]){
        Thread t1 = new Thread(new NewThread());
        t1.start();
    }
    
}
