/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcao;

import javax.swing.JOptionPane;

/**
 *
 * @author CAMARGO
 */
public class Ex01 {

    void Tri() {
        try {
            int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da sua base(B): "));
            int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de altura(H): "));
            int c = 2;

            int Tri = (a + b) / c;

            JOptionPane.showMessageDialog(null, "A área do seu triângulo é: " + Tri);
        } catch (Exception e) {
            System.out.println("Caractere inválido digite novamente");
        }

    }

    void Ret() {
        try {
            int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da sua base(B): "));
            int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de altura(H): "));

            int Ret = (a * b);

            JOptionPane.showMessageDialog(null, "A área do seu retangulo é: " + Ret);
        } catch (Exception e) {
            System.out.println("Caractere inválido digite novamente");
        }
    }
    
    void Qua(){
        try {
            int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da sua base(B): "));
            int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de altura(H): "));

            int Qua = ((a*a)*(b*b));

            JOptionPane.showMessageDialog(null, "A área do seu quadrado é: " + Qua);
        } catch (Exception e) {
            System.out.println("Caractere inválido digite novamente");
        }
}
    }

