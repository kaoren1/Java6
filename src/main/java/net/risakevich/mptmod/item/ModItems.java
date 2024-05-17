package net.risakevich.mptmod.item;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;
import net.risakevich.mptmod.Mptmod;

public class ModItems {

    public static final DeferredRegister<Item> Items =
            DeferredRegister.create(ForgeRegistries.ITEMS, Mptmod.MOD_ID);

    // Предметы
    public static final RegistryObject<Item> AMBER = Items.register("amber",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.MPT_TAB)));

    public static final RegistryObject<Item> AMBER_RAW = Items.register("amber_raw",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.MPT_TAB)));

    // Броня
    public static final RegistryObject<Item> AMBER_HELMET = Items.register("amber_helmet",
            () -> new ArmorItem(ArmorMaterials.GOLD, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModTab.MPT_TAB)));

    public static final RegistryObject<Item> AMBER_BIB = Items.register("amber_bib",
            () -> new ArmorItem(ArmorMaterials.GOLD, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModTab.MPT_TAB)));

    public static final RegistryObject<Item> AMBER_GREAVES = Items.register("amber_greaves",
            () -> new ArmorItem(ArmorMaterials.GOLD, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModTab.MPT_TAB)));

    public static final RegistryObject<Item> AMBER_BOOTS = Items.register("amber_boots",
            () -> new ArmorItem(ArmorMaterials.GOLD, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModTab.MPT_TAB)));

    // Инструменты
    public static final RegistryObject<Item> AMBER_SHOVEL = Items.register("amber_shovel",
            () -> new ShovelItem(Tiers.IRON, 1.5F, -3.0F,
                    new Item.Properties().tab(ModCreativeModTab.MPT_TAB)));

    public static final RegistryObject<Item> AMBER_HOE = Items.register("amber_hoe",
            () -> new HoeItem(Tiers.IRON, -3, -3.0F,
                    new Item.Properties().tab(ModCreativeModTab.MPT_TAB)));

    public static final RegistryObject<Item> AMBER_PICKAXE = Items.register("amber_pickaxe",
            () -> new PickaxeItem(Tiers.IRON, 1, -2.8F,
                    new Item.Properties().tab(ModCreativeModTab.MPT_TAB)));

    public static final RegistryObject<Item> AMBER_AXE = Items.register("amber_axe",
            () -> new AxeItem(Tiers.IRON, 5.0F, -3.0F,
                    new Item.Properties().tab(ModCreativeModTab.MPT_TAB)));

    public static final RegistryObject<Item> AMBER_SWORD = Items.register("amber_sword",
            () -> new SwordItem(Tiers.IRON, 3, -2.4F,
                    new Item.Properties().tab(ModCreativeModTab.MPT_TAB)));

    public static void register(IEventBus eventBus) {
        Items.register(eventBus);
    }
}


