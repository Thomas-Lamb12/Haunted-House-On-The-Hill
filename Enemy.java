package hauntedhousehill;

import java.util.*;

// currently empty, but any additional attributes go here

public class Enemy extends Entity {
    
    public Enemy(
            String name,
            int id,
            int maxHp,
            int currentHp,
            int attack,
            int speed,
            int defence){
        
    super(name,id,maxHp,currentHp,attack,speed,defence);
    }
    
    //getters and setters are inherited from Entity
    
    public static Enemy pullEnemyT1(){
        Enemy enemy;
        ArrayList<Enemy> enemiesT1 = new ArrayList<>();
        
        enemiesT1.add(new Enemy("Failed Clone V1", 1, 10, 10, 10, 8, 0));
        enemiesT1.add(new Enemy("Failed Clone V2", 2, 10, 10, 10, 12, 0));
        enemiesT1.add(new Enemy("Failed Clone V3", 3, 15, 15, 15, 12, 5));
        
        int roll = (int)(Math.random()*3);
        enemy = enemiesT1.get(roll);
        
        return enemy;
    }
        public static Enemy pullEnemyT2(){
        Enemy enemy;
        ArrayList<Enemy> enemiesT2 = new ArrayList<>();
        
        enemiesT2.add(new Enemy("name", 4, 0, 0, 0, 0, 0));
        enemiesT2.add(new Enemy("name", 5, 0, 0, 0, 0, 0));
        enemiesT2.add(new Enemy("name", 6, 0, 0, 0, 0, 0));
        
        int roll = (int)(Math.random()*3);
        enemy = enemiesT2.get(roll);
        
        return enemy;
    }
        public static Enemy pullEnemyT3(){
        Enemy enemy;
        ArrayList<Enemy> enemiesT3 = new ArrayList<>();
        
        enemiesT3.add(new Enemy("name", 7, 0, 0, 0, 0, 0));
        enemiesT3.add(new Enemy("name", 8, 0, 0, 0, 0, 0));
        enemiesT3.add(new Enemy("name", 9, 0, 0, 0, 0, 0));
        
        int roll = (int)(Math.random()*3);
        enemy = enemiesT3.get(roll);
        
        return enemy;
    }
        public static Enemy pullEnemyT4(){
        Enemy enemy;
        ArrayList<Enemy> enemiesT4 = new ArrayList<>();
        
        enemiesT4.add(new Enemy("name", 10, 0, 0, 0, 0, 0));
        enemiesT4.add(new Enemy("name", 11, 0, 0, 0, 0, 0));
        enemiesT4.add(new Enemy("name", 12, 0, 0, 0, 0, 0));
        
        int roll = (int)(Math.random()*3);
        enemy = enemiesT4.get(roll);
        
        return enemy;
    }
    
    // final boss creation. copies certain stats from player
    public static Enemy createBoss(Player player){
        int maxHp = player.maxHp;
        int currentHp = maxHp;
        int attack = player.attack;
        int speed = player.speed;
        int defence = player.defence;
        
        Enemy boss = new Enemy("You?..", 13, maxHp, currentHp, attack, speed, defence);
        return boss;
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
