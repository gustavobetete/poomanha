package br.edu.fatecmm.calculadoraGUI;

import br.edu.fatecmm.calculadoraGUI.view.CalculadoraGUI;

import javax.swing.*;

public class ExecutarCalculadora {

    public static void main(String[] args) {
	// write your code here
        JFrame tela = new JFrame();
        tela.setContentPane(new CalculadoraGUI().getPanelCalculadora());
        tela.setSize(320,320);
        tela.setLocation((1920-320)/2, (1080-320)/2);
        tela.setTitle("Calculadora");
        tela.setResizable(false);
        tela.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        tela.setVisible(true);
    }
}
