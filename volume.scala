object volume extends App{

	def volume(r:Double):Double=4.0/3.0*math.Pi*r*r*r
	printf("The volume of a sphere with radius 5 =%f cubic units",volume(5))
}