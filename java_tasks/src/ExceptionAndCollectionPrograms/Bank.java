package ExceptionAndCollectionPrograms;

class Bank{
	private static String bankName;
	private static double dailLimit;

	public Bank(String bankName, double dailyLimit) {
		this.bankName = bankName;
		this.dailLimit = dailyLimit;
	}

	public static String getBankName() {
		return bankName;
	}

	public static double getDailLimit() {
		return dailLimit;
	}


	public static void setBankName(String bankName) {
		Bank.bankName = bankName;
	}

	public static void setDailLimit(double dailLimit) {
		Bank.dailLimit = dailLimit;
	}
	
	public static String deposite(int depositeAmount, Customer customer) throws InvalidAmountException,MinimumDepositAmountException,AccountLockedException {
		
		if(depositeAmount<100) {
			throw new MinimumDepositAmountException("enterd amount is less than minimum amount");
		}else if(depositeAmount%100!=0) {
			throw new InvalidAmountException("Entered amount is not multiples of 100");
		}else if(!customer.getAccountState().equals("Active")) {
			throw new AccountLockedException("Your account is not active"); 
		}else{
			customer.addBalance(depositeAmount);
		}
		
		return "Amount"+depositeAmount+" is credited";
	}
	
	public static String checkBalance(Customer customer) throws NegativeAmountException,AccountLockedException{
		if(customer.getBalance()<0) {
			throw new NegativeAmountException("Your account balance went to Negitive number");
		}else if(!customer.getAccountState().equals("Active")) {
			throw new AccountLockedException("Your account is not active");
		}else {
			return "Account Holder--"+customer.getAccountHolder()+" Balance--"+customer.getBalance();
		}
	}

	public static String withdraw(int withdrawAmmount, Customer customer) throws InvalidAmountException,AccountLockedException,DailyLimitException,InsufficientFundsException{
		if(withdrawAmmount<100 || withdrawAmmount%100!=0) {
			throw new InvalidAmountException("Enter amount multiples of 100");
		}else if(!customer.getAccountState().equals("Active")) {
			throw new AccountLockedException("Your account is not active");
		}else if(customer.getDailyLimit()<100) {
			throw new DailyLimitException("Maximium Withdraw limit has reached");
		}else if(withdrawAmmount>customer.getBalance()){
			throw new InsufficientFundsException("Your account balance is less");
		}else {
			customer.deleteBalance(withdrawAmmount);
		}
		return "Amount "+withdrawAmmount+" is debited...";
	}

}
