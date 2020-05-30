object ticketPrice extends App{

	def attendees(price:Int):Int=120+(15-price)/5*20
	def revenue(price:Int):Int=attendees(price)*price
	def cost(price:Int):Int=500+attendees(price)*3
	def profit(price:Int):Int=revenue(price)-cost(price)
	printf("%d\n %d\n %d\n %d\n %d\n %d\n %d",profit(5),profit(10),profit(15),profit(20),profit(25),profit(30),profit(35))

}