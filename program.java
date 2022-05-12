package application;

import java.util.Scanner;

import entidades.retangulo;

public class program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		retangulo ret = new retangulo();
		
		
		System.out.println("Digite a largura e a altura do retângulo: ");
		ret.altura = sc.nextDouble();
		ret.largura = sc.nextDouble();
		
		System.out.printf("Área = %.2f%n", ret.medeArea());
		System.out.printf("Perímetro: %.2f%n", ret.medePerimetro());
		System.out.printf("Diagonal: %.2f", ret.medeDiagonal());		
		
		
		sc.close();

	}

}
