package hauntedhousehill;

public abstract class GameCharacter {
    private final int id;
    private final String name;
    private final int maxHp;

    private int currentHp;
    private int attack;
    private int defense;

    protected GameCharacter(
            int id,
            String name,
            int maxHp,
            int attack,
            int defense) {

        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Character name cannot be empty.");
        }

        if (maxHp <= 0 || attack < 0 || defense < 0) {
            throw new IllegalArgumentException(
                    "Invalid character stats.");
        }

        this.id = id;
        this.name = name.trim();
        this.maxHp = maxHp;
        this.currentHp = maxHp;
        this.attack = attack;
        this.defense = defense;
    }

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

    public boolean isAlive() {
        return currentHp > 0;
    }

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

    public int getDefense() {
        return defense;
    }
}
