package br.com.Atividades;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
	
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Escreva um numero:");
		int num = scan.nextInt();
		int fat =1;
		
		for (int i =2; i<= num; i++) {
			fat*=i;
		}
		System.out.println("O fatorial de "+num+ " é igual a "+fat);
	}

}
