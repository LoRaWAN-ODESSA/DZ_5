package task3;

public class UniqueFinder {
    int[] array;

    public UniqueFinder(int[] array) {
        this.array = array;
    }

    public int[] findUnique() {
        int[] result = {};
        for (int i = 0; i < array.length; i++) {
            boolean isUnique = true;
            int num = array[i];
            int length = 1;
            int counter = 1;
            while (num / 10 >= 1) {
                length++;
                num /= 10;
            }
            int[] numArray = new int[length];
            num = array[i];
            for (int j = 0; j < numArray.length; j++) {
                if (num / 10 >= 1) {
                    numArray[j] = num % 10;
                    num /= 10;
                } else {
                    numArray[j] = num;
                }
            }
            if (numArray.length == 1) {
                int[] temp = new int[result.length + 1];
                for (int j = 0; j < result.length; j++) {
                    temp[j] = result[j];
                }
                temp[result.length] = array[i];
                result = new int[temp.length];
                for (int j = 0; j < temp.length; j++) {
                    result[j] = temp[j];
                }
            } else {
                for (int k = 0; k < numArray.length; k++) {
                    for (int l = 0; l < numArray.length; l++) {
                        if (k != l && numArray[k] == numArray[l]) {
                            isUnique = false;
                            break;
                        }
                    }
                }
                if (isUnique) {
                    int[] temp = new int[result.length + 1];
                    for (int j = 0; j < result.length; j++) {
                        temp[j] = result[j];
                    }
                    temp[result.length] = array[i];
                    result = new int[temp.length];
                    for (int j = 0; j < temp.length; j++) {
                        result[j] = temp[j];
                    }
                }
            }
        }
        return result;
    }
}
