package by.bsuir.gurinov.task5;

public class SequenceGenerator {
    private static int[] numbers = {1,2,3,14,5,6,7,8,9,10,11,12};
    public static void setNumbers(int[] numbers) {
        SequenceGenerator.numbers = numbers;
    }

    public static int getNumberOfItemsToDelete() {
        int maxIncreasingLength = 0, curIncreasingLength;
        boolean isIncreasing;

        for (int i = 0; i < numbers.length; i++) {
            isIncreasing = true;
            curIncreasingLength = 1;
            for (int j = i + 1; (j < numbers.length) && isIncreasing; j++) {
                if (numbers[j - 1] < numbers[j]) {
                    curIncreasingLength++;
                } else {
                    isIncreasing = false;
                }
            }
            maxIncreasingLength = Math.max(maxIncreasingLength, curIncreasingLength);
        }
        return numbers.length - maxIncreasingLength;
    }

}
