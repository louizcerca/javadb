/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Luiz
 */
public class main extends JFrame {
    static JFrame janela;
    Container teste;
    public main(){
                janela = new JFrame("Primeira janela do Luiz Cerca");
		janela.setResizable(false);
	
		janela.setTitle("test");
		janela.setBounds(350, 100, 295, 490); // PosiçãoInicial(x, y, largura, altura)
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                janela.setVisible(true);

		teste = janela.getContentPane();
                
                 JButton hue = new JButton();
        
        hue.setBounds(40, 40, 40, 40);
        hue.setSize(80, 80);
        hue.setText("testar");
        JLabel texto = new JLabel("");
        //texto.setBounds(100,100,100,100);
        //panel.add(hue);
        //panel.add(texto);
        //teste.add(texto, BorderLayout.SOUTH);
        //teste.add(panel, BorderLayout.CENTER);
      
        JLabel labelcpf = new JLabel();
	labelcpf.setBounds(5, 15, 50, 100);
	labelcpf.setText("cpf do aluno");
	labelcpf.setOpaque(false);
	
	JTextField cpf = new JTextField(30);
	cpf.setBounds(60,15,270,20);
	cpf.setEditable(true);
	cpf.setHorizontalAlignment(JTextField.LEFT);
		
	JLabel labelnome = new JLabel();
	labelnome.setBounds(5,65,270,20);
	labelnome.setText("Nome do Aluno");
	labelnome.setOpaque(false);
		
	JTextField nome = new JTextField(30);
	nome.setBounds(5,90,270,25);
	nome.setEditable(true);
	//nome.setFont(display);
	//nome.setHorizontalAlignment(JTextField.LEFT);
        hue.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
            try{
                String busca = nome.getText();
                Conexao.pr = busca;
                Conexao.Conectar();
                  
               texto.setText("Acertooo");
            } catch(Exception e){
              texto.setText("errou");
            }
        }
        });
  
        teste.add(labelnome);
        teste.add(nome);
        //teste.add(cpf);
        //teste.add(labelcpf);
        teste.add(hue);
        teste.setVisible(true);
        teste.repaint();
      
                }
}
    

