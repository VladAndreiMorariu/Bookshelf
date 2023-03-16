package net.darkhax.bookshelf.api.event.item;

import com.google.common.collect.Multimap;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.item.ItemStack;

import java.util.Collection;
import java.util.function.Consumer;

public interface IItemAttributeEvent {

    Multimap<Attribute, AttributeModifier> getModifiers();

    Multimap<Attribute, AttributeModifier> getOriginalModifiers();

    boolean addModifier(Attribute attribute, AttributeModifier modifier);

    boolean removeModifier(Attribute attribute, AttributeModifier modifier);

    Collection<AttributeModifier> removeAttribute(Attribute attribute);

    void clearModifiers();

    EquipmentSlot getSlotType();

    ItemStack getItemStack();

    @FunctionalInterface
    public static interface Listener extends Consumer<IItemAttributeEvent> {
    }
}