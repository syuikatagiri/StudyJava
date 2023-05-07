package src.ensyu1_1;

public class Record {

    private String studentNo;
    private String studentName;
    private int math;
    private int english;
    private int japanese;
    private int science;

    public Record(String studentNo, String studentName, int math, int english, int japanese, int science) {
        this.studentNo = studentNo;
        this.studentName = studentName;
        this.math = math;
        this.english = english;
        this.japanese = japanese;
        this.science = science;
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
