package hauntedhousehill;

public class Player extends Entity {
    // Player Varibles: id, name, maxHP, speed, currentHp, defence, attack || cClass, maxAp, currentAp, level, exp
    
    private String cClass;
    private int maxAp;
    private int currentAp;
    private int level;
    private int exp;

    public Player(
            String cClass,
            String name,
            int id,
            int maxHp,
            int attack,
            int speed,
            int defence,
            int currentAp,
            int level,
            int exp,
            int maxAp) {
        
        super(name,id,maxHp,attack,speed,defence);

        this.cClass = cClass;
        this.maxAp = maxAp;
        this.currentAp = maxAp;
        this.level = level;
        this.exp = 0;
    }

    public boolean spendAp(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException(
                    "AP cost cannot be negative.");
        }

        if (currentAp < amount) {
            return false;
        }

        currentAp -= amount;
        return true;
    }

    public void restoreAp(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException(
                    "AP restoration cannot be negative.");
        }

        currentAp = Math.min(maxAp, currentAp + amount);
    }

    // getters
    public String getCharacterClass() {
        return cClass;
    }
    public int getCurrentAp() {
        return currentAp;
    }
    public int getMaxAp() {
        return maxAp;
    }
    public int getLevel(){
        return level;
    }
    public int getExp(){
        return exp;
    }
    
    // setters
    public void setCClass(String newC){
        cClass = newC;
    }
    public void setMaxAp(int newMaxAp){
        maxAp = newMaxAp;
    }
    public void setLevel(int newLevel){
        level = newLevel;
    }
    public void incLevel(){
        level++;
    }
    public void setExp(int newExp){
        exp = newExp;
    }
    public void gainExp(int addedExp){
        exp = exp + addedExp;
    }
    
    // inventory items initalized here as an arraylist
    
    /*if (characterClass == null) {
            throw new IllegalArgumentException(
                    "Please select a character class.");
    */
}
