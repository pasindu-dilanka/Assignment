object q5 extends App{

	printf("Enter a number:")
	var num=readInt()
	printf("Sum of even numbers in less than %d = %d",num,sumEven(num))

	def sumEven(num:Int):Int = num match{
    		case x if (num<1) => num
   		case x if (num%2==0) => (num-2) + sumEven(num-2)
   		case x if (num%2==1) => (x-1) + sumEven(num-1)
 	}

}