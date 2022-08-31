package br.senai.jandira.sp.model;

import java.time.LocalDate;

import br.senai.jandira.sp.gui.Frame;

public class AppaAcademia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Frame tela = new Frame();
		tela.titulo = " Calculadora IMC";
		tela.altura = 580;
		tela.largura = 400;
		tela.criarTela();

		Clientes maria = new Clientes();
		maria.nome = "Maria Antonieta";
		maria.peso = 57;
		maria.altura = 1.80;
		maria.dataDeNascimento = LocalDate.of(2005, 05, 23);

		Clientes pedro = new Clientes();
		pedro.nome = "Pedro Alvares Cabral";
		pedro.peso = 78.5;
		pedro.altura = 1.74;
		pedro.dataDeNascimento = LocalDate.of(2000, 03, 29);

		System.out.println(" O IMC do(a) é " + maria.getImc());
		System.out.println(" O IMC do(a) é " + pedro.getImc());

		System.out.println(" Sua idade é " + maria.getIdade());
		System.out.println(" Sua idade é " + pedro.getIdade());
		System.out.println(maria.nome + ", Classificação " + maria.getStatusImc());
		System.out.println(pedro.nome + ", Classificação " + pedro.getStatusImc());

		if (maria.getIdade() >= 21) {
			System.out.printf(" %s Está liberada para fazer o processo", maria.nome);
		} else {
			System.out.printf(" %s, Perdão você não pode realizar esse processo", maria.nome);
		}
	}

}
