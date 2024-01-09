package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("phone")
public class Phone {
	@Autowired
	@Qualifier("voda")
	private SimCard simcard;
	
	public Phone() {
		System.out.println("Phone.Phone::0-param constractor");
	}
	public void Validity(String startvalidity,String endvalidity) {
		System.out.println("Validity start");
		simcard.validitystart();
		System.out.println("Validity sim start"+startvalidity);
		System.out.println("Validity sim going on..........");
		simcard.validitystop();
		System.out.println("Validity sim stop"+endvalidity);
	}
}
