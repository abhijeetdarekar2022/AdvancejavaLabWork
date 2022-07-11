package com.cdac.component.atmbank;

import org.springframework.stereotype.Component;

@Component("citybank-v2")
public class CityBank implements Bank {

	public boolean isAccountPresent(int acno) {
		if(acno == 10101010)
			return true;
		return false;
	}

	public void withdraw(int atmId, int acno, double amount) {
		
		System.out.println("Customer of CitiBank wants to withdraw money..");
		
	}

	
}
