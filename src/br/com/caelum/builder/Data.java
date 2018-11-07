package br.com.caelum.builder;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {
	
	public Mes dia(int dia) {
		return new Mes(dia);
	}
	
		public class Mes{
			private int dia;
			
			public Mes(int dia) {this.dia = dia;}
	
			public Ano mes(int mes) {
				return new Ano(this.dia, mes);
			}
		}
		
		public class Ano{
			private int dia;
			private int mes;
			
			public Ano(int dia, int mes) {this.dia = dia;this.mes = mes;}
			
			@SuppressWarnings("deprecation")
			public Date ano(int ano) {
				return new Date(ano, mes, dia);
			}
		}
	
	
	public static void main(String[] args) {
		Date data = new Data().dia(5).mes(12).ano(2018);
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		String dataFormatada = formato.format(data);
		
		System.out.println(dataFormatada);
	}
}
