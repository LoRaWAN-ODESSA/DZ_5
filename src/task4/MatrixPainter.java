package task4;

public class MatrixPainter {
    int k;

    public MatrixPainter(int k) {
        this.k = k;
    }

    public String[] buildMatrix() {
        int separator = calculateSeparator(k);
        int dozen = 1;
        int position = 1;
        int size = calculateSize(k);
        String[] result = new String[size];

        for (int i = 0; i < size; i++) {
            String row = "";
            for (int j = 0; j < size; j++) {
                if (position / 10 < dozen && position <= k) {
                    row += position + (" ".repeat(separator));
                    position++;
                } else if (position / 10 == dozen && position <= k) {
                    dozen *= 10;
                    separator--;
                    row += position + (" ".repeat(separator));
                    position++;
                } else {
                    separator = calculateSeparator(k);
                    row += "*" + (" ".repeat(separator));
                    position++;
                }
            }
            result[i] = row;
        }
        printMatrix(result);
        return result;
    }

    private int calculateSeparator(int k) {
        int separator = 1;
        while (k / 10 >= 1) {
            separator++;
            k /= 10;
        }
        return separator;
    }

    private int calculateSize(int k) {
        int size = 1;
        while (size * size < k) {
            size++;
        }
        return size;
    }

    private void printMatrix(String[] matrix) {
        for (int i = 0; i < calculateSize(k); i++) {
            System.out.println(matrix[i]);
        }
    }
}
