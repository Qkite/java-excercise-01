public class RandomCalculator {

    static int randomNumber = (int)(Math.random()*9);
    static int inputNum;

    RandomCalculator(int inputNum){
        this.inputNum = inputNum;
    }

    public static void plus(){
        System.out.println(inputNum + randomNumber);
    }

    public static void minus(){
        System.out.println(inputNum - randomNumber);
    }

    public static void multiple(){
        System.out.println(inputNum * randomNumber);
    }

    public static void divide(){

        try{
            double resultNumber =  inputNum / randomNumber;
            if (Double.isInfinite(resultNumber)||Double.isNaN(resultNumber)){
                throw new ArithmeticException();
            }
            System.out.println(inputNum / randomNumber);
        }catch (ArithmeticException e){
            System.out.println("random한 숫자가 0으로 생성되었습니다.");
        }

    }

}
