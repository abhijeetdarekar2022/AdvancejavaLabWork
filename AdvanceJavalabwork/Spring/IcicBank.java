package com.cdac.component.atmbank;

import org.springframework.stereotype.Component;

@Component("icicbank-v2")
public class IcicBank implements Bank {

	public boolean isAccountPresent(int acno) {
		if(acno == 20202020)
			return true;
		return false;
	}

	public void withdraw(int atmId, int acno, double amount) {
		System.out.println("Customer of IciciBank wants to withdraw money..");
	}

}
