package dk.mosberg.mam.mana;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.network.ServerPlayerEntity;

public class ManaPoolManager {
    private final Map<UUID, ManaPool> playerMana = new ConcurrentHashMap<>();

    public void consumeMana(PlayerEntity player, float amount)
            throws InsufficientManaException {
        ManaPool manaPool = playerMana.get(player.getUuid());
        if (manaPool == null) {
            throw new InsufficientManaException("No mana pool found for player.");
        }
        manaPool.consume(amount);
    }

    public void regenerateMana(ServerPlayerEntity player, float amount) throws InsufficientManaException {
        ManaPool manaPool = playerMana.get(player.getUuid());
        if (manaPool == null) {
            throw new InsufficientManaException("No mana pool found for player.");
        }
        manaPool.regenerate(amount);
    }

    public int getMana(PlayerEntity player) {
        // TODO: Implement this method
        throw new UnsupportedOperationException("Unimplemented method 'getMana'");
    }
}
