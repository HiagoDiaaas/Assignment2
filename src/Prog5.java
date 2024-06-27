public class Prog5 {
    public static void main(String[] args) {
        int[] a = {5, 6, -4, 3, 1};
        int[] b = {3, 8, 9, 11};

        int[] combinedArray = combine(a, b);

        for(int i : combinedArray) {
            System.out.print(i + " ");
        }
    }

    public static int[] combine(int[] a, int[] b) {
        int[] combinedArray = new int[a.length + b.length];

        System.arraycopy(a, 0, combinedArray, 0, a.length);
        System.arraycopy(b, 0, combinedArray, a.length, b.length);

        return combinedArray;
    }
}
