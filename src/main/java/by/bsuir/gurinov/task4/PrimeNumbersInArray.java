package by.bsuir.gurinov.task4;

public class PrimeNumbersInArray {
    private int[] numbers;

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public PrimeNumbersInArray(int[] numbers) {
        this.numbers = numbers;
    }

    public PrimeNumbersInArray() {
        this.numbers = new int[]{-5,0,1,2,3,4,5,6,7,8,9,10,11,12};
    }

    public boolean isPrimeNumbers(int num){
        if (num <= 0) return false;
        boolean isComposite = false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isComposite = true;
                break;
            }
        }
        if (!isComposite) {
            return true;
        }
        return false;
    }

    public void findPrimeNumbers(){
        for(int i=0; i < numbers.length; i++){
            if(isPrimeNumbers(numbers[i]))
                System.out.print(i+"; ");
        }
        System.out.print("\n");
    }
}
