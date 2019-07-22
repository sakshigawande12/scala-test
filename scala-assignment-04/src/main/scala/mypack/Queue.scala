package mypack
package mypack
trait Queue{
  def performEnqueue(list: List[Int],input:Int):List[Int]

  def performDequeue(list:List[Int]):List[Int]=
  {
    list.tail
  }
}
class DoubleQueue extends  Queue {
  override  def performEnqueue(list : List[Int],input :Int):List[Int]={
    val doubleResult=input*2
    list:+doubleResult
  }

}

class SquareQueue extends  Queue {
  override  def performEnqueue(list : List[Int],input :Int):List[Int]={
    val squareResult=input*input
    list:+squareResult;
  }

}

object QueueWork extends App{
  val objDouble=new DoubleQueue
  val objSquare=new SquareQueue
  val objDequeue=new DoubleQueue

  println( objDouble.performEnqueue(List(1,22,3),6))
  println( objSquare.performEnqueue(List(1,3,1),6))
  println( objDouble.performDequeue(List(1,2,3,6)))


}
