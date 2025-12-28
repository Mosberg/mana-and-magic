package dk.mosberg.mam.spell;

import dk.mosberg.mam.mana.InsufficientManaException;
import dk.mosberg.mam.mana.ManaPoolManager;
import net.minecraft.entity.player.PlayerEntity;

public class SpellCastingManager {
    private final ManaPoolManager manaPoolManager = new ManaPoolManager();

    public <Spell> void castSpell(PlayerEntity player, Spell spell) throws InsufficientManaException {
        // Example spell casting logic
        int manaCost = getManaCostForSpell(spell);
        if (manaPoolManager.getMana(player) >= manaCost) {
            manaPoolManager.consumeMana(player, manaCost);
            // Execute spell effect
        } else {
            throw new IllegalStateException("Insufficient mana to cast spell.");
        }
    }

    private <Spell> int getManaCostForSpell(Spell spell) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getManaCostForSpell'");
    }
}
