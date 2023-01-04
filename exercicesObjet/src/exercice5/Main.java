package exercice5;

public class Main {

	public static void main(String[] args) {
		Triangle tri   = new Triangle(5,2,4,10,7);
		
		tri.perimetre();
		System.out.println("le périmètre du triangle est de " +tri.perimetre());
		
		tri.aire();
		System.out.println("l'aire du triangle est de " +tri.aire());
		
		tri.deplacer();
		System.out.println(tri.coteA);
		System.out.println(tri.coteB);
		System.out.println(tri.coteC);
		
		tri.reduire();
		System.out.println(tri.coteA);
		System.out.println(tri.coteB);
		System.out.println(tri.coteC);
	}
      
		
}


