package laptop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LaptopImpl {	
	@Autowired
	private laptopInterface laptop;
	
//	public void setLaptop(laptopInterface laptop) {
//		this.laptop = laptop;
//	}

//	public LaptopImpl(laptopInterface laptop) {
//		super();
//		this.laptop = laptop;
//	}

	
	public String laptopBrand(){
		String laptopName = laptop.company();
		return laptopName;
		
	}

	

	}
