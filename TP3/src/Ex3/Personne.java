package Ex3;

public class Personne {
	private String nom;
	private int age;
	
	Personne(String nom, int age) {
		this.nom = nom;
		this.age = age;
	}
	
	String afficherNom() {
		return this.nom;
	}
	
	int afficherAge() {
		return this.age;
	}
	
	void modifierNom(String nom) {
		this.nom = nom;
	}
	
	void modifierAge(int age) {
		this.age = age;
	}
}
