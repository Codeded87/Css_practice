/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author john
 */
public class Bubble_sorting {
    
    static void bubble(int A[],int n){
//       static temp = 0;
    
        for(int i= 0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(A[j] > A[j + 1]){
                    int temp = 0;
                    temp  = A[j + 1];
                    A[j+1] = A[j];
                    A[j] = temp;
                }
            }
    }
        for(int i=0;i<n;i++){
        System.out.println(A[i]);
}}
    @SuppressWarnings("empty-statement")
    public static void main(String args[]){
      int A[] ={22,2,23,43,12,54};
      int n = A.length;
      System.out.println("Hello world");
      for(int i = 0;i<n-1;i++){
      System.out.println(A[i]);}
      bubble(A,n);
      
    }
    
}
