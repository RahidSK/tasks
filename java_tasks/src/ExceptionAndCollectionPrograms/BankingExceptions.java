package ExceptionAndCollectionPrograms;

class InsufficientFundsException extends BankingExceptions{
	public InsufficientFundsException(String message) {
		super(message);
	}
}

class NegativeAmountException extends BankingExceptions{
	public NegativeAmountException(String message) {
		super(message);
	}
}

class InvalidAmountException extends BankingExceptions{
	public InvalidAmountException(String message) {
		super(message);
	}
}

class MaximumWithdrawalLimitException extends BankingExceptions{
	public MaximumWithdrawalLimitException(String message) {
		super(message);
	}
}

class MinimumDepositAmountException extends InvalidAmountException{
	public MinimumDepositAmountException(String message) {
		super(message);
	}
}

class DailyLimitException extends BankingExceptions{
	public DailyLimitException(String message) {
		super(message);
	}
}

class AccountLockedException extends BankingExceptions{
	public AccountLockedException(String message) {
		super(message);
	}
}

class TransactionFailedException extends BankingExceptions{
	public TransactionFailedException(String message) {
		super(message);
	}
}

class CustomerNotFoundException extends BankingExceptions{
	public CustomerNotFoundException(String message) {
		super(message);
	}
}

public class BankingExceptions extends Exception{
	public BankingExceptions(String message) {
		super(message);
	}
}
