class Employee {

  def displayDetails(f: FirstName, l: LastName, a: Age): Unit = {
    println(f.name + " " + l.lastname + "  is of  " + a.age + "  years old")
  }
}




class FirstName(val name: String) extends AnyVal {
  def u_firstName = name;
}

class LastName(val lastname: String) extends AnyVal {
  def u_lastName = lastname;
}

class Age(val age: Int) extends AnyVal {
  def u_age = age;
}



object Employee extends App {

  val f = new FirstName("saksh")
  val l = new LastName("Gawande")
  val a = new Age(21)
  val e = new Employee
  e.displayDetails(f,l,a)

}


