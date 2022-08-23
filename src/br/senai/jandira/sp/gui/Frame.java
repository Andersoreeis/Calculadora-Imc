package br.senai.jandira.sp.gui;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Frame {
	public String titulo;
	public int largura;
	public int altura;
	
	public void criarTela() {
		JFrame tela = new JFrame();
		tela.setTitle(titulo);
		tela.setSize(largura, altura);
		tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		tela.setLayout(null);
	
		
		// Obter o container para colocar componentes dentro dele
		 Container painel =  tela.getContentPane();
		
		 // Criar os componentes que serão colocados no container
		 JButton botaoCalcular = new JButton();
		 botaoCalcular.setText("Calcular");
		 botaoCalcular.setBounds(30, 30, 100, 30);
		 JTextField texto = new JTextField();
		 texto.setBounds(30, 90, 200, 30);
		
		 
		 // Colocando os componente dentro do Container
		 
		 painel.add(botaoCalcular);
		 painel.add(texto);
		 
		
		tela.setVisible(true);
		
	}
	

}
