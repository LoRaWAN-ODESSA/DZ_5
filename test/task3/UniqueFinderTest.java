package task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UniqueFinderTest {

    @Test
    void whenFindUnique_thenReturnArray() {
        int[] input = {2, 34, 553, 34, 9873, 1233, 22, 1234561, 22222, 1, 398662829, 19283734, 3, 11, 987463, 12345, 67894, 1230, 8876, 47, 56765};
        int[] output = {2, 34, 34, 9873, 1, 3, 987463, 12345, 67894, 1230, 47};

        UniqueFinder finder = new UniqueFinder(input);
        int[] result = finder.findUnique();

        Assertions.assertArrayEquals(output, result);
    }
}