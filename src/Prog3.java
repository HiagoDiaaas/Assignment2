public class Prog3 {
    public static void main(String[] args) {
        String[] inputArray = {
                "horse", "dog", "cat", "horse", "dog"
        };

        String[] uniqueArray = removeDuplicates(inputArray);

        for(int i = 0; i < uniqueArray.length; i++) {
            System.out.println(uniqueArray[i]);
        }
    }

    public static String[] removeDuplicates(String[] array) {
        int length = array.length;
        String[] tempArray = new String[length];
        int count = 0;

        for (int i = 0; i < length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < count; j++) {
                if (array[i].equals(tempArray[j])) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                tempArray[count] = array[i];
                count++;
            }
        }

        String[] resultArray = new String[count];
        for (int i = 0; i < count; i++) {
            resultArray[i] = tempArray[i];
        }

        return resultArray;
    }
}

