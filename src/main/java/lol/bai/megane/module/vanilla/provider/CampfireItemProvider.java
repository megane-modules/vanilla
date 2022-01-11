package lol.bai.megane.module.vanilla.provider;

import lol.bai.megane.api.provider.ItemProvider;
import org.jetbrains.annotations.NotNull;
import net.minecraft.block.entity.CampfireBlockEntity;
import net.minecraft.item.ItemStack;

public class CampfireItemProvider extends ItemProvider<CampfireBlockEntity> {

    @Override
    public int getSlotCount() {
        return getObject().getItemsBeingCooked().size();
    }

    @Override
    public @NotNull ItemStack getStack(int slot) {
        return getObject().getItemsBeingCooked().get(slot);
    }

}
