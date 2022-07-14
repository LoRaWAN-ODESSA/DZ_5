package task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ComparerTest {

    @Test
    void whenFindSubsequence_thenReturnBoolean1() {
        int[] inputN = {10, -2, 13, -3, 55, 15, 6, 88, 99, 53, 34, 0, -27, 3, 45, 13, -2, 77, 15, 90, 7654};
        int[] inputK = {13, -2, 77, 15};
        Comparer comparer = new Comparer(inputN, inputK);
        boolean result = comparer.findSubsequence();

        Assertions.assertEquals(true, result);
    }

    @Test
    void whenFindSubsequence_thenReturnBoolean2() {
        int[] inputN = {10, -2, 13, -3, 55, 15, 6, 88, 99, 53, 34, 0, -27, 3, 45, 13, -2, 77, 15, 90, 7654};
        int[] inputK = {13, 14, 7, 15};
        Comparer comparer = new Comparer(inputN, inputK);
        boolean result = comparer.findSubsequence();

        Assertions.assertEquals(false, result);
    }
}