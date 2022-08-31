package br.senai.jandira.sp.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.senai.jandira.sp.model.Clientes;

public class Frame {
	public String titulo;
	public int largura;
	public int altura;

	// Cores
	Color Roxo = new Color(192, 0, 255);
	Color Branco = new Color(255, 255, 255);
	Color Cinza = new Color(48, 50, 51);

	public void criarTela() {
		JFrame tela = new JFrame();
		tela.setTitle(titulo);
		tela.setSize(largura, altura);
		tela.getContentPane().setBackground(Cinza);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);

		// Obter o container para colocar componentes dentro dele
		Container painel = tela.getContentPane();

		// Fontes
		// Criar os componentes que serão colocados no container
		JLabel tituloText = new JLabel();
		tituloText.setText("IMC");
		tituloText.setBounds(150, 40, 400, 30);
		tituloText.setFont(new Font("monospace", Font.BOLD, 40));
		tituloText.setForeground(Roxo);

		JLabel painelNome = new JLabel();
		painelNome.setText("Nome");
		painelNome.setForeground(Branco);
		painelNome.setBounds(30, 70, 200, 30);
		JTextField caixaNome = new JTextField();
		caixaNome.setBounds(30, 100, 250, 30);

		JLabel painelPeso = new JLabel();
		painelPeso.setText("Peso");
		painelPeso.setForeground(Branco);
		painelPeso.setBounds(30, 170, 200, 30);
		JTextField caixaPeso = new JTextField();
		caixaPeso.setBounds(30, 200, 150, 30);

		JLabel painelAltura = new JLabel();
		painelAltura.setText("Altura");
		painelAltura.setForeground(Branco);
		painelAltura.setBounds(30, 270, 200, 30);
		JTextField caixaAltura = new JTextField();
		caixaAltura.setBounds(30, 300, 150, 30);

		JLabel painelData = new JLabel();
		painelData.setText("Data");
		painelData.setForeground(Branco);
		painelData.setBounds(30, 370, 200, 30);
		JTextField caixaData = new JTextField();
		caixaData.setBounds(30, 400, 150, 30);

		JButton botaoCalcular = new JButton();
		botaoCalcular.setText("Calcular");
		botaoCalcular.setBounds(250, 400, 100, 30);
		botaoCalcular.setForeground(Branco);
		botaoCalcular.setBackground(Roxo);

		JLabel resultadoImc = new JLabel();
		resultadoImc.setForeground(Branco);
		resultadoImc.setText("Seu IMC ...");
		resultadoImc.setBounds(30, 440, 200, 30);

		JLabel resultadoStatus = new JLabel();
		resultadoStatus.setForeground(Branco);
		resultadoStatus.setText("Seu Status IMC ...");
		resultadoStatus.setBounds(30, 470, 200, 30);

		JLabel resultadoData = new JLabel();
		resultadoData.setForeground(Branco);
		resultadoData.setText("Sua Idade é ...");
		resultadoData.setBounds(30, 500, 200, 30);
		// Colocando os componente dentro do Container

		painel.add(tituloText);
		painel.add(painelNome);
		painel.add(caixaNome);
		painel.add(painelPeso);
		painel.add(caixaPeso);
		painel.add(painelAltura);
		painel.add(caixaAltura);
		painel.add(painelData);
		painel.add(caixaData);
		painel.add(botaoCalcular);

		painel.add(resultadoImc);
		painel.add(resultadoStatus);
		painel.add(resultadoData);

		tela.setVisible(true);
		
		//detectar alguma ação no botão
		botaoCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				Clientes cliente = new Clientes();
				cliente.nome = caixaNome.getText();
				cliente.peso = Integer.parseInt(caixaPeso.getText());
				cliente.altura = Double.parseDouble(caixaAltura.getText());
				resultadoImc.setText(String.format("%.2f", cliente.getImc()));
				resultadoStatus.setText(cliente.getStatusImc());
				
				
				//Determinar a idade do Cliente
				 String[] data = caixaData.getText().split("/");
			int dia = Integer.parseInt(data[0]);
			int mes = Integer.parseInt(data[1]);
			int ano = Integer.parseInt(data[2]);
			
				cliente.dataDeNascimento = LocalDate.of(ano, mes, dia);
				resultadoData.setText("Você tem " + cliente.getIdade() +  " Anos");
			}
		});
				
				
		 

		
	}
}
	
