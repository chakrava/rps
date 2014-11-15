/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rockpaperscissors;

/**
 * Represents what the agent knows of the world, specifically, the history of
 * the player's choices
 */
public interface Agent {
    //AgentModel model=new AgentModel();
    //double choice=0;//a randomly generated number between 0 and 1, used to pick the computer's choice
    //int pickRockAgent = 0, pickPaperAgent = 0, pickScissorsAgent = 0;//how many times the agent has selected each choice

    public float getChosenRock();

    public float getChosenPaper();

    public int getPickRockAgent();

    public int getPickPaperAgent();

    public int getPickScissorsAgent();

    public double getChoice();

    public int getWin();

    public void setWin(int win);

    public int getLoss();

    public void setLoss(int loss);

    public int getTie();

    public void setTie(int tie);

    //generates a random number and uses it to select a choice
    public String agentGetChoice();

    //updates the floats to adjust the chances the agent thinks the player will pick each choice
    public void update();

}
