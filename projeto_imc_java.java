/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

class Projetoimc
{
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println("Digite seu peso (Kg): ");
		Scanner teclado = new Scanner(System.in);
		
		float peso = teclado.nextFloat();
		
		System.out.println("Digite sua altura (metros): ");
		
		float altura = teclado.nextFloat();
		
		float imc = peso / (altura*altura);
		
		System.out.println("Seu IMC eh: " + imc);
	}
}