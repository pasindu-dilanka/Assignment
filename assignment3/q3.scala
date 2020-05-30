object q3 extends App{

	printf("Enter a number:")
	var n=readInt()
	printf("Sum of numbers from 1 to %d = %d",n,sum(n))

	def sum(n:Int,p:Int=1,total:Int=0):Int=p match{	
		case x if(n==x)=>total+x
		case x if(n>x)=>sum(n,x+1,total+x)
	}

}