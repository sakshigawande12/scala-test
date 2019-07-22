class Fibbonacci {
  def fibseries(n : Int): Unit =
  {
    var a=0

    var b=1
    var c=a+b

    println(a)
    println(b)
    println(c)
    for(i<-1 to n)
      {
        a=b
        b=c
        c=a+b
        println(c)
      }

  }

}

//object Fibbonacci extends App
//{

  object FibonacciTailRecursive extends App {

    println(fib(9))

    def fib(x: Int): BigInt = {
       def fibHelper(x: Int, prev: BigInt = 0, next: BigInt = 1): BigInt = x match {
        case 0 => prev
        case 1 => next
        case _ => fibHelper(x - 1, next, (next + prev))
      }
      fibHelper(x)
    }

  }

  //val f= new Fibbonacci
  //f.fibseries(5)
//}