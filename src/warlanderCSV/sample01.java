package src.warlanderCSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class sample01 {
    public static void main(String[] args) throws IOException {

        //　ファイルの読み込み
        FileReader fr = new FileReader( "D:\\Git\\git\\StudyJava\\src\\warlanderCSV\\sample.csv" );
        BufferedReader br = new BufferedReader( fr );
        ArrayList<Warlander> warData = new ArrayList<Warlander>();
        Warlander wd = new Warlander();
        String line = null;
        int i = 0;

        while( ( line = br.readLine() ) != null ){

            // カンマ区切りで分割
            String[] strArray = line.split( "," );

            /* 1行目の見出しは不要のため、飛ばす */
            if( i == 0 ){

                i++;
                continue;
            }

            // 1レコード分のデータを格納
            wd = wd.warlanDataReader( strArray );

            // 1レコードをリストに格納
            warData.add( wd );

            i++;
        }

        String str = warData.toString();

        System.out.println( str.replaceAll("\\[|\\]|,\\s","") );
        System.out.println( wd.calcAverage( warData ) );
        fr.close();

    }
}
