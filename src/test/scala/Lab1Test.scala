import List1.multiply
import List1.checkPositiveNumbers
import List1.factorial
import List1.stringBuilder
import org.scalatest.FunSuite

class Lab1Test  extends FunSuite{
  test("List1.multiply") {
   assert(multiply(List(3.5,2.5,1.5))==13.125)
   assert(multiply(List(3.5,-2.5,1.5))==(-13.125))
   assert(multiply(List(3,7,8))==168)
  }

  test("List1.checkPositiveNumbers") {
    assert(checkPositiveNumbers(List(3, 2, 0)))
    assert(!checkPositiveNumbers(List(3, -2, 0)))
    assert(!checkPositiveNumbers(List(-3, 2, 0)))
  }
  test("List1.stringBuilder"){
    val pattern=(List("Procedura","testowa","czy","wszystko","dziala")," ","!")
    assert(stringBuilder(pattern)=="Procedura testowa czy wszystko dziala!")
  }
  test("List1.factorial"){
    assert(factorial(5)==120)
    assert(factorial(3)==6)
    assert(factorial(6)==720)
  }
}
