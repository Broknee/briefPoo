package bases;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// EXERCICES SOUS ECLIPSE

		// ---------- exo 5 ------------------------------------
		// A partir d’une valeur saisie, vérifier si l’utilisateur est majeur ou mineur

		int age = 13;
		if (age >= 18) {
			System.out.println("l'utilisateur est majeur");
		} else {
			System.out.println("l'utilisateur est mineur");
		}

		// ------------- exo 6 ----------------------------------
		// A partir d’une valeur saisie, vérifier si l’utilisateur est majeur ou mineur

		int nombre = 18;
		int reste = nombre % 2;
		if (reste == 0) {
			System.out.println("le nombre est pair");
		} else {
			System.out.println("le nombre est impair");
		}

		//--------------- exo 7 -----------------------------------------

		int annee = 2024;
		int multiple4 = 4;
		int multiple400 = 400;

		if ((annee % multiple4 == 0) || (annee % multiple400 == 0)) {
			System.out.println("l'année est bissextile");
		} else {
			System.out.println("l'année n'est pas bissextile");
		}

		// -------------- exo 8 -------------------------------------------
		// A partir d’un mois saisi en chiffre, afficher le nombre de jour d’un mois

		int janvier = 01;
		int fevrier = 02;
		int mars = 03;
		int avril = 04;
		int mai = 05;
		int juin = 06;

		int mois = 02;

		if ((mois == janvier) || (mois == mars) || (mois == mai)) {
			System.out.println("Ce mois contient 31 jours");
		} else if (mois == fevrier) {
			System.out.println("Ce mois contient 28jours");
		} else if ((mois == avril) || (mois == juin)) {
			System.out.println("Ce mois contient 30jours");
		}

		// ---------- exo 8 BIS ----------------------------------------

		String janvierString = Integer.toString(janvier);
		System.out.println(janvierString);

		// --------- exo 8 TER -----------------------------------------

		// exo 9

		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}

		//-------------- exo 11 --------------------------------------

		for (int asciiValue = 0; asciiValue < 255; asciiValue++) {
			char convertedChar = (char) asciiValue;
			System.out.println(convertedChar);
		}

		// -------------- exo 12 -----------------------------------

		int premiere = 54;
		int seconde = 40;
		int troisieme;
		troisieme = premiere;
		premiere = seconde;
		System.out.println(premiere);
		seconde = troisieme;
		System.out.println(seconde);

// ------------------------------------------DEUXIEME EXERCICE SIMPLON ONLINE------------------------------------------

		// EXERCICE 1
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entre une chaine:");
		char[]array =new char[] { 'a','b','c','d','e','f','g','h','i','j','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		String userString = scanner.nextLine();
		HashMap<Character, Integer> charint = new HashMap<>();
		for(Character c:userString.toCharArray()) {
			if(charint.containsKey(c))
				charint.replace(c, charint.get(c).intValue()+1);
			else
				charint.put(c, 1);
		}
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]+":"+(charint.get(array[i])==null? "0": charint.get(array[i])));
		}
		

		// EXERCICE 2

		String caractere = "Bonjour";
		System.out.println(caractere.toUpperCase());
		System.out.println(caractere.toLowerCase());
		
		
		// EXERCICE 3	
		StringBuilder phrase = new StringBuilder("Bonjour");
		for (int i=1;i<phrase.length();i+=2) {
			phrase.setCharAt(i,'*');
		}
		System.out.println(phrase);
		
	}
}


