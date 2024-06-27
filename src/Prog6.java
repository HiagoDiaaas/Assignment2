public class Prog6 {
    public static void main(String[] args) {
        int[] arrayOfInts = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};

        int minValue = min(arrayOfInts);
        System.out.println("The minimum value in the array is: " + minValue);
    }

    public static int min(int[] arrayOfInts) {
        if (arrayOfInts == null || arrayOfInts.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }

        int minValue = arrayOfInts[0];

        for (int i = 1; i < arrayOfInts.length; i++) {
            if (arrayOfInts[i] < minValue) {
                minValue = arrayOfInts[i];
            }
        }

        return minValue;
    }
}

