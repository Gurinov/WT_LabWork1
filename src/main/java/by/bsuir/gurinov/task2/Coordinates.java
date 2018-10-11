package by.bsuir.gurinov.task2;

public class Coordinates {

    private int cellWeight;
    private int max_X;
    private int max_Y;
    private int min_X;
    private int min_Y;

    public Coordinates(int cellWeight) {
        this.cellWeight = cellWeight;
    }
    public Coordinates() {
        this.cellWeight = 1;
    }

    public void setCellWeight(int cellWeight) {
        if(cellWeight > 0)
            this.cellWeight = cellWeight;
        else
            this.cellWeight = 1;
        setCoordinates();
    }

    private void setCoordinates(){
        max_X = cellWeight * 6;
        max_Y = cellWeight * 5;
        min_X = cellWeight * 4;
        min_Y = -cellWeight * 3;
    }

    public boolean isValidCoordinates(int x, int y){

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
