package br.edu.fatecmm.controledecaixagui.view;

import br.edu.fatecmm.controledecaixagui.model.Caixa;
import br.edu.fatecmm.controledecaixagui.utils.SemSaldoException;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CaixaGUI2 {
    private JPanel panelCaixa;
    private JTextField txtValor;
    private JTextField txtSaldo;
    private JButton cmdEntrada;
    private JButton cmdRetirada;
    private JButton cmdConsulta;
    private JButton cmdSair;
    private JTextArea txtMsg;
    private JLabel lblValor;
    private JLabel lblSaldo;
    private Caixa caixa;

    public CaixaGUI2() {
        caixa = new Caixa();
        cmdEntrada.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
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
        });
        cmdRetirada.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    double valor = Double.parseDouble(txtValor.getText());

                    caixa.sacar(valor);
                    JOptionPane.showMessageDialog(null,
                            "Saque efetuado",
                            "Saque",
                            JOptionPane.INFORMATION_MESSAGE);
                    txtMsg.append("Saque de " + valor + " foi efetuado com sucesso\n");
                    txtValor.setText("");
                    txtValor.requestFocus(); //Colocar o foco no controle.
                } catch (SemSaldoException semSaldoException) {
                    JOptionPane.showMessageDialog(null,
                            "Sem saldo suficiente",
                            "Erro",
                            JOptionPane.ERROR_MESSAGE);
                }catch(NumberFormatException exception){
                    JOptionPane.showMessageDialog(null,
                            "Entrada de dados inválida",
                            "Erro",
                            JOptionPane.ERROR_MESSAGE);
                }

            }
        });
        cmdConsulta.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                txtValor.setText("");
                double valor = caixa.getSaldo();
                txtSaldo.setText(Double.toString(valor));
            }
        });
        cmdSair.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(null,
                        "Fechando o Aplicativo de Caixa",
                        "Fechando",
                        JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }
        });
    }

    public JPanel getPanelCaixa() {
        return panelCaixa;
    }
}
