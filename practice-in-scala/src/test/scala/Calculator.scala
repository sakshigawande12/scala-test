
import org.scalatest.WordSpec

class CalculatorTest extends  WordSpec{
  val calculator= new Calculator(12,2)

  "Calculator" should{
    "Perform the addition of two integer" in{
      assert((calculator.addition)==14)

    }
  }


   "Calculator" should{
    "Perform the substraction of two integer" in{
      assert((calculator.substraction)==10)

    }
  }

  "Calculator" should{
    "Perform the Multiplication of two integer" in{
      assert((calculator.multiplication)==24)

    }
  }

  "Calculator" should{
    "Perform the division of two integer" in{
      assert((calculator.division)==6)

    }
  }

}


