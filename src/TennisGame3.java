public class TennisGame3 implements TennisGame
{
    public int player1Points = 0;
    public int player2Points = 0;
    
    public String P1res = "";
    public String P2res = "";
    private String player1Name;
    private String player2Name;

    public TennisGame3(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }
    
    public String getLiteralScore() {
    	String literalScore = "";
    	if(isNormal())
        	literalScore = getLiteral(player1Points) + "-" + getLiteral(player2Points);
        if(isTie())
        	literalScore = getLiteral(player1Points)+ "-All";
        if(isDeuce())
        	literalScore = "Deuce";
        if(isInAdvantageOver(player1Points,player2Points))
        	literalScore = "Advantage player1";
        if(isInAdvantageOver(player2Points,player1Points))
        	literalScore = "Advantage player2";
       
    	return literalScore;
    }
    
    
    private boolean isNormal() {
    	return player2Points != player1Points;
    }
    private boolean isTie() {
    	return player1Points == player2Points && player1Points < 4;
    }
    private boolean isInAdvantageOver(int firstPlayerPoints, int secondPlayerPoints) {
    	return firstPlayerPoints < secondPlayerPoints && secondPlayerPoints>=3;
    }
   
    private boolean isDeuce() {
    	return player1Points == player2Points && player1Points >= 3;
    }

    
    private String getLiteral(int playerPoints) {
    	String result = "";
    	if(playerPoints == 0)
    		result = "Love";
    	if(playerPoints == 1)
    		result = "Fifteen";
    	if(playerPoints == 2)
    		result = "Thirty";
    	if(playerPoints == 3)
    		result = "Forty";
    	return result;
    }
    
    public String getScore(){
        String score = "";
        
        return score;
    }
    
    
    
    public void SetP1Score(int number){
        
        for (int i = 0; i < number; i++)
        {
            P1Score();
        }
            
    }
    
    public void SetP2Score(int number){
        
        for (int i = 0; i < number; i++)
        {
            P2Score();
        }
            
    }
    
    public void P1Score(){
        player1Points++;
    }
    
    public void P2Score(){
        player2Points++;
    }

    public void wonPoint(String player) {
        if (player == "player1")
            P1Score();
        else
            P2Score();
    }
}