package exceptionEx;

public class Account {
   String accountNo;
   String ownerName;
   int balance;
   
   public Account () {
	   
   }
   public Account(String accountNo, String ownerName, int balance) {
	   this.accountNo = accountNo;
	   this.ownerName=ownerName;
	   this.balance=balance;
   }
   //예금한다 메서드
   void deposit(int amount) {
	   balance+=amount;
   }
   //인출한다 메서드
   int withdraw(int amount) throws Exception{
	   if(balance < amount) {
		   throw new InsufficientException("잔고 부족(" + (amount-balance) + "모자람");
	   }
	   balance-=amount;
	   return amount;
   }
}
