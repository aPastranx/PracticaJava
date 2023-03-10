package practicaJava1;

import java.time.LocalTime;

public class practicaJava1 {

	static void primerMetodo(int x) {
		System.out.println(x);
	}
	
	// 1 Escribir un metodo para encontrar el área de un triángulo a partir de 3 lados ingresados
		// Revisar si es un triángulo válido
		
	static void areaTriangulo(double a, double b, double c) {
		//area de un triangulo con tres lados 
		
		//primero sacar el perimetro (suma de los 3 lados del traingulo)
		double perimetro = a + b + c;
		//System.out.println (perimetro);
		
		//despues sacar el semiperimetro (s=(perimetro/2))
		double sp = (perimetro/2);
		//System.out.println (sp);
		//finalmente raiz cuadrada de (s(s-a)(s-b)(s-c) 
		
		double numeroRaiz = (sp*((sp-a)*(sp-b)*(sp-c)));
		//System.out.println (numeroRaiz);
		double raiz = Math.sqrt(numeroRaiz);
		//System.out.println (raiz);
	
		//Para validadr que es un triangulo valido 
		if (raiz == 0) {
			System.out.println("Este no es un triangulo valido");
		}else {
			System.out.println("Es un triangulo valido");
			System.out.println("El area del triangulo es: " + raiz +" m^2");
		}
		
	}
		// 2 Escribir un metodo para encontrar el area y la circumferencia de un circulo dado el radio
		// Utilizar PI de la libreria de Java
		
	static void areaCirculo (double r){
		//circunferencia=perimetro
		
		double perimCircle = (2 * (Math.PI * r));
		double areaCircle = (Math.PI * (Math.pow(r, 2)));
		System.out.println("\n");
		System.out.println("La circunferencia del circulo es: " + perimCircle);
		System.out.println("El area del circulo es: " + areaCircle);
		
	}
	
		// 3 Escribir un metodo que muestre por consola la hora del sistema
		// Utilizar e investigar la libreria de Java
	
	static void horaSys () {
		LocalTime horaActual = LocalTime.now();
		System.out.println("\n");
		System.out.println("La hora actual del sistema es: " + horaActual);
	}

		// 4 Escribir un metodo que convierta n cantidad de segundos a (hora, minutos, segundos) segun sea el caso
		// ej 3600 = "1 hora = 60 min = 3600 seg"
		
	static void transformarSegundos(double n) {
		double minutos = n/60;
		double horas = minutos/60;
		System.out.println("\n");
		System.out.println(n + " segundo son:");
		System.out.println(minutos + " minutos");
		System.out.println(horas + " horas");
		
	}
		// 5 Escribir un metodo para encontrar el volumen de una esfera dado el radio
	
	static void volumenEsfera (double rad) {
		double volumen = ((4 * Math.PI * Math.pow(rad, 3))/3);
		System.out.println("\n");
		System.out.println("El volumen de la esfera es: " + volumen + "m^3");
	}
		
		// 6 Escribir un metodo para encontrar el volumen de un cono a dado el radio y la altura
	
	static void volumenCono (double radCon, double altCon) {
		double volumCono = ((Math.PI * Math.pow(radCon, 2) * altCon)/ 3);
		System.out.println("\n");
		System.out.println("El volumen del cono es: " + volumCono + "m^3");
	}
	
		
		// 7 Encontrar el area superficial de un cubo dado un lado a
	
	static void areaSuper(double ladoa) {
		double areaSuperficial = 6 * Math.pow(ladoa, 2);
		System.out.println("\n");
		System.out.println("El área superficial del cubo es: " + areaSuperficial);
	}

		// 8 Escribir un metodo para descubrir si un año ingresado es bisiesto o no
	
		// 9. Escribir mostrar en pantalla los primeros 100 numeros primos
	
		// 10. Escribir un programa para sumar 2 numeros sin usar operadores aritmeticos
	
	// 11. Escribir un método para verificar si un numero positivo de 2 digitos es palindromo

	// 12. Sin usar loops, escribir un metodo para sumar todos los digitos de un numero donde 99 >= n >= 10
	
	// 13. Escribir un método para remover espacios en blanco de un String. ej -> "Hola Mundo" -> "HolaMundo"
	
	// 14. Escribir un método para invertir un String. ej -> "Hola" -> "aloH" --- Sin usar loops
	
	// 15. Escribir un metodo para encontrar el factorial de un numero sin loops



	
	public static void main(String[] args) {
		//primerMetodo (7);
		areaTriangulo (10, 10, 10);
		areaCirculo (4);
		horaSys();
		transformarSegundos(60);
		volumenEsfera (2.22);
		volumenCono (15, 30);
		areaSuper(25.5); 
	
	}

}
