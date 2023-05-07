package src.ensyu1_5;

public class UseRecord {
    public static void main(String[] args){

        Record data = new Record();

        System.out.println ( data.getStudentName() + "さんの最高点は" + data.maxSubject() + "です" );
        System.out.println ( data.getStudentName() + "さんの平均点は" + data.recordAverage() + "です" );
    }
}
