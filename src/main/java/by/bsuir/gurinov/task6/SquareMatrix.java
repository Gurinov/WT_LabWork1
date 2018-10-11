package by.bsuir.gurinov.task6;

public class SquareMatrix {
    private static double[] numbers = {1,2,3,14,5,6,7,8,9,10,11,12};
    public static void setNumbers(double[] numbers) {
        SquareMatrix.numbers = numbers;
    }

    public static double[][] generateSquareMatrix(){
        int length = numbers.length;
        int position;
        double[][] squareMatrix = new double[length][length];

        for(int i = 0; i < length; i++){
            position = 0;
            for(int j = i; j < length; j++){
                squareMatrix[i][position] = numbers[j];
                position++;
            }
            for(int j = 0; j < i; j++){
                squareMatrix[i][position] = numbers[j];
                position++;
            }
        }

        return squareMatrix;
    }
}
