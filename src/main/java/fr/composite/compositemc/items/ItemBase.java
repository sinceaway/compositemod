package fr.composite.compositemc.items;

import fr.composite.compositemc.CompositeMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {
    public ItemBase() {
        super(new Item.Properties().group(CompositeMod.TAB));
    }
}
