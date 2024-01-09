package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("voda")
@Lazy
public final class VodaphoneSim implements SimCard{
	
	public VodaphoneSim() {
		System.out.println("vodaphone ::0-param constractor");
	}


	@Override
	public void validitystart() {
		System.out.println("vodaphone.start() ::vodaphone engine is started");
		
	}

	@Override
	public void validitystop() {
		System.out.println("vodaphone.stop() ::vodaphone engine is stop");
		
	}
	

}