package Procedimento;

import javax.swing.JOptionPane;

public class Operador {

    void soma() {

        int a = Integer.parseInt(JOptionPane.showInputDialog(" Digite o valor A: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog(" Digite o valor B: "));
        int soma = a + b;

        JOptionPane.showMessageDialog(null, "O valor da soma: " + soma);
    }

    void multiplicacao() {
        int a = Integer.parseInt(JOptionPane.showInputDialog(" Digite o valor A: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog(" Digite o valor B: "));
        int multiplicacao = a * b;

        JOptionPane.showMessageDialog(null, "O valor da multiplicação: " + multiplicacao);
    }

    void divisao() {
        int a = Integer.parseInt(JOptionPane.showInputDialog(" Digite o valor A: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog(" Digite o valor B: "));
        int divisao = a / b;
        JOptionPane.showMessageDialog(null, "O valor da divisão: " + divisao);

    }

    void subtracao() {

        int a = Integer.parseInt(JOptionPane.showInputDialog(" Digite o valor A: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog(" Digite o valor A: "));
        int subtracao = a - b;

        JOptionPane.showMessageDialog(null, "O valor da subtração: " + subtracao);
    }

}
