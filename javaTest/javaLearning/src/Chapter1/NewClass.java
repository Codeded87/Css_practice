/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter1;

/**
 *
 * @author john
 */
public class NewClass {
    public static void main(String args[]){
        String str = "123";
        Integer i = Integer.valueOf(str);
        int x = Integer.parseInt(str);
        int f = i.intValue();
        System.out.println(f);
        System.out.println(x);
        
    }
}
