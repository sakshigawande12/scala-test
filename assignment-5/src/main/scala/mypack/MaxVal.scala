package mypack

class Main{
 def maxi(arr: Array[Int]): Int=
  {
    var m=arr(0)
    for(i<-1 to arr.length)
    if(m<arr(i))
      {
        m=arr(i)
  }



  }

    object Main extends App {
      def main(args: Array[Int]): Unit = {
        //println("enert the first element")
        val arr = Array(5, 1, 3, 2, 4)
        //for (i <- 0 to arr.length) {
          val m = new Main
          m.maxi(arr);

        println(m)

        }
      }

    }
