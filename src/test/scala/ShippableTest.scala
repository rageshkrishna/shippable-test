import org.scalatest.{Matchers, FlatSpecLike}

class ShippableTest extends FlatSpecLike with Matchers {

  "Environment" should "contain shippable variables" in {

    Seq("HELLO_1", "WORLD_2").map(sys.env.get) match {

      case Seq(Some(hello), Some(world)) ⇒
        hello should be("hello")
        world should be("world")

      case _ ⇒ fail("No environment variables!")
    }
  }
}