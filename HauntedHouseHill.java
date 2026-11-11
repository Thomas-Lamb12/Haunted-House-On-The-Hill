package hauntedhousehill;

import static hauntedhousehill.Enemy.*;
import java.util.*;

public class HauntedHouseHill {

    public static void main(String[] args) {
        //variables
        int classChoice = 0;
        //enemylists
        ArrayList<Enemy> enemiesT1 = new ArrayList<>();
        ArrayList<Enemy> enemiesT2 = new ArrayList<>();
        ArrayList<Enemy> enemiesT3 = new ArrayList<>();
        ArrayList<Enemy> enemiesT4 = new ArrayList<>();
        
        
        initalizeT1Enemies(enemiesT1);
        // createPlayer();
        new StartScreenGUI();
         
    }
    
}
