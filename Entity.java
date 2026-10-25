package hauntedhousehill;

public abstract class Entity {
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
            int attack,
            int speed,
            int defence) {

        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Character name cannot be empty.");
        }

        if (maxHp <= 0 || attack < 0 || defence < 0 || speed < 0) {
            throw new IllegalArgumentException(
                    "Invalid character stats.");
        }
        this.id = id;
        this.name = name.trim();
        this.maxHp = maxHp;
        this.currentHp = maxHp;
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
    
    // damage and heal framework
    public void takeDamage(int damage) {
        if (damage < 0) {
            throw new IllegalArgumentException(
                    "Damage cannot be negative.");
        }

        currentHp = Math.max(0, currentHp - damage);
    }

    public void heal(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException(
                    "Healing cannot be negative.");
        }

        currentHp = Math.min(maxHp, currentHp + amount);
    }
}
