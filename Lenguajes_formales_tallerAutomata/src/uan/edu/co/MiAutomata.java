package uan.edu.co;

import java.util.Scanner;

public class MiAutomata {

	static Scanner entrada = new Scanner(System.in);

	/**
	 * @param tiene que ser pares cualquier palabra de aes o bes
	 */
	public static void main(String[] args) {
		String alfabeto = "ab";
		String palabra_test;
		int aCount = 0, bCount = 0;
		// 0 hace referencia al elemento 1 del string, un string es una cadena de chars
		// "un vector"
		// de chars, luego el elemento 0 es a, y es el primer elemento, luego el
		// elemento
		// 1 será el segundo elemento de la cadena "ab"

		// imprimiendo el primero elemento de la cadena
		System.out.println(alfabeto.substring(0, 1));

		// imprimiendo el segundo elemento de la cadena
		System.out.println(alfabeto.substring(1, 2));

		System.out.println("Usuario digite cadena: ");
		palabra_test = entrada.nextLine();
		entrada.close();

		// for que evalua que la cadena tenga a y b pares
		for (int i = 0; i < palabra_test.length(); i++) {
			// no leerá el "igual que ==" ya que no es un tipo numérico.
			if (palabra_test.substring(i, i + 1) == alfabeto.substring(0, 1)) {// es lo mismo que para b
				aCount += 1;
			}
			if (palabra_test.substring(i, i + 1).equals("b")) {// es lo mismo que para a
				bCount++;
			}
		}

		System.out.println("numero de aes:" + aCount);
		System.out.println("numero de bes:" + bCount);
		if (aCount % 2 == 0 && bCount % 2 == 0) {
			System.out.println("La cadena '" + palabra_test
					+ "' es aceptada porque tiene cantidad pares de aes y bes.\nN° de aes: " + aCount + "\nN° de bes: "
					+ bCount);
		} else {
			System.out.println("la cadena tiene una longitud impar en las aes o las bes");
		}


	}
}
