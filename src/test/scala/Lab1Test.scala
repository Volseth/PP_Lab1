import List1.multiply
import List1.checkPositiveNumbers
import List1.factorial
import List1.stringBuilder
import org.scalatest.FunSuite

class Lab1Test  extends FunSuite{
  test("List1.multiply") {
   assert(multiply(List(3.5,2.5,1.5))==13.125)      //13.125
   assert(multiply(List(3.5,-2.5,1.5))==(-13.125))  //-13.125
   assert(multiply(List(3,7,8))==168)               //168
  }

  test("List1.checkPositiveNumbers") {
    assert(checkPositiveNumbers(List(3, 2, 0))) //true
    assert(!checkPositiveNumbers(List(3, -2, 0))) //false
    assert(!checkPositiveNumbers(List(-3, 2, 0))) //false
  }
  test("List1.stringBuilder"){
    val pattern1=(List("Procedura","testowa","czy","wszystko","dziala")," ","!")
    val pattern2=(List("Procedura","testowa","czy","wszystko","dziala"),",","!")
    assert(stringBuilder(pattern1)=="Procedura testowa czy wszystko dziala!")
    assert(stringBuilder(pattern2)=="Procedura,testowa,czy,wszystko,dziala!")
  }
  test("List1.factorial"){
    assert(factorial(5)==120)   //n=5, 120
    assert(factorial(3)==6)     //n=3, 6
    assert(factorial(6)==720)   //n=6, 720
  }
}
