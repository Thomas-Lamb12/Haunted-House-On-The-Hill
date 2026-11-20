package hauntedhousehill;

import static hauntedhousehill.Enemy.*;
import java.util.*;

public class HauntedHouseHill {

    public static void main(String[] args) {
        //variables (feel free to append)
        int classChoice = 0;
        int roundTimer = 0;
        
        // call these on object creation. Essential for keeping battle simple. overwrite currentEnemy when a new enemy appears
        Player thePlayer;
        Enemy currentEnemy;
        Enemy boss;
        
        //enemylists and initalization
        ArrayList<Enemy> enemiesT1 = new ArrayList<>();
        ArrayList<Enemy> enemiesT2 = new ArrayList<>();
        ArrayList<Enemy> enemiesT3 = new ArrayList<>();
        ArrayList<Enemy> enemiesT4 = new ArrayList<>();
        initalizeT1Enemies(enemiesT1);
        initalizeT2Enemies(enemiesT2);
        initalizeT3Enemies(enemiesT3);
        initalizeT4Enemies(enemiesT4);
        
        // BEINNING OF GAMEPLAY!! * ************************************************************
         
    }
    
}
