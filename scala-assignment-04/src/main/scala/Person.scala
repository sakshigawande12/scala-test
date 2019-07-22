class Person(val name:String,val age:Int) extends Ordered[Person] {

  def compare (that: Person)={
    if(this.name==that.name)
      this.age-that.age
    else
      this.name.length-that.name.length
  }

}
object Person extends App{
  val person1=new Person("sakjhkksh",21)
  val person2=new Person("saksh",21)
  val result=person1<person2
  println(result)
  val result1=person1!=person2
  println(result1)
  val result2=person1==person2
  println(result2)
}