package anudip.org;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {

	public static void main(String[] args) {
	ApplicationContext apcon=new ClassPathXmlApplicationContext("spring.config.xml"); 
	MakeMyTrip mtp=apcon.getBean("MakeMyTrip",MakeMyTrip.class);
	mtp.booking();
	
	}
}