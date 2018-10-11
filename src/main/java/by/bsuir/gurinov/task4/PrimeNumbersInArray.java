package by.bsuir.gurinov.task4;

public class PrimeNumbersInArray {
    private static int[] numbers = {-5,0,1,2,3,4,5,6,7,8,9,10,11,12};

    public static void setNumbers(int[] numbers) {
        PrimeNumbersInArray.numbers = numbers;
    }

    public static boolean isPrimeNumbers(int num){
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

    public static void findPrimeNumbers(){
        for(int i=0; i < numbers.length; i++){
            if(isPrimeNumbers(numbers[i]))
                System.out.print(i+"; ");
        }
        System.out.print("\n");
    }
}
