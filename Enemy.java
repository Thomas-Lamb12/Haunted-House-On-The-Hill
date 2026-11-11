package hauntedhousehill;

import java.util.*;

// currently empty, but any additional attributes go here

public class Enemy extends Entity {
    
    public Enemy(
            String name,
            int id,
            int maxHp,
            int attack,
            int speed,
            int defence){
        
    super(name,id,maxHp,attack,speed,defence);
        
    }
    
    /* list of enemies based on power/floors
    ArrayList<Enemy> enemiesT1 = new ArrayList<>();
    ArrayList<Enemy> enemiesT2 = new ArrayList<>();
    ArrayList<Enemy> enemiesT3 = new ArrayList<>();
    ArrayList<Enemy> enemiesT4 = new ArrayList<>();
    */
    
    // T1 enemies (super fast low attack, super high hp enemy, neutral enemy)
    public static void initalizeT1Enemies(ArrayList list){
    Enemy enemyNeutralT1 = new Enemy("Failed Clone V1", 1, 10, 10, 8, 0);
    Enemy enemyFastT1 = new Enemy("Failed Clone V2", 2, 10, 10, 12, 0);
    Enemy enemyFastStrongT1 = new Enemy("Failed Clone V3", 3, 15, 15, 12, 5);
    list.add(enemyNeutralT1);
    list.add(enemyFastT1);
    list.add(enemyFastStrongT1);
    }
    
    public static void initalizeT2Enemies(ArrayList list){
    Enemy enemyNeutralT2 = new Enemy("name", 4, 0, 0, 0, 0);
    Enemy enemyFastT2 = new Enemy("name", 5, 0, 0, 0, 0);
    Enemy enemyFastStrongT2 = new Enemy("name", 6, 0, 0, 0, 0);
    list.add(enemyNeutralT2);
    list.add(enemyFastT2);
    list.add(enemyFastStrongT2);
    }
    
    public static void initalizeT3Enemies(ArrayList list){
    Enemy enemyNeutralT3 = new Enemy("name", 7, 0, 0, 0, 0);
    Enemy enemyFastT3 = new Enemy("name", 8, 0, 0, 0, 0);
    Enemy enemyFastStrongT3 = new Enemy("name", 9, 0, 0, 0, 0);
    list.add(enemyNeutralT3);
    list.add(enemyFastT3);
    list.add(enemyFastStrongT3);
    }
    
    public static void initalizeT4Enemies(ArrayList list){
    Enemy enemyNeutralT4 = new Enemy("name", 10, 0, 0, 0, 0);
    Enemy enemyFastT4 = new Enemy("name", 11, 0, 0, 0, 0);
    Enemy enemyFastStrongT4 = new Enemy("name", 12, 0, 0, 0, 0);
    list.add(enemyNeutralT4);
    list.add(enemyFastT4);
    list.add(enemyFastStrongT4);    
    }
    
    /*public void initalizeAllEnemies(){
        initalizeT1Enemies(enemiesT1);
        initalizeT2Enemies(enemiesT2);
        initalizeT3Enemies(enemiesT3);
        initalizeT4Enemies(enemiesT4);
    }*/
    
    // hp = 20 increasing, attack low increases
    // 12 encounters, 3 fights for lvl up
    // drop initialized here as an arraylist
}
