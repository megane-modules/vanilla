package lol.bai.megane.module.vanilla.provider;

import lol.bai.megane.api.provider.ItemProvider;
import org.jetbrains.annotations.NotNull;
import net.minecraft.block.entity.JukeboxBlockEntity;
import net.minecraft.item.ItemStack;

public class JukeboxItemProvider extends ItemProvider<JukeboxBlockEntity> {

    @Override
    public int getSlotCount() {
        return 1;
    }

    @Override
    public @NotNull ItemStack getStack(int slot) {
        return getObject().getRecord();
    }

}
