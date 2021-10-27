package laptop;

import org.springframework.stereotype.Component;

@Component
public class HpLap implements laptopInterface{

	public String company() {
		
		String company = "HP";
		
		return company;
	}

}
