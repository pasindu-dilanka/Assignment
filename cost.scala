object cost extends App{

	def bookPrice(x:Int):Double=x*24.95
	def discount(amount:Double):Double=amount*0.4
	def shippingCost(x:Int):Double=x*3+(x-50)*0.75
	def cost(x:Int):Double=bookPrice(x)-discount(bookPrice(x))+shippingCost(x)

	printf("Total wholesale cost for 60 copies = %f",cost(60))
}