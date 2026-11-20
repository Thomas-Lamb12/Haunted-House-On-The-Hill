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
            int currentHp,
            int attack,
            int speed,
            int defence,
            int level,
            int exp,
            int maxAp,
            int currentAp) {
        
        super(name,id,maxHp,currentHp,attack,speed,defence);

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
        this.cClass = newC;
    }
    public void setMaxAp(int newMaxAp){
        this.maxAp = newMaxAp;
    }
    public void setLevel(int newLevel){
        this.level = newLevel;
    }
    public void incLevel(){
        level++;
    }
    public void setExp(int newExp){
        this.exp = newExp;
    }
    
    // important method for player level up, requires two additional varibles to be passed and calls levelUp if exp > 3
    public void gainExp(int addedExp, Player player){
        player.exp = exp + addedExp;
        if (exp == 3){
            levelUp(player);
        }
    }
    
    public static void levelUp(Player player){
        // player levelup and exp reset
        player.level++;
        player.exp = 0;
        
        // gets the players current values, transforms them into doubles and applies lvl up bonus (rounded up)
        double mathMaxHp = Math.ceil(player.getMaxHp() * .1);
        double mathAttack = Math.ceil(player.getAttack() * .1);
        double mathSpeed = Math.ceil(player.getSpeed() * .1);
        double mathDefence = Math.ceil(player.getDefence() *.1);
        double mathMaxAp = Math.ceil(player.getMaxAp() * .1);
        
        // typecasted stats to be given back to player
        int newMaxHp = (int)mathMaxHp;
        int newAttack = (int)mathAttack;
        int newSpeed = (int)mathSpeed;
        int newDefence = (int)mathDefence;
        int newMaxAp = (int)mathMaxAp;
        
        // setters for players stats and end of method
        player.setMaxHP(newMaxHp);
        player.setAttack(newAttack);
        player.setSpeed(newSpeed);
        player.setDefence(newDefence);
        player.setMaxAp(newMaxAp);
    }
    
    // method for giving the player their class, player ID is 0
    public static Player createPlayer(int classChoice){
        if (classChoice == 1){
            Player thePlayer = new Player(
                "Jobless", "null", 0, 100, 100, 8, 15, 3, 1, 0, 30, 30);
            return thePlayer;
        }
        if (classChoice == 2){
            Player thePlayer = new Player(
            "Boxer", "null", 0, 80, 80, 12, 20, 1, 1, 0, 20, 20);
            return thePlayer;
        }
        if (classChoice == 3){
            Player thePlayer = new Player(
            "Doctor", "null", 0, 80, 80, 6, 12, 5, 1, 0, 20, 20);
            return thePlayer;
        }
        if (classChoice == 4){
            Player thePlayer = new Player(
            "Detective", "null", 0, 120, 120, 6, 20, 1, 1, 0, 50, 50);
            return thePlayer;
        }
        else{
            Player thePlayer = new Player(
                "FIXME", "FIXME", 0, 1000, 1000, 800, 150, 300, 1, 0, 300, 300);
            return thePlayer;
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
