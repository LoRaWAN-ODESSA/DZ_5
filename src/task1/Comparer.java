package task1;

public class Comparer {
    int[] arrayN;
    int[] arrayK;

    public Comparer(int[] arrayN, int[] arrayK) {
        this.arrayN = arrayN;
        this.arrayK = arrayK;
    }

    public boolean findSubsequence() {
        boolean isSubsequence = false;

        for (int i = 0; i < arrayN.length; i++) {
            if (arrayK[0] == arrayN[i] && arrayK.length <= arrayN.length - i) {
                isSubsequence = true;
                for (int j = 1; j < arrayK.length; j++) {
                    if (arrayK[j] != arrayN[i + j]) {
                        isSubsequence = false;
                        break;
                    }
                }
                if (isSubsequence) {
                    System.out.println("Array K is a subsequence of array N!");
                    return true;
                }
            }
        }
        System.out.println("Array K is not a subsequence of array N!");
        return false;
    }
}
