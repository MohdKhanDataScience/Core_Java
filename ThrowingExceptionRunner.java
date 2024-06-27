package com.in28minutes.exception;

class Amount{
	private String currency;
	private int amount;
	
	Amount(String currency,int amount){
		super();
		this.currency=currency;
		this.amount=amount;
	}
	public void add(Amount other)  {
		if(!this.currency.equals(other.currency)) {
			//throw new Exception("Currencies are not matched " + this.currency + " & " + other.currency);
			throw new CurrenciesDoNotMacthException("Currencies are not matched " + this.currency + " & " + other.currency);
		}
		this.amount=this.amount+other.amount;
	}

	@Override
	public String toString() {
		return "Amount [currency=" + currency + ", amount=" + amount + "]";
	}
	
}
		//************Custom Exception class***********.
	// when using runtime exception no need to throws 

class CurrenciesDoNotMacthException extends RuntimeException{
	public CurrenciesDoNotMacthException(String msg) {
		super(msg);
	}
	
}

public class ThrowingExceptionRunner {

	public static void main(String[] args)  
	{
		Amount amount1=new Amount("USD",10);
		Amount amount2=new Amount("EUR",20);
		
		amount1.add(amount2);
		System.out.println(amount1);
		
	}

}
