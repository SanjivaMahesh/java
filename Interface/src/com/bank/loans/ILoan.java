package com.bank.loans;

public interface ILoan {
	double RATE_OF_INTEREST = 20;

	double calculateInterest(double principle, int years);

}
