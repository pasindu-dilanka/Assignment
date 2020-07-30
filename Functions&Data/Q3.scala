class account(id:String,aNumber:Int,balance:Double){

	var nic=id;
	var accNumber=aNumber;
	var aBalance=balance;

	def withdraw(amount:Double)=if(aBalance>amount) aBalance=aBalance-amount else println("Your account balnce is not sufficient.");
	def deposit(amount:Double)=aBalance=aBalance+amount;
	def transfer(acc:List[account],amount:Double)={
		if(aBalance>amount){
			aBalance=aBalance-amount;
			acc.head.aBalance=acc.head.aBalance+amount;
		}
		else{
			println("Your account balnce is not sufficient.");
		}
	}	
}

object Q3{

	def main(args:Array[String]){

		println("Bank Tranfer");
		var acc1=new account("101V",1000,50000);
		var acc2=new account("102V",1001,15000);
		val bank:List[account]=List(acc1,acc2);
		val x=find(1001,bank);
		acc1.transfer(x,5000);
		println("Transferd account balance : "+acc1.aBalance);
		println("Received account balance  : "+x.head.aBalance);
		
	}

	val find=(accNumber:Int,list:List[account])=>list.filter(x=>x.accNumber.equals(accNumber));

}
