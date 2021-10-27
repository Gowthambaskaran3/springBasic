package laptop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication

public class LaptopApp {

	private static Logger log = LoggerFactory.getLogger(LaptopApp.class);
	
	public static void main(String[] args) { 
		ApplicationContext appContext = SpringApplication.run(LaptopApp.class, args);
		LaptopImpl laptop = appContext.getBean(LaptopImpl.class);
		String Name = laptop.laptopBrand();
		log.info(Name);
	}

}