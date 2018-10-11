package by.bsuir.gurinov.task2;

public class Coordinates {

    private static int cellWeight = 1;
    private static int max_X;
    private static int max_Y;
    private static int min_X;
    private static int min_Y;

    public static void setCellWeight(int cellWeight) {
        if(cellWeight > 0)
            Coordinates.cellWeight = cellWeight;
        else
            Coordinates.cellWeight = 1;

        setCoordinates();
    }

    private static void setCoordinates(){
        max_X = cellWeight * 6;
        max_Y = cellWeight * 5;
        min_X = cellWeight * 4;
        min_Y = cellWeight * 3;
    }

    public static boolean isValidCoordinates(int x, int y){

        setCoordinates();
        if(y > 0 && y < max_Y){
            if(x > -min_X && x < min_X)
                return true;
        }
        if (y <= 0 && y > min_Y){
            if(x > -max_X && x < max_X)
                return true;
        }

        return false;
    }
}
