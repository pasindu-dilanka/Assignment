object salary extends App{

	printf("Enter your working hour:")
	var h1=readInt()
	printf("Enter your ot hour:")
	var h2=readInt()
	printf("Your take home salary=Rs%.2f",takeHome(h1,h2))
	def normal(hours:Int):Int=hours*150
	def ot(hours:Int):Int=hours*75
	def income(h1:Int,h2:Int):Int=normal(h1)+ot(h2)
	def tax(income:Int):Double=income*0.1
	def takeHome(h1:Int,h2:Int):Double=income(h1,h2)-tax(income(h1,h2))

}	