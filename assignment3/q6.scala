object q6 extends App{

	printf("Enter a number:")
	var num=readInt()
	fibonacciSeq(num)
	def fibonacci(num:Int):Int=num match{
		case 0 => 0
		case x if(x==1) => 1
		case _ => fibonacci(num-1)+fibonacci(num-2)
	}

	def fibonacciSeq(num:Int):Unit={
		if(num>0)fibonacciSeq(num-1)
		printf("%d\t",fibonacci(num))
	}

}