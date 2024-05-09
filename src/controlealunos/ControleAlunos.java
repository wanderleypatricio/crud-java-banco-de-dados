/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlealunos;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class ControleAlunos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        a biblioteca Scanner serve para que o 
        usuário possa dar entrada de dados e ver o 
        resultado.
        */
        Scanner sc = new Scanner(System.in);
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Informe outro número"));
        double imc = peso/(altura*altura);
        JOptionPane.showMessageDialog(null,imc);    
    }
    
}
