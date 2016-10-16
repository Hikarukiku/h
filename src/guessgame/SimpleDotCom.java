package guessgame;
import java.util.ArrayList;
/**
 * Created by hikarukiku on 09.10.16.
 */
public class SimpleDotCom {
    private ArrayList<String> locationCells;
    private int numOfHits = 0;
    public void setLocationCells(ArrayList <String> locs){
        locationCells = locs;
    }
    public String checkYourself(String userInput){
        int index = locationCells.indexOf(userInput);
        String result = "miss";

        if (index>=0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()){
                result = "kill";
            } else {
                result = "hit";
            }
        }
        return result;
    }
}
