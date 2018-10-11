package by.bsuir.gurinov.task1;

public class Formula {

    private double x;
    private double y;

    public Formula(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Formula() {
        this.x = 0;
        this.y = 0;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getResult(){
        return (1 + Math.pow(Math.sin(x+y),2)) / (2 + Math.abs(x - 2*x/(1 + Math.pow(x,2)*Math.pow(y,2)))) + x;
    }

}
