package org.generation.italy;

import java.util.Scanner;

public class CalcoloBMI {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // Creazione scanner

		float peso, altezza, bmi; // Assegnazione del float alle variabili

		String fascia; // Creazioni string
		String risposta;
		System.out.println("Benvenuto nella pagina di calcolo del tuo BMI.");
		// Inizio do while dell'intero programma
		do {
			 // Assegnazione valori alle variaili
			peso = 0;
			altezza = 0;
			// Inizio do while del peso
			do {
				System.out.println("Inserisci il tuo peso in kg:");
				peso = sc.nextFloat();
				sc.nextLine();
				if (peso <= 0)
					System.out.println("Peso non valido."); // Determina se il valore non è valido
			} while (peso <= 0);
			// Inizio while dell'altezza
			while (altezza <= 0) {
				System.out.println("Inserisci la tua altezza in m:");
				altezza = sc.nextFloat();
				sc.nextLine();
				if (altezza <= 0)
					System.out.println("Altezza non valida."); // Determina se il valore non è valido
			}
			
			bmi = peso / (altezza * altezza); // formula per determinare il risultato della variabile bmi
			System.out.println("Il tuo BMI è di " + String.format("%.2f", bmi));
			// Determinazione della fascia di appartenenza
			if (bmi > 0 && bmi <= 16) {
				fascia = "grave magrezza";
				System.out.println("Sei nella fascia: " + fascia); // Fascia grave magrezza
			} else if (bmi <= 18.49) {
				fascia = "sottopeso";
				System.out.println("Sei nella fascia: " + fascia); // Fascia sottopeso
			} else if (bmi <= 24.99) {
				fascia = "normo peso";
				System.out.println("Sei nella fascia: " + fascia); // Fascia normopeso
			} else if (bmi <= 29.99) {
				fascia = "sovrappeso";
				System.out.println("Sei nella fascia: " + fascia); // Fascia sovrappeso
			} else if (bmi <= 34.99) {
				fascia = "obeso classe 1";
				System.out.println("Sei nella fascia: " + fascia); // Fascia obeso classe 1
			} else if (bmi <= 39.99) {
				fascia = "obeso classe 2";
				System.out.println("Sei nella fascia: " + fascia); // Fascia obeso classe 2
			} else if (bmi >= 40) {
				fascia = "obeso classe 3";
				System.out.println("Sei nella fascia: " + fascia); // Fascia obeso classe 3
			}

			// Richiesta di ricalcolo
			System.out.println("Vuoi ricalcolare il tuo bmi? Si o No?");
			risposta = sc.nextLine();
			if (risposta.equalsIgnoreCase("no")) {
				System.out.println("Grazie e arrivederci.");
			}
		} while (risposta.equalsIgnoreCase("si"));

	}

}
