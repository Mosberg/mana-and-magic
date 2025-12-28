package dk.mosberg.mam.mana;

public class ManaPool {
    private float currentMana;
    private final float maxMana;

    public ManaPool(float maxMana) {
        this.maxMana = maxMana;
        this.currentMana = maxMana;
    }

    public float getCurrentMana() {
        return currentMana;
    }

    public float getMaxMana() {
        return maxMana;
    }

    public void consume(float amount) throws InsufficientManaException {
        if (amount > currentMana) {
            throw new InsufficientManaException("Not enough mana to consume.");
        }
        currentMana -= amount;
    }

    public void regenerate(float amount) {
        currentMana = Math.min(currentMana + amount, maxMana);
    }
}
