package thaumicdyes.common;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagByte;

import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.common.config.ConfigBlocks;
import thaumcraft.common.config.ConfigItems;
import thaumicdyes.common.items.ItemHandler;

public class ConfigRecipes {

    public static void init() {
        // reg things here
        /*
         * initCrimsonRecipes();
         * initCrimsonDyedRecipes();
         * initEldritchRecipes();
         * initIronRecipes();
         * initThaumiumRecipes();
         * initVoidRecipes();
         */
        initRunicRecipes();
        initRunicUpgrades();
    }

    public static void initCrimsonRecipes() {

    }

    public static void initCrimsonDyedRecipes() {

    }

    public static void initEldritchRecipes() {

    }

    public static void initIronRecipes() {

    }

    public static void initThaumiumRecipes() {

    }

    public static void initVoidRecipes() {

    }

    public static void initRunicRecipes() {
        // base
        ConfigResearch.recipes.put(
            "RunicArmorHelm",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMOR",
                new ItemStack(ItemHandler.itemRunicHelmet),
                4,
                new AspectList().add(Aspect.ARMOR, 30)
                    .add(Aspect.MAGIC, 75)
                    .add(Aspect.ENERGY, 75),
                new ItemStack(Items.golden_helmet, 1, 32767),
                new ItemStack[] { new ItemStack(ConfigItems.itemResource, 1, 15),
                    new ItemStack(ConfigItems.itemResource, 1, 6), new ItemStack(ConfigItems.itemResource, 1, 7),
                    new ItemStack(ConfigItems.itemResource, 1, 1), new ItemStack(ConfigItems.itemInkwell) }));

        ConfigResearch.recipes.put(
            "RunicArmorChest",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMOR",
                new ItemStack(ItemHandler.itemRunicChest),
                4,
                new AspectList().add(Aspect.ARMOR, 60)
                    .add(Aspect.MAGIC, 105)
                    .add(Aspect.ENERGY, 105),
                new ItemStack(Items.golden_chestplate, 1, 32767),
                new ItemStack[] { new ItemStack(ConfigItems.itemResource, 1, 15),
                    new ItemStack(ConfigItems.itemResource, 1, 6), new ItemStack(ConfigItems.itemResource, 1, 7),
                    new ItemStack(ConfigItems.itemResource, 1, 1), new ItemStack(ConfigItems.itemResource, 1, 1),
                    new ItemStack(ConfigItems.itemResource, 1, 1), new ItemStack(ConfigItems.itemInkwell) }));

        ConfigResearch.recipes.put(
            "RunicArmorLegs",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMOR",
                new ItemStack(ItemHandler.itemRunicLegs),
                4,
                new AspectList().add(Aspect.ARMOR, 45)
                    .add(Aspect.MAGIC, 90)
                    .add(Aspect.ENERGY, 90),
                new ItemStack(Items.golden_leggings, 1, 32767),
                new ItemStack[] { new ItemStack(ConfigItems.itemResource, 1, 15),
                    new ItemStack(ConfigItems.itemResource, 1, 6), new ItemStack(ConfigItems.itemResource, 1, 7),
                    new ItemStack(ConfigItems.itemResource, 1, 1), new ItemStack(ConfigItems.itemResource, 1, 1),
                    new ItemStack(ConfigItems.itemInkwell) }));

        ConfigResearch.recipes.put(
            "RunicArmorBoots",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMOR",
                new ItemStack(ItemHandler.itemRunicBoots),
                4,
                new AspectList().add(Aspect.ARMOR, 30)
                    .add(Aspect.MAGIC, 75)
                    .add(Aspect.ENERGY, 75),
                new ItemStack(Items.golden_boots, 1, 32767),
                new ItemStack[] { new ItemStack(ConfigItems.itemResource, 1, 15),
                    new ItemStack(ConfigItems.itemResource, 1, 6), new ItemStack(ConfigItems.itemResource, 1, 7),
                    new ItemStack(ConfigItems.itemResource, 1, 1), new ItemStack(ConfigItems.itemInkwell) }));

        ConfigResearch.recipes.put(
            "RunicGoggles",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICGOGGLES",
                new ItemStack(ItemHandler.itemRunicGoggles),
                4,
                new AspectList().add(Aspect.MAGIC, 25)
                    .add(Aspect.EXCHANGE, 25),
                new ItemStack(ConfigItems.itemGoggles, 1, 32767),
                new ItemStack[] { new ItemStack(ItemHandler.itemRunicHelmet), new ItemStack(Items.slime_ball) }));

        ConfigResearch.recipes.put(
            "RunicBootsTraveller",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICBOOTSTRAVELLER",
                new ItemStack(ItemHandler.itemRunicBootsTraveller),
                4,
                new AspectList().add(Aspect.MAGIC, 25)
                    .add(Aspect.EXCHANGE, 25),
                new ItemStack(ConfigItems.itemBootsTraveller, 1, 32767),
                new ItemStack[] { new ItemStack(ItemHandler.itemRunicBoots), new ItemStack(Items.slime_ball) }));

        // ENHANCED

        ConfigResearch.recipes.put(
            "EnhRunicArmor0",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.ENHANCEDRUNICARMOR",
                new ItemStack(ItemHandler.itemRunicHelmetEnhanced),
                8,
                new AspectList().add(Aspect.ARMOR, 40)
                    .add(Aspect.MAGIC, 160)
                    .add(Aspect.ENERGY, 80)
                    .add(Aspect.ELDRITCH, 20)
                    .add(Aspect.CLOTH, 24)
                    .add(Aspect.CRYSTAL, 16)
                    .add(Aspect.EXCHANGE, 20),
                new ItemStack(ItemHandler.itemRunicHelmet),
                new ItemStack[] { new ItemStack(Items.nether_star), new ItemStack(ConfigItems.itemResource, 1, 7), // fabric7,
                                                                                                                   // salis14,
                                                                                                                   // p.charm
                                                                                                                   // 15,
                                                                                                                   // nitor1,
                                                                                                                   // amber6
                    new ItemStack(ConfigItems.itemResource, 1, 7), new ItemStack(ConfigItems.itemResource, 1, 7),
                    new ItemStack(Items.nether_star), new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemResource, 1, 15), new ItemStack(ConfigItems.itemResource, 1, 6), }));

        ConfigResearch.recipes.put(
            "EnhRunicArmor1",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.ENHANCEDRUNICARMOR",
                new ItemStack(ItemHandler.itemRunicChestEnhanced),
                8,
                new AspectList().add(Aspect.ARMOR, 40)
                    .add(Aspect.MAGIC, 160)
                    .add(Aspect.ENERGY, 80)
                    .add(Aspect.ELDRITCH, 20)
                    .add(Aspect.CLOTH, 24)
                    .add(Aspect.CRYSTAL, 16)
                    .add(Aspect.EXCHANGE, 20),
                new ItemStack(ItemHandler.itemRunicChest),
                new ItemStack[] { new ItemStack(Items.nether_star), new ItemStack(ConfigItems.itemResource, 1, 7), // fabric7,
                                                                                                                   // salis14,
                                                                                                                   // p.charm
                                                                                                                   // 15,
                                                                                                                   // nitor1,
                                                                                                                   // amber6
                    new ItemStack(ConfigItems.itemResource, 1, 7), new ItemStack(ConfigItems.itemResource, 1, 7),
                    new ItemStack(Items.nether_star), new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemResource, 1, 15), new ItemStack(ConfigItems.itemResource, 1, 6), }));

        ConfigResearch.recipes.put(
            "EnhRunicArmor2",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.ENHANCEDRUNICARMOR",
                new ItemStack(ItemHandler.itemRunicLegsEnhanced),
                8,
                new AspectList().add(Aspect.ARMOR, 40)
                    .add(Aspect.MAGIC, 160)
                    .add(Aspect.ENERGY, 80)
                    .add(Aspect.ELDRITCH, 20)
                    .add(Aspect.CLOTH, 24)
                    .add(Aspect.CRYSTAL, 16)
                    .add(Aspect.EXCHANGE, 20),
                new ItemStack(ItemHandler.itemRunicLegs),
                new ItemStack[] { new ItemStack(Items.nether_star), new ItemStack(ConfigItems.itemResource, 1, 7), // fabric7,
                                                                                                                   // salis14,
                                                                                                                   // p.charm
                                                                                                                   // 15,
                                                                                                                   // nitor1,
                                                                                                                   // amber6
                    new ItemStack(ConfigItems.itemResource, 1, 7), new ItemStack(ConfigItems.itemResource, 1, 7),
                    new ItemStack(Items.nether_star), new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemResource, 1, 15), new ItemStack(ConfigItems.itemResource, 1, 6), }));

        ConfigResearch.recipes.put(
            "EnhRunicArmor3",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.ENHANCEDRUNICARMOR",
                new ItemStack(ItemHandler.itemRunicBootsEnhanced),
                8,
                new AspectList().add(Aspect.ARMOR, 40)
                    .add(Aspect.MAGIC, 160)
                    .add(Aspect.ENERGY, 80)
                    .add(Aspect.ELDRITCH, 20)
                    .add(Aspect.CLOTH, 24)
                    .add(Aspect.CRYSTAL, 16)
                    .add(Aspect.EXCHANGE, 20),
                new ItemStack(ItemHandler.itemRunicBoots),
                new ItemStack[] { new ItemStack(Items.nether_star), new ItemStack(ConfigItems.itemResource, 1, 7), // fabric7,
                                                                                                                   // salis14,
                                                                                                                   // p.charm
                                                                                                                   // 15,
                                                                                                                   // nitor1,
                                                                                                                   // amber6
                    new ItemStack(ConfigItems.itemResource, 1, 7), new ItemStack(ConfigItems.itemResource, 1, 7),
                    new ItemStack(Items.nether_star), new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemResource, 1, 15), new ItemStack(ConfigItems.itemResource, 1, 6), }));

        // Primal

        ConfigResearch.recipes.put(
            "PrmRunicArmor0",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.PRIMALRUNICARMOR",
                new ItemStack(ItemHandler.itemRunicHelmetPrimal),
                10,
                new AspectList().add(Aspect.MAGIC, 240)
                    .add(Aspect.ELDRITCH, 120)
                    .add(Aspect.DARKNESS, 60)
                    .add(Aspect.SOUL, 60)
                    .add(Aspect.EXCHANGE, 40),
                new ItemStack(ConfigItems.itemEldritchObject, 1, 3),
                new ItemStack[] { new ItemStack(ItemHandler.itemRunicHelmetEnhanced),
                    new ItemStack(ConfigItems.itemEldritchObject, 1, 0), // eye0, pearl3
                    // new ItemStack(ConfigItems.itemResource,1,7),
                    // new ItemStack(ConfigItems.itemResource,1,7),
                    new ItemStack(ConfigItems.itemHelmetVoidRobe), new ItemStack(ConfigItems.itemEldritchObject, 1, 0),
                // new ItemStack(ConfigItems.itemResource,1,15),
                // new ItemStack(ConfigItems.itemResource,1,6),
                }));

        ConfigResearch.recipes.put(
            "PrmRunicArmor1",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.PRIMALRUNICARMOR",
                new ItemStack(ItemHandler.itemRunicChestPrimal),
                10,
                new AspectList().add(Aspect.MAGIC, 240)
                    .add(Aspect.ELDRITCH, 120)
                    .add(Aspect.DARKNESS, 60)
                    .add(Aspect.SOUL, 60)
                    .add(Aspect.EXCHANGE, 40),
                new ItemStack(ConfigItems.itemEldritchObject, 1, 3),
                new ItemStack[] { new ItemStack(ItemHandler.itemRunicChestEnhanced),
                    new ItemStack(ConfigItems.itemEldritchObject, 1, 0), // eye0, pearl3
                    // new ItemStack(ConfigItems.itemResource,1,7),
                    // new ItemStack(ConfigItems.itemResource,1,7),
                    new ItemStack(ConfigItems.itemChestVoidRobe), new ItemStack(ConfigItems.itemEldritchObject, 1, 0),
                // new ItemStack(ConfigItems.itemResource,1,15),
                // new ItemStack(ConfigItems.itemResource,1,6),
                }));

        ConfigResearch.recipes.put(
            "PrmRunicArmor2",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.PRIMALRUNICARMOR",
                new ItemStack(ItemHandler.itemRunicLegsPrimal),
                10,
                new AspectList().add(Aspect.MAGIC, 240)
                    .add(Aspect.ELDRITCH, 120)
                    .add(Aspect.DARKNESS, 60)
                    .add(Aspect.SOUL, 60)
                    .add(Aspect.EXCHANGE, 40),
                new ItemStack(ConfigItems.itemEldritchObject, 1, 3),
                new ItemStack[] { new ItemStack(ItemHandler.itemRunicLegsEnhanced),
                    new ItemStack(ConfigItems.itemEldritchObject, 1, 0), // eye0, pearl3
                    // new ItemStack(ConfigItems.itemResource,1,7),
                    // new ItemStack(ConfigItems.itemResource,1,7),
                    new ItemStack(ConfigItems.itemLegsVoidRobe), new ItemStack(ConfigItems.itemEldritchObject, 1, 0),
                // new ItemStack(ConfigItems.itemResource,1,15),
                // new ItemStack(ConfigItems.itemResource,1,6),
                }));

        ConfigResearch.recipes.put(
            "PrmRunicArmor3",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.PRIMALRUNICARMOR",
                new ItemStack(ItemHandler.itemRunicBootsPrimal),
                10,
                new AspectList().add(Aspect.MAGIC, 240)
                    .add(Aspect.ELDRITCH, 120)
                    .add(Aspect.DARKNESS, 60)
                    .add(Aspect.SOUL, 60)
                    .add(Aspect.EXCHANGE, 40),
                new ItemStack(ConfigItems.itemEldritchObject, 1, 3),
                new ItemStack[] { new ItemStack(ItemHandler.itemRunicBootsEnhanced),
                    new ItemStack(ConfigItems.itemEldritchObject, 1, 0), // eye0, pearl3
                    // new ItemStack(ConfigItems.itemResource,1,7),
                    // new ItemStack(ConfigItems.itemResource,1,7),
                    new ItemStack(ItemHandler.itemVoidBootsTraveller),
                    new ItemStack(ConfigItems.itemEldritchObject, 1, 0),
                // new ItemStack(ConfigItems.itemResource,1,15),
                // new ItemStack(ConfigItems.itemResource,1,6),
                }));

    }

    public static void initRunicUpgrades() {

        /**
         * item.runic.upgrade.0= - No upgrade
         * item.runic.upgrade.1= - Berserker
         * item.runic.upgrade.2= - Augmented (+shields)
         * item.runic.upgrade.3= - Kinetic Feedback (AOE)
         * item.runic.upgrade.4= - Revitalizing Feedback (regen)
         * item.runic.upgrade.5= - Hardened (+armour)
         * item.runic.upgrade.6= - Emergency Shielding (+8u)
         * item.runic.upgrade.7= - Steadfast
         * item.runic.upgrade.8= - Vitality
         * item.runic.upgrade.9= - Haste
         * item.runic.upgrade.10= -
         */

        // TODO upgrade 1 (berserker)
        /*
         * new AspectList().add(Aspect.WEAPON, 120).add(Aspect.MAGIC, 50).add(Aspect.FIRE, 32),
         * new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6), new ItemStack(ConfigItems.itemShard, 1, 1), new
         * ItemStack(ConfigItems.itemShard, 1, 1), new ItemStack(Items.blaze_powder), new
         * ItemStack(ConfigItems.itemShard, 1, 1), new ItemStack(ConfigItems.itemShard, 1, 1) }));
         */
        ConfigResearch.recipes.put(
            "RAU1_0",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 1) },
                6,
                new AspectList().add(Aspect.WEAPON, 120)
                    .add(Aspect.MAGIC, 50)
                    .add(Aspect.FIRE, 32),
                new ItemStack(ItemHandler.itemRunicHelmet),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 1), new ItemStack(ConfigItems.itemShard, 1, 1),
                    new ItemStack(Items.blaze_powder), new ItemStack(ConfigItems.itemShard, 1, 1),
                    new ItemStack(ConfigItems.itemShard, 1, 1) }));

        ConfigResearch.recipes.put(
            "RAU1_1",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 1) },
                6,
                new AspectList().add(Aspect.WEAPON, 120)
                    .add(Aspect.MAGIC, 50)
                    .add(Aspect.FIRE, 32),
                new ItemStack(ItemHandler.itemRunicChest),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 1), new ItemStack(ConfigItems.itemShard, 1, 1),
                    new ItemStack(Items.blaze_powder), new ItemStack(ConfigItems.itemShard, 1, 1),
                    new ItemStack(ConfigItems.itemShard, 1, 1) }));

        ConfigResearch.recipes.put(
            "RAU1_2",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 1) },
                6,
                new AspectList().add(Aspect.WEAPON, 120)
                    .add(Aspect.MAGIC, 50)
                    .add(Aspect.FIRE, 32),
                new ItemStack(ItemHandler.itemRunicLegs),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 1), new ItemStack(ConfigItems.itemShard, 1, 1),
                    new ItemStack(Items.blaze_powder), new ItemStack(ConfigItems.itemShard, 1, 1),
                    new ItemStack(ConfigItems.itemShard, 1, 1) }));

        ConfigResearch.recipes.put(
            "RAU1_3",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 1) },
                6,
                new AspectList().add(Aspect.WEAPON, 120)
                    .add(Aspect.MAGIC, 50)
                    .add(Aspect.FIRE, 32),
                new ItemStack(ItemHandler.itemRunicBoots),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 1), new ItemStack(ConfigItems.itemShard, 1, 1),
                    new ItemStack(Items.blaze_powder), new ItemStack(ConfigItems.itemShard, 1, 1),
                    new ItemStack(ConfigItems.itemShard, 1, 1) }));

        ConfigResearch.recipes.put(
            "RGU1",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 1) },
                6,
                new AspectList().add(Aspect.WEAPON, 120)
                    .add(Aspect.MAGIC, 50)
                    .add(Aspect.FIRE, 32),
                new ItemStack(ItemHandler.itemRunicGoggles),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 1), new ItemStack(ConfigItems.itemShard, 1, 1),
                    new ItemStack(Items.blaze_powder), new ItemStack(ConfigItems.itemShard, 1, 1),
                    new ItemStack(ConfigItems.itemShard, 1, 1) }));

        ConfigResearch.recipes.put(
            "RBTU1",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 1) },
                6,
                new AspectList().add(Aspect.WEAPON, 120)
                    .add(Aspect.MAGIC, 50)
                    .add(Aspect.FIRE, 32),
                new ItemStack(ItemHandler.itemRunicBootsTraveller),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 1), new ItemStack(ConfigItems.itemShard, 1, 1),
                    new ItemStack(Items.blaze_powder), new ItemStack(ConfigItems.itemShard, 1, 1),
                    new ItemStack(ConfigItems.itemShard, 1, 1) }));

        // ------------
        ConfigResearch.recipes.put(
            "ERAU1_0",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 1) },
                6,
                new AspectList().add(Aspect.WEAPON, 120)
                    .add(Aspect.MAGIC, 50)
                    .add(Aspect.FIRE, 32),
                new ItemStack(ItemHandler.itemRunicHelmetEnhanced),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 1), new ItemStack(ConfigItems.itemShard, 1, 1),
                    new ItemStack(Items.blaze_powder), new ItemStack(ConfigItems.itemShard, 1, 1),
                    new ItemStack(ConfigItems.itemShard, 1, 1) }));

        ConfigResearch.recipes.put(
            "ERAU1_1",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 1) },
                6,
                new AspectList().add(Aspect.WEAPON, 120)
                    .add(Aspect.MAGIC, 50)
                    .add(Aspect.FIRE, 32),
                new ItemStack(ItemHandler.itemRunicChestEnhanced),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 1), new ItemStack(ConfigItems.itemShard, 1, 1),
                    new ItemStack(Items.blaze_powder), new ItemStack(ConfigItems.itemShard, 1, 1),
                    new ItemStack(ConfigItems.itemShard, 1, 1) }));

        ConfigResearch.recipes.put(
            "ERAU1_2",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 1) },
                6,
                new AspectList().add(Aspect.WEAPON, 120)
                    .add(Aspect.MAGIC, 50)
                    .add(Aspect.FIRE, 32),
                new ItemStack(ItemHandler.itemRunicLegsEnhanced),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 1), new ItemStack(ConfigItems.itemShard, 1, 1),
                    new ItemStack(Items.blaze_powder), new ItemStack(ConfigItems.itemShard, 1, 1),
                    new ItemStack(ConfigItems.itemShard, 1, 1) }));

        ConfigResearch.recipes.put(
            "ERAU1_3",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 1) },
                6,
                new AspectList().add(Aspect.WEAPON, 120)
                    .add(Aspect.MAGIC, 50)
                    .add(Aspect.FIRE, 32),
                new ItemStack(ItemHandler.itemRunicBootsEnhanced),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 1), new ItemStack(ConfigItems.itemShard, 1, 1),
                    new ItemStack(Items.blaze_powder), new ItemStack(ConfigItems.itemShard, 1, 1),
                    new ItemStack(ConfigItems.itemShard, 1, 1) }));

        // ------------
        ConfigResearch.recipes.put(
            "PRAU1_0",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 1) },
                6,
                new AspectList().add(Aspect.WEAPON, 120)
                    .add(Aspect.MAGIC, 50)
                    .add(Aspect.FIRE, 32),
                new ItemStack(ItemHandler.itemRunicHelmetPrimal),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 1), new ItemStack(ConfigItems.itemShard, 1, 1),
                    new ItemStack(Items.blaze_powder), new ItemStack(ConfigItems.itemShard, 1, 1),
                    new ItemStack(ConfigItems.itemShard, 1, 1) }));

        ConfigResearch.recipes.put(
            "PRAU1_1",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 1) },
                6,
                new AspectList().add(Aspect.WEAPON, 120)
                    .add(Aspect.MAGIC, 50)
                    .add(Aspect.FIRE, 32),
                new ItemStack(ItemHandler.itemRunicChestPrimal),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 1), new ItemStack(ConfigItems.itemShard, 1, 1),
                    new ItemStack(Items.blaze_powder), new ItemStack(ConfigItems.itemShard, 1, 1),
                    new ItemStack(ConfigItems.itemShard, 1, 1) }));

        ConfigResearch.recipes.put(
            "PRAU1_2",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 1) },
                6,
                new AspectList().add(Aspect.WEAPON, 120)
                    .add(Aspect.MAGIC, 50)
                    .add(Aspect.FIRE, 32),
                new ItemStack(ItemHandler.itemRunicLegsPrimal),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 1), new ItemStack(ConfigItems.itemShard, 1, 1),
                    new ItemStack(Items.blaze_powder), new ItemStack(ConfigItems.itemShard, 1, 1),
                    new ItemStack(ConfigItems.itemShard, 1, 1) }));

        ConfigResearch.recipes.put(
            "PRAU1_3",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 1) },
                6,
                new AspectList().add(Aspect.WEAPON, 120)
                    .add(Aspect.MAGIC, 50)
                    .add(Aspect.FIRE, 32),
                new ItemStack(ItemHandler.itemRunicBootsPrimal),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 1), new ItemStack(ConfigItems.itemShard, 1, 1),
                    new ItemStack(Items.blaze_powder), new ItemStack(ConfigItems.itemShard, 1, 1),
                    new ItemStack(ConfigItems.itemShard, 1, 1) }));

        // TODO upgrade 2 (+shields)
        /*
         * new AspectList().add(Aspect.ARMOR, 256).add(Aspect.MAGIC, 256).add(Aspect.ENERGY, 512).add(Aspect.CRYSTAL,
         * 32),
         * new ItemStack[] { new ItemStack(ConfigItems.itemResource, 1, 14), new ItemStack(ConfigItems.itemShard, 1, 6),
         * new ItemStack(ConfigItems.itemShard, 1, 6), new ItemStack(ConfigItems.itemResource, 1, 1), new
         * ItemStack(ConfigItems.itemShard, 1, 6), new ItemStack(ConfigItems.itemShard, 1, 6) }));
         */
        ConfigResearch.recipes.put(
            "RAU2_0",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 2) },
                6,
                new AspectList().add(Aspect.ARMOR, 256)
                    .add(Aspect.MAGIC, 256)
                    .add(Aspect.ENERGY, 512)
                    .add(Aspect.CRYSTAL, 32),
                new ItemStack(ItemHandler.itemRunicHelmet),
                new ItemStack[] { new ItemStack(ConfigItems.itemResource, 1, 14),
                    new ItemStack(ConfigItems.itemShard, 1, 6), new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemResource, 1, 1), new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 6) }));

        ConfigResearch.recipes.put(
            "RAU2_1",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 2) },
                6,
                new AspectList().add(Aspect.ARMOR, 256)
                    .add(Aspect.MAGIC, 256)
                    .add(Aspect.ENERGY, 512)
                    .add(Aspect.CRYSTAL, 32),
                new ItemStack(ItemHandler.itemRunicChest),
                new ItemStack[] { new ItemStack(ConfigItems.itemResource, 1, 14),
                    new ItemStack(ConfigItems.itemShard, 1, 6), new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemResource, 1, 1), new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 6) }));

        ConfigResearch.recipes.put(
            "RAU2_2",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 2) },
                6,
                new AspectList().add(Aspect.ARMOR, 256)
                    .add(Aspect.MAGIC, 256)
                    .add(Aspect.ENERGY, 512)
                    .add(Aspect.CRYSTAL, 32),
                new ItemStack(ItemHandler.itemRunicLegs),
                new ItemStack[] { new ItemStack(ConfigItems.itemResource, 1, 14),
                    new ItemStack(ConfigItems.itemShard, 1, 6), new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemResource, 1, 1), new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 6) }));

        ConfigResearch.recipes.put(
            "RAU2_3",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 2) },
                6,
                new AspectList().add(Aspect.ARMOR, 256)
                    .add(Aspect.MAGIC, 256)
                    .add(Aspect.ENERGY, 512)
                    .add(Aspect.CRYSTAL, 32),
                new ItemStack(ItemHandler.itemRunicBoots),
                new ItemStack[] { new ItemStack(ConfigItems.itemResource, 1, 14),
                    new ItemStack(ConfigItems.itemShard, 1, 6), new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemResource, 1, 1), new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 6) }));

        ConfigResearch.recipes.put(
            "RGU2",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 2) },
                6,
                new AspectList().add(Aspect.ARMOR, 256)
                    .add(Aspect.MAGIC, 256)
                    .add(Aspect.ENERGY, 512)
                    .add(Aspect.CRYSTAL, 32),
                new ItemStack(ItemHandler.itemRunicGoggles),
                new ItemStack[] { new ItemStack(ConfigItems.itemResource, 1, 14),
                    new ItemStack(ConfigItems.itemShard, 1, 6), new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemResource, 1, 1), new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 6) }));

        ConfigResearch.recipes.put(
            "RBTU2",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 2) },
                6,
                new AspectList().add(Aspect.ARMOR, 256)
                    .add(Aspect.MAGIC, 256)
                    .add(Aspect.ENERGY, 512)
                    .add(Aspect.CRYSTAL, 32),
                new ItemStack(ItemHandler.itemRunicBootsTraveller),
                new ItemStack[] { new ItemStack(ConfigItems.itemResource, 1, 14),
                    new ItemStack(ConfigItems.itemShard, 1, 6), new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemResource, 1, 1), new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 6) }));

        // ------------
        ConfigResearch.recipes.put(
            "ERAU2_0",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 2) },
                6,
                new AspectList().add(Aspect.ARMOR, 256)
                    .add(Aspect.MAGIC, 256)
                    .add(Aspect.ENERGY, 512)
                    .add(Aspect.CRYSTAL, 32),
                new ItemStack(ItemHandler.itemRunicHelmetEnhanced),
                new ItemStack[] { new ItemStack(ConfigItems.itemResource, 1, 14),
                    new ItemStack(ConfigItems.itemShard, 1, 6), new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemResource, 1, 1), new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 6) }));

        ConfigResearch.recipes.put(
            "ERAU2_1",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 2) },
                6,
                new AspectList().add(Aspect.ARMOR, 256)
                    .add(Aspect.MAGIC, 256)
                    .add(Aspect.ENERGY, 512)
                    .add(Aspect.CRYSTAL, 32),
                new ItemStack(ItemHandler.itemRunicChestEnhanced),
                new ItemStack[] { new ItemStack(ConfigItems.itemResource, 1, 14),
                    new ItemStack(ConfigItems.itemShard, 1, 6), new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemResource, 1, 1), new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 6) }));

        ConfigResearch.recipes.put(
            "ERAU2_2",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 2) },
                6,
                new AspectList().add(Aspect.ARMOR, 256)
                    .add(Aspect.MAGIC, 256)
                    .add(Aspect.ENERGY, 512)
                    .add(Aspect.CRYSTAL, 32),
                new ItemStack(ItemHandler.itemRunicLegsEnhanced),
                new ItemStack[] { new ItemStack(ConfigItems.itemResource, 1, 14),
                    new ItemStack(ConfigItems.itemShard, 1, 6), new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemResource, 1, 1), new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 6) }));

        ConfigResearch.recipes.put(
            "ERAU2_3",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 2) },
                6,
                new AspectList().add(Aspect.ARMOR, 256)
                    .add(Aspect.MAGIC, 256)
                    .add(Aspect.ENERGY, 512)
                    .add(Aspect.CRYSTAL, 32),
                new ItemStack(ItemHandler.itemRunicBootsEnhanced),
                new ItemStack[] { new ItemStack(ConfigItems.itemResource, 1, 14),
                    new ItemStack(ConfigItems.itemShard, 1, 6), new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemResource, 1, 1), new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 6) }));

        // ------------
        ConfigResearch.recipes.put(
            "PRAU2_0",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 2) },
                6,
                new AspectList().add(Aspect.ARMOR, 256)
                    .add(Aspect.MAGIC, 256)
                    .add(Aspect.ENERGY, 512)
                    .add(Aspect.CRYSTAL, 32),
                new ItemStack(ItemHandler.itemRunicHelmetPrimal),
                new ItemStack[] { new ItemStack(ConfigItems.itemResource, 1, 14),
                    new ItemStack(ConfigItems.itemShard, 1, 6), new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemResource, 1, 1), new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 6) }));

        ConfigResearch.recipes.put(
            "PRAU2_1",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 2) },
                6,
                new AspectList().add(Aspect.ARMOR, 256)
                    .add(Aspect.MAGIC, 256)
                    .add(Aspect.ENERGY, 512)
                    .add(Aspect.CRYSTAL, 32),
                new ItemStack(ItemHandler.itemRunicChestPrimal),
                new ItemStack[] { new ItemStack(ConfigItems.itemResource, 1, 14),
                    new ItemStack(ConfigItems.itemShard, 1, 6), new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemResource, 1, 1), new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 6) }));

        ConfigResearch.recipes.put(
            "PRAU2_2",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 2) },
                6,
                new AspectList().add(Aspect.ARMOR, 256)
                    .add(Aspect.MAGIC, 256)
                    .add(Aspect.ENERGY, 512)
                    .add(Aspect.CRYSTAL, 32),
                new ItemStack(ItemHandler.itemRunicLegsPrimal),
                new ItemStack[] { new ItemStack(ConfigItems.itemResource, 1, 14),
                    new ItemStack(ConfigItems.itemShard, 1, 6), new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemResource, 1, 1), new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 6) }));

        ConfigResearch.recipes.put(
            "PRAU2_3",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 2) },
                6,
                new AspectList().add(Aspect.ARMOR, 256)
                    .add(Aspect.MAGIC, 256)
                    .add(Aspect.ENERGY, 512)
                    .add(Aspect.CRYSTAL, 32),
                new ItemStack(ItemHandler.itemRunicBootsPrimal),
                new ItemStack[] { new ItemStack(ConfigItems.itemResource, 1, 14),
                    new ItemStack(ConfigItems.itemShard, 1, 6), new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemResource, 1, 1), new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 6) }));

        // TODO upgrade 3(kinetic)
        /*
         * new AspectList().add(Aspect.ARMOR, 33).add(Aspect.MAGIC, 55).add(Aspect.AIR, 64),
         * new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6), new ItemStack(ConfigItems.itemShard, 1, 0), new
         * ItemStack(ConfigItems.itemShard, 1, 0), new ItemStack(Items.potionitem, 1, 16428), new
         * ItemStack(ConfigItems.itemShard, 1, 0), new ItemStack(ConfigItems.itemShard, 1, 0) }));
         */
        ConfigResearch.recipes.put(
            "RAU3_0",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 3) },
                6,
                new AspectList().add(Aspect.ARMOR, 40)
                    .add(Aspect.MAGIC, 60)
                    .add(Aspect.AIR, 80)
                    .add(Aspect.MOTION, 40),
                new ItemStack(ItemHandler.itemRunicHelmet),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 0), new ItemStack(ConfigItems.itemShard, 1, 0),
                    new ItemStack(Items.potionitem, 1, 16428), new ItemStack(ConfigItems.itemShard, 1, 0),
                    new ItemStack(ConfigItems.itemShard, 1, 0) }));

        ConfigResearch.recipes.put(
            "RAU3_1",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 3) },
                6,
                new AspectList().add(Aspect.ARMOR, 40)
                    .add(Aspect.MAGIC, 60)
                    .add(Aspect.AIR, 80)
                    .add(Aspect.MOTION, 40),
                new ItemStack(ItemHandler.itemRunicChest),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 0), new ItemStack(ConfigItems.itemShard, 1, 0),
                    new ItemStack(Items.potionitem, 1, 16428), new ItemStack(ConfigItems.itemShard, 1, 0),
                    new ItemStack(ConfigItems.itemShard, 1, 0) }));

        ConfigResearch.recipes.put(
            "RAU3_2",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 3) },
                6,
                new AspectList().add(Aspect.ARMOR, 40)
                    .add(Aspect.MAGIC, 60)
                    .add(Aspect.AIR, 80)
                    .add(Aspect.MOTION, 40),
                new ItemStack(ItemHandler.itemRunicLegs),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 0), new ItemStack(ConfigItems.itemShard, 1, 0),
                    new ItemStack(Items.potionitem, 1, 16428), new ItemStack(ConfigItems.itemShard, 1, 0),
                    new ItemStack(ConfigItems.itemShard, 1, 0) }));

        ConfigResearch.recipes.put(
            "RAU3_3",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 3) },
                6,
                new AspectList().add(Aspect.ARMOR, 40)
                    .add(Aspect.MAGIC, 60)
                    .add(Aspect.AIR, 80)
                    .add(Aspect.MOTION, 40),
                new ItemStack(ItemHandler.itemRunicBoots),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 0), new ItemStack(ConfigItems.itemShard, 1, 0),
                    new ItemStack(Items.potionitem, 1, 16428), new ItemStack(ConfigItems.itemShard, 1, 0),
                    new ItemStack(ConfigItems.itemShard, 1, 0) }));

        ConfigResearch.recipes.put(
            "RGU3",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 3) },
                6,
                new AspectList().add(Aspect.ARMOR, 40)
                    .add(Aspect.MAGIC, 60)
                    .add(Aspect.AIR, 80)
                    .add(Aspect.MOTION, 40),
                new ItemStack(ItemHandler.itemRunicGoggles),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 0), new ItemStack(ConfigItems.itemShard, 1, 0),
                    new ItemStack(Items.potionitem, 1, 16428), new ItemStack(ConfigItems.itemShard, 1, 0),
                    new ItemStack(ConfigItems.itemShard, 1, 0) }));

        ConfigResearch.recipes.put(
            "RBTU3",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 3) },
                6,
                new AspectList().add(Aspect.ARMOR, 40)
                    .add(Aspect.MAGIC, 60)
                    .add(Aspect.AIR, 80)
                    .add(Aspect.MOTION, 40),
                new ItemStack(ItemHandler.itemRunicBootsTraveller),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 0), new ItemStack(ConfigItems.itemShard, 1, 0),
                    new ItemStack(Items.potionitem, 1, 16428), new ItemStack(ConfigItems.itemShard, 1, 0),
                    new ItemStack(ConfigItems.itemShard, 1, 0) }));

        // ------------
        ConfigResearch.recipes.put(
            "ERAU3_0",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 3) },
                6,
                new AspectList().add(Aspect.ARMOR, 40)
                    .add(Aspect.MAGIC, 60)
                    .add(Aspect.AIR, 80)
                    .add(Aspect.MOTION, 40),
                new ItemStack(ItemHandler.itemRunicHelmetEnhanced),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 0), new ItemStack(ConfigItems.itemShard, 1, 0),
                    new ItemStack(Items.potionitem, 1, 16428), new ItemStack(ConfigItems.itemShard, 1, 0),
                    new ItemStack(ConfigItems.itemShard, 1, 0) }));

        ConfigResearch.recipes.put(
            "ERAU3_1",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 3) },
                6,
                new AspectList().add(Aspect.ARMOR, 40)
                    .add(Aspect.MAGIC, 60)
                    .add(Aspect.AIR, 80)
                    .add(Aspect.MOTION, 40),
                new ItemStack(ItemHandler.itemRunicChestEnhanced),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 0), new ItemStack(ConfigItems.itemShard, 1, 0),
                    new ItemStack(Items.potionitem, 1, 16428), new ItemStack(ConfigItems.itemShard, 1, 0),
                    new ItemStack(ConfigItems.itemShard, 1, 0) }));

        ConfigResearch.recipes.put(
            "ERAU3_2",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 3) },
                6,
                new AspectList().add(Aspect.ARMOR, 40)
                    .add(Aspect.MAGIC, 60)
                    .add(Aspect.AIR, 80)
                    .add(Aspect.MOTION, 40),
                new ItemStack(ItemHandler.itemRunicLegsEnhanced),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 0), new ItemStack(ConfigItems.itemShard, 1, 0),
                    new ItemStack(Items.potionitem, 1, 16428), new ItemStack(ConfigItems.itemShard, 1, 0),
                    new ItemStack(ConfigItems.itemShard, 1, 0) }));

        ConfigResearch.recipes.put(
            "ERAU3_3",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 3) },
                6,
                new AspectList().add(Aspect.ARMOR, 40)
                    .add(Aspect.MAGIC, 60)
                    .add(Aspect.AIR, 80)
                    .add(Aspect.MOTION, 40),
                new ItemStack(ItemHandler.itemRunicBootsEnhanced),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 0), new ItemStack(ConfigItems.itemShard, 1, 0),
                    new ItemStack(Items.potionitem, 1, 16428), new ItemStack(ConfigItems.itemShard, 1, 0),
                    new ItemStack(ConfigItems.itemShard, 1, 0) }));

        // ------------
        ConfigResearch.recipes.put(
            "PRAU3_0",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 3) },
                6,
                new AspectList().add(Aspect.ARMOR, 40)
                    .add(Aspect.MAGIC, 60)
                    .add(Aspect.AIR, 80)
                    .add(Aspect.MOTION, 40),
                new ItemStack(ItemHandler.itemRunicHelmetPrimal),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 0), new ItemStack(ConfigItems.itemShard, 1, 0),
                    new ItemStack(Items.potionitem, 1, 16428), new ItemStack(ConfigItems.itemShard, 1, 0),
                    new ItemStack(ConfigItems.itemShard, 1, 0) }));

        ConfigResearch.recipes.put(
            "PRAU3_1",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 3) },
                6,
                new AspectList().add(Aspect.ARMOR, 40)
                    .add(Aspect.MAGIC, 60)
                    .add(Aspect.AIR, 80)
                    .add(Aspect.MOTION, 40),
                new ItemStack(ItemHandler.itemRunicChestPrimal),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 0), new ItemStack(ConfigItems.itemShard, 1, 0),
                    new ItemStack(Items.potionitem, 1, 16428), new ItemStack(ConfigItems.itemShard, 1, 0),
                    new ItemStack(ConfigItems.itemShard, 1, 0) }));

        ConfigResearch.recipes.put(
            "PRAU3_2",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 3) },
                6,
                new AspectList().add(Aspect.ARMOR, 40)
                    .add(Aspect.MAGIC, 60)
                    .add(Aspect.AIR, 80)
                    .add(Aspect.MOTION, 40),
                new ItemStack(ItemHandler.itemRunicLegsPrimal),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 0), new ItemStack(ConfigItems.itemShard, 1, 0),
                    new ItemStack(Items.potionitem, 1, 16428), new ItemStack(ConfigItems.itemShard, 1, 0),
                    new ItemStack(ConfigItems.itemShard, 1, 0) }));

        ConfigResearch.recipes.put(
            "PRAU3_3",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 3) },
                6,
                new AspectList().add(Aspect.ARMOR, 40)
                    .add(Aspect.MAGIC, 60)
                    .add(Aspect.AIR, 80)
                    .add(Aspect.MOTION, 40),
                new ItemStack(ItemHandler.itemRunicBootsPrimal),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 0), new ItemStack(ConfigItems.itemShard, 1, 0),
                    new ItemStack(Items.potionitem, 1, 16428), new ItemStack(ConfigItems.itemShard, 1, 0),
                    new ItemStack(ConfigItems.itemShard, 1, 0) }));

        // TODO upgrade 4 (regen)
        /*
         * new AspectList().add(Aspect.ARMOR, 16).add(Aspect.MAGIC, 48).add(Aspect.WATER, 32).add(Aspect.HEAL, 60),
         * new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6), new ItemStack(ConfigItems.itemShard, 1, 2), new
         * ItemStack(ConfigItems.itemShard, 1, 2), new ItemStack(Items.potionitem, 1, 8257), new
         * ItemStack(ConfigItems.itemShard, 1, 2), new ItemStack(ConfigItems.itemShard, 1, 2) }));
         */
        ConfigResearch.recipes.put(
            "RAU4_0",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 4) },
                6,
                new AspectList().add(Aspect.ARMOR, 16)
                    .add(Aspect.MAGIC, 64)
                    .add(Aspect.WATER, 32)
                    .add(Aspect.HEAL, 60),
                new ItemStack(ItemHandler.itemRunicHelmet),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 2), new ItemStack(ConfigItems.itemShard, 1, 2),
                    new ItemStack(Items.potionitem, 1, 8257), new ItemStack(ConfigItems.itemShard, 1, 2),
                    new ItemStack(ConfigItems.itemShard, 1, 2) }));

        ConfigResearch.recipes.put(
            "RAU4_1",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 4) },
                6,
                new AspectList().add(Aspect.ARMOR, 16)
                    .add(Aspect.MAGIC, 64)
                    .add(Aspect.WATER, 32)
                    .add(Aspect.HEAL, 60),
                new ItemStack(ItemHandler.itemRunicChest),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 2), new ItemStack(ConfigItems.itemShard, 1, 2),
                    new ItemStack(Items.potionitem, 1, 8257), new ItemStack(ConfigItems.itemShard, 1, 2),
                    new ItemStack(ConfigItems.itemShard, 1, 2) }));

        ConfigResearch.recipes.put(
            "RAU4_2",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 4) },
                6,
                new AspectList().add(Aspect.ARMOR, 16)
                    .add(Aspect.MAGIC, 64)
                    .add(Aspect.WATER, 32)
                    .add(Aspect.HEAL, 60),
                new ItemStack(ItemHandler.itemRunicLegs),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 2), new ItemStack(ConfigItems.itemShard, 1, 2),
                    new ItemStack(Items.potionitem, 1, 8257), new ItemStack(ConfigItems.itemShard, 1, 2),
                    new ItemStack(ConfigItems.itemShard, 1, 2) }));

        ConfigResearch.recipes.put(
            "RAU4_3",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 4) },
                6,
                new AspectList().add(Aspect.ARMOR, 16)
                    .add(Aspect.MAGIC, 64)
                    .add(Aspect.WATER, 32)
                    .add(Aspect.HEAL, 60),
                new ItemStack(ItemHandler.itemRunicBoots),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 2), new ItemStack(ConfigItems.itemShard, 1, 2),
                    new ItemStack(Items.potionitem, 1, 8257), new ItemStack(ConfigItems.itemShard, 1, 2),
                    new ItemStack(ConfigItems.itemShard, 1, 2) }));

        ConfigResearch.recipes.put(
            "RGU4",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 4) },
                6,
                new AspectList().add(Aspect.ARMOR, 16)
                    .add(Aspect.MAGIC, 48)
                    .add(Aspect.WATER, 32)
                    .add(Aspect.HEAL, 60),
                new ItemStack(ItemHandler.itemRunicGoggles),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 2), new ItemStack(ConfigItems.itemShard, 1, 2),
                    new ItemStack(Items.potionitem, 1, 8257), new ItemStack(ConfigItems.itemShard, 1, 2),
                    new ItemStack(ConfigItems.itemShard, 1, 2) }));

        ConfigResearch.recipes.put(
            "RBTU4",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 4) },
                6,
                new AspectList().add(Aspect.ARMOR, 16)
                    .add(Aspect.MAGIC, 48)
                    .add(Aspect.WATER, 32)
                    .add(Aspect.HEAL, 60),
                new ItemStack(ItemHandler.itemRunicBootsTraveller),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 2), new ItemStack(ConfigItems.itemShard, 1, 2),
                    new ItemStack(Items.potionitem, 1, 8257), new ItemStack(ConfigItems.itemShard, 1, 2),
                    new ItemStack(ConfigItems.itemShard, 1, 2) }));

        // ------------
        ConfigResearch.recipes.put(
            "ERAU4_0",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 4) },
                6,
                new AspectList().add(Aspect.ARMOR, 16)
                    .add(Aspect.MAGIC, 64)
                    .add(Aspect.WATER, 32)
                    .add(Aspect.HEAL, 60),
                new ItemStack(ItemHandler.itemRunicHelmetEnhanced),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 2), new ItemStack(ConfigItems.itemShard, 1, 2),
                    new ItemStack(Items.potionitem, 1, 8257), new ItemStack(ConfigItems.itemShard, 1, 2),
                    new ItemStack(ConfigItems.itemShard, 1, 2) }));

        ConfigResearch.recipes.put(
            "ERAU4_1",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 4) },
                6,
                new AspectList().add(Aspect.ARMOR, 16)
                    .add(Aspect.MAGIC, 64)
                    .add(Aspect.WATER, 32)
                    .add(Aspect.HEAL, 60),
                new ItemStack(ItemHandler.itemRunicChestEnhanced),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 2), new ItemStack(ConfigItems.itemShard, 1, 2),
                    new ItemStack(Items.potionitem, 1, 8257), new ItemStack(ConfigItems.itemShard, 1, 2),
                    new ItemStack(ConfigItems.itemShard, 1, 2) }));

        ConfigResearch.recipes.put(
            "ERAU4_2",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 4) },
                6,
                new AspectList().add(Aspect.ARMOR, 16)
                    .add(Aspect.MAGIC, 64)
                    .add(Aspect.WATER, 32)
                    .add(Aspect.HEAL, 60),
                new ItemStack(ItemHandler.itemRunicLegsEnhanced),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 2), new ItemStack(ConfigItems.itemShard, 1, 2),
                    new ItemStack(Items.potionitem, 1, 8257), new ItemStack(ConfigItems.itemShard, 1, 2),
                    new ItemStack(ConfigItems.itemShard, 1, 2) }));

        ConfigResearch.recipes.put(
            "ERAU4_3",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 4) },
                6,
                new AspectList().add(Aspect.ARMOR, 16)
                    .add(Aspect.MAGIC, 64)
                    .add(Aspect.WATER, 32)
                    .add(Aspect.HEAL, 60),
                new ItemStack(ItemHandler.itemRunicBootsEnhanced),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 2), new ItemStack(ConfigItems.itemShard, 1, 2),
                    new ItemStack(Items.potionitem, 1, 8257), new ItemStack(ConfigItems.itemShard, 1, 2),
                    new ItemStack(ConfigItems.itemShard, 1, 2) }));

        // ------------
        ConfigResearch.recipes.put(
            "PRAU4_0",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 4) },
                6,
                new AspectList().add(Aspect.ARMOR, 16)
                    .add(Aspect.MAGIC, 64)
                    .add(Aspect.WATER, 32)
                    .add(Aspect.HEAL, 60),
                new ItemStack(ItemHandler.itemRunicHelmetPrimal),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 2), new ItemStack(ConfigItems.itemShard, 1, 2),
                    new ItemStack(Items.potionitem, 1, 8257), new ItemStack(ConfigItems.itemShard, 1, 2),
                    new ItemStack(ConfigItems.itemShard, 1, 2) }));

        ConfigResearch.recipes.put(
            "PRAU4_1",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 4) },
                6,
                new AspectList().add(Aspect.ARMOR, 16)
                    .add(Aspect.MAGIC, 64)
                    .add(Aspect.WATER, 32)
                    .add(Aspect.HEAL, 60),
                new ItemStack(ItemHandler.itemRunicChestPrimal),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 2), new ItemStack(ConfigItems.itemShard, 1, 2),
                    new ItemStack(Items.potionitem, 1, 8257), new ItemStack(ConfigItems.itemShard, 1, 2),
                    new ItemStack(ConfigItems.itemShard, 1, 2) }));

        ConfigResearch.recipes.put(
            "PRAU4_2",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 4) },
                6,
                new AspectList().add(Aspect.ARMOR, 16)
                    .add(Aspect.MAGIC, 64)
                    .add(Aspect.WATER, 32)
                    .add(Aspect.HEAL, 60),
                new ItemStack(ItemHandler.itemRunicLegsPrimal),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 2), new ItemStack(ConfigItems.itemShard, 1, 2),
                    new ItemStack(Items.potionitem, 1, 8257), new ItemStack(ConfigItems.itemShard, 1, 2),
                    new ItemStack(ConfigItems.itemShard, 1, 2) }));

        ConfigResearch.recipes.put(
            "PRAU4_3",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 4) },
                6,
                new AspectList().add(Aspect.ARMOR, 16)
                    .add(Aspect.MAGIC, 64)
                    .add(Aspect.WATER, 32)
                    .add(Aspect.HEAL, 60),
                new ItemStack(ItemHandler.itemRunicBootsPrimal),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 2), new ItemStack(ConfigItems.itemShard, 1, 2),
                    new ItemStack(Items.potionitem, 1, 8257), new ItemStack(ConfigItems.itemShard, 1, 2),
                    new ItemStack(ConfigItems.itemShard, 1, 2) }));

        // TODO upgrade 5 (+armour)
        /*
         * new AspectList().add(Aspect.ARMOR, 48).add(Aspect.MAGIC, 32).add(Aspect.ORDER, 32).add(Aspect.METAL, 40),
         * new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6), new ItemStack(ConfigItems.itemShard, 1, 4), new
         * ItemStack(ConfigItems.itemShard, 1, 4), new ItemStack(Blocks.iron_block), new
         * ItemStack(ConfigItems.itemShard, 1, 4), new ItemStack(ConfigItems.itemShard, 1, 4) }));
         */
        ConfigResearch.recipes.put(
            "RAU5_0",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 5) },
                6,
                new AspectList().add(Aspect.ARMOR, 48)
                    .add(Aspect.MAGIC, 32)
                    .add(Aspect.ORDER, 32)
                    .add(Aspect.METAL, 40),
                new ItemStack(ItemHandler.itemRunicHelmet),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 4), new ItemStack(ConfigItems.itemShard, 1, 4),
                    new ItemStack(Blocks.iron_block), new ItemStack(ConfigItems.itemShard, 1, 4),
                    new ItemStack(ConfigItems.itemShard, 1, 4) }));

        ConfigResearch.recipes.put(
            "RAU5_1",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 5) },
                6,
                new AspectList().add(Aspect.ARMOR, 48)
                    .add(Aspect.MAGIC, 32)
                    .add(Aspect.ORDER, 32)
                    .add(Aspect.METAL, 40),
                new ItemStack(ItemHandler.itemRunicChest),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 4), new ItemStack(ConfigItems.itemShard, 1, 4),
                    new ItemStack(Blocks.iron_block), new ItemStack(ConfigItems.itemShard, 1, 4),
                    new ItemStack(ConfigItems.itemShard, 1, 4) }));

        ConfigResearch.recipes.put(
            "RAU5_2",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 5) },
                6,
                new AspectList().add(Aspect.ARMOR, 48)
                    .add(Aspect.MAGIC, 32)
                    .add(Aspect.ORDER, 32)
                    .add(Aspect.METAL, 40),
                new ItemStack(ItemHandler.itemRunicLegs),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 4), new ItemStack(ConfigItems.itemShard, 1, 4),
                    new ItemStack(Blocks.iron_block), new ItemStack(ConfigItems.itemShard, 1, 4),
                    new ItemStack(ConfigItems.itemShard, 1, 4) }));

        ConfigResearch.recipes.put(
            "RAU5_3",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 5) },
                6,
                new AspectList().add(Aspect.ARMOR, 48)
                    .add(Aspect.MAGIC, 32)
                    .add(Aspect.ORDER, 32)
                    .add(Aspect.METAL, 40),
                new ItemStack(ItemHandler.itemRunicBoots),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 4), new ItemStack(ConfigItems.itemShard, 1, 4),
                    new ItemStack(Blocks.iron_block), new ItemStack(ConfigItems.itemShard, 1, 4),
                    new ItemStack(ConfigItems.itemShard, 1, 4) }));

        ConfigResearch.recipes.put(
            "RGU5",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 5) },
                6,
                new AspectList().add(Aspect.ARMOR, 48)
                    .add(Aspect.MAGIC, 32)
                    .add(Aspect.ORDER, 32)
                    .add(Aspect.METAL, 40),
                new ItemStack(ItemHandler.itemRunicGoggles),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 4), new ItemStack(ConfigItems.itemShard, 1, 4),
                    new ItemStack(Blocks.iron_block), new ItemStack(ConfigItems.itemShard, 1, 4),
                    new ItemStack(ConfigItems.itemShard, 1, 4) }));

        ConfigResearch.recipes.put(
            "RBTU5",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 5) },
                6,
                new AspectList().add(Aspect.ARMOR, 48)
                    .add(Aspect.MAGIC, 32)
                    .add(Aspect.ORDER, 32)
                    .add(Aspect.METAL, 40),
                new ItemStack(ItemHandler.itemRunicBootsTraveller),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 4), new ItemStack(ConfigItems.itemShard, 1, 4),
                    new ItemStack(Blocks.iron_block), new ItemStack(ConfigItems.itemShard, 1, 4),
                    new ItemStack(ConfigItems.itemShard, 1, 4) }));

        // ------------
        ConfigResearch.recipes.put(
            "ERAU5_0",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 5) },
                6,
                new AspectList().add(Aspect.ARMOR, 48)
                    .add(Aspect.MAGIC, 32)
                    .add(Aspect.ORDER, 32)
                    .add(Aspect.METAL, 40),
                new ItemStack(ItemHandler.itemRunicHelmetEnhanced),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 4), new ItemStack(ConfigItems.itemShard, 1, 4),
                    new ItemStack(Blocks.iron_block), new ItemStack(ConfigItems.itemShard, 1, 4),
                    new ItemStack(ConfigItems.itemShard, 1, 4) }));

        ConfigResearch.recipes.put(
            "ERAU5_1",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 5) },
                6,
                new AspectList().add(Aspect.ARMOR, 48)
                    .add(Aspect.MAGIC, 32)
                    .add(Aspect.ORDER, 32)
                    .add(Aspect.METAL, 40),
                new ItemStack(ItemHandler.itemRunicChestEnhanced),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 4), new ItemStack(ConfigItems.itemShard, 1, 4),
                    new ItemStack(Blocks.iron_block), new ItemStack(ConfigItems.itemShard, 1, 4),
                    new ItemStack(ConfigItems.itemShard, 1, 4) }));

        ConfigResearch.recipes.put(
            "ERAU5_2",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 5) },
                6,
                new AspectList().add(Aspect.ARMOR, 48)
                    .add(Aspect.MAGIC, 32)
                    .add(Aspect.ORDER, 32)
                    .add(Aspect.METAL, 40),
                new ItemStack(ItemHandler.itemRunicLegsEnhanced),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 4), new ItemStack(ConfigItems.itemShard, 1, 4),
                    new ItemStack(Blocks.iron_block), new ItemStack(ConfigItems.itemShard, 1, 4),
                    new ItemStack(ConfigItems.itemShard, 1, 4) }));

        ConfigResearch.recipes.put(
            "ERAU5_3",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 5) },
                6,
                new AspectList().add(Aspect.ARMOR, 48)
                    .add(Aspect.MAGIC, 32)
                    .add(Aspect.ORDER, 32)
                    .add(Aspect.METAL, 40),
                new ItemStack(ItemHandler.itemRunicBootsEnhanced),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 4), new ItemStack(ConfigItems.itemShard, 1, 4),
                    new ItemStack(Blocks.iron_block), new ItemStack(ConfigItems.itemShard, 1, 4),
                    new ItemStack(ConfigItems.itemShard, 1, 4) }));

        // ------------
        ConfigResearch.recipes.put(
            "PRAU5_0",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 5) },
                6,
                new AspectList().add(Aspect.ARMOR, 48)
                    .add(Aspect.MAGIC, 32)
                    .add(Aspect.ORDER, 32)
                    .add(Aspect.METAL, 40),
                new ItemStack(ItemHandler.itemRunicHelmetPrimal),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 4), new ItemStack(ConfigItems.itemShard, 1, 4),
                    new ItemStack(Blocks.iron_block), new ItemStack(ConfigItems.itemShard, 1, 4),
                    new ItemStack(ConfigItems.itemShard, 1, 4) }));

        ConfigResearch.recipes.put(
            "PRAU5_1",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 5) },
                6,
                new AspectList().add(Aspect.ARMOR, 48)
                    .add(Aspect.MAGIC, 32)
                    .add(Aspect.ORDER, 32)
                    .add(Aspect.METAL, 40),
                new ItemStack(ItemHandler.itemRunicChestPrimal),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 4), new ItemStack(ConfigItems.itemShard, 1, 4),
                    new ItemStack(Blocks.iron_block), new ItemStack(ConfigItems.itemShard, 1, 4),
                    new ItemStack(ConfigItems.itemShard, 1, 4) }));

        ConfigResearch.recipes.put(
            "PRAU5_2",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 5) },
                6,
                new AspectList().add(Aspect.ARMOR, 48)
                    .add(Aspect.MAGIC, 32)
                    .add(Aspect.ORDER, 32)
                    .add(Aspect.METAL, 40),
                new ItemStack(ItemHandler.itemRunicLegsPrimal),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 4), new ItemStack(ConfigItems.itemShard, 1, 4),
                    new ItemStack(Blocks.iron_block), new ItemStack(ConfigItems.itemShard, 1, 4),
                    new ItemStack(ConfigItems.itemShard, 1, 4) }));

        ConfigResearch.recipes.put(
            "PRAU5_3",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 5) },
                6,
                new AspectList().add(Aspect.ARMOR, 48)
                    .add(Aspect.MAGIC, 32)
                    .add(Aspect.ORDER, 32)
                    .add(Aspect.METAL, 40),
                new ItemStack(ItemHandler.itemRunicBootsPrimal),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 4), new ItemStack(ConfigItems.itemShard, 1, 4),
                    new ItemStack(Blocks.iron_block), new ItemStack(ConfigItems.itemShard, 1, 4),
                    new ItemStack(ConfigItems.itemShard, 1, 4) }));

        // TODO upgrade 6 (+emergency)
        /*
         * new AspectList().add(Aspect.ARMOR, 40).add(Aspect.MAGIC, 56).add(Aspect.EARTH, 32).add(Aspect.ENERGY, 80),
         * new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6), new ItemStack(ConfigItems.itemShard, 1, 3), new
         * ItemStack(ConfigItems.itemShard, 1, 3), new ItemStack(Items.potionitem, 1, 8233), new
         * ItemStack(ConfigItems.itemShard, 1, 3), new ItemStack(ConfigItems.itemShard, 1, 3) }));
         */
        ConfigResearch.recipes.put(
            "RAU6_0",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 6) },
                6,
                new AspectList().add(Aspect.ARMOR, 40)
                    .add(Aspect.MAGIC, 56)
                    .add(Aspect.EARTH, 32)
                    .add(Aspect.ENERGY, 80),
                new ItemStack(ItemHandler.itemRunicHelmet),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 3), new ItemStack(ConfigItems.itemShard, 1, 3),
                    new ItemStack(Items.potionitem, 1, 8233), new ItemStack(ConfigItems.itemShard, 1, 3),
                    new ItemStack(ConfigItems.itemShard, 1, 3) }));

        ConfigResearch.recipes.put(
            "RAU6_1",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 6) },
                6,
                new AspectList().add(Aspect.ARMOR, 40)
                    .add(Aspect.MAGIC, 56)
                    .add(Aspect.EARTH, 32)
                    .add(Aspect.ENERGY, 80),
                new ItemStack(ItemHandler.itemRunicChest),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 3), new ItemStack(ConfigItems.itemShard, 1, 3),
                    new ItemStack(Items.potionitem, 1, 8233), new ItemStack(ConfigItems.itemShard, 1, 3),
                    new ItemStack(ConfigItems.itemShard, 1, 3) }));

        ConfigResearch.recipes.put(
            "RAU6_2",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 6) },
                6,
                new AspectList().add(Aspect.ARMOR, 40)
                    .add(Aspect.MAGIC, 56)
                    .add(Aspect.EARTH, 32)
                    .add(Aspect.ENERGY, 80),
                new ItemStack(ItemHandler.itemRunicLegs),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 3), new ItemStack(ConfigItems.itemShard, 1, 3),
                    new ItemStack(Items.potionitem, 1, 8233), new ItemStack(ConfigItems.itemShard, 1, 3),
                    new ItemStack(ConfigItems.itemShard, 1, 3) }));

        ConfigResearch.recipes.put(
            "RAU6_3",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 6) },
                6,
                new AspectList().add(Aspect.ARMOR, 40)
                    .add(Aspect.MAGIC, 56)
                    .add(Aspect.EARTH, 32)
                    .add(Aspect.ENERGY, 80),
                new ItemStack(ItemHandler.itemRunicBoots),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 3), new ItemStack(ConfigItems.itemShard, 1, 3),
                    new ItemStack(Items.potionitem, 1, 8233), new ItemStack(ConfigItems.itemShard, 1, 3),
                    new ItemStack(ConfigItems.itemShard, 1, 3) }));

        ConfigResearch.recipes.put(
            "RGU6",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 6) },
                6,
                new AspectList().add(Aspect.ARMOR, 40)
                    .add(Aspect.MAGIC, 56)
                    .add(Aspect.EARTH, 32)
                    .add(Aspect.ENERGY, 80),
                new ItemStack(ItemHandler.itemRunicGoggles),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 3), new ItemStack(ConfigItems.itemShard, 1, 3),
                    new ItemStack(Items.potionitem, 1, 8233), new ItemStack(ConfigItems.itemShard, 1, 3),
                    new ItemStack(ConfigItems.itemShard, 1, 3) }));

        ConfigResearch.recipes.put(
            "RBTU6",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 6) },
                6,
                new AspectList().add(Aspect.ARMOR, 40)
                    .add(Aspect.MAGIC, 56)
                    .add(Aspect.EARTH, 32)
                    .add(Aspect.ENERGY, 80),
                new ItemStack(ItemHandler.itemRunicBootsTraveller),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 3), new ItemStack(ConfigItems.itemShard, 1, 3),
                    new ItemStack(Items.potionitem, 1, 8233), new ItemStack(ConfigItems.itemShard, 1, 3),
                    new ItemStack(ConfigItems.itemShard, 1, 3) }));

        // ------------
        ConfigResearch.recipes.put(
            "ERAU6_0",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 6) },
                6,
                new AspectList().add(Aspect.ARMOR, 40)
                    .add(Aspect.MAGIC, 56)
                    .add(Aspect.EARTH, 32)
                    .add(Aspect.ENERGY, 80),
                new ItemStack(ItemHandler.itemRunicHelmetEnhanced),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 3), new ItemStack(ConfigItems.itemShard, 1, 3),
                    new ItemStack(Items.potionitem, 1, 8233), new ItemStack(ConfigItems.itemShard, 1, 3),
                    new ItemStack(ConfigItems.itemShard, 1, 3) }));

        ConfigResearch.recipes.put(
            "ERAU6_1",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 6) },
                6,
                new AspectList().add(Aspect.ARMOR, 40)
                    .add(Aspect.MAGIC, 56)
                    .add(Aspect.EARTH, 32)
                    .add(Aspect.ENERGY, 80),
                new ItemStack(ItemHandler.itemRunicChestEnhanced),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 3), new ItemStack(ConfigItems.itemShard, 1, 3),
                    new ItemStack(Items.potionitem, 1, 8233), new ItemStack(ConfigItems.itemShard, 1, 3),
                    new ItemStack(ConfigItems.itemShard, 1, 3) }));

        ConfigResearch.recipes.put(
            "ERAU6_2",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 6) },
                6,
                new AspectList().add(Aspect.ARMOR, 40)
                    .add(Aspect.MAGIC, 56)
                    .add(Aspect.EARTH, 32)
                    .add(Aspect.ENERGY, 80),
                new ItemStack(ItemHandler.itemRunicLegsEnhanced),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 3), new ItemStack(ConfigItems.itemShard, 1, 3),
                    new ItemStack(Items.potionitem, 1, 8233), new ItemStack(ConfigItems.itemShard, 1, 3),
                    new ItemStack(ConfigItems.itemShard, 1, 3) }));

        ConfigResearch.recipes.put(
            "ERAU6_3",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 6) },
                6,
                new AspectList().add(Aspect.ARMOR, 40)
                    .add(Aspect.MAGIC, 56)
                    .add(Aspect.EARTH, 32)
                    .add(Aspect.ENERGY, 80),
                new ItemStack(ItemHandler.itemRunicBootsEnhanced),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 3), new ItemStack(ConfigItems.itemShard, 1, 3),
                    new ItemStack(Items.potionitem, 1, 8233), new ItemStack(ConfigItems.itemShard, 1, 3),
                    new ItemStack(ConfigItems.itemShard, 1, 3) }));

        // ------------
        ConfigResearch.recipes.put(
            "PRAU6_0",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 6) },
                6,
                new AspectList().add(Aspect.ARMOR, 40)
                    .add(Aspect.MAGIC, 56)
                    .add(Aspect.EARTH, 32)
                    .add(Aspect.ENERGY, 80),
                new ItemStack(ItemHandler.itemRunicHelmetPrimal),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 3), new ItemStack(ConfigItems.itemShard, 1, 3),
                    new ItemStack(Items.potionitem, 1, 8233), new ItemStack(ConfigItems.itemShard, 1, 3),
                    new ItemStack(ConfigItems.itemShard, 1, 3) }));

        ConfigResearch.recipes.put(
            "PRAU6_1",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 6) },
                6,
                new AspectList().add(Aspect.ARMOR, 40)
                    .add(Aspect.MAGIC, 56)
                    .add(Aspect.EARTH, 32)
                    .add(Aspect.ENERGY, 80),
                new ItemStack(ItemHandler.itemRunicChestPrimal),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 3), new ItemStack(ConfigItems.itemShard, 1, 3),
                    new ItemStack(Items.potionitem, 1, 8233), new ItemStack(ConfigItems.itemShard, 1, 3),
                    new ItemStack(ConfigItems.itemShard, 1, 3) }));

        ConfigResearch.recipes.put(
            "PRAU6_2",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 6) },
                6,
                new AspectList().add(Aspect.ARMOR, 40)
                    .add(Aspect.MAGIC, 56)
                    .add(Aspect.EARTH, 32)
                    .add(Aspect.ENERGY, 80),
                new ItemStack(ItemHandler.itemRunicLegsPrimal),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 3), new ItemStack(ConfigItems.itemShard, 1, 3),
                    new ItemStack(Items.potionitem, 1, 8233), new ItemStack(ConfigItems.itemShard, 1, 3),
                    new ItemStack(ConfigItems.itemShard, 1, 3) }));

        ConfigResearch.recipes.put(
            "PRAU6_3",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 6) },
                6,
                new AspectList().add(Aspect.ARMOR, 40)
                    .add(Aspect.MAGIC, 56)
                    .add(Aspect.EARTH, 32)
                    .add(Aspect.ENERGY, 80),
                new ItemStack(ItemHandler.itemRunicBootsPrimal),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 3), new ItemStack(ConfigItems.itemShard, 1, 3),
                    new ItemStack(Items.potionitem, 1, 8233), new ItemStack(ConfigItems.itemShard, 1, 3),
                    new ItemStack(ConfigItems.itemShard, 1, 3) }));

        // TODO upgrade 7 (knockback)
        /*
         * new Object[] { "upgrade", new NBTTagByte((byte) 7) }, 6,
         * new AspectList().add(Aspect.ARMOR, 24).add(Aspect.MAGIC, 32).add(Aspect.MOTION, 40).add(Aspect.ENTROPY, 60),
         * new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6), new ItemStack(ConfigItems.itemShard, 1, 5), new
         * ItemStack(Blocks.iron_block), new ItemStack(ConfigBlocks.blockCosmeticSolid,1,3), new
         * ItemStack(Blocks.iron_block), new ItemStack(ConfigItems.itemShard, 1, 5) }));
         */
        ConfigResearch.recipes.put(
            "RAU7_0",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 7) },
                6,
                new AspectList().add(Aspect.ARMOR, 24)
                    .add(Aspect.MAGIC, 32)
                    .add(Aspect.MOTION, 40)
                    .add(Aspect.ENTROPY, 60),
                new ItemStack(ItemHandler.itemRunicHelmet),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 5), new ItemStack(Blocks.iron_block),
                    new ItemStack(ConfigBlocks.blockCosmeticSolid, 1, 3), new ItemStack(Blocks.iron_block),
                    new ItemStack(ConfigItems.itemShard, 1, 5) }));

        ConfigResearch.recipes.put(
            "RAU7_1",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 7) },
                6,
                new AspectList().add(Aspect.ARMOR, 24)
                    .add(Aspect.MAGIC, 32)
                    .add(Aspect.MOTION, 40)
                    .add(Aspect.ENTROPY, 60),
                new ItemStack(ItemHandler.itemRunicChest),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 5), new ItemStack(Blocks.iron_block),
                    new ItemStack(ConfigBlocks.blockCosmeticSolid, 1, 3), new ItemStack(Blocks.iron_block),
                    new ItemStack(ConfigItems.itemShard, 1, 5) }));

        ConfigResearch.recipes.put(
            "RAU7_2",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 7) },
                6,
                new AspectList().add(Aspect.ARMOR, 24)
                    .add(Aspect.MAGIC, 32)
                    .add(Aspect.MOTION, 40)
                    .add(Aspect.ENTROPY, 60),
                new ItemStack(ItemHandler.itemRunicLegs),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 5), new ItemStack(Blocks.iron_block),
                    new ItemStack(ConfigBlocks.blockCosmeticSolid, 1, 3), new ItemStack(Blocks.iron_block),
                    new ItemStack(ConfigItems.itemShard, 1, 5) }));

        ConfigResearch.recipes.put(
            "RAU7_3",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 7) },
                6,
                new AspectList().add(Aspect.ARMOR, 24)
                    .add(Aspect.MAGIC, 32)
                    .add(Aspect.MOTION, 40)
                    .add(Aspect.ENTROPY, 60),
                new ItemStack(ItemHandler.itemRunicBoots),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 5), new ItemStack(Blocks.iron_block),
                    new ItemStack(ConfigBlocks.blockCosmeticSolid, 1, 3), new ItemStack(Blocks.iron_block),
                    new ItemStack(ConfigItems.itemShard, 1, 5) }));

        ConfigResearch.recipes.put(
            "RGU7",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 7) },
                6,
                new AspectList().add(Aspect.ARMOR, 24)
                    .add(Aspect.MAGIC, 32)
                    .add(Aspect.MOTION, 40)
                    .add(Aspect.ENTROPY, 60),
                new ItemStack(ItemHandler.itemRunicGoggles),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 5), new ItemStack(Blocks.iron_block),
                    new ItemStack(ConfigBlocks.blockCosmeticSolid, 1, 3), new ItemStack(Blocks.iron_block),
                    new ItemStack(ConfigItems.itemShard, 1, 5) }));

        ConfigResearch.recipes.put(
            "RBTU7",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 7) },
                6,
                new AspectList().add(Aspect.ARMOR, 24)
                    .add(Aspect.MAGIC, 32)
                    .add(Aspect.MOTION, 40)
                    .add(Aspect.ENTROPY, 60),
                new ItemStack(ItemHandler.itemRunicBootsTraveller),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 5), new ItemStack(Blocks.iron_block),
                    new ItemStack(ConfigBlocks.blockCosmeticSolid, 1, 3), new ItemStack(Blocks.iron_block),
                    new ItemStack(ConfigItems.itemShard, 1, 5) }));

        // ------------
        ConfigResearch.recipes.put(
            "ERAU7_0",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 7) },
                6,
                new AspectList().add(Aspect.ARMOR, 24)
                    .add(Aspect.MAGIC, 32)
                    .add(Aspect.MOTION, 40)
                    .add(Aspect.ENTROPY, 60),
                new ItemStack(ItemHandler.itemRunicHelmetEnhanced),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 5), new ItemStack(Blocks.iron_block),
                    new ItemStack(ConfigBlocks.blockCosmeticSolid, 1, 3), new ItemStack(Blocks.iron_block),
                    new ItemStack(ConfigItems.itemShard, 1, 5) }));

        ConfigResearch.recipes.put(
            "ERAU7_1",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 7) },
                6,
                new AspectList().add(Aspect.ARMOR, 24)
                    .add(Aspect.MAGIC, 32)
                    .add(Aspect.MOTION, 40)
                    .add(Aspect.ENTROPY, 60),
                new ItemStack(ItemHandler.itemRunicChestEnhanced),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 5), new ItemStack(Blocks.iron_block),
                    new ItemStack(ConfigBlocks.blockCosmeticSolid, 1, 3), new ItemStack(Blocks.iron_block),
                    new ItemStack(ConfigItems.itemShard, 1, 5) }));

        ConfigResearch.recipes.put(
            "ERAU7_2",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 7) },
                6,
                new AspectList().add(Aspect.ARMOR, 24)
                    .add(Aspect.MAGIC, 32)
                    .add(Aspect.MOTION, 40)
                    .add(Aspect.ENTROPY, 60),
                new ItemStack(ItemHandler.itemRunicLegsEnhanced),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 5), new ItemStack(Blocks.iron_block),
                    new ItemStack(ConfigBlocks.blockCosmeticSolid, 1, 3), new ItemStack(Blocks.iron_block),
                    new ItemStack(ConfigItems.itemShard, 1, 5) }));

        ConfigResearch.recipes.put(
            "ERAU7_3",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 7) },
                6,
                new AspectList().add(Aspect.ARMOR, 24)
                    .add(Aspect.MAGIC, 32)
                    .add(Aspect.MOTION, 40)
                    .add(Aspect.ENTROPY, 60),
                new ItemStack(ItemHandler.itemRunicBootsEnhanced),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 5), new ItemStack(Blocks.iron_block),
                    new ItemStack(ConfigBlocks.blockCosmeticSolid, 1, 3), new ItemStack(Blocks.iron_block),
                    new ItemStack(ConfigItems.itemShard, 1, 5) }));

        // ------------
        ConfigResearch.recipes.put(
            "PRAU7_0",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 7) },
                6,
                new AspectList().add(Aspect.ARMOR, 24)
                    .add(Aspect.MAGIC, 32)
                    .add(Aspect.MOTION, 40)
                    .add(Aspect.ENTROPY, 60),
                new ItemStack(ItemHandler.itemRunicHelmetPrimal),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 5), new ItemStack(Blocks.iron_block),
                    new ItemStack(ConfigBlocks.blockCosmeticSolid, 1, 3), new ItemStack(Blocks.iron_block),
                    new ItemStack(ConfigItems.itemShard, 1, 5) }));

        ConfigResearch.recipes.put(
            "PRAU7_1",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 7) },
                6,
                new AspectList().add(Aspect.ARMOR, 24)
                    .add(Aspect.MAGIC, 32)
                    .add(Aspect.MOTION, 40)
                    .add(Aspect.ENTROPY, 60),
                new ItemStack(ItemHandler.itemRunicChestPrimal),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 5), new ItemStack(Blocks.iron_block),
                    new ItemStack(ConfigBlocks.blockCosmeticSolid, 1, 3), new ItemStack(Blocks.iron_block),
                    new ItemStack(ConfigItems.itemShard, 1, 5) }));

        ConfigResearch.recipes.put(
            "PRAU7_2",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 7) },
                6,
                new AspectList().add(Aspect.ARMOR, 24)
                    .add(Aspect.MAGIC, 32)
                    .add(Aspect.MOTION, 40)
                    .add(Aspect.ENTROPY, 60),
                new ItemStack(ItemHandler.itemRunicLegsPrimal),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 5), new ItemStack(Blocks.iron_block),
                    new ItemStack(ConfigBlocks.blockCosmeticSolid, 1, 3), new ItemStack(Blocks.iron_block),
                    new ItemStack(ConfigItems.itemShard, 1, 5) }));

        ConfigResearch.recipes.put(
            "PRAU7_3",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 7) },
                6,
                new AspectList().add(Aspect.ARMOR, 24)
                    .add(Aspect.MAGIC, 32)
                    .add(Aspect.MOTION, 40)
                    .add(Aspect.ENTROPY, 60),
                new ItemStack(ItemHandler.itemRunicBootsPrimal),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 5), new ItemStack(Blocks.iron_block),
                    new ItemStack(ConfigBlocks.blockCosmeticSolid, 1, 3), new ItemStack(Blocks.iron_block),
                    new ItemStack(ConfigItems.itemShard, 1, 5) }));

        // TODO upgrade 8 (vitality)
        /*
         * new Object[] { "upgrade", new NBTTagByte((byte) 8) }, 6,
         * new AspectList().add(Aspect.WEAPON, 120).add(Aspect.MAGIC, 50).add(Aspect.FIRE, 32),
         * new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6), new ItemStack(ConfigItems.itemShard, 1, 1), new
         * ItemStack(ConfigItems.itemShard, 1, 1), new ItemStack(Items.blaze_powder), new
         * ItemStack(ConfigItems.itemShard, 1, 1), new ItemStack(ConfigItems.itemShard, 1, 1) }));
         */
        ConfigResearch.recipes.put(
            "RAU8_0",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 8) },
                6,
                new AspectList().add(Aspect.LIFE, 320)
                    .add(Aspect.MAGIC, 64)
                    .add(Aspect.MAN, 80)
                    .add(Aspect.EXCHANGE, 40)
                    .add(Aspect.SOUL, 40),
                new ItemStack(ItemHandler.itemRunicHelmet),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 2), new ItemStack(ConfigBlocks.blockCustomPlant, 1, 1),
                    new ItemStack(ConfigItems.itemGolemPlacer, 1, 4),
                    new ItemStack(ConfigBlocks.blockCustomPlant, 1, 1), new ItemStack(ConfigItems.itemShard, 1, 3) }));

        ConfigResearch.recipes.put(
            "RAU8_1",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 8) },
                6,
                new AspectList().add(Aspect.LIFE, 320)
                    .add(Aspect.MAGIC, 64)
                    .add(Aspect.MAN, 80)
                    .add(Aspect.EXCHANGE, 40)
                    .add(Aspect.SOUL, 40),
                new ItemStack(ItemHandler.itemRunicChest),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 2), new ItemStack(ConfigBlocks.blockCustomPlant, 1, 1),
                    new ItemStack(ConfigItems.itemGolemPlacer, 1, 4),
                    new ItemStack(ConfigBlocks.blockCustomPlant, 1, 1), new ItemStack(ConfigItems.itemShard, 1, 3) }));

        ConfigResearch.recipes.put(
            "RAU8_2",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 8) },
                6,
                new AspectList().add(Aspect.LIFE, 320)
                    .add(Aspect.MAGIC, 64)
                    .add(Aspect.MAN, 80)
                    .add(Aspect.EXCHANGE, 40)
                    .add(Aspect.SOUL, 40),
                new ItemStack(ItemHandler.itemRunicLegs),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 2), new ItemStack(ConfigBlocks.blockCustomPlant, 1, 1),
                    new ItemStack(ConfigItems.itemGolemPlacer, 1, 4),
                    new ItemStack(ConfigBlocks.blockCustomPlant, 1, 1), new ItemStack(ConfigItems.itemShard, 1, 3) }));

        ConfigResearch.recipes.put(
            "RAU8_3",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 8) },
                6,
                new AspectList().add(Aspect.LIFE, 320)
                    .add(Aspect.MAGIC, 64)
                    .add(Aspect.MAN, 80)
                    .add(Aspect.EXCHANGE, 40)
                    .add(Aspect.SOUL, 40),
                new ItemStack(ItemHandler.itemRunicBoots),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 2), new ItemStack(ConfigBlocks.blockCustomPlant, 1, 1),
                    new ItemStack(ConfigItems.itemGolemPlacer, 1, 4),
                    new ItemStack(ConfigBlocks.blockCustomPlant, 1, 1), new ItemStack(ConfigItems.itemShard, 1, 3) }));

        ConfigResearch.recipes.put(
            "RGU8",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 8) },
                6,
                new AspectList().add(Aspect.LIFE, 320)
                    .add(Aspect.MAGIC, 64)
                    .add(Aspect.MAN, 80)
                    .add(Aspect.EXCHANGE, 40)
                    .add(Aspect.SOUL, 40),
                new ItemStack(ItemHandler.itemRunicGoggles),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 2), new ItemStack(ConfigBlocks.blockCustomPlant, 1, 1),
                    new ItemStack(ConfigItems.itemGolemPlacer, 1, 4),
                    new ItemStack(ConfigBlocks.blockCustomPlant, 1, 1), new ItemStack(ConfigItems.itemShard, 1, 3) }));

        ConfigResearch.recipes.put(
            "RBTU8",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 8) },
                6,
                new AspectList().add(Aspect.LIFE, 320)
                    .add(Aspect.MAGIC, 64)
                    .add(Aspect.MAN, 80)
                    .add(Aspect.EXCHANGE, 40)
                    .add(Aspect.SOUL, 40),
                new ItemStack(ItemHandler.itemRunicBootsTraveller),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 2), new ItemStack(ConfigBlocks.blockCustomPlant, 1, 1),
                    new ItemStack(ConfigItems.itemGolemPlacer, 1, 4),
                    new ItemStack(ConfigBlocks.blockCustomPlant, 1, 1), new ItemStack(ConfigItems.itemShard, 1, 3) }));

        // ------------
        ConfigResearch.recipes.put(
            "ERAU8_0",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 8) },
                6,
                new AspectList().add(Aspect.LIFE, 320)
                    .add(Aspect.MAGIC, 64)
                    .add(Aspect.MAN, 80)
                    .add(Aspect.EXCHANGE, 40)
                    .add(Aspect.SOUL, 40),
                new ItemStack(ItemHandler.itemRunicHelmetEnhanced),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 2), new ItemStack(ConfigBlocks.blockCustomPlant, 1, 1),
                    new ItemStack(ConfigItems.itemGolemPlacer, 1, 4),
                    new ItemStack(ConfigBlocks.blockCustomPlant, 1, 1), new ItemStack(ConfigItems.itemShard, 1, 3) }));

        ConfigResearch.recipes.put(
            "ERAU8_1",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 8) },
                6,
                new AspectList().add(Aspect.LIFE, 320)
                    .add(Aspect.MAGIC, 64)
                    .add(Aspect.MAN, 80)
                    .add(Aspect.EXCHANGE, 40)
                    .add(Aspect.SOUL, 40),
                new ItemStack(ItemHandler.itemRunicChestEnhanced),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 2), new ItemStack(ConfigBlocks.blockCustomPlant, 1, 1),
                    new ItemStack(ConfigItems.itemGolemPlacer, 1, 4),
                    new ItemStack(ConfigBlocks.blockCustomPlant, 1, 1), new ItemStack(ConfigItems.itemShard, 1, 3) }));

        ConfigResearch.recipes.put(
            "ERAU8_2",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 8) },
                6,
                new AspectList().add(Aspect.LIFE, 320)
                    .add(Aspect.MAGIC, 64)
                    .add(Aspect.MAN, 80)
                    .add(Aspect.EXCHANGE, 40)
                    .add(Aspect.SOUL, 40),
                new ItemStack(ItemHandler.itemRunicLegsEnhanced),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 2), new ItemStack(ConfigBlocks.blockCustomPlant, 1, 1),
                    new ItemStack(ConfigItems.itemGolemPlacer, 1, 4),
                    new ItemStack(ConfigBlocks.blockCustomPlant, 1, 1), new ItemStack(ConfigItems.itemShard, 1, 3) }));

        ConfigResearch.recipes.put(
            "ERAU8_3",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 8) },
                6,
                new AspectList().add(Aspect.LIFE, 320)
                    .add(Aspect.MAGIC, 64)
                    .add(Aspect.MAN, 80)
                    .add(Aspect.EXCHANGE, 40)
                    .add(Aspect.SOUL, 40),
                new ItemStack(ItemHandler.itemRunicBootsEnhanced),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 2), new ItemStack(ConfigBlocks.blockCustomPlant, 1, 1),
                    new ItemStack(ConfigItems.itemGolemPlacer, 1, 4),
                    new ItemStack(ConfigBlocks.blockCustomPlant, 1, 1), new ItemStack(ConfigItems.itemShard, 1, 3) }));

        // ------------
        ConfigResearch.recipes.put(
            "PRAU8_0",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 8) },
                6,
                new AspectList().add(Aspect.LIFE, 320)
                    .add(Aspect.MAGIC, 64)
                    .add(Aspect.MAN, 80)
                    .add(Aspect.EXCHANGE, 40)
                    .add(Aspect.SOUL, 40),
                new ItemStack(ItemHandler.itemRunicHelmetPrimal),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 2), new ItemStack(ConfigBlocks.blockCustomPlant, 1, 1),
                    new ItemStack(ConfigItems.itemGolemPlacer, 1, 4),
                    new ItemStack(ConfigBlocks.blockCustomPlant, 1, 1), new ItemStack(ConfigItems.itemShard, 1, 3) }));

        ConfigResearch.recipes.put(
            "PRAU8_1",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 8) },
                6,
                new AspectList().add(Aspect.LIFE, 320)
                    .add(Aspect.MAGIC, 64)
                    .add(Aspect.MAN, 80)
                    .add(Aspect.EXCHANGE, 40)
                    .add(Aspect.SOUL, 40),
                new ItemStack(ItemHandler.itemRunicChestPrimal),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 2), new ItemStack(ConfigBlocks.blockCustomPlant, 1, 1),
                    new ItemStack(ConfigItems.itemGolemPlacer, 1, 4),
                    new ItemStack(ConfigBlocks.blockCustomPlant, 1, 1), new ItemStack(ConfigItems.itemShard, 1, 3) }));

        ConfigResearch.recipes.put(
            "PRAU8_2",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 8) },
                6,
                new AspectList().add(Aspect.LIFE, 320)
                    .add(Aspect.MAGIC, 64)
                    .add(Aspect.MAN, 80)
                    .add(Aspect.EXCHANGE, 40)
                    .add(Aspect.SOUL, 40),
                new ItemStack(ItemHandler.itemRunicLegsPrimal),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 2), new ItemStack(ConfigBlocks.blockCustomPlant, 1, 1),
                    new ItemStack(ConfigItems.itemGolemPlacer, 1, 4),
                    new ItemStack(ConfigBlocks.blockCustomPlant, 1, 1), new ItemStack(ConfigItems.itemShard, 1, 3) }));

        ConfigResearch.recipes.put(
            "PRAU8_3",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 8) },
                6,
                new AspectList().add(Aspect.LIFE, 320)
                    .add(Aspect.MAGIC, 64)
                    .add(Aspect.MAN, 80)
                    .add(Aspect.EXCHANGE, 40)
                    .add(Aspect.SOUL, 40),
                new ItemStack(ItemHandler.itemRunicBootsPrimal),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemShard, 1, 2), new ItemStack(ConfigBlocks.blockCustomPlant, 1, 1),
                    new ItemStack(ConfigItems.itemGolemPlacer, 1, 4),
                    new ItemStack(ConfigBlocks.blockCustomPlant, 1, 1), new ItemStack(ConfigItems.itemShard, 1, 3) }));

        // TODO upgrade 9 (haste)
        /*
         * new Object[] { "upgrade", new NBTTagByte((byte) 9) }, 6,
         * new AspectList().add(Aspect.WEAPON, 120).add(Aspect.MAGIC, 50).add(Aspect.FIRE, 32),
         * new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6), new ItemStack(ConfigItems.itemShard, 1, 1), new
         * ItemStack(ConfigItems.itemShard, 1, 1), new ItemStack(Items.blaze_powder), new
         * ItemStack(ConfigItems.itemShard, 1, 1), new ItemStack(ConfigItems.itemShard, 1, 1) }));
         */
        ConfigResearch.recipes.put(
            "RAU9_3",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 9) },
                6,
                new AspectList().add(Aspect.TRAVEL, 24)
                    .add(Aspect.MAGIC, 16)
                    .add(Aspect.FLIGHT, 24)
                    .add(Aspect.MOTION, 32),
                new ItemStack(ItemHandler.itemRunicBoots),
                new ItemStack[] { new ItemStack(ConfigItems.itemResource, 1, 14),
                    new ItemStack(ConfigItems.itemShard, 1, 0), new ItemStack(ConfigItems.itemResource, 1, 1),
                    new ItemStack(ConfigItems.itemResource, 1, 14), new ItemStack(ConfigItems.itemResource, 1, 1),
                    new ItemStack(ConfigItems.itemShard, 1, 4) }));

        ConfigResearch.recipes.put(
            "RBTU9",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 9) },
                6,
                new AspectList().add(Aspect.TRAVEL, 24)
                    .add(Aspect.MAGIC, 16)
                    .add(Aspect.FLIGHT, 24)
                    .add(Aspect.MOTION, 32),
                new ItemStack(ItemHandler.itemRunicBootsTraveller),
                new ItemStack[] { new ItemStack(ConfigItems.itemResource, 1, 14),
                    new ItemStack(ConfigItems.itemShard, 1, 0), new ItemStack(ConfigItems.itemResource, 1, 1),
                    new ItemStack(ConfigItems.itemResource, 1, 14), new ItemStack(ConfigItems.itemResource, 1, 1),
                    new ItemStack(ConfigItems.itemShard, 1, 4) }));

        ConfigResearch.recipes.put(
            "ERAU9_3",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 9) },
                6,
                new AspectList().add(Aspect.TRAVEL, 24)
                    .add(Aspect.MAGIC, 16)
                    .add(Aspect.FLIGHT, 24)
                    .add(Aspect.MOTION, 32),
                new ItemStack(ItemHandler.itemRunicBootsEnhanced),
                new ItemStack[] { new ItemStack(ConfigItems.itemResource, 1, 14),
                    new ItemStack(ConfigItems.itemShard, 1, 0), new ItemStack(ConfigItems.itemResource, 1, 1),
                    new ItemStack(ConfigItems.itemResource, 1, 14), new ItemStack(ConfigItems.itemResource, 1, 1),
                    new ItemStack(ConfigItems.itemShard, 1, 4) }));

        ConfigResearch.recipes.put(
            "PRAU9_3",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 9) },
                6,
                new AspectList().add(Aspect.TRAVEL, 24)
                    .add(Aspect.MAGIC, 16)
                    .add(Aspect.FLIGHT, 24)
                    .add(Aspect.MOTION, 32),
                new ItemStack(ItemHandler.itemRunicBootsPrimal),
                new ItemStack[] { new ItemStack(ConfigItems.itemResource, 1, 14),
                    new ItemStack(ConfigItems.itemShard, 1, 0), new ItemStack(ConfigItems.itemResource, 1, 1),
                    new ItemStack(ConfigItems.itemResource, 1, 14), new ItemStack(ConfigItems.itemResource, 1, 1),
                    new ItemStack(ConfigItems.itemShard, 1, 4) }));

        // TODO upgrade 10 (ravager)
        /*
         * new Object[] { "upgrade", new NBTTagByte((byte) 10) }, 6,
         * new AspectList().add(Aspect.WEAPON, 200).add(Aspect.MAGIC, 64).add(Aspect.ENERGY, 96),
         * new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6), new ItemStack(ConfigItems.itemResource, 1, 0),
         * new ItemStack(ConfigItems.itemShard, 1, 1), new ItemStack(ConfigItems.itemSwordThaumium), new
         * ItemStack(ConfigItems.itemShard, 1, 4), new ItemStack(ConfigItems.itemResource, 1, 0) }));
         */
        ConfigResearch.recipes.put(
            "RAU10_0",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 10) },
                6,
                new AspectList().add(Aspect.WEAPON, 200)
                    .add(Aspect.MAGIC, 64)
                    .add(Aspect.ENERGY, 96),
                new ItemStack(ItemHandler.itemRunicHelmet),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemResource, 1, 0), new ItemStack(ConfigItems.itemShard, 1, 1),
                    new ItemStack(ConfigItems.itemSwordThaumium), new ItemStack(ConfigItems.itemShard, 1, 4),
                    new ItemStack(ConfigItems.itemResource, 1, 0) }));

        ConfigResearch.recipes.put(
            "RAU10_1",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 10) },
                6,
                new AspectList().add(Aspect.WEAPON, 200)
                    .add(Aspect.MAGIC, 64)
                    .add(Aspect.ENERGY, 96),
                new ItemStack(ItemHandler.itemRunicChest),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemResource, 1, 0), new ItemStack(ConfigItems.itemShard, 1, 1),
                    new ItemStack(ConfigItems.itemSwordThaumium), new ItemStack(ConfigItems.itemShard, 1, 4),
                    new ItemStack(ConfigItems.itemResource, 1, 0) }));

        ConfigResearch.recipes.put(
            "RAU10_2",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 10) },
                6,
                new AspectList().add(Aspect.WEAPON, 200)
                    .add(Aspect.MAGIC, 64)
                    .add(Aspect.ENERGY, 96),
                new ItemStack(ItemHandler.itemRunicLegs),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemResource, 1, 0), new ItemStack(ConfigItems.itemShard, 1, 1),
                    new ItemStack(ConfigItems.itemSwordThaumium), new ItemStack(ConfigItems.itemShard, 1, 4),
                    new ItemStack(ConfigItems.itemResource, 1, 0) }));

        ConfigResearch.recipes.put(
            "RAU10_3",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 10) },
                6,
                new AspectList().add(Aspect.WEAPON, 200)
                    .add(Aspect.MAGIC, 64)
                    .add(Aspect.ENERGY, 96),
                new ItemStack(ItemHandler.itemRunicBoots),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemResource, 1, 0), new ItemStack(ConfigItems.itemShard, 1, 1),
                    new ItemStack(ConfigItems.itemSwordThaumium), new ItemStack(ConfigItems.itemShard, 1, 4),
                    new ItemStack(ConfigItems.itemResource, 1, 0) }));

        ConfigResearch.recipes.put(
            "RGU10",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 10) },
                6,
                new AspectList().add(Aspect.WEAPON, 200)
                    .add(Aspect.MAGIC, 64)
                    .add(Aspect.ENERGY, 96),
                new ItemStack(ItemHandler.itemRunicGoggles),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemResource, 1, 0), new ItemStack(ConfigItems.itemShard, 1, 1),
                    new ItemStack(ConfigItems.itemSwordThaumium), new ItemStack(ConfigItems.itemShard, 1, 4),
                    new ItemStack(ConfigItems.itemResource, 1, 0) }));

        ConfigResearch.recipes.put(
            "RBTU10",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 10) },
                6,
                new AspectList().add(Aspect.WEAPON, 200)
                    .add(Aspect.MAGIC, 64)
                    .add(Aspect.ENERGY, 96),
                new ItemStack(ItemHandler.itemRunicBootsTraveller),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemResource, 1, 0), new ItemStack(ConfigItems.itemShard, 1, 1),
                    new ItemStack(ConfigItems.itemSwordThaumium), new ItemStack(ConfigItems.itemShard, 1, 4),
                    new ItemStack(ConfigItems.itemResource, 1, 0) }));

        // ------------
        ConfigResearch.recipes.put(
            "ERAU10_0",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 10) },
                6,
                new AspectList().add(Aspect.WEAPON, 200)
                    .add(Aspect.MAGIC, 64)
                    .add(Aspect.ENERGY, 96),
                new ItemStack(ItemHandler.itemRunicHelmetEnhanced),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemResource, 1, 0), new ItemStack(ConfigItems.itemShard, 1, 1),
                    new ItemStack(ConfigItems.itemSwordThaumium), new ItemStack(ConfigItems.itemShard, 1, 4),
                    new ItemStack(ConfigItems.itemResource, 1, 0) }));

        ConfigResearch.recipes.put(
            "ERAU10_1",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 10) },
                6,
                new AspectList().add(Aspect.WEAPON, 200)
                    .add(Aspect.MAGIC, 64)
                    .add(Aspect.ENERGY, 96),
                new ItemStack(ItemHandler.itemRunicChestEnhanced),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemResource, 1, 0), new ItemStack(ConfigItems.itemShard, 1, 1),
                    new ItemStack(ConfigItems.itemSwordThaumium), new ItemStack(ConfigItems.itemShard, 1, 4),
                    new ItemStack(ConfigItems.itemResource, 1, 0) }));

        ConfigResearch.recipes.put(
            "ERAU10_2",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 10) },
                6,
                new AspectList().add(Aspect.WEAPON, 200)
                    .add(Aspect.MAGIC, 64)
                    .add(Aspect.ENERGY, 96),
                new ItemStack(ItemHandler.itemRunicLegsEnhanced),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemResource, 1, 0), new ItemStack(ConfigItems.itemShard, 1, 1),
                    new ItemStack(ConfigItems.itemSwordThaumium), new ItemStack(ConfigItems.itemShard, 1, 4),
                    new ItemStack(ConfigItems.itemResource, 1, 0) }));

        ConfigResearch.recipes.put(
            "ERAU10_3",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 10) },
                6,
                new AspectList().add(Aspect.WEAPON, 200)
                    .add(Aspect.MAGIC, 64)
                    .add(Aspect.ENERGY, 96),
                new ItemStack(ItemHandler.itemRunicBootsEnhanced),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemResource, 1, 0), new ItemStack(ConfigItems.itemShard, 1, 1),
                    new ItemStack(ConfigItems.itemSwordThaumium), new ItemStack(ConfigItems.itemShard, 1, 4),
                    new ItemStack(ConfigItems.itemResource, 1, 0) }));

        // ------------
        ConfigResearch.recipes.put(
            "PRAU10_0",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 10) },
                6,
                new AspectList().add(Aspect.WEAPON, 200)
                    .add(Aspect.MAGIC, 64)
                    .add(Aspect.ENERGY, 96),
                new ItemStack(ItemHandler.itemRunicHelmetPrimal),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemResource, 1, 0), new ItemStack(ConfigItems.itemShard, 1, 1),
                    new ItemStack(ConfigItems.itemSwordThaumium), new ItemStack(ConfigItems.itemShard, 1, 4),
                    new ItemStack(ConfigItems.itemResource, 1, 0) }));

        ConfigResearch.recipes.put(
            "PRAU10_1",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 10) },
                6,
                new AspectList().add(Aspect.WEAPON, 200)
                    .add(Aspect.MAGIC, 64)
                    .add(Aspect.ENERGY, 96),
                new ItemStack(ItemHandler.itemRunicChestPrimal),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemResource, 1, 0), new ItemStack(ConfigItems.itemShard, 1, 1),
                    new ItemStack(ConfigItems.itemSwordThaumium), new ItemStack(ConfigItems.itemShard, 1, 4),
                    new ItemStack(ConfigItems.itemResource, 1, 0) }));

        ConfigResearch.recipes.put(
            "PRAU10_2",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 10) },
                6,
                new AspectList().add(Aspect.WEAPON, 200)
                    .add(Aspect.MAGIC, 64)
                    .add(Aspect.ENERGY, 96),
                new ItemStack(ItemHandler.itemRunicLegsPrimal),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemResource, 1, 0), new ItemStack(ConfigItems.itemShard, 1, 1),
                    new ItemStack(ConfigItems.itemSwordThaumium), new ItemStack(ConfigItems.itemShard, 1, 4),
                    new ItemStack(ConfigItems.itemResource, 1, 0) }));

        ConfigResearch.recipes.put(
            "PRAU10_3",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "TD.RUNICARMORUPGRADES",
                new Object[] { "upgrade", new NBTTagByte((byte) 10) },
                6,
                new AspectList().add(Aspect.WEAPON, 200)
                    .add(Aspect.MAGIC, 64)
                    .add(Aspect.ENERGY, 96),
                new ItemStack(ItemHandler.itemRunicBootsPrimal),
                new ItemStack[] { new ItemStack(ConfigItems.itemShard, 1, 6),
                    new ItemStack(ConfigItems.itemResource, 1, 0), new ItemStack(ConfigItems.itemShard, 1, 1),
                    new ItemStack(ConfigItems.itemSwordThaumium), new ItemStack(ConfigItems.itemShard, 1, 4),
                    new ItemStack(ConfigItems.itemResource, 1, 0) }));

    }

}
