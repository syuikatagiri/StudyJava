package src.ensyu1_2;

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
