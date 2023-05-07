package src.ensyu1_1;

public class UseRecord {
    public static void main(String[] args){

        Record data = new Record("E01","Betty",85, 80, 75,90 );

        System.out.println( "学籍番号は\t" + data.getStudentNo()  + "点\n" +
                            "氏 名は\t"   + data.getMath()       + "点\n" +
                            "数 学は\t"    + data.getMath()       + "点\n" +
                            "英 語は\t"   + data.getEnglish()    + "点\n" +
                            "国 語は\t"     + data.getJapanese()   + "点\n" +
                            "理　科は\t"   + data.getScience()    + "点\n" );
    }
}
