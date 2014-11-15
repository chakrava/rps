/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rockpaperscissors;

/**
 * This class contains the logic for the program, specifically the "paper beats
 * rocks" and other comparisons
 */
public class Logic {

    static AgentModel stats=null;
    static SimpleReflex simpleReflex = null;
    static RandomGuess randomGuess=null;
    
    Logic(AgentModel st){
        stats = st;
        simpleReflex=new SimpleReflex(st);
        randomGuess=new RandomGuess(st);
    }
    
    public void picked(String picked){
        //TODO update all the agents with how they did
    }
    
    static String getChoice(){
        randomGuess.agentGetChoice();
        return simpleReflex.agentGetChoice();
    }

    public void update(){
        simpleReflex.update();
    }
    
    //compares the selection of the user and AI and returns the winner (as a string)
    static String compareChoices(int user, int ai) {
        if (user == ai) {
            System.out.println("Tie");
            return "Tie";
        } else if (user == ai + 1 || (user == 0 && ai == 2)) {
            System.out.println("User wins!");
            return "User";
        } else {
            System.out.println("AI wins");
            return "AI";
        }
    }

    //turns an incoming string ("rock") into an integer (0)
    //"rock" = 0
    //"paper" = 1
    //"scissors" = 2
    static int ChoiceStringToInt(String s) {
        switch (s) {
            case "rock":
                return 0;
            case "paper":
                return 1;
            case "scissors":
                return 2;
            default:
                throw new RuntimeException("Invalid choice!");
        }
    }

}
