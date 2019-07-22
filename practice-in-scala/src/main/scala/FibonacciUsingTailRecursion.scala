// class FibonacciUsingTailRecursion {



// }

import scala.annotation.tailrec

object Fib extends App{

  val list = List.range(1, 100)
  println(sum(list))
 // println(sumWithReduce(list))


  def sum(ints: List[Int]): Int = {
    @tailrec def sumAccumulator(ints: List[Int], accum: Int): Int = {
      ints match {
        case Nil => accum
        case x :: tail => sumAccumulator(tail, accum + x)
      }
    }
    sumAccumulator(ints, 0)
  }
}
