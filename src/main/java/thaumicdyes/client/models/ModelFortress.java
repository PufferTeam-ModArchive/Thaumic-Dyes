package thaumicdyes.client.models;

import java.util.HashMap;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

import org.lwjgl.opengl.GL11;

import thaumicdyes.common.items.ThaumiumFortressDyed;

public class ModelFortress extends ModelBiped {

    ModelRenderer OrnamentL;
    ModelRenderer OrnamentL2;
    ModelRenderer OrnamentR;
    ModelRenderer OrnamentR2;
    ModelRenderer Helmet;
    ModelRenderer HelmetR;
    ModelRenderer HelmetL;
    ModelRenderer HelmetB;
    ModelRenderer capsthingy;
    ModelRenderer flapR;
    ModelRenderer flapL;
    ModelRenderer Gemornament;
    ModelRenderer Gem;
    ModelRenderer[] Mask;
    ModelRenderer Goggles;
    ModelRenderer BeltR;
    ModelRenderer Mbelt;
    ModelRenderer MbeltL;
    ModelRenderer MbeltR;
    ModelRenderer BeltL;
    ModelRenderer Chestplate;
    ModelRenderer Scroll;
    ModelRenderer Backplate;
    ModelRenderer Book;
    ModelRenderer ShoulderR;
    ModelRenderer GauntletR;
    ModelRenderer GauntletstrapR1;
    ModelRenderer GauntletstrapR2;
    ModelRenderer ShoulderplateRtop;
    ModelRenderer ShoulderplateR1;
    ModelRenderer ShoulderplateR2;
    ModelRenderer ShoulderplateR3;
    ModelRenderer ShoulderL;
    ModelRenderer GauntletL;
    ModelRenderer Gauntletstrapl1;
    ModelRenderer GauntletstrapL2;
    ModelRenderer ShoulderplateLtop;
    ModelRenderer ShoulderplateL1;
    ModelRenderer ShoulderplateL2;
    ModelRenderer ShoulderplateL3;
    ModelRenderer LegpanelR1;
    ModelRenderer LegpanelR2;
    ModelRenderer LegpanelR3;
    ModelRenderer LegpanelR4;
    ModelRenderer LegpanelR5;
    ModelRenderer LegpanelR6;
    ModelRenderer SidepanelR1;
    ModelRenderer SidepanelR2;
    ModelRenderer SidepanelR3;
    ModelRenderer BackpanelR1;
    ModelRenderer BackpanelR2;
    ModelRenderer BackpanelR3;
    ModelRenderer BackpanelL3;
    ModelRenderer LegpanelL1;
    ModelRenderer LegpanelL2;
    ModelRenderer LegpanelL3;
    ModelRenderer LegpanelL4;
    ModelRenderer LegpanelL5;
    ModelRenderer LegpanelL6;
    ModelRenderer SidepanelL1;
    ModelRenderer SidepanelL2;
    ModelRenderer SidepanelL3;
    ModelRenderer BackpanelL1;
    ModelRenderer BackpanelL2;
    private static HashMap hasSet = new HashMap();
    private static HashMap hasMask = new HashMap();
    private static HashMap hasGoggles = new HashMap();

    public ModelFortress(float f) {
        super(f, 0.0F, 128, 64);
        super.textureWidth = 128;
        super.textureHeight = 64;
        this.Mask = new ModelRenderer[3];

        for (int a = 0; a < 3; ++a) {
            this.Mask[a] = new ModelRenderer(this, 52 + a * 24, 2);
            this.Mask[a].addBox(-4.5F, -5.0F, -4.6F, 9, 5, 1);
            this.Mask[a].setRotationPoint(0.0F, 0.0F, 0.0F);
            this.Mask[a].setTextureSize(128, 64);
            this.setRotation(this.Mask[a], 0.0F, 0.0F, 0.0F);
        }

        this.Goggles = new ModelRenderer(this, 100, 18);
        this.Goggles.addBox(-4.5F, -5.0F, -4.25F, 9, 5, 1);
        this.Goggles.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Goggles.setTextureSize(128, 64);
        this.setRotation(this.Goggles, 0.0F, 0.0F, 0.0F);
        this.OrnamentL = new ModelRenderer(this, 78, 8);
        this.OrnamentL.mirror = true;
        this.OrnamentL.addBox(1.5F, -9.0F, -6.5F, 2, 2, 1);
        this.OrnamentL.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.OrnamentL.setTextureSize(128, 64);
        this.setRotation(this.OrnamentL, -0.1396263F, 0.0F, 0.0F);
        this.OrnamentL2 = new ModelRenderer(this, 78, 8);
        this.OrnamentL2.mirror = true;
        this.OrnamentL2.addBox(3.5F, -10.0F, -6.5F, 1, 2, 1);
        this.OrnamentL2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.OrnamentL2.setTextureSize(128, 64);
        this.setRotation(this.OrnamentL2, -0.1396263F, 0.0F, 0.0F);
        this.OrnamentR = new ModelRenderer(this, 78, 8);
        this.OrnamentR.addBox(-3.5F, -9.0F, -6.5F, 2, 2, 1);
        this.OrnamentR.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.OrnamentR.setTextureSize(128, 64);
        this.setRotation(this.OrnamentR, -0.1396263F, 0.0F, 0.0F);
        this.OrnamentR2 = new ModelRenderer(this, 78, 8);
        this.OrnamentR2.addBox(-4.5F, -10.0F, -6.5F, 1, 2, 1);
        this.OrnamentR2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.OrnamentR2.setTextureSize(128, 64);
        this.setRotation(this.OrnamentR2, -0.1396263F, 0.0F, 0.0F);
        this.Helmet = new ModelRenderer(this, 41, 8);
        this.Helmet.addBox(-4.5F, -9.0F, -4.5F, 9, 4, 9);
        this.Helmet.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Helmet.setTextureSize(128, 64);
        this.setRotation(this.Helmet, 0.0F, 0.0F, 0.0F);
        this.HelmetR = new ModelRenderer(this, 21, 13);
        this.HelmetR.addBox(-6.5F, -3.0F, -4.5F, 1, 5, 9);
        this.HelmetR.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HelmetR.setTextureSize(128, 64);
        this.setRotation(this.HelmetR, 0.0F, 0.0F, 0.5235988F);
        this.HelmetL = new ModelRenderer(this, 21, 13);
        this.HelmetL.mirror = true;
        this.HelmetL.addBox(5.5F, -3.0F, -4.5F, 1, 5, 9);
        this.HelmetL.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HelmetL.setTextureSize(128, 64);
        this.setRotation(this.HelmetL, 0.0F, 0.0F, -0.5235988F);
        this.HelmetB = new ModelRenderer(this, 41, 21);
        this.HelmetB.addBox(-4.5F, -3.0F, 5.5F, 9, 5, 1);
        this.HelmetB.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HelmetB.setTextureSize(128, 64);
        this.setRotation(this.HelmetB, 0.5235988F, 0.0F, 0.0F);
        this.capsthingy = new ModelRenderer(this, 21, 0);
        this.capsthingy.addBox(-4.5F, -6.0F, -6.5F, 9, 1, 2);
        this.capsthingy.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.capsthingy.setTextureSize(128, 64);
        this.setRotation(this.capsthingy, 0.0F, 0.0F, 0.0F);
        this.flapR = new ModelRenderer(this, 59, 10);
        this.flapR.addBox(-10.0F, -2.0F, -1.0F, 3, 3, 1);
        this.flapR.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.flapR.setTextureSize(128, 64);
        this.setRotation(this.flapR, 0.0F, -0.5235988F, 0.5235988F);
        this.flapL = new ModelRenderer(this, 59, 10);
        this.flapL.mirror = true;
        this.flapL.addBox(7.0F, -2.0F, -1.0F, 3, 3, 1);
        this.flapL.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.flapL.setTextureSize(128, 64);
        this.setRotation(this.flapL, 0.0F, 0.5235988F, -0.5235988F);
        this.Gemornament = new ModelRenderer(this, 68, 11);
        this.Gemornament.addBox(-1.5F, -9.0F, -7.0F, 3, 3, 2);
        this.Gemornament.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Gemornament.setTextureSize(128, 64);
        this.setRotation(this.Gemornament, -0.1396263F, 0.0F, 0.0F);
        this.Gem = new ModelRenderer(this, 72, 8);
        this.Gem.addBox(-1.0F, -8.5F, -7.5F, 2, 2, 1);
        this.Gem.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Gem.setTextureSize(128, 64);
        this.setRotation(this.Gem, -0.1396263F, 0.0F, 0.0F);
        this.BeltR = new ModelRenderer(this, 76, 44);
        this.BeltR.addBox(-5.0F, 4.0F, -3.0F, 1, 3, 6);
        this.BeltR.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BeltR.setTextureSize(128, 64);
        this.setRotation(this.BeltR, 0.0F, 0.0F, 0.0F);
        this.Mbelt = new ModelRenderer(this, 56, 55);
        this.Mbelt.addBox(-4.0F, 8.0F, -3.0F, 8, 4, 1);
        this.Mbelt.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Mbelt.setTextureSize(128, 64);
        this.setRotation(this.Mbelt, 0.0F, 0.0F, 0.0F);
        this.MbeltL = new ModelRenderer(this, 76, 44);
        this.MbeltL.addBox(4.0F, 8.0F, -3.0F, 1, 3, 6);
        this.MbeltL.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.MbeltL.setTextureSize(128, 64);
        this.setRotation(this.MbeltL, 0.0F, 0.0F, 0.0F);
        this.MbeltR = new ModelRenderer(this, 76, 44);
        this.MbeltR.addBox(-5.0F, 8.0F, -3.0F, 1, 3, 6);
        this.MbeltR.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.MbeltR.setTextureSize(128, 64);
        this.setRotation(this.MbeltR, 0.0F, 0.0F, 0.0F);
        this.BeltL = new ModelRenderer(this, 76, 44);
        this.BeltL.addBox(4.0F, 4.0F, -3.0F, 1, 3, 6);
        this.BeltL.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BeltL.setTextureSize(128, 64);
        this.setRotation(this.BeltL, 0.0F, 0.0F, 0.0F);
        this.Chestplate = new ModelRenderer(this, 56, 45);
        this.Chestplate.addBox(-4.0F, 1.0F, -4.0F, 8, 7, 2);
        this.Chestplate.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Chestplate.setTextureSize(128, 64);
        this.setRotation(this.Chestplate, 0.0F, 0.0F, 0.0F);
        this.Scroll = new ModelRenderer(this, 34, 27);
        this.Scroll.addBox(-2.0F, 9.5F, 4.0F, 8, 3, 3);
        this.Scroll.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Scroll.setTextureSize(128, 64);
        this.setRotation(this.Scroll, 0.0F, 0.0F, 0.191986F);
        this.Backplate = new ModelRenderer(this, 36, 45);
        this.Backplate.addBox(-4.0F, 1.0F, 2.0F, 8, 11, 2);
        this.Backplate.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Backplate.setTextureSize(128, 64);
        this.setRotation(this.Backplate, 0.0F, 0.0F, 0.0F);
        this.Book = new ModelRenderer(this, 100, 8);
        this.Book.addBox(1.0F, -0.3F, 4.0F, 5, 7, 2);
        this.Book.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Book.setTextureSize(128, 64);
        this.setRotation(this.Book, 0.0F, 0.0F, 0.7679449F);
        this.ShoulderR = new ModelRenderer(this, 56, 35);
        this.ShoulderR.addBox(-3.5F, -2.5F, -2.5F, 5, 5, 5);
        this.ShoulderR.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ShoulderR.setTextureSize(128, 64);
        this.setRotation(this.ShoulderR, 0.0F, 0.0F, 0.0F);
        this.GauntletR = new ModelRenderer(this, 100, 26);
        this.GauntletR.addBox(-3.5F, 3.5F, -2.5F, 2, 6, 5);
        this.GauntletR.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.GauntletR.setTextureSize(128, 64);
        this.setRotation(this.GauntletR, 0.0F, 0.0F, 0.0F);
        this.GauntletstrapR1 = new ModelRenderer(this, 84, 31);
        this.GauntletstrapR1.addBox(-1.5F, 3.5F, -2.5F, 3, 1, 5);
        this.GauntletstrapR1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.GauntletstrapR1.setTextureSize(128, 64);
        this.setRotation(this.GauntletstrapR1, 0.0F, 0.0F, 0.0F);
        this.GauntletstrapR2 = new ModelRenderer(this, 84, 31);
        this.GauntletstrapR2.addBox(-1.5F, 6.5F, -2.5F, 3, 1, 5);
        this.GauntletstrapR2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.GauntletstrapR2.setTextureSize(128, 64);
        this.setRotation(this.GauntletstrapR2, 0.0F, 0.0F, 0.0F);
        this.ShoulderplateRtop = new ModelRenderer(this, 110, 37);
        this.ShoulderplateRtop.addBox(-5.5F, -2.5F, -3.5F, 2, 1, 7);
        this.ShoulderplateRtop.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ShoulderplateRtop.setTextureSize(128, 64);
        this.setRotation(this.ShoulderplateRtop, 0.0F, 0.0F, 0.4363323F);
        this.ShoulderplateR1 = new ModelRenderer(this, 110, 45);
        this.ShoulderplateR1.addBox(-4.5F, -1.5F, -3.5F, 1, 4, 7);
        this.ShoulderplateR1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ShoulderplateR1.setTextureSize(128, 64);
        this.setRotation(this.ShoulderplateR1, 0.0F, 0.0F, 0.4363323F);
        this.ShoulderplateR2 = new ModelRenderer(this, 94, 45);
        this.ShoulderplateR2.addBox(-3.5F, 1.5F, -3.5F, 1, 3, 7);
        this.ShoulderplateR2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ShoulderplateR2.setTextureSize(128, 64);
        this.setRotation(this.ShoulderplateR2, 0.0F, 0.0F, 0.4363323F);
        this.ShoulderplateR3 = new ModelRenderer(this, 94, 45);
        this.ShoulderplateR3.addBox(-2.5F, 3.5F, -3.5F, 1, 3, 7);
        this.ShoulderplateR3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ShoulderplateR3.setTextureSize(128, 64);
        this.setRotation(this.ShoulderplateR3, 0.0F, 0.0F, 0.4363323F);
        this.ShoulderL = new ModelRenderer(this, 56, 35);
        this.ShoulderL.mirror = true;
        this.ShoulderL.addBox(-1.5F, -2.5F, -2.5F, 5, 5, 5);
        this.ShoulderL.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ShoulderL.setTextureSize(128, 64);
        this.setRotation(this.ShoulderL, 0.0F, 0.0F, 0.0F);
        this.GauntletL = new ModelRenderer(this, 114, 26);
        this.GauntletL.addBox(1.5F, 3.5F, -2.5F, 2, 6, 5);
        this.GauntletL.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.GauntletL.setTextureSize(128, 64);
        this.setRotation(this.GauntletL, 0.0F, 0.0F, 0.0F);
        this.Gauntletstrapl1 = new ModelRenderer(this, 84, 31);
        this.Gauntletstrapl1.mirror = true;
        this.Gauntletstrapl1.addBox(-1.5F, 3.5F, -2.5F, 3, 1, 5);
        this.Gauntletstrapl1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Gauntletstrapl1.setTextureSize(128, 64);
        this.setRotation(this.Gauntletstrapl1, 0.0F, 0.0F, 0.0F);
        this.GauntletstrapL2 = new ModelRenderer(this, 84, 31);
        this.GauntletstrapL2.mirror = true;
        this.GauntletstrapL2.addBox(-1.5F, 6.5F, -2.5F, 3, 1, 5);
        this.GauntletstrapL2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.GauntletstrapL2.setTextureSize(128, 64);
        this.setRotation(this.GauntletstrapL2, 0.0F, 0.0F, 0.0F);
        this.ShoulderplateLtop = new ModelRenderer(this, 110, 37);
        this.ShoulderplateLtop.mirror = true;
        this.ShoulderplateLtop.addBox(3.5F, -2.5F, -3.5F, 2, 1, 7);
        this.ShoulderplateLtop.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ShoulderplateLtop.setTextureSize(128, 64);
        this.setRotation(this.ShoulderplateLtop, 0.0F, 0.0F, -0.4363323F);
        this.ShoulderplateL1 = new ModelRenderer(this, 110, 45);
        this.ShoulderplateL1.mirror = true;
        this.ShoulderplateL1.addBox(3.5F, -1.5F, -3.5F, 1, 4, 7);
        this.ShoulderplateL1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ShoulderplateL1.setTextureSize(128, 64);
        this.setRotation(this.ShoulderplateL1, 0.0F, 0.0F, -0.4363323F);
        this.ShoulderplateL2 = new ModelRenderer(this, 94, 45);
        this.ShoulderplateL2.mirror = true;
        this.ShoulderplateL2.addBox(2.5F, 1.5F, -3.5F, 1, 3, 7);
        this.ShoulderplateL2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ShoulderplateL2.setTextureSize(128, 64);
        this.setRotation(this.ShoulderplateL2, 0.0F, 0.0F, -0.4363323F);
        this.ShoulderplateL3 = new ModelRenderer(this, 94, 45);
        this.ShoulderplateL3.mirror = true;
        this.ShoulderplateL3.addBox(1.5F, 3.5F, -3.5F, 1, 3, 7);
        this.ShoulderplateL3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ShoulderplateL3.setTextureSize(128, 64);
        this.setRotation(this.ShoulderplateL3, 0.0F, 0.0F, -0.4363323F);
        this.LegpanelR1 = new ModelRenderer(this, 0, 51);
        this.LegpanelR1.addBox(-1.0F, 0.5F, -3.5F, 3, 4, 1);
        this.LegpanelR1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LegpanelR1.setTextureSize(128, 64);
        this.setRotation(this.LegpanelR1, -0.4363323F, 0.0F, 0.0F);
        this.LegpanelR2 = new ModelRenderer(this, 8, 51);
        this.LegpanelR2.addBox(-1.0F, 3.5F, -2.5F, 3, 4, 1);
        this.LegpanelR2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LegpanelR2.setTextureSize(128, 64);
        this.setRotation(this.LegpanelR2, -0.4363323F, 0.0F, 0.0F);
        this.LegpanelR3 = new ModelRenderer(this, 0, 56);
        this.LegpanelR3.addBox(-1.0F, 6.5F, -1.5F, 3, 3, 1);
        this.LegpanelR3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LegpanelR3.setTextureSize(128, 64);
        this.setRotation(this.LegpanelR3, -0.4363323F, 0.0F, 0.0F);
        this.LegpanelR4 = new ModelRenderer(this, 0, 43);
        this.LegpanelR4.addBox(-3.0F, 0.5F, -3.5F, 2, 3, 1);
        this.LegpanelR4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LegpanelR4.setTextureSize(128, 64);
        this.setRotation(this.LegpanelR4, -0.4363323F, 0.0F, 0.0F);
        this.LegpanelR5 = new ModelRenderer(this, 0, 47);
        this.LegpanelR5.addBox(-3.0F, 2.5F, -2.5F, 2, 3, 1);
        this.LegpanelR5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LegpanelR5.setTextureSize(128, 64);
        this.setRotation(this.LegpanelR5, -0.4363323F, 0.0F, 0.0F);
        this.LegpanelR6 = new ModelRenderer(this, 6, 43);
        this.LegpanelR6.addBox(-3.0F, 4.5F, -1.5F, 2, 3, 1);
        this.LegpanelR6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LegpanelR6.setTextureSize(128, 64);
        this.setRotation(this.LegpanelR6, -0.4363323F, 0.0F, 0.0F);
        this.SidepanelR1 = new ModelRenderer(this, 0, 22);
        this.SidepanelR1.addBox(-2.5F, 0.5F, -2.5F, 1, 4, 5);
        this.SidepanelR1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.SidepanelR1.setTextureSize(128, 64);
        this.setRotation(this.SidepanelR1, 0.0F, 0.0F, 0.4363323F);
        this.SidepanelR2 = new ModelRenderer(this, 0, 31);
        this.SidepanelR2.addBox(-1.5F, 3.5F, -2.5F, 1, 3, 5);
        this.SidepanelR2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.SidepanelR2.setTextureSize(128, 64);
        this.setRotation(this.SidepanelR2, 0.0F, 0.0F, 0.4363323F);
        this.SidepanelR3 = new ModelRenderer(this, 12, 31);
        this.SidepanelR3.addBox(-0.5F, 5.5F, -2.5F, 1, 3, 5);
        this.SidepanelR3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.SidepanelR3.setTextureSize(128, 64);
        this.setRotation(this.SidepanelR3, 0.0F, 0.0F, 0.4363323F);
        this.BackpanelR1 = new ModelRenderer(this, 0, 18);
        this.BackpanelR1.addBox(-3.0F, 0.5F, 2.5F, 5, 3, 1);
        this.BackpanelR1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BackpanelR1.setTextureSize(128, 64);
        this.setRotation(this.BackpanelR1, 0.4363323F, 0.0F, 0.0F);
        this.BackpanelR2 = new ModelRenderer(this, 0, 18);
        this.BackpanelR2.addBox(-3.0F, 2.5F, 1.5F, 5, 3, 1);
        this.BackpanelR2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BackpanelR2.setTextureSize(128, 64);
        this.setRotation(this.BackpanelR2, 0.4363323F, 0.0F, 0.0F);
        this.BackpanelR3 = new ModelRenderer(this, 0, 18);
        this.BackpanelR3.addBox(-3.0F, 4.5F, 0.5F, 5, 3, 1);
        this.BackpanelR3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BackpanelR3.setTextureSize(128, 64);
        this.setRotation(this.BackpanelR3, 0.4363323F, 0.0F, 0.0F);
        this.BackpanelL3 = new ModelRenderer(this, 0, 18);
        this.BackpanelL3.mirror = true;
        this.BackpanelL3.addBox(-2.0F, 4.5F, 0.5F, 5, 3, 1);
        this.BackpanelL3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BackpanelL3.setTextureSize(128, 64);
        this.setRotation(this.BackpanelL3, 0.4363323F, 0.0F, 0.0F);
        this.LegpanelL1 = new ModelRenderer(this, 0, 51);
        this.LegpanelL1.mirror = true;
        this.LegpanelL1.addBox(-2.0F, 0.5F, -3.5F, 3, 4, 1);
        this.LegpanelL1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LegpanelL1.setTextureSize(128, 64);
        this.setRotation(this.LegpanelL1, -0.4363323F, 0.0F, 0.0F);
        this.LegpanelL2 = new ModelRenderer(this, 8, 51);
        this.LegpanelL2.mirror = true;
        this.LegpanelL2.addBox(-2.0F, 3.5F, -2.5F, 3, 4, 1);
        this.LegpanelL2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LegpanelL2.setTextureSize(128, 64);
        this.setRotation(this.LegpanelL2, -0.4363323F, 0.0F, 0.0F);
        this.LegpanelL3 = new ModelRenderer(this, 0, 56);
        this.LegpanelL3.mirror = true;
        this.LegpanelL3.addBox(-2.0F, 6.5F, -1.5F, 3, 3, 1);
        this.LegpanelL3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LegpanelL3.setTextureSize(128, 64);
        this.setRotation(this.LegpanelL3, -0.4363323F, 0.0F, 0.0F);
        this.LegpanelL4 = new ModelRenderer(this, 0, 43);
        this.LegpanelL4.mirror = true;
        this.LegpanelL4.addBox(1.0F, 0.5F, -3.5F, 2, 3, 1);
        this.LegpanelL4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LegpanelL4.setTextureSize(128, 64);
        this.setRotation(this.LegpanelL4, -0.4363323F, 0.0F, 0.0F);
        this.LegpanelL5 = new ModelRenderer(this, 0, 47);
        this.LegpanelL5.mirror = true;
        this.LegpanelL5.addBox(1.0F, 2.5F, -2.5F, 2, 3, 1);
        this.LegpanelL5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LegpanelL5.setTextureSize(128, 64);
        this.setRotation(this.LegpanelL5, -0.4363323F, 0.0F, 0.0F);
        this.LegpanelL6 = new ModelRenderer(this, 6, 43);
        this.LegpanelL6.mirror = true;
        this.LegpanelL6.addBox(1.0F, 4.5F, -1.5F, 2, 3, 1);
        this.LegpanelL6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LegpanelL6.setTextureSize(128, 64);
        this.setRotation(this.LegpanelL6, -0.4363323F, 0.0F, 0.0F);
        this.SidepanelL1 = new ModelRenderer(this, 0, 22);
        this.SidepanelL1.mirror = true;
        this.SidepanelL1.addBox(1.5F, 0.5F, -2.5F, 1, 4, 5);
        this.SidepanelL1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.SidepanelL1.setTextureSize(128, 64);
        this.setRotation(this.SidepanelL1, 0.0F, 0.0F, -0.4363323F);
        this.SidepanelL2 = new ModelRenderer(this, 0, 31);
        this.SidepanelL2.mirror = true;
        this.SidepanelL2.addBox(0.5F, 3.5F, -2.5F, 1, 3, 5);
        this.SidepanelL2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.SidepanelL2.setTextureSize(128, 64);
        this.setRotation(this.SidepanelL2, 0.0F, 0.0F, -0.4363323F);
        this.SidepanelL3 = new ModelRenderer(this, 12, 31);
        this.SidepanelL3.mirror = true;
        this.SidepanelL3.addBox(-0.5F, 5.5F, -2.5F, 1, 3, 5);
        this.SidepanelL3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.SidepanelL3.setTextureSize(128, 64);
        this.setRotation(this.SidepanelL3, 0.0F, 0.0F, -0.4363323F);
        this.BackpanelL1 = new ModelRenderer(this, 0, 18);
        this.BackpanelL1.mirror = true;
        this.BackpanelL1.addBox(-2.0F, 0.5F, 2.5F, 5, 3, 1);
        this.BackpanelL1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BackpanelL1.setTextureSize(128, 64);
        this.setRotation(this.BackpanelL1, 0.4363323F, 0.0F, 0.0F);
        this.BackpanelL2 = new ModelRenderer(this, 0, 18);
        this.BackpanelL2.mirror = true;
        this.BackpanelL2.addBox(-2.0F, 2.5F, 1.5F, 5, 3, 1);
        this.BackpanelL2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BackpanelL2.setTextureSize(128, 64);
        this.setRotation(this.BackpanelL2, 0.4363323F, 0.0F, 0.0F);
        super.bipedHeadwear.cubeList.clear();
        super.bipedHead.cubeList.clear();
        super.bipedHead.addChild(this.OrnamentL);
        super.bipedHead.addChild(this.OrnamentL2);
        super.bipedHead.addChild(this.OrnamentR);
        super.bipedHead.addChild(this.OrnamentR2);
        super.bipedHead.addChild(this.Helmet);
        super.bipedHead.addChild(this.HelmetR);
        super.bipedHead.addChild(this.HelmetL);
        super.bipedHead.addChild(this.HelmetB);
        super.bipedHead.addChild(this.capsthingy);
        super.bipedHead.addChild(this.flapR);
        super.bipedHead.addChild(this.flapL);
        super.bipedHead.addChild(this.Gemornament);
        super.bipedHead.addChild(this.Gem);
        super.bipedHead.addChild(this.Goggles);
        super.bipedHead.addChild(this.Mask[0]);
        super.bipedHead.addChild(this.Mask[1]);
        super.bipedHead.addChild(this.Mask[2]);
        super.bipedBody.cubeList.clear();
        if (f < 1.0F) {
            super.bipedBody.addChild(this.Mbelt);
            super.bipedBody.addChild(this.MbeltL);
            super.bipedBody.addChild(this.MbeltR);
        } else {
            super.bipedBody.addChild(this.BeltR);
            super.bipedBody.addChild(this.BeltL);
            super.bipedBody.addChild(this.Chestplate);
            super.bipedBody.addChild(this.Scroll);
            super.bipedBody.addChild(this.Backplate);
            super.bipedBody.addChild(this.Book);
        }

        super.bipedRightArm.cubeList.clear();
        super.bipedRightArm.addChild(this.ShoulderR);
        super.bipedRightArm.addChild(this.GauntletR);
        super.bipedRightArm.addChild(this.GauntletstrapR1);
        super.bipedRightArm.addChild(this.GauntletstrapR2);
        super.bipedRightArm.addChild(this.ShoulderplateRtop);
        super.bipedRightArm.addChild(this.ShoulderplateR1);
        super.bipedRightArm.addChild(this.ShoulderplateR2);
        super.bipedRightArm.addChild(this.ShoulderplateR3);
        super.bipedLeftArm.cubeList.clear();
        super.bipedLeftArm.addChild(this.ShoulderL);
        super.bipedLeftArm.addChild(this.GauntletL);
        super.bipedLeftArm.addChild(this.Gauntletstrapl1);
        super.bipedLeftArm.addChild(this.GauntletstrapL2);
        super.bipedLeftArm.addChild(this.ShoulderplateLtop);
        super.bipedLeftArm.addChild(this.ShoulderplateL1);
        super.bipedLeftArm.addChild(this.ShoulderplateL2);
        super.bipedLeftArm.addChild(this.ShoulderplateL3);
        super.bipedRightLeg.cubeList.clear();
        super.bipedRightLeg.addChild(this.LegpanelR1);
        super.bipedRightLeg.addChild(this.LegpanelR2);
        super.bipedRightLeg.addChild(this.LegpanelR3);
        super.bipedRightLeg.addChild(this.LegpanelR4);
        super.bipedRightLeg.addChild(this.LegpanelR5);
        super.bipedRightLeg.addChild(this.LegpanelR6);
        super.bipedRightLeg.addChild(this.SidepanelR1);
        super.bipedRightLeg.addChild(this.SidepanelR2);
        super.bipedRightLeg.addChild(this.SidepanelR3);
        super.bipedRightLeg.addChild(this.BackpanelR1);
        super.bipedRightLeg.addChild(this.BackpanelR2);
        super.bipedRightLeg.addChild(this.BackpanelR3);
        super.bipedLeftLeg.cubeList.clear();
        super.bipedLeftLeg.addChild(this.BackpanelL3);
        super.bipedLeftLeg.addChild(this.LegpanelL1);
        super.bipedLeftLeg.addChild(this.LegpanelL2);
        super.bipedLeftLeg.addChild(this.LegpanelL3);
        super.bipedLeftLeg.addChild(this.LegpanelL4);
        super.bipedLeftLeg.addChild(this.LegpanelL5);
        super.bipedLeftLeg.addChild(this.LegpanelL6);
        super.bipedLeftLeg.addChild(this.SidepanelL1);
        super.bipedLeftLeg.addChild(this.SidepanelL2);
        super.bipedLeftLeg.addChild(this.SidepanelL3);
        super.bipedLeftLeg.addChild(this.BackpanelL1);
        super.bipedLeftLeg.addChild(this.BackpanelL2);
    }

    private void checkSet(Entity entity) {
        if (entity instanceof EntityLivingBase && entity.ticksExisted % 20 == 0) {
            int set = 0;

            for (int a = 1; a < 4; ++a) {
                ItemStack piece = ((EntityLivingBase) entity).getEquipmentInSlot(a + 1);
                if (piece != null && piece.getItem() instanceof ThaumiumFortressDyed) {
                    ++set;
                    if (a == 3) {
                        if (piece.hasTagCompound() && piece.stackTagCompound.hasKey("mask")) {
                            hasMask.put(
                                Integer.valueOf(entity.getEntityId()),
                                Integer.valueOf(piece.stackTagCompound.getInteger("mask")));
                        } else {
                            hasMask.remove(Integer.valueOf(entity.getEntityId()));
                        }

                        if (piece.hasTagCompound() && piece.stackTagCompound.hasKey("goggles")) {
                            hasGoggles.put(Integer.valueOf(entity.getEntityId()), Boolean.valueOf(true));
                        } else {
                            hasGoggles.remove(Integer.valueOf(entity.getEntityId()));
                        }
                    }
                }
            }

            if (set > 0) {
                hasSet.put(Integer.valueOf(entity.getEntityId()), Integer.valueOf(set));
            } else {
                hasSet.remove(Integer.valueOf(entity.getEntityId()));
            }
        }

    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.checkSet(entity);
        int set = hasSet.containsKey(Integer.valueOf(entity.getEntityId()))
            ? ((Integer) hasSet.get(Integer.valueOf(entity.getEntityId()))).intValue()
            : -1;
        int mask = hasMask.containsKey(Integer.valueOf(entity.getEntityId()))
            ? ((Integer) hasMask.get(Integer.valueOf(entity.getEntityId()))).intValue()
            : -1;
        this.Goggles.isHidden = !hasGoggles.containsKey(Integer.valueOf(entity.getEntityId()));

        for (int var11 = 0; var11 < 3; ++var11) {
            if (mask == var11) {
                this.Mask[var11].isHidden = false;
            } else {
                this.Mask[var11].isHidden = true;
            }
        }

        this.Scroll.isHidden = set < 3;
        this.Book.isHidden = set < 2;
        this.OrnamentL.isHidden = set < 3;
        this.OrnamentL2.isHidden = set < 3;
        this.OrnamentR.isHidden = set < 3;
        this.OrnamentR2.isHidden = set < 3;
        this.Gemornament.isHidden = set < 3;
        this.Gem.isHidden = set < 3;
        this.flapL.isHidden = set < 2;
        this.flapR.isHidden = set < 2;
        this.ShoulderplateLtop.isHidden = set < 2;
        this.ShoulderplateL1.isHidden = set < 2;
        this.ShoulderplateL2.isHidden = set < 3;
        this.ShoulderplateL3.isHidden = set < 3;
        this.ShoulderplateRtop.isHidden = set < 2;
        this.ShoulderplateR1.isHidden = set < 2;
        this.ShoulderplateR2.isHidden = set < 3;
        this.ShoulderplateR3.isHidden = set < 3;
        this.SidepanelR2.isHidden = set < 2;
        this.SidepanelL2.isHidden = set < 2;
        this.SidepanelR3.isHidden = set < 3;
        this.SidepanelL3.isHidden = set < 3;
        if (!(entity instanceof EntitySkeleton) && !(entity instanceof EntityZombie)) {
            this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        } else {
            this.setRotationAnglesZombie(f, f1, f2, f3, f4, f5, entity);
        }

        if (super.isChild) {
            float var111 = 2.0F;
            GL11.glPushMatrix();
            GL11.glScalef(1.5F / var111, 1.5F / var111, 1.5F / var111);
            GL11.glTranslatef(0.0F, 16.0F * f5, 0.0F);
            super.bipedHead.render(f5);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glScalef(1.0F / var111, 1.0F / var111, 1.0F / var111);
            GL11.glTranslatef(0.0F, 24.0F * f5, 0.0F);
            super.bipedBody.render(f5);
            super.bipedRightArm.render(f5);
            super.bipedLeftArm.render(f5);
            super.bipedRightLeg.render(f5);
            super.bipedLeftLeg.render(f5);
            super.bipedHeadwear.render(f5);
            GL11.glPopMatrix();
        } else {
            GL11.glPushMatrix();
            GL11.glScalef(1.01F, 1.01F, 1.01F);
            super.bipedHead.render(f5);
            GL11.glPopMatrix();
            super.bipedBody.render(f5);
            super.bipedRightArm.render(f5);
            super.bipedLeftArm.render(f5);
            super.bipedRightLeg.render(f5);
            super.bipedLeftLeg.render(f5);
            super.bipedHeadwear.render(f5);
        }

    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAnglesZombie(float p_78087_1_, float p_78087_2_, float p_78087_3_, float p_78087_4_,
        float p_78087_5_, float p_78087_6_, Entity p_78087_7_) {
        super.setRotationAngles(p_78087_1_, p_78087_2_, p_78087_3_, p_78087_4_, p_78087_5_, p_78087_6_, p_78087_7_);
        float f6 = MathHelper.sin(super.onGround * 3.141593F);
        float f7 = MathHelper.sin((1.0F - (1.0F - super.onGround) * (1.0F - super.onGround)) * 3.141593F);
        super.bipedRightArm.rotateAngleZ = 0.0F;
        super.bipedLeftArm.rotateAngleZ = 0.0F;
        super.bipedRightArm.rotateAngleY = -(0.1F - f6 * 0.6F);
        super.bipedLeftArm.rotateAngleY = 0.1F - f6 * 0.6F;
        super.bipedRightArm.rotateAngleX = -1.570796F;
        super.bipedLeftArm.rotateAngleX = -1.570796F;
        super.bipedRightArm.rotateAngleX -= f6 * 1.2F - f7 * 0.4F;
        super.bipedLeftArm.rotateAngleX -= f6 * 1.2F - f7 * 0.4F;
        super.bipedRightArm.rotateAngleZ += MathHelper.cos(p_78087_3_ * 0.09F) * 0.05F + 0.05F;
        super.bipedLeftArm.rotateAngleZ -= MathHelper.cos(p_78087_3_ * 0.09F) * 0.05F + 0.05F;
        super.bipedRightArm.rotateAngleX += MathHelper.sin(p_78087_3_ * 0.067F) * 0.05F;
        super.bipedLeftArm.rotateAngleX -= MathHelper.sin(p_78087_3_ * 0.067F) * 0.05F;
    }
}
