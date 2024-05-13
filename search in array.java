public class Main {
    public static void main(String[] args) {
        int[] arr = {23, 10, 5, 8, 2, 15};
        int searchNum = 10;
        int occurrences = countOccurrences(arr, searchNum);
        if (occurrences > 0) {
            System.out.println(searchNum + " appears " + occurrences + " times in the array.");
        } else {
            System.out.println(searchNum + " does not appear in the array.");
        }
    }

    public static int countOccurrences(int[] arr, int num) {
        int count = 0;
        for (int element : arr) {
            if (element == num) {
                count++;
            }
        }
        return count;
    }
}