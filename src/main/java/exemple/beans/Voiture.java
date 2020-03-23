package exemple.beans;


public class Voiture implements Vehicule{

	private static int count = 0;
	
	private int id;
	
	public Voiture(String marque) {
		count ++;
		this.id = count;
		System.out.println("Hello Bean Voiture"+ marque +count);
	}
	
	
	public int getId() {
		return this.id;
	}

	public void transporter() {
		System.out.println("Je transporte");
	}
}
