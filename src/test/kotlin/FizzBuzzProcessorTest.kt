import org.junit.Assert
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import processor.FizzBuzzProcessor

class FizzBuzzProcessorTest {
  lateinit var sharedInstance: FizzBuzzProcessor

  @Before
  fun setUp() {
    sharedInstance = FizzBuzzProcessor()
  }

  @Test
  fun `normal numbers`() {
    Assert.assertEquals("1", sharedInstance.convert(1))
    Assert.assertEquals("2", sharedInstance.convert(2))
  }

  @Test
  fun `three numbers`() {
    Assert.assertEquals("Fizz", sharedInstance.convert(3))
  }

  @Test
  fun `five numbers`() {
    Assert.assertEquals("Buzz", sharedInstance.convert(5))
  }
}
