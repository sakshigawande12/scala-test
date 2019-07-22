class Interpolation {

  val list=List(10,20,30,40)

  def elements {
    println(" The elements of list are")
    println(this.list)
    for(i <- list) {
      println(s"${list.indexOf(i)} = $i")
    }
  }
}

object Interpolation extends App
{
  val j=new Interpolation
  j.elements
}