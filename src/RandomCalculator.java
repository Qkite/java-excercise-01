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
            System.out.println((float) inputNum / (float) randomNumber);
        }catch (ArithmeticException e){
            System.out.println("random한 숫자가 0으로 생성되었습니다.");
        }

    }

}
