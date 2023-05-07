package src.ensyu1_4;

public class UseCalc {
    public static void main(String[] args) {

        int firstNum = Integer.parseInt(args[0]);
        int firstSecond = Integer.parseInt(args[1]);
        Calc data = new Calc(firstNum,firstSecond);

        System.out.println("加算結果は" +data.addCalc());
        System.out.println("減算結果は" +data.subCalc());
        System.out.println("乗算結果は" +data.multiCalc());
        System.out.println("除算結果は" +data.divCalc());
    }
}
