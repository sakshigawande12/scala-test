class Summation {

  def mulN(n: Int) {
    var mul = 1;
    for (i <- 1 to n) {
      mul = mul * i;
    }
    println(mul)

    var sum = 0
    while(mul != 0) {
      var rem = mul % 10
      sum = sum + rem
      mul = mul / 10
    }
      println(sum)

  }

}





object Summation extends App
{
  val s=new Summation
  val N= s.mulN(5)
  //val s1 =new Summation
  //s1.sumDigit
}





//   https://alvinalexander.com/scala/scala-recursion-examples-recursive-programming