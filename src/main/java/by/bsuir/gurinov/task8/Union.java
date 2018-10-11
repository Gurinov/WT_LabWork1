package by.bsuir.gurinov.task8;

public class Union {
    private double[] numbersA;
    private double[] numbersB;

    public Union(double[] numbersA, double[] numbersB) {
        this.numbersA = numbersA;
        this.numbersB = numbersB;
    }

    public Union() {
        this.numbersA = new double[]{1,2.5,3,5,26};
        this.numbersB = new double[]{1.5,2.3,18,19,28};
    }

    public String joinArrays(){
        String result = "";
        int positionInNumbersB = 0;
        for(int i = 0; i < numbersA.length-1; ){
            if(numbersB[positionInNumbersB] >= numbersA[i] && numbersB[positionInNumbersB] <= numbersA[i+1]){
                result += (i+1) + "; ";
                positionInNumbersB++;
            }
            else
                i++;
        }
        int i = positionInNumbersB;
        positionInNumbersB = numbersA.length + 1;
        for(; i < numbersB.length; i++){
                result += (positionInNumbersB++) + "; ";
        }

        return result;
    }
}
