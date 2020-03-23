package exemple.config;

import java.util.Random;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import exemple.beans.Camion;
import exemple.beans.Vehicule;
import exemple.beans.Voiture;

@Configuration
public class VehiculeConfiguration {

	@Bean("aleat")
	@Primary
	public Vehicule getVehicule(String marque) {
		if(new Random().nextInt(100) > 50) {
			return new Camion();
		} else {
			return new Voiture(marque);
		}
	}
	
	@Bean(name = "camion")
	public Vehicule camion(String marque) {
		return new Camion();
	}
	
	@Bean
	public String marque() {
		return "Tesla";
	}
}
