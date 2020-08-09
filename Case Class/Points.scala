case class Point(a:Int,b:Int){
  def x:Int=a
  def y:Int=b
  
  def +(that:Point)=Point(this.x+that.x,this.y+that.y) 
  
  def move(dx:Int,dy:Int)=Point(this.x+dx,this.y+dy)
  
  def -(that:Point)=Point(this.x-that.x,this.y-that.y) 
  def DisOfpoints(that:Point):Double={
   	val distance=math.sqrt((this.x)*(this.x)+(this.y)*(this.y))
   	return distance
}

  def InvertOfpoint(that:Point)=Point(this.y,this.x)

}

object Points extends App{
   
   	val p1=Point(2,3)
   	val p2=Point(7,12)
   
   	println("Add "+p1+" and "+p2+"="+(p1+p2))
   	println("")
   	println("Move a "+p1+" by given distance="+p1.move(5,6))
	println("")
  	val p3=p1-p2
   	println("Distance between "+p1+" and "+p2+"="+p3.DisOfpoints(p3))
  	println("")
   	println("Invert of "+p1+"="+p1.InvertOfpoint(p1))
 
}