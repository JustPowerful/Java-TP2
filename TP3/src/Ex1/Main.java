package Ex1;

public class Main {
	public static void main(String[] args) {
		Article A1 = new Article(1, "Chemise", 49.99, 50);	
		Article A2 = new Article(1, "Jeans", 30.5, 100);
		
		System.out.println(A1.price()); // Price TTC
		A1.sell(50);
		A1.provision(10);
		System.out.println(A1.stock);
	}
}