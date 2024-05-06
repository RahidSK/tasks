package ExceptionAndCollectionPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Customer {
	private long accoutNumber;
	private String accountHolder;
	private double balance;
	private Bank bankName;
	private String accountState;
	private double dailyLimit;

	public Customer(long accoutNumber, String accountHolder, Bank bankName, String accountState, double dailyLimit) {
		super();
		this.accoutNumber = accoutNumber;
		this.accountHolder = accountHolder;
		this.bankName = bankName;
		this.accountState = accountState;
		this.dailyLimit = dailyLimit;
	}

	public Bank getBankName() {
		return bankName;
	}

	public void setBankName(Bank bankName) {
		this.bankName = bankName;
	}

	public long getAccoutNumber() {
		return accoutNumber;
	}

	public double getDailyLimit() {
		return dailyLimit;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccoutNumber(long accoutNumber) {
		this.accoutNumber = accoutNumber;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccountState() {
		return accountState;
	}

	public void setAccountState(String accountState) {
		this.accountState = accountState;
	}

	public void addBalance(int balance) {
		this.balance += balance;
	}

	public void deleteBalance(int balance) {
		this.balance -= balance;
	}
}

public class CustomExceptionsForBanking {
	public static void main(String[] args) {

		System.out.println("Enter number of customers in the bank: ");
		Scanner scan = new Scanner(System.in);
		List<Customer> list = addCustomers(scan);
		
		for (Customer c : list) {
			System.out.println("Accountnumber: " + c.getAccoutNumber() + "  |    AccountHolder: " + c.getAccountHolder()
					+ "       |     Balance in the account:" + c.getBalance() + "  |     Bank Name:"
					+ Bank.getBankName());
		}

		System.out.println("==================================================");

		bankingOperations(scan,list);

	}

	public static Customer actionAccount(int accountNumber, List<Customer> list) throws CustomerNotFoundException {
		for (Customer customer : list) {
			if (customer.getAccoutNumber() == accountNumber) {
				return customer;
			} else {
				throw new CustomerNotFoundException("Customer your trying to perform operation is not present..");
			}

		}
		return null;
	}

	public static List<Customer> addCustomers(Scanner scan) {
		List<Customer> list = new ArrayList<Customer>();
		int numberOfCustomers = scan.nextInt();
		for (int i = 1; i <= numberOfCustomers; i++) {
			System.out.println("Enter Account Number: ");
			long accountNumber = scan.nextLong();
			scan.nextLine();
			System.out.println("Enter Account Holders Name:");
			String accounHolder = scan.nextLine();

			System.out.println("Enter Account State Active/In Active");
			String state = scan.nextLine();

			System.out.println("Enter Bank Name: ");
			String bankName = scan.nextLine();

			System.out.println("Set DailyLimit:");
			double dailyLimit = scan.nextDouble();

			Bank bank = new Bank(bankName, dailyLimit);

			Customer customer = new Customer(accountNumber, accounHolder, bank, state, dailyLimit);

			list.add(customer);
			System.out.println("----------------------------------------------------------");

		}
		
		return list;
	}
	
	public static void bankingOperations(Scanner scan, List<Customer> list) {
		char operationDecision = 'y';
		while (operationDecision == 'y' || operationDecision == 'Y') {
			System.out.print("1: Withdraw\n2: Deposite\n3: Check Balance\nSelect operation: ");
			int operation = scan.nextInt();
			switch (operation) {
			case 1:
				withdrawOperation(scan, list);

				break;
			case 2:
				depositeOperation(scan, list);
				break;

			case 3:
				checkBalanceOperation(scan,list);

				break;

			default:
				System.out.println("Operation can't be performed....");
			}

			System.out.println("-----------------------------------------------");
			System.out.print("Want to perform Banking operations again: Y/N");
			operationDecision = scan.next().charAt(0);
		}
	}
	
	public static void depositeOperation(Scanner scan, List<Customer> list) {
		System.out.println("Enter account number: ");
		int depositeAccountNumber = scan.nextInt();
		System.out.println("Enter amount want to desposit: ");
		int depositeAmount = scan.nextInt();
		try {
			Customer customer = actionAccount(depositeAccountNumber, list);
			try {
				System.out.println(Bank.deposite(depositeAmount, customer));
			} catch (InvalidAmountException e) {

				System.out.println(e);
			}
		} catch (CustomerNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (AccountLockedException e) {
			System.out.println(e.getMessage());

		}
	}
	
	public static void withdrawOperation(Scanner scan, List<Customer> list) {
		System.out.println("Enter Account number: ");
		int withdrawAccountNumber = scan.nextInt();
		System.out.println("Enter Amount want to withdraw: ");
		int withdrawAmmount = scan.nextInt();
		try {
			Customer customer = actionAccount(withdrawAccountNumber, list);
			try {
				System.out.println(Bank.withdraw(withdrawAmmount, customer));
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		} catch (CustomerNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void checkBalanceOperation(Scanner scan, List<Customer> list) {
		System.out.println("Enter account number: ");
		int checkBalanceAccountNumber = scan.nextInt();
		try {
			Customer customer = actionAccount(checkBalanceAccountNumber, list);
			try {
				System.out.println(Bank.checkBalance(customer));
			} catch (NegativeAmountException e) {
				System.out.println(e.getMessage());
			} catch (AccountLockedException e) {
				System.out.println(e.getMessage());
			}
		} catch (CustomerNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

}
