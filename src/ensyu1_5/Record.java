package src.ensyu1_5;

import java.util.Arrays;

public class Record {

    private String studentNo;
    private String studentName;
    private int math;
    private int english;
    private int japanese;
    private int science;

    public Record() {
        this.studentNo = "E01";
        this.studentName = "Betty";
        this.math = 85;
        this.english = 80;
        this.japanese = 75;
        this.science = 90;
    }

    public void dispStudent(){

        System.out.println( "学籍番号は\t" + studentNo  + "点\n" +
                            "氏 名は\t"   + studentName      + "点\n" +
                            "数 学は\t"   + math       + "点\n" +
                            "英 語は\t"   + english    + "点\n" +
                            "国 語は\t"   + japanese   + "点\n" +
                            "理　科は\t"  + science    + "点\n" );
    }

    public int[] toArray() {
        int[] arr = new int[4];
        arr[0] = math;
        arr[1] = english;
        arr[2] = japanese;
        arr[3] = science;

        return arr;
    }
    public String maxSubject(){
        String[] subjectNames = {"数学","英語","国語","理科"};
        String str;
        int[] arr = toArray();
        int maxNum = arr[0];
        int index = 0;

        for(int i = 1; i < arr.length; i++){

            if(maxNum < arr[i]){
                maxNum = arr[i];
                index = i;
            }
        }

        return subjectNames[index] + "で" + maxNum;
    }

    public int recordAverage(){
        int sum = math + english + japanese + science;
        int avg = sum / 4;

        return avg;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getJapanese() {
        return japanese;
    }

    public void setJapanese(int japanese) {
        this.japanese = japanese;
    }

    public int getScience() {
        return science;
    }

    public void setScience(int science) {
        this.science = science;
    }
}
