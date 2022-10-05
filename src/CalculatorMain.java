public class CalculatorMain {

    public static void main(String[] args) {

        int num1 = 50;
        int num2 = 60;

        Calculator calculator = new Calculator();

        double result1 = calculator.minus(50,60);
        double result2 = calculator.plus(70,90);
        double result3 = calculator.multiple(50,6);
        double result4 = calculator.divide(10,20);




        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);



    }

}

