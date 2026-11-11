package hauntedhousehill;
import java.util.ArrayList;

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
    // list of enemies based on power/floors
    ArrayList<Enemy> enemiesT1 = new ArrayList<>();
    ArrayList<Enemy> enemiesT2 = new ArrayList<>();
    ArrayList<Enemy> enemiesT3 = new ArrayList<>();
    ArrayList<Enemy> enemiesT4 = new ArrayList<>();
    
    // T1 enemies (super fast low attack, super high hp enemy, neutral enemy)
    public void initalizeT1Enemies(){
    Enemy enemyNeutralT1 = new Enemy("Failed Clone V1", 1, 10, 10, 8, 0);
    Enemy enemyFastT1 = new Enemy("Failed Clone V2", 2, 10, 10, 12, 0);
    Enemy enemyFastStrongT1 = new Enemy("Failed Clone V3", 3, 15, 15, 12, 5);
    enemiesT1.add(enemyNeutralT1);
    enemiesT1.add(enemyFastT1);
    enemiesT1.add(enemyFastStrongT1);
    }
    
    public void initalizeT2Enemies(){
    Enemy enemyNeutralT2 = new Enemy("name", 4, 0, 0, 0, 0);
    Enemy enemyFastT2 = new Enemy("name", 5, 0, 0, 0, 0);
    Enemy enemyFastStrongT2 = new Enemy("name", 6, 0, 0, 0, 0);
    enemiesT2.add(enemyNeutralT2);
    enemiesT2.add(enemyFastT2);
    enemiesT2.add(enemyFastStrongT2);
    }
    
    public void initalizeT3Enemies(){
    Enemy enemyNeutralT3 = new Enemy("name", 7, 0, 0, 0, 0);
    Enemy enemyFastT3 = new Enemy("name", 8, 0, 0, 0, 0);
    Enemy enemyFastStrongT3 = new Enemy("name", 9, 0, 0, 0, 0);
    enemiesT3.add(enemyNeutralT3);
    enemiesT3.add(enemyFastT3);
    enemiesT3.add(enemyFastStrongT3);
    }
    
    public void initalizeT4Enemies(){
    Enemy enemyNeutralT4 = new Enemy("name", 10, 0, 0, 0, 0);
    Enemy enemyFastT4 = new Enemy("name", 11, 0, 0, 0, 0);
    Enemy enemyFastStrongT4 = new Enemy("name", 12, 0, 0, 0, 0);
    enemiesT4.add(enemyNeutralT4);
    enemiesT4.add(enemyFastT4);
    enemiesT4.add(enemyFastStrongT4);    
    }
    // hp = 20 increasing, attack low increases
    // 12 encounters, 3 fights for lvl up
    // drop initialized here as an arraylist
}
