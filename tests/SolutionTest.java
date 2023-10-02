import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import java.util.Random;

public class SolutionTest {
    @Test
    public void basicTests() {
        assertArrayEquals(new int[]{1, 2, 3, 4}, Kata.between(1, 4));
        assertArrayEquals(new int[]{-2, -1, 0, 1, 2}, Kata.between(-2, 2));
        assertArrayEquals(new int[]{-10,-9,-8,-7,-6,-5,-4,-3,-2,-1,0,1,2,3,4,5,6,7,8,9,10}, Kata.between(-10, 10));
        assertArrayEquals(new int[]{5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100}, Kata.between(5, 100));
    }

    @Test
    public void randomTests() {
        Random rnd = new Random();
        for (int i=0; i<100; ++i) {
            int a = rnd.nextInt(201) - 100;
            int b = a + rnd.nextInt(new int[]{5,20,50}[rnd.nextInt(3)]) + 1;
            int[] expected = java.util.stream.IntStream.rangeClosed(a, b).toArray();
            int[] actual = Kata.between(a, b);
            assertArrayEquals(expected, actual);
        }
    }
}