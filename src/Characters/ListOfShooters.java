package Characters;

import java.util.ArrayList;

public class ListOfShooters {
    public ArrayList<Character> list = new ArrayList<>();
    int numberOfShooters = 0;

    public void addCharacter(Character ch) {
        list.add(ch);
        numberOfShooters ++;
    }


    public int getNumberOfShooters() throws ZeroShooters {
        if (numberOfShooters != 0) {
            return numberOfShooters;
        } else {
            throw new ZeroShooters();
        }
    }

    public String hasCharacter(Character ch) throws BegemotIsNotShooter {
        if (list.contains(ch) == true) {
            return "";
        } else {
            throw new BegemotIsNotShooter();
        }
    }
}
