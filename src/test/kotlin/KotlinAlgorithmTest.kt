import feb.ReverserInteger
import feb.twoSum
import org.junit.Test
import java.util.*

class KotlinAlgorithmTest {

    @Test fun testTwoSum() {
        val intArray :IntArray = intArrayOf(0, 2, 3, 6, 9, 11)
        val targetSum = 11

        val res = twoSum(intArray, targetSum)
        println(Arrays.toString(res))
    }
}