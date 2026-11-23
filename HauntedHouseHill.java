package hauntedhousehill;

import static hauntedhousehill.Enemy.*;
import static hauntedhousehill.Player.*;
import static hauntedhousehill.Entity.*;
import java.util.*;

public class HauntedHouseHill {
    

    public static void main(String[] args) {
        //variables (feel free to append)
        int classChoice = 0;
        int currentFloor = 1;
        
        // call these on object creation. Essential for keeping battle simple. overwrite currentEnemy when a new enemy appears
        Player thePlayer;
        Enemy currentEnemy;
        Enemy boss;
        
        // BEINNING OF GAMEPLAY!! * ************************************************************
        
        // code testing, works so far!
         thePlayer = createPlayer(1);
         System.out.println(thePlayer.getAttack());
         currentEnemy = pullEnemyT1();
         System.out.println(currentEnemy.id);
         
         thePlayer.attackTarget(currentEnemy, thePlayer);
         thePlayer.attackTarget(currentEnemy, thePlayer);
         thePlayer.attackTarget(currentEnemy, thePlayer);
         System.out.println(thePlayer.getAttack());
    }
    
}
