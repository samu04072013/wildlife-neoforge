/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package org.samu04072013.wildlife.init;

import org.samu04072013.wildlife.WildlifeMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;

import java.util.function.Function;

public class WildlifeModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(WildlifeMod.MODID);
	public static final DeferredItem<Item> GIRAFFE_SPAWN_EGG = register("giraffe_spawn_egg", properties -> new SpawnEggItem(WildlifeModEntities.GIRAFFE.get(), properties));

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}
}