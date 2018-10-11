package by.bsuir.gurinov.task7;

public class ShellSort {

    public static double[] sort(double[] array) {
        int currentIndex = 0;
        double buffer;

        while (currentIndex < (array.length - 1)) {
            if (array[currentIndex] <= array[currentIndex + 1]) {
                currentIndex++;
            } else {
                buffer = array[currentIndex];
                array[currentIndex] = array[currentIndex + 1];
                array[currentIndex + 1] = buffer;
                if (currentIndex > 0) {
                    currentIndex--;
                }
            }
        }
        return array;
    }

}
