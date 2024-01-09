package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("airtel")
@Lazy
public final class AirtelSim implements SimCard{
	
	public AirtelSim() {
		System.out.println("Airtel ::0-param constractor");
	}


	@Override
	public void validitystart() {
		System.out.println("Airetl.start() ::Airtel  is started");
		
	}

	@Override
	public void validitystop() {
		System.out.println("Airtel.stop() ::Airtel engine is stop");
		
	}
	

}