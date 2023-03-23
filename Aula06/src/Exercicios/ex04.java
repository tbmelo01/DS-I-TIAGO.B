/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios;

/**
 *
 * @author CAMARGO
 */
public class ex04 {

    void loop() {
        int par = 0;
        int impar = 0;
        for (int i = 1; i <= 100; i++) {

            if (i % 2 == 0) {
                System.out.println(i + " Par ");
                par = i + par;
            } else {
                System.out.println(i + " Impar ");
                impar = i + impar;
            }

        }
        System.out.println(" Soma dos Pares: " + par);
        System.out.println(" Soma dos Imares: " + impar);
        if (par > impar) {
            System.out.println(" A soma dos pares é maior ");
        } else {
            System.out.println(" A soma dos impares é maior ");
        }
    }
}
