package src.warlanderCSV;

import java.util.ArrayList;

public class Warlander {

    private String day;
    private String victoryOrFalse;
    private String teamNum;
    private int squadRank;
    private int playerRank;
    private int valorPoint;
    private String time;

    public Warlander() {
        this.day = " ";
        this.victoryOrFalse = " ";
        this.teamNum = " ";
        this.squadRank = 0;
        this.playerRank = 0;
        this.valorPoint = 0;
        this.time = " ";
    }

    public Warlander warlanDataReader(String[] strArray ){

        Warlander wd = new Warlander();

        wd.setDay( strArray[0]);
        wd.setVictoryOrFalse( strArray[1] );
        wd.setTeamNum( strArray[2] );

        // parseIntに備えて、不要な文字を消す
        String squadRank = strArray[3].replaceAll( "th|st|nd|rd","" );
        wd.setSquadRank( Integer.parseInt( squadRank ) );

        // parseIntに備えて、不要な文字を消す
        String playerRank = strArray[4].replaceAll( "th|st|nd|rd","" );
        wd.setPlayerRank( Integer.parseInt( playerRank ) );

        wd.setValorPoint( Integer.parseInt(strArray[5]) );
        wd.setTime( strArray[6]);

        return wd;
    }

    @Override
    public String toString() {
        String str =   day + " " + victoryOrFalse + " " + teamNum + " " + squadRank + " " +
                            playerRank + " " + valorPoint + " " + time + '\n';

        return str;
    }

    public int calcAverage( ArrayList<Warlander> warData ){

        int sum = 0;
        for (Warlander wd : warData){
            sum = sum + wd.getSquadRank();
        }

     return  sum / warData.size();
    }
    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getVictoryOrFalse() {
        return victoryOrFalse;
    }

    public void setVictoryOrFalse(String victoryOrFalse) {
        this.victoryOrFalse = victoryOrFalse;
    }

    public String getTeamNum() {
        return teamNum;
    }

    public void setTeamNum(String teamNum) {
        this.teamNum = teamNum;
    }

    public int getSquadRank() {
        return squadRank;
    }

    public void setSquadRank(int squadRank) {
        this.squadRank = squadRank;
    }

    public int getPlayerRank() {
        return playerRank;
    }

    public void setPlayerRank(int playerRank) {
        this.playerRank = playerRank;
    }

    public int getValorPoint() {
        return valorPoint;
    }

    public void setValorPoint(int valorPoint) {
        this.valorPoint = valorPoint;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
