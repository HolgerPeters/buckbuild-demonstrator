package de.holger_peters.sclib
import de.holger_peters.sclib.Multiplier

import org.junit.runner.RunWith

import org.scalatest._

@RunWith(classOf[junit.JUnitRunner])
class MultiplierSpec extends FlatSpec with Matchers {

  it should "correctly multiply" in {
    val m: Multiplier = new Multiplier(10)
    assert(100 == m.multipliy(10))
  }

  it should "fail" in {
    assert(1 == 1)
  }
}
