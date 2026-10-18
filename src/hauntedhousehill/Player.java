package hauntedhousehill;

public class Player extends GameCharacter {
    private final CharacterClass characterClass;
    private final int maxAp;
    private int currentAp;

    public Player(
            int id,
            String name,
            CharacterClass characterClass) {

        super(id, name, 100, 15, 5);

        if (characterClass == null) {
            throw new IllegalArgumentException(
                    "Please select a character class.");
        }

        this.characterClass = characterClass;
        this.maxAp = 20;
        this.currentAp = maxAp;
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

    public CharacterClass getCharacterClass() {
        return characterClass;
    }

    public int getCurrentAp() {
        return currentAp;
    }

    public int getMaxAp() {
        return maxAp;
    }
}
