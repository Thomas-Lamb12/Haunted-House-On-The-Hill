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
    
    // method for giving the player their class
    public Player createPlayer(int classChoice){
        if (classChoice == 1){
            Player jobless = new Player(
                "Jobless", "null", 1, 100, 8, 15, 3, 1, 0, 30);
            return jobless;
        }
        if (classChoice == 2){
            Player boxer = new Player(
            "Boxer", "null", 1, 80, 12, 20, 1, 1, 0, 20);
            return boxer;
        }
        if (classChoice == 3){
            Player doctor = new Player(
            "Doctor", "null", 1, 80, 6, 12, 5, 1, 0, 20);
            return doctor;
        }
        if (classChoice == 4){
            Player detective = new Player(
            "Detective", "null", 1, 120, 6, 20, 1, 1, 0, 50);
            return detective;
        }
        else{
            Player fixme = new Player(
                "FIXME", "FIXME", 1, 1000, 800, 150, 300, 1, 0, 300);
            return fixme;
        }
    }
    
    //character classes (boxer, doctor, detective, jobless)
    // boxer: atk 12,hp 80, def 1, speed 20, ap 20 || skills: right-hook, perfect block
    // doctor: atk 6,hp 80, def 5, speed 12, ap 20 || skills: pop pill, poison
    // jobless: atk 8, hp 100, def 3, speed 15, ap 30 || skills: fight or flight, borrowed help
    // detective: atk 6, hp 120, def 1, speed 20, ap 50 || skills: fmj, prosecution
    
    
    
    // ap skills (jab, flurry, right hook)
    
    // level up heal and stat inc (20%)
    
    // inventory items initalized here as an arraylist
    
    /*if (characterClass == null) {
            throw new IllegalArgumentException(
                    "Please select a character class.");
    */
}
