package br.edu.fatecmm.controledecaixagui;

import br.edu.fatecmm.controledecaixagui.view.CaixaGUI;
import br.edu.fatecmm.controledecaixagui.view.CaixaGUI2;

import javax.swing.*;
import java.awt.*;

public class GerenciarCaixa {

    public static void main(String[] args) {
	    //Abrir a janela do caixa
        //CaixaGUI tela = new CaixaGUI();
        //tela.setVisible(true);
        JFrame tela = new JFrame();
        tela.setContentPane(new CaixaGUI2().getPanelCaixa());
        tela.setTitle("Controle de Caixa");
        tela.setSize(400,400);
        tela.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        tela.setVisible(true);
    }
}
