package by.bsuir.gurinov.task3;

public class FunctionValues {

    private int a;
    private int b;
    private int h;

    public FunctionValues(int a, int b, int h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public FunctionValues() {
        this.a = 0;
        this.b = 1;
        this.h = 1;
    }

    public void setA(int i) {
        if(h > 0)
            a = i;
        else
            a = b - h;
    }

    public void setB(int i) {
        if(h > 0)
            b = i;
        else
            b = a + h;
    }

    public void setH(int i) {
        if(h > 0)
            h = i;
        else
            h = 1;
    }

    private double F(int x){
        return Math.sin(x)/Math.cos(x);
    }

    public String getFunctionTable(){
        String result = "";
        int x = a;

        do{
            result += "| " + x + " | " + F(x) + " |\n";
            x += h;
        }while (x <= b);

        return result;
    }

}
