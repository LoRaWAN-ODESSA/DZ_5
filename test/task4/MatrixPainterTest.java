package task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MatrixPainterTest {
    
    @Test
    void whenBuildMatrix_thenReturnArray() {

        int input = 27;
        String[] output = {"1  2  3  4  5  6  ",
                "7  8  9  10 11 12 ",
                "13 14 15 16 17 18 ",
                "19 20 21 22 23 24 ",
                "25 26 27 *  *  *  ",
                "*  *  *  *  *  *  "};
        MatrixPainter painter = new MatrixPainter(input);
        String[] result = painter.buildMatrix();

        Assertions.assertArrayEquals(output, result);
    }

}