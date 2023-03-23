/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios;

/**
 *
 * @author CAMARGO
 */
public class Ex03 {

    public static void main(String[] args) {
        int x = 0;
        int y = 1;
        int i;
        int z;
        
        System.out.println(x);
         System.out.println(y);

        for (i = 0; i < 11; i++) {

          
            z = x + y;
            System.out.println(z);
              x = y;
            y = z;

        }
       
    }
}
