package dk.mosberg.mam.item;

import java.util.List;
import org.jetbrains.annotations.Nullable;
import dk.mosberg.mam.gemstone.GemstoneRarity;
import dk.mosberg.mam.gemstone.GemstoneSchool;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;

/**
 * Custom gemstone item with rarity, school affinity, and mana properties.
 *
 * @author Mosberg
 * @version 1.0.0
 * @since 1.0.0
 */
public class GemstoneItem extends Item {
    private final GemstoneRarity rarity;
    private final GemstoneSchool school;
    private final float manaCapacity;

    public GemstoneItem(GemstoneRarity rarity, GemstoneSchool school, Settings settings) {
        super(settings);
        this.rarity = rarity;
        this.school = school;
        this.manaCapacity = rarity.getManaCapacity();
    }

    public GemstoneRarity getRarity() {
        return rarity;
    }

    public GemstoneSchool getSchool() {
        return school;
    }

    public float getManaCapacity() {
        return manaCapacity;
    }

    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip,
            TooltipContext context) {
        tooltip.add(Text.literal("Rarity: " + rarity.getName()).formatted(rarity.getFormatting()));
        tooltip.add(Text.literal("School: " + school.getName()).formatted(school.getColor()));
        tooltip.add(Text.literal("Mana: " + manaCapacity).formatted(rarity.getFormatting()));
    }
}
