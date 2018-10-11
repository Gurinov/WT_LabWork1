package by.bsuir.gurinov.task5;

public class SequenceGenerator {
    private int[] numbers;
    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public SequenceGenerator(int[] numbers) {
        this.numbers = numbers;
    }

    public SequenceGenerator() {
        this.numbers = new int[]{1,2,3,5,6,7,8,9,10,11,14,12};
    }

    public int getNumberOfItemsToDelete() {
        int maxLength = 0;
        int[] maxSubsequence = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            int max = 0;
            for (int j = 0; j < i; j++) {
                if (numbers[j] < numbers[i] && maxSubsequence[j]>max) {
                    max = maxSubsequence[j];
                }
            }
            maxSubsequence[i] = max + 1;
            if(maxLength < maxSubsequence[i]){
                maxLength = maxSubsequence[i];
            }
        }
        return numbers.length - maxLength;
    }

}
