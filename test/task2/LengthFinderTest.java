package task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LengthFinderTest {

    @Test
    void whenFindLongest_thenReturnLongest() {
        int[] input = {22, 13, 55311, 56};
        LengthFinder finder = new LengthFinder(input);
        Result result = finder.findLongest();

        Assertions.assertEquals(55311, result.number);
        Assertions.assertEquals(5, result.length);
    }

    @Test
    void whenFindShortest_thenReturnShortest() {
        int[] input = {22, 13, 55311, 56};
        LengthFinder finder = new LengthFinder(input);
        Result result = finder.findShortest();

        Assertions.assertEquals(56, result.number);
        Assertions.assertEquals(2, result.length);
    }


}