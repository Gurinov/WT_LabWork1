package by.bsuir.gurinov.task3;

public class FunctionValues {

    private static int a = 0;
    private static int b = 1;
    private static int h = 1;

    public static void setA(int i) {
        if(h > 0)
            a = i;
        else
            a = b - h;
    }

    public static void setB(int i) {
        if(h > 0)
            b = i;
        else
            b = a + h;
    }

    public static void setH(int i) {
        if(h > 0)
            h = i;
        else
            h = 1;
    }

    private static double F(int x){
        return Math.sin(x)/Math.cos(x);
    }

    public static String getFunctionTable(){
        String result = "";
        int x = a;

        do{
            result += "| " + x + " | " + F(x) + " |\n";
            x += h;
        }while (x <= b);

        return result;
    }

}
