package exercice7;

public class Etudiant {
		public int noteFrancais = 8;
		public int noteMaths = 14;
		public static String nom = "Doe";
		public static String prenom = "John";
		
		
		
		public double moyenne() {
			double moyenne = ((noteMaths + noteFrancais) / 2);
			return moyenne;
		}
		
		public  String initiales() {
		char initNom = nom.charAt(0);
		char initPrenom = prenom.charAt(0);
		String str= new StringBuilder().append(initNom).append(initPrenom).toString();
		return str;
	
		}
		
		
		public String trigramme() {
		char initNom = nom.charAt(0);
		char initPrenom = prenom.charAt(0);
		char last = nom.charAt(2);
		String str= new StringBuilder().append(initNom).append(initPrenom).append(last).toString();
		return str;
}
}