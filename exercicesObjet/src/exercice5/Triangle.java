package exercice5;

public class Triangle {
		public int coteA;
		public int coteB;
		public int coteC;
		public int base;
		public int hauteur;
	
		public Triangle (int coteA, int coteB, int coteC, int base,int hauteur) {
			this.coteA = coteA;
			this.coteB = coteB;
			this.coteC = coteC;
			this.base = base;
			this.hauteur = hauteur;
		}
		
		public int perimetre() {
			int p = coteA+coteB+coteC;
			return p;
		}
		
		public int aire() {
			int aire = (base*hauteur)/2;
			return aire;
		}
		
		public void deplacer() {
			this.coteA+=1;
			this.coteB+=1;
			this.coteC+=1;
			
		}
		
		public void reduire() {
			this.coteA-=1;
			this.coteB-=1;
			this.coteC-=1;
			
		}
}
