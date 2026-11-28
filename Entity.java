package hauntedhousehill;

import java.util.ArrayList;

public class Entity {
        // Entity variables: id, name, maxHP, speed, currentHp, defence, attack
    
    protected final int id;
    protected String name;
    protected int maxHp;
    protected int speed;
    protected int currentHp;
    protected int defence;
    protected int attack;

    // constructor (would use Player or Enemy over this.)
    protected Entity(
            String name,
            int id,
            int maxHp,
            int currentHp,
            int attack,
            int speed,
            int defence) {

        // keep an eye on this incase giving an empty name throws an error
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Character name cannot be empty.");
        }
        
        this.id = id;
        this.name = name.trim();
        this.maxHp = maxHp;
        this.currentHp = currentHp;
        this.speed = speed;
        this.attack = attack;
        this.defence = defence;
    }

    // getters below
    public boolean isAlive() {
        return currentHp > 0;
    }
    //every entity should be initialized with an ID for easy reference
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getMaxHp() {
        return maxHp;
    }
    public int getCurrentHp() {
        return currentHp;
    }
    public int getAttack() {
        return attack;
    }
    public int getDefence() {
        return defence;
    }
    public int getSpeed(){
        return speed;
    }
    
    // setters below
    public void setName(String newName){
        name = newName;
    }
    public void setMaxHP(int newMaxHp){
        maxHp = newMaxHp;
    }
    public void setAttack(int newAttack){
        attack = newAttack;
    }
    public void setDefence(int newDefence){
        defence = newDefence;
    }
    public void setSpeed(int newSpeed){
        speed = newSpeed;
    }
    
    // linked to takeDamage
    
    // this is for player attacks
    public void attackTarget(Entity target, Player thePlayer){
        int attackPower = this.attack;
        int accuracyDeviation;
        int accuracyBonus;
        
        if (target.speed - this.speed < 0){
            accuracyDeviation = 0;
            accuracyBonus = Math.abs(target.speed - this.speed);
        }
        else{
            accuracyDeviation = target.speed - this.speed;
            accuracyBonus = 0;
        }
        int accRoll = (int)((Math.random() * (100)) + (1 + accuracyBonus));
        if (accRoll <= accuracyDeviation){
            return;
        }
        target.takeDamage(attackPower, thePlayer);
    }
    
    // this if for enemy attacks
    public void attackTarget(Entity target){
        int attackPower = this.attack;
        int accuracyDeviation;
        int accuracyBonus;
        
        if (target.speed - this.speed < 0){
            accuracyDeviation = 0;
            accuracyBonus = Math.abs(target.speed - this.speed);
        }
        else{
            accuracyDeviation = target.speed - this.speed;
            accuracyBonus = 0;
        }
        int accRoll = (int)((Math.random() * (100)) + (1 + accuracyBonus));
        if (accRoll <= accuracyDeviation){
            return;
        }
        target.takeDamage(attackPower);
    }

    
    // this is for the enemy taking damage
    public void takeDamage(int damage, Player thePlayer) {
        this.currentHp = Math.max(0, currentHp - damage);
        if (this.id > 0 && this.currentHp <= 0){
            thePlayer.gainExp();
            if (thePlayer.level == 1){
            Enemy.pullEnemyT1();
            }
            if (thePlayer.level == 2){
            Enemy.pullEnemyT2();
            }
            if (thePlayer.level == 3){
            Enemy.pullEnemyT3();
            }
            if (thePlayer.level == 4){
            Enemy.pullEnemyT4();
            }
            else{
                Enemy.createBoss(thePlayer);
            }
            }
    }
    // this one is for the player taking damage
    public void takeDamage(int damage) {
        this.currentHp = Math.max(0, currentHp - damage);
        if (this.id == 0 && this.currentHp <= 0){
            new gameOverScreen();
            //game over screen goes here @THOMAS
        }
    }

    // heal framework
    public void heal(int amount) {
        // ensures that health cannot be negative and damage you
        if (amount < 0) {
        amount = 0;
        }
        
        this.currentHp += amount;
        
        // prevents overhealing
        if (this.currentHp > this.maxHp){
            this.currentHp = this.maxHp;
        }
    }
}
