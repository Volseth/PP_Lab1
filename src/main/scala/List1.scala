object List1 extends App {

  def multiply(x:List[Double]):Double = {
    if (x.isEmpty) 0
    else if(x.length==1) x.head
    else x.head*multiply(x.tail)
  }

  def checkPositiveNumbers(x:List[Int]):Boolean ={
    if(x.isEmpty) true
    else if(x.head<0) false
    else checkPositiveNumbers(x.tail)
  }

  def stringBuilder(x:(List[String],String,String)):String={
    if(x._1.isEmpty) ""
    else if(x._1.length==1) x._1.head+x._3
    else x._1.head+x._2+stringBuilder(x._1.tail,x._2,x._3)
  }

  def factorial(x:Int):Int = {
    if(x<0) throw new IllegalArgumentException
    if(x==0) 1
    else x*factorial(x-1)
  }
}
