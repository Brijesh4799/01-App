package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("jio")
@Lazy
public class JioSim implements SimCard{
	
	public JioSim() {
		System.out.println("JioSim :::0-param constractor");
	}

	@Override
	public void validitystart() {
		System.out.println("JioSim.validitystart::jio sim validity start");
	}

	@Override
	public void validitystop() {
		System.out.println("JioSim.validitystop::jio sim validity stop");
		
	}

}
