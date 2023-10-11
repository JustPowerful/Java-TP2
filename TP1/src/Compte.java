
public class Compte {
	double solde;
	Compte(double solde) {
		this.solde = solde;
	}
	
	double getSolde() {
		return this.solde;
	}	
	
	void retirer(double montant) {
		double resultat = this.solde - montant;
		this.solde = resultat;
	}
	
	void deposer(double montant) {
		this.solde = this.solde + montant;
	}
	
	void transferer(Compte destination, double montant) {
			this.retirer(montant);
			destination.deposer(montant);
	}
}
