package io.redspace.allthewizardgear.item;

import io.redspace.ironsspellbooks.api.registry.AttributeRegistry;
import io.redspace.ironsspellbooks.compat.Curios;
import io.redspace.ironsspellbooks.item.SpellBook;
import io.redspace.ironsspellbooks.item.weapons.AttributeContainer;
import io.redspace.ironsspellbooks.util.ItemPropertiesHelper;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.item.Rarity;

public class CooldownCastTimeSpellBook extends SpellBook {

    public CooldownCastTimeSpellBook(int spellSlots, double cooldown, double castTime) {
        super(spellSlots, ItemPropertiesHelper.equipment().stacksTo(1).rarity(Rarity.EPIC).fireResistant());
        withAttributes(Curios.SPELLBOOK_SLOT,
                new AttributeContainer(AttributeRegistry.COOLDOWN_REDUCTION, cooldown, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
                new AttributeContainer(AttributeRegistry.CAST_TIME_REDUCTION, castTime, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
                new AttributeContainer(AttributeRegistry.MAX_MANA, 300, AttributeModifier.Operation.ADD_VALUE)
        );
    }
}
