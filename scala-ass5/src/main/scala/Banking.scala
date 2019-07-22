class Banking {

  var balance:Int=0
  var customer_name:String

  def openAcc(name:String , id:Int): Unit =
  {
    customer_name=name
    println("Account opend with")
    println("ID="+id)
    println("Customer Name="+customer_name)
  }

  def closeAcc(id:Int): Unit =
  {
    this.balance=0;
    println("Acc deleted of Id"+id)
  }

  def deposite(amt:Int): Unit =
  {
    balance=balance+amt
    println("Total amt credited="+amt)
    println("updated balance="+balance)
  }

  def withdraw(amt:Int): Unit =
  {
    balance=balance-amt
    println("Total amt withdrawl="+amt)
    println("updated balance="+balance)
  }

}


object Banking extends App{
  val b1=new Banking
  b1.openAcc("sakshi",101)
  b1.closeAcc(101)


}