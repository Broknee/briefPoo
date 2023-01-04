package exercice4;

public class Livre {
		public String nom;
		public String nomAuteur;
		public String prenomAuteur;
		public String categorie;
		public String isbn;

	public  Livre(String nom,String nomAuteur,String prenomAuteur,String categorie,String isbn) {
		this.nom = nom;
		this.nomAuteur= nomAuteur;
		this.prenomAuteur= prenomAuteur;
		this.categorie = categorie;
		this.isbn = isbn;
	}
	
	public void codeLivre() {
		char lettrenom = this.nomAuteur.charAt(1);
		char lettreprenom = this.prenomAuteur.charAt(1);
		char lettrecategorie = this.categorie.charAt(0);
		char minusone = this.isbn.charAt(isbn.length()-1);
		char minustwo = this.isbn.charAt(isbn.length()-2);
		
		
		String str= new StringBuilder().append(lettrenom).append(lettreprenom).append(lettrecategorie).append(minusone).append(minustwo).toString();
		System.out.println(str);
	}
}
