package laptop;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class DellLap implements laptopInterface{

	public String company() {
		
		String company = "Dell";
		
		return company;
	}


}
