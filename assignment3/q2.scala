object q2 extends App{
	
	printf("Enter a number:")
	var num=readInt()
	primeSeq(num)
	def primeSeq(num:Int,count:Int=2):Unit={
		if(prime(count)) printf("%d,",count)
		if(num>count)primeSeq(num,count+1)
	}

	def prime(num:Int,a:Int=2):Boolean=a match{
		case x if(x==num)=>true
		case x if GCD(num,x)>1=>false
		case x =>prime(num,x+1)
	}
	def GCD(p:Int,q:Int):Int=q match{
		case x if(x==0)=>p
		case x =>GCD(x,p%x)
	}

}