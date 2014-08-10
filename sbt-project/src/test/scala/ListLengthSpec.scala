import org.scalatest.{ FlatSpec, Matchers }
import org.scalatest.prop.PropertyChecks

class ListLengthSpec extends FlatSpec with Matchers with PropertyChecks {

  "The sum of two list sizes" must "be the size of their concatenation" in {
    forAll { (l: List[Int], m: List[Int]) =>
      (l ::: m).size should equal (l.size + m.size)
    }
  }

}
