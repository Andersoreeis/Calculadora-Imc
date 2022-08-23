package br.senai.jandira.sp.model;

import java.time.LocalDate;
import java.time.Period;

public class Clientes {

	public String nome;
	public double peso;
	public double altura;
	public LocalDate dataDeNascimento;

	public double getImc() {

		return peso / Math.pow(altura, 2);
	}

	public int getIdade() {
		Period p = Period.between(dataDeNascimento, LocalDate.now());
		return p.getYears();
	}

	public String getStatusImc() {

		if (getImc() <= 18.5) {
			return "Abaixo do peso";
		} else if (getImc() >= 18.5 && getImc() <= 24.9) {
			return "Peso ideal (Parabéns)";
		} else if (getImc() >= 25.0 && getImc() <= 29.9) {
			return "Obesidade Grau I";
		} else if (getImc() >= 29.9 && getImc() <= 34.9) {
			return "Obesidade grau II (severa)";
		} else if (getImc() >= 34.9 && getImc() <= 39.9) {
			return "Obesidade grau II (severa)";
		} else {
			return "Obesidade grau III (mórbida)";
		}
	}
}
