/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rockpaperscissors;

/**
 *
 * @author Erik Storla <estorla42@gmail.com>
 */
public class RandomGuess implements Agent {

    AgentModel model = null;
    private int win = 0, loss = 0, tie = 0;//the win/loss/tie records
    private double choice;//a randomly generated number between 0 and 1, used to pick the computer's choice
    private int pickRockAgent = 0, pickPaperAgent = 0, pickScissorsAgent = 0;//how many times the agent has selected each choice
    private float chosenRock = 1 / (float) 3, chosenPaper = 2 / (float) 3;//used to set the ranges the computer uses to split up each choice

    RandomGuess(AgentModel am){
        model=am;
    }
    
    @Override
    public float getChosenRock() {
        return chosenRock;
    }

    @Override
    public float getChosenPaper() {
        return chosenPaper;
    }

    @Override
    public int getPickRockAgent() {
        return pickRockAgent;
    }

    @Override
    public int getPickPaperAgent() {
        return pickPaperAgent;
    }

    @Override
    public int getPickScissorsAgent() {
        return pickScissorsAgent;
    }

    @Override
    public double getChoice() {
        return choice;
    }

    @Override
    public int getWin() {
        return win;
    }

    @Override
    public void setWin(int win) {
        this.win = win;
    }

    @Override
    public int getLoss() {
        return loss;
    }

    @Override
    public void setLoss(int loss) {
        this.loss = loss;
    }

    @Override
    public int getTie() {
        return tie;
    }

    @Override
    public void setTie(int tie) {
        this.tie = tie;
    }

    @Override
    public String agentGetChoice() {
        choice = Math.random();
        return getLastChoice();
    }

    public String getLastChoice(){
        if (choice<=(1/3)) {
            pickPaperAgent++;
            return "paper";
        } else if (choice <=(2/3)) {
            pickScissorsAgent++;
            return "scissors";
        } else {
            pickRockAgent++;
            return "rock";
        }
    }
    
    @Override
    public void update() {
        int pickRock = model.getPickRock();
        int pickPaper = model.getPickPaper();
        int pickScissors = model.getPickScissors();

        int totalPicks = pickRock + pickPaper + pickScissors;
        if (totalPicks < 10) {//if there's been less than 10 picks there's not enough data, don't change ranges
            return;
        }

        chosenRock = (float) pickRock / totalPicks;
        chosenPaper = chosenRock + (float) pickPaper / totalPicks;

        System.out.println(pickRock + " " + pickPaper + " " + pickScissors);
        System.out.println(chosenRock + " " + chosenPaper + " 1");
    }

}
