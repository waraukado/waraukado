public class Team {
    private String name; //チーム名
    private int teamno; //チーム番号
    private int win; //勝ち数    
    private int lose; //負け数   
    private int drow;//引き分け数
    private int tokuten; //総得点
    private int shiten; //総失点
    private int trys;//トライ数の合計
    private int winpoint; //勝ち点

    public String getName(){
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getTeamno(){
        return this.teamno;
    }
    public void setTeamno(int teamno) {
        this.teamno = teamno;
    }
    public int getWin(){
        return this.win;
    }
    public void setWin(int win) {
        this.win = win;
    }
    public int getLose(){
        return this.lose;
    }
    public void setLose(int lose) {
        this.lose = lose;
    }
    public int getDrow(){
        return this.drow;
    }
    public void setDrow(int drow) {
        this.drow = drow;
    }
    public int getTokuten(){
        return this.tokuten;
    }
    public void setTokuten(int tokuten) {
        this.tokuten = tokuten;
    }
    public int getShiten(){
        return this.shiten;
    }
    public void setShiten(int shiten) {
        this.shiten = shiten;
    }
    public int getTrys(){
        return this.trys;
    }
    public void setTrys(int trys) {
        this.trys = trys;
    }
    public int getWinpoint(){
        return this.winpoint;
    }
    public void setWinpoint(int winpoint) {
        this.winpoint = winpoint;
    }

    Team(String name,int teamno){
        this.name = name;
        this.teamno = teamno;
    }
    
}
