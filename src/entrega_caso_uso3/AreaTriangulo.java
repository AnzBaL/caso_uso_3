package entrega_caso_uso3;

import java.util.Scanner;

public class AreaTriangulo {
	
	public static  void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("--- AREA TRIANGULO ---");
		System.out.println("Introduce la base:");
		double base = entrada.nextDouble();
		System.out.println("Introduce la altura:");
		double altura = entrada.nextDouble();
		
		double area = areaTriangulo(base, altura);
		
		System.out.println("El area del triangulo es " + area);
		
	}
	
	////////////////////////////////////////////////////////////////////
	// METODOS
	
	public static double areaTriangulo(double base, double altura)
	{
		return (base * altura) / 2;
	}
}