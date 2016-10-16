package guessgame;
import java.util.Random;
import java.util.ArrayList;
/**
 * Created by hikarukiku on 09.10.16.
 */
public class SimpleDotComGame {
    public static void main(String[] args) {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();
        SimpleDotCom theDotCom = new SimpleDotCom();
        int randomNum = (int) (Math.random()*5);

        ArrayList<Integer> locations = new ArrayList<Integer>;
        locations.add(randomNum);
        locations.add(randomNum+1);
        locations.add(randomNum+2);
        theDotCom.setLocationCells(locations);
        boolean isAlive = true;

        while (isAlive){
            String guess = helper.getUserInput("enter a number");
            String result = theDotCom.checkYourself(guess);
            numOfGuesses++;
        if (result.equals("kill")){
            isAlive = false;
            System.out.println("You took "+numOfGuesses + " guesses");
            }
        }
    }
}
