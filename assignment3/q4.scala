object q4 extends App{

	printf("Enter your number:")
	var num=readInt()
	if(isEven(num))printf("This is even number!")
	else printf("This is odd number!")

	def isEven(num:Int):Boolean=num match{
		case 0 =>true
		case _ =>isOdd(num-1)
	}

	def isOdd(num:Int):Boolean = !(isEven(num))
		
}		