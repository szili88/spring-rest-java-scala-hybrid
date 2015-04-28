package szili88.spring_rest_java_scala_hybrid.endpoints

import org.junit.Test
import org.junit.Assert._

class GreetingControllerScalaTest {
  @Test
  def testHello() = {
    val result = new GreetingControllerScala().hello("John")
    assertEquals("Hello, Scala John!", result)
  }
}
