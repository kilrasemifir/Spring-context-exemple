package exemple.beans;

import org.springframework.stereotype.Component;

@Component
public class Parking {

	private Vehicule v;
	
	public Parking(Vehicule v) {
		this.v = v;
	}
	
	public String toString() {
		return "Parking avec voiture " + v.getId();
	}
}
