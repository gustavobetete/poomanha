package br.edu.fatecmm.controledecaixagui.view;

import br.edu.fatecmm.controledecaixagui.model.Caixa;
import br.edu.fatecmm.controledecaixagui.utils.SemSaldoException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class CaixaGUI extends JFrame implements ActionListener, WindowListener {
    //Atributos da classe
    private Dimension dFrame, dLabel, dTextField, dButton, dTextArea;
    private Label lblValor, lblSaldo;
    private TextField txtValor, txtSaldo;
    private Button cmdEntrada, cmdRetirada, cmdConsulta, cmdSair;
    private TextArea txtMsg;
    //Atributo associado da Classe Caixa
    private Caixa caixa;


    //Aparencia e o comportamento da janela - definimos no construtor
    public CaixaGUI(){
        caixa = new Caixa();
        dFrame = new Dimension(400,400);
        dLabel = new Dimension(40, 20);
        dTextField = new Dimension(150, 20);
        dButton = new Dimension(95,20);
        dTextArea = new Dimension(300, 140);
        //Definindo aparência da janela
        setSize(dFrame);
        setTitle("Controle de Caixa");
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocation(700, 350);
        //Ter a liberdade de escolher a posição onde quero colocar os elementos
        setLayout(null);

        //Labels
        lblValor = new Label("Valor:");
        lblValor.setSize(dLabel);
        lblValor.setLocation(25,50);
        add(lblValor);

        lblSaldo = new Label("Saldo:");
        lblSaldo.setSize(dLabel);
        lblSaldo.setLocation(25,80);
        add(lblSaldo);

        //TextField
        txtValor = new TextField(null);
        txtValor.setSize(dTextField);
        txtValor.setLocation(75, 50);
        add(txtValor);

        txtSaldo = new TextField(null);
        txtSaldo.setSize(dTextField);
        txtSaldo.setLocation(75, 80);
        add(txtSaldo);

        //Button
        cmdEntrada = new Button("Entrada");
        cmdEntrada.setSize(dButton);
        cmdEntrada.setLocation(25,150);
        cmdEntrada.addActionListener(this);
        add(cmdEntrada);

        cmdConsulta = new Button("Consulta");
        cmdConsulta.setSize(dButton);
        cmdConsulta.setLocation(25,185);
        cmdConsulta.addActionListener(this);
        add(cmdConsulta);

        cmdRetirada = new Button("Retirada");
        cmdRetirada.setSize(dButton);
        cmdRetirada.setLocation(180,150);
        cmdRetirada.addActionListener(this);
        add(cmdRetirada);

        cmdSair = new Button("Sair");
        cmdSair.setSize(dButton);
        cmdSair.setLocation(180,185);
        cmdSair.addActionListener(this);
        add(cmdSair);

        //TextArea
        txtMsg = new TextArea(null);
        txtMsg.setSize(dTextArea);
        txtMsg.setLocation(25, 220);
        add(txtMsg);
        addWindowListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==cmdSair){
            JOptionPane.showMessageDialog(null,
                    "Fechando o Aplicativo de Caixa",
                    "Fechando",
                    JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
        //Depositar
        if(e.getSource()==cmdEntrada){
            double valor = Double.parseDouble(txtValor.getText());
            boolean depositou =  caixa.depositar(valor);
            if(depositou){
                JOptionPane.showMessageDialog(null,
                        "Depósito efetuado",
                        "Depósito",
                        JOptionPane.INFORMATION_MESSAGE);
                txtMsg.append("Depósito de " + valor + " foi efetuado com sucesso\n");
            }else{
                JOptionPane.showMessageDialog(null,
                        "Erro no valor informado",
                        "Erro",
                        JOptionPane.ERROR_MESSAGE);
            }
            txtValor.setText("");
            txtValor.requestFocus(); //Colocar o foco no controle.
        }
        if(e.getSource()==cmdRetirada){
            double valor = Double.parseDouble(txtValor.getText());
            boolean sacou = false;
            try {
                caixa.sacar(valor);
                JOptionPane.showMessageDialog(null,
                        "Saque efetuado",
                        "Saque",
                        JOptionPane.INFORMATION_MESSAGE);
                txtMsg.append("Saque de " + valor + " foi efetuado com sucesso\n");
            } catch (SemSaldoException semSaldoException) {
                JOptionPane.showMessageDialog(null,
                         semSaldoException.getMessage(),
                        "Erro",
                        JOptionPane.ERROR_MESSAGE);
            }

            txtValor.setText("");
            txtValor.requestFocus(); //Colocar o foco no controle.
        }
        if(e.getSource()==cmdConsulta){
            txtValor.setText("");
            double valor = caixa.getSaldo();
            txtSaldo.setText(Double.toString(valor));
        }

    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        JOptionPane.showMessageDialog(null,
                "Fechando o Aplicativo de Caixa",
                "Fechando",
                JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
