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
public class AgentModel {

    private int win = 0, loss = 0, tie = 0;//the win/loss/tie records
    private int pickRock = 0, pickPaper = 0, pickScissors = 0;//how many times the player has picked each choice

    public void tie() {
        tie++;
    }

    public void loss() {
        loss++;
    }

    public void win() {
        win++;
    }

    public int getWin() {
        return win;
    }

    public int getLoss() {
        return loss;
    }

    public int getTie() {
        return tie;
    }

    public int getPickRock() {
        return pickRock;
    }

    public int getPickPaper() {
        return pickPaper;
    }

    public int getPickScissors() {
        return pickScissors;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public void setLoss(int loss) {
        this.loss = loss;
    }

    public void setTie(int tie) {
        this.tie = tie;
    }

    public void setPickRock(int pickRock) {
        this.pickRock = pickRock;
    }

    public void setPickPaper(int pickPaper) {
        this.pickPaper = pickPaper;
    }

    public void setPickScissors(int pickScissors) {
        this.pickScissors = pickScissors;
    }

    //used to update the agent on what choice the user made
    public void picked(String s) {
        s = s.toLowerCase();
        switch (s) {
            case "rock":
                pickRock++;
                //update();
                break;
            case "paper":
                pickPaper++;
                //update();
                break;
            case "scissors":
                pickScissors++;
                //update();
                break;
            default:
                throw new RuntimeException("Invalid choice!");
        }
    }
}
