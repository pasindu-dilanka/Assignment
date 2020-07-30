class account(id:String,aNumber:Int,balance:Double){

	var nic=id;
	var accNumber=aNumber;
	var aBalance=balance;
}

object Q4{

	def main(args:Array[String]){
		
		println("  Overdraft-Total Balance-Interest");
		var acc1=new account("101V",1001,0);
		var acc2=new account("102V",1002,15000);
		var acc3=new account("103V",1003,30000);
		var acc4=new account("104V",1004,50000);
		var acc5=new account("105V",1005,-20000);
		var acc6=new account("106V",1006,-1000);
		val bank:List[account]=List(acc1,acc2,acc3,acc4,acc5,acc6);
		
		print("Overdraft account numbers   : ");
		var ODlist=overdraft(bank);
		ODlist.foreach(x=>print(x.accNumber+"   "));

		var tBalance=balance(bank);
		print("\nTotal account balance       : "+tBalance.aBalance);

		print("\nAccount balances + interest : ")
		var interestList=interest(bank);
		interestList.foreach(x=>print(x+" "));

		
	}

	val overdraft=(list:List[account])=>list.filter(x=>x.aBalance<=0);
	val balance=(list:List[account])=>list.reduce((x,y)=>new account("S000",1000,x.aBalance+y.aBalance));
	val interest=(list:List[account])=>list.map(x=>(if(x.aBalance>0) x.aBalance*1.05d else x.aBalance*1.01d));
}
