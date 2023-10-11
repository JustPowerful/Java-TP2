


public class Exercice1 {
	public static void main(String args[]) {
		Compte C1 = new Compte(500);
		Compte C2 = new Compte(0);
		C1.transferer(C2, 1000);
		System.out.println("Solde C1:" + C1.getSolde());
		System.out.println("Solde C2:" + C2.getSolde());
		
	}
}
