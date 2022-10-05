public class CalculatorMain {

    public static void main(String[] args) {

        int num1 = 50;
        int num2 = 60;


        Calculator calculator = new Calculator(50,60);

        double result1 = calculator.minus();
        double result2 = calculator.plus();
        double result3 = calculator.multiple();
        double result4 = calculator.divide();



        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);



    }

}
