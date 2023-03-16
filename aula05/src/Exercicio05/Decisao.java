/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio05;

import javax.swing.JOptionPane;

/**
 *
 * @author CAMARGO
 */
public class Decisao {

    void idade() {

        try {
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Diigte sua idade"));

            if (idade >= 18) {
                System.out.println(" maior");
            } else {
                System.out.println(" menor");
            }
        } catch (Exception e) {
            System.out.println("Caractere inválido digite novamente");
        }
    }

    void Soma() {

        try {
            int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A: "));
            int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B: "));

            int Soma = a + b;

            JOptionPane.showMessageDialog(null, " O valor da soma é: " + Soma);
        } catch (Exception e) {
            System.out.println("Caractere inválido digite novamente");
        }
    }

    void Sub() {

        try {
            int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A: "));
            int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B: "));

            int Sub = a - b;

            JOptionPane.showMessageDialog(null, " O valor da subtração é: " + Sub);
        } catch (Exception e) {
            System.out.println("Caractere inválido digite novamente");
        }
    }

    void Mult() {

        try {
            int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A: "));
            int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B: "));

            int Mult = a * b;

            JOptionPane.showMessageDialog(null, " O valor da soma é: " + Mult);
        } catch (Exception e) {
            System.out.println("Caractere inválido digite novamente");
        }
    }
void Div() {

        try {
            int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A: "));
            int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B: "));

            int Div = a / b;

            JOptionPane.showMessageDialog(null, " O valor da soma é: " + Div);
        } catch (Exception e) {
            System.out.println("Caractere inválido digite novamente");
        }
    }
}
