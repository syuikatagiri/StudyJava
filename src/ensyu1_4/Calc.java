package src.ensyu1_4;

public class Calc {

    private int firstNum;
    private int secondNum;

    public Calc(int firstNum, int secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    public int addCalc(){
        return firstNum + secondNum;
    }

    public int subCalc(){
        return firstNum - secondNum;
    }

    public int multiCalc(){
        return firstNum * secondNum;
    }

    public int divCalc(){
        return firstNum / secondNum;
    }
}
