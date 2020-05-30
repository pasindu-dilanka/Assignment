object q1 extends App{

	printf("Enter a number:")
	var num=readInt()
	printf("%s",prime(num))
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