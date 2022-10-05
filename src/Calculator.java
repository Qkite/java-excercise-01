public class Calculator {


    static double num1, num2;

    Calculator(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public static double plus(){
        return num1 + num2;
    }

    public static double minus(){
        return num1 - num2;
    }


    public static double multiple(){
        return num1 * num2;
    }

    public static double divide(){
        return num1 / num2;
    }

}
