package Ex3;

public class PersonneTest {
	public static void main(String[] args) {
		Personne p1 = new Personne("Pierre", 23);
		Personne p2 = new Personne("Christophe",34);
		System.out.println(p1.afficherNom());
		System.out.println(p2.afficherNom());
		
		System.out.println(p1.afficherAge());
		System.out.println(p2.afficherAge());
		
		p1.modifierAge(24);
		System.out.println(p1.afficherAge());
		p2.modifierNom("Christian");
		System.out.println(p2.afficherNom());
		
	}
}
