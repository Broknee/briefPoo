package exercice6;

public class Operations {
		public int addition(int nb1,int nb2) {
			return nb1+nb2;
		}
		
		public int soustraction(int nb1,int nb2) {
			return nb1-nb2;
		}
		public int multiplication(int nb1,int nb2) {
			return nb1*nb2;
		}
		public int division(int nb1,int nb2) {
			if(nb2==0) {
				System.out.println("Tu ne peux pas diviser par 0");
				return 0;
				
			} else {
				return nb1/nb2;
			}
			
		}
		
}
