package exemple;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import exemple.beans.Parking;

@ComponentScan(basePackageClasses = Application.class)
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
		
		Parking p = context.getBean(Parking.class);
		System.out.println(p);
	}
}
