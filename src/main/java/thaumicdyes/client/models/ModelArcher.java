package thaumicdyes.client.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.util.MathHelper;

import org.lwjgl.opengl.GL11;

public class ModelArcher extends ModelBiped {

    public ModelRenderer GauntletstrapR1;
    public ModelRenderer GauntletstrapR2;
    public ModelRenderer GauntletR;
    public ModelRenderer GauntletL;
    public ModelRenderer GauntletstrapL1;
    public ModelRenderer GauntletstrapL2;
    public ModelRenderer ShoulderL1;
    public ModelRenderer ShoulderL2;
    public ModelRenderer ShoulderL3;
    public ModelRenderer ShoulderL4;
    public ModelRenderer ShoulderL5;
    public ModelRenderer ShoulderR1;
    public ModelRenderer ShoulderR4;
    public ModelRenderer ShoulderR2;
    public ModelRenderer ShoulderR3;
    public ModelRenderer ShoulderR5;
    public ModelRenderer Helmet;
    public ModelRenderer Helmet1;
    public ModelRenderer Helmet2;
    public ModelRenderer Chestthing;
    public ModelRenderer Mbelt;
    public ModelRenderer clothchestL;
    public ModelRenderer clothchestR;
    public ModelRenderer BeltR;
    public ModelRenderer Backplate;
    public ModelRenderer MbeltL;
    public ModelRenderer MbeltR;
    public ModelRenderer BeltL;
    public ModelRenderer Chestplate;
    public ModelRenderer Quiver;
    public ModelRenderer ShoulderR;
    public ModelRenderer ShoulderL;

    public ModelRenderer LegpanelL1;
    public ModelRenderer LegpanelL4;
    public ModelRenderer LegpanelL5;
    public ModelRenderer LegpanelL6;
    public ModelRenderer BackpanelL1;
    public ModelRenderer BackpanelL2;
    public ModelRenderer BackpanelL3;
    public ModelRenderer BackpanelL4;

    public ModelRenderer LegpanelR6;
    public ModelRenderer LegpanelR5;
    public ModelRenderer LegpanelR4;
    public ModelRenderer BackpanelR1;
    public ModelRenderer BackpanelR2;
    public ModelRenderer BackpanelR3;
    public ModelRenderer BackpanelR4;

    public ModelRenderer FrontclothR1;
    private ModelRenderer FrontclothR2;
    private ModelRenderer FrontclothL1;
    private ModelRenderer FrontclothL2;
    private ModelRenderer ClothBackR1;
    private ModelRenderer ClothBackR2;
    private ModelRenderer ClothBackR3;
    private ModelRenderer ClothBackL1;
    private ModelRenderer ClothBackL2;
    private ModelRenderer ClothBackL3;

    public ModelRenderer MbeltB;

    public ModelArcher(float f) {
        super(f, 0.0F, 128, 64);
        this.textureWidth = 128;
        this.textureHeight = 64;

        this.BackpanelR3 = new ModelRenderer(this, 84, 3);
        this.BackpanelR3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BackpanelR3.addBox(0.0F, 2.5F, -2.5F, 2, 2, 5, 0.0F);
        this.setRotation(BackpanelR3, 0.0F, -0.0F, 0.13962634015954636F);

        this.ShoulderL3 = new ModelRenderer(this, 0, 50);
        this.ShoulderL3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ShoulderL3.addBox(2.299999952316284F, 3.0F, -3.0F, 1, 2, 6, 0.0F);
        this.setRotation(ShoulderL3, 0.0F, -0.0F, -0.6457718014717102F);

        this.Quiver = new ModelRenderer(this, 85, 18);
        this.Quiver.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Quiver.addBox(1.0F, 0.0F, 3.0F, 5, 8, 4, 0.0F);
        this.setRotation(Quiver, 0.0F, -0.0F, 0.767944872379303F);

        this.Chestplate = new ModelRenderer(this, 16, 25);
        this.Chestplate.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Chestplate.addBox(-4.0F, 1.0F, -3.0F, 8, 6, 1, 0.0F);

        this.ShoulderL2 = new ModelRenderer(this, 0, 58);
        this.ShoulderL2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ShoulderL2.addBox(3.299999952316284F, 3.0F, -2.5F, 1, 1, 5, 0.0F);
        this.setRotation(ShoulderL2, 0.0F, -0.0F, -0.6457718014717102F);

        this.BackpanelL1 = new ModelRenderer(this, 104, 9);
        this.BackpanelL1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BackpanelL1.addBox(2.0F, 2.5F, -2.5F, 1, 6, 5, 0.0F);
        this.setRotation(BackpanelL1, 0.0F, -0.0F, -0.13962633907794952F);

        this.Helmet1 = new ModelRenderer(this, 2, 1);
        this.Helmet1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Helmet1.addBox(-5.5F, -6.0F, -5.5F, 11, 1, 11, 0.0F);

        this.Mbelt = new ModelRenderer(this, 16, 55);
        this.Mbelt.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Mbelt.addBox(-4.0F, 7.0F, -3.0F, 8, 5, 1, 0.0F);

        this.MbeltB = new ModelRenderer(this, 16, 55);
        this.MbeltB.addBox(-4.0F, 7.0F, -4.0F, 8, 5, 1);
        this.MbeltB.setTextureSize(128, 64);
        setRotation(this.MbeltB, 0.0F, 3.141593F, 0.0F);

        this.ShoulderR = new ModelRenderer(this, 16, 45);
        this.ShoulderR.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ShoulderR.addBox(-3.5F, -2.5F, -2.5F, 5, 5, 5, 0.0F);

        this.GauntletstrapR1 = new ModelRenderer(this, 84, 58);
        this.GauntletstrapR1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.GauntletstrapR1.addBox(-1.5F, 3.5F, -2.5F, 3, 1, 5, 0.0F);

        this.GauntletL = new ModelRenderer(this, 114, 53);
        this.GauntletL.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.GauntletL.addBox(1.5F, 3.5F, -2.5F, 2, 6, 5, 0.0F);

        this.ShoulderL = new ModelRenderer(this, 16, 45);
        this.ShoulderL.mirror = true;
        this.ShoulderL.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ShoulderL.addBox(-1.5F, -2.5F, -2.5F, 5, 5, 5, 0.0F);

        this.LegpanelL5 = new ModelRenderer(this, 76, 42);
        this.LegpanelL5.mirror = true;
        this.LegpanelL5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LegpanelL5.addBox(1.0F, 2.5F, -2.5F, 2, 3, 1, 0.0F);
        this.setRotation(LegpanelL5, -0.43633231520652765F, -0.0F, 0.0F);

        this.BackpanelL2 = new ModelRenderer(this, 84, 10);
        this.BackpanelL2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BackpanelL2.addBox(-2.0F, -0.5F, -2.5F, 5, 3, 5, 0.0F);
        this.setRotation(BackpanelL2, 0.0F, -0.0F, -0.13962634015954636F);

        this.GauntletstrapL2 = new ModelRenderer(this, 84, 58);
        this.GauntletstrapL2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.GauntletstrapL2.addBox(-1.5F, 6.5F, -2.5F, 3, 1, 5, 0.0F);

        this.BackpanelR1 = new ModelRenderer(this, 84, 10);
        this.BackpanelR1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BackpanelR1.addBox(-3.0F, -0.5F, -2.5F, 5, 3, 5, 0.0F);
        this.setRotation(BackpanelR1, 0.0F, -0.0F, 0.13962633907794952F);

        this.ShoulderR5 = new ModelRenderer(this, 0, 38);
        this.ShoulderR5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ShoulderR5.addBox(-3.299999952316284F, -2.0F, 3.0F, 1, 6, 1, 0.0F);
        this.setRotation(ShoulderR5, 0.0F, -0.0F, 0.6457718014717102F);

        this.BackpanelL3 = new ModelRenderer(this, 84, 3);
        this.BackpanelL3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BackpanelL3.addBox(-2.0F, 2.5F, -2.5F, 2, 2, 5, 0.0F);
        this.setRotation(BackpanelL3, 0.0F, -0.0F, -0.13962634015954636F);

        this.Helmet = new ModelRenderer(this, 48, 0);
        this.Helmet.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Helmet.addBox(-4.5F, -5.0F, -4.5F, 9, 5, 9, 0.0F);

        this.GauntletstrapL1 = new ModelRenderer(this, 84, 58);
        this.GauntletstrapL1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.GauntletstrapL1.addBox(-1.5F, 3.5F, -2.5F, 3, 1, 5, 0.0F);

        this.clothchestL = new ModelRenderer(this, 108, 38);
        this.clothchestL.mirror = true;
        this.clothchestL.setRotationPoint(2.0F, 12.0F, 0.0F);
        this.clothchestL.addBox(0.10000000149011612F, -11.5F, -3.5F, 2, 8, 1, 0.0F);

        this.ShoulderR1 = new ModelRenderer(this, 0, 39);
        this.ShoulderR1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ShoulderR1.addBox(-4.300000190734863F, -2.0F, -3.0F, 1, 5, 6, 0.0F);
        this.setRotation(ShoulderR1, 0.0F, -0.0F, 0.6457718014717102F);

        this.MbeltR = new ModelRenderer(this, 16, 36);
        this.MbeltR.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.MbeltR.addBox(-5.0F, 8.0F, -3.0F, 1, 3, 6, 0.0F);

        this.LegpanelR6 = new ModelRenderer(this, 82, 38);
        this.LegpanelR6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LegpanelR6.addBox(-3.0F, 4.5F, -1.5F, 2, 3, 1, 0.0F);
        this.setRotation(LegpanelR6, -0.43633231520652765F, -0.0F, 0.0F);

        this.Chestthing = new ModelRenderer(this, 56, 50);
        this.Chestthing.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Chestthing.addBox(-2.5F, 1.0F, -4.0F, 5, 7, 1, 0.0F);

        this.BackpanelR4 = new ModelRenderer(this, 102, 1);
        this.BackpanelR4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BackpanelR4.addBox(-2.0F, 2.5F, -2.5F, 2, 3, 5, 0.0F);
        this.setRotation(BackpanelR4, 0.0F, -0.0F, 0.13962634015954636F);

        this.ShoulderR4 = new ModelRenderer(this, 0, 38);
        this.ShoulderR4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ShoulderR4.addBox(-3.299999952316284F, -2.0F, -4.0F, 1, 6, 1, 0.0F);
        this.setRotation(ShoulderR4, 0.0F, -0.0F, 0.6457718014717102F);

        this.clothchestR = new ModelRenderer(this, 108, 38);
        this.clothchestR.setRotationPoint(2.0F, 12.0F, 0.0F);
        this.clothchestR.addBox(-6.099999904632568F, -11.5F, -3.5F, 2, 8, 1, 0.0F);

        this.ShoulderR3 = new ModelRenderer(this, 0, 50);
        this.ShoulderR3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ShoulderR3.addBox(-3.299999952316284F, 3.0F, -3.0F, 1, 2, 6, 0.0F);
        this.setRotation(ShoulderR3, 0.0F, -0.0F, 0.6457718014717102F);

        this.LegpanelR4 = new ModelRenderer(this, 76, 38);
        this.LegpanelR4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LegpanelR4.addBox(-3.0F, 0.5F, -3.5F, 2, 3, 1, 0.0F);
        this.setRotation(LegpanelR4, -0.43633231520652765F, -0.0F, 0.0F);

        this.ShoulderL1 = new ModelRenderer(this, 0, 39);
        this.ShoulderL1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ShoulderL1.addBox(3.299999952316284F, -2.0F, -3.0F, 1, 5, 6, 0.0F);
        this.setRotation(ShoulderL1, 0.0F, -0.0F, -0.6457718014717102F);

        this.BeltR = new ModelRenderer(this, 16, 36);
        this.BeltR.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BeltR.addBox(-5.0F, 4.0F, -3.0F, 1, 3, 6, 0.0F);

        this.GauntletstrapR2 = new ModelRenderer(this, 84, 58);
        this.GauntletstrapR2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.GauntletstrapR2.addBox(-1.5F, 6.5F, -2.5F, 3, 1, 5, 0.0F);

        this.LegpanelL1 = new ModelRenderer(this, 123, 9);
        this.LegpanelL1.mirror = true;
        this.LegpanelL1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LegpanelL1.addBox(1.0F, 8.800000190734863F, 1.2999999523162842F, 1, 2, 1, 0.0F);
        this.setRotation(LegpanelL1, 0.22689279913902285F, -0.0F, 0.0F);

        this.Backplate = new ModelRenderer(this, 38, 46);
        this.Backplate.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Backplate.addBox(-4.0F, 1.0F, 2.0F, 8, 11, 1, 0.0F);

        this.BackpanelL4 = new ModelRenderer(this, 102, 1);
        this.BackpanelL4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BackpanelL4.addBox(0.0F, 2.5F, -2.5F, 2, 3, 5, 0.0F);
        this.setRotation(BackpanelL4, 0.0F, -0.0F, -0.13962634015954636F);

        this.LegpanelR5 = new ModelRenderer(this, 76, 42);
        this.LegpanelR5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LegpanelR5.addBox(-3.0F, 2.5F, -2.5F, 2, 3, 1, 0.0F);
        this.setRotation(LegpanelR5, -0.43633231520652765F, -0.0F, 0.0F);

        this.BackpanelR2 = new ModelRenderer(this, 104, 9);
        this.BackpanelR2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BackpanelR2.addBox(-3.0F, 2.5F, -2.5F, 1, 6, 5, 0.0F);
        this.setRotation(BackpanelR2, 0.0F, -0.0F, 0.13962634015954636F);

        this.ShoulderL4 = new ModelRenderer(this, 0, 38);
        this.ShoulderL4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ShoulderL4.addBox(2.299999952316284F, -2.0F, -4.0F, 1, 6, 1, 0.0F);
        this.setRotation(ShoulderL4, 0.0F, -0.0F, -0.6457718014717102F);

        this.LegpanelL6 = new ModelRenderer(this, 82, 38);
        this.LegpanelL6.mirror = true;
        this.LegpanelL6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LegpanelL6.addBox(1.0F, 4.5F, -1.5F, 2, 3, 1, 0.0F);
        this.setRotation(LegpanelL6, -0.43633231520652765F, -0.0F, 0.0F);

        this.ShoulderR2 = new ModelRenderer(this, 0, 58);
        this.ShoulderR2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ShoulderR2.addBox(-4.300000190734863F, 3.0F, -2.5F, 1, 1, 5, 0.0F);
        this.setRotation(ShoulderR2, 0.0F, -0.0F, 0.6457718014717102F);

        this.ShoulderL5 = new ModelRenderer(this, 0, 38);
        this.ShoulderL5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ShoulderL5.addBox(2.299999952316284F, -2.0F, 3.0F, 1, 6, 1, 0.0F);
        this.setRotation(ShoulderL5, 0.0F, -0.0F, -0.6457718014717102F);

        this.BeltL = new ModelRenderer(this, 16, 36);
        this.BeltL.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BeltL.addBox(4.0F, 4.0F, -3.0F, 1, 3, 6, 0.0F);

        this.Helmet2 = new ModelRenderer(this, 0, 13);
        this.Helmet2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Helmet2.addBox(-4.5F, -9.0F, -4.5F, 9, 3, 9, 0.0F);

        this.MbeltL = new ModelRenderer(this, 16, 36);
        this.MbeltL.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.MbeltL.addBox(4.0F, 8.0F, -3.0F, 1, 3, 6, 0.0F);

        this.LegpanelL4 = new ModelRenderer(this, 76, 38);
        this.LegpanelL4.mirror = true;
        this.LegpanelL4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LegpanelL4.addBox(1.0F, 0.5F, -3.5F, 2, 3, 1, 0.0F);
        this.setRotation(LegpanelL4, -0.43633231520652765F, -0.0F, 0.0F);

        this.GauntletR = new ModelRenderer(this, 100, 53);
        this.GauntletR.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.GauntletR.addBox(-3.5F, 3.5F, -2.5F, 2, 6, 5, 0.0F);

        this.FrontclothR1 = new ModelRenderer(this, 108, 38);
        this.FrontclothR1.addBox(0.0F, 0.0F, 0.0F, 3, 8, 1);
        this.FrontclothR1.setRotationPoint(-3.0F, 11.0F, -2.9F);
        this.FrontclothR1.setTextureSize(128, 64);
        setRotation(this.FrontclothR1, -0.1047198F, 0.0F, 0.0F);

        this.FrontclothR2 = new ModelRenderer(this, 108, 47);
        this.FrontclothR2.addBox(0.0F, 7.5F, 1.7F, 3, 3, 1);
        this.FrontclothR2.setRotationPoint(-3.0F, 11.0F, -2.9F);
        this.FrontclothR2.setTextureSize(128, 64);
        setRotation(this.FrontclothR2, -0.3316126F, 0.0F, 0.0F);

        this.FrontclothL1 = new ModelRenderer(this, 108, 38);
        this.FrontclothL1.mirror = true;
        this.FrontclothL1.addBox(0.0F, 0.0F, 0.0F, 3, 8, 1);
        this.FrontclothL1.setRotationPoint(0.0F, 11.0F, -2.9F);
        this.FrontclothL1.setTextureSize(128, 64);
        setRotation(this.FrontclothL1, -0.1047198F, 0.0F, 0.0F);

        this.FrontclothL2 = new ModelRenderer(this, 108, 47);
        this.FrontclothL2.mirror = true;
        this.FrontclothL2.addBox(0.0F, 7.5F, 1.7F, 3, 3, 1);
        this.FrontclothL2.setRotationPoint(0.0F, 11.0F, -2.9F);
        this.FrontclothL2.setTextureSize(128, 64);
        setRotation(this.FrontclothL2, -0.3316126F, 0.0F, 0.0F);

        this.ClothBackR1 = new ModelRenderer(this, 118, 16);
        this.ClothBackR1.mirror = true;
        this.ClothBackR1.addBox(0.0F, 0.0F, 0.0F, 4, 8, 1);
        this.ClothBackR1.setRotationPoint(-4.0F, 11.5F, 2.9F);
        this.ClothBackR1.setTextureSize(128, 64);
        setRotation(this.ClothBackR1, 0.1047198F, 0.0F, 0.0F);

        this.ClothBackR2 = new ModelRenderer(this, 123, 9);
        this.ClothBackR2.addBox(0.0F, 7.8F, -0.9F, 1, 2, 1);
        this.ClothBackR2.setRotationPoint(-4.0F, 11.5F, 2.9F);
        this.ClothBackR2.setTextureSize(128, 64);
        setRotation(this.ClothBackR2, 0.2268928F, 0.0F, 0.0F);

        this.ClothBackR3 = new ModelRenderer(this, 120, 12);
        this.ClothBackR3.mirror = true;
        this.ClothBackR3.addBox(1.0F, 7.8F, -0.9F, 3, 3, 1);
        this.ClothBackR3.setRotationPoint(-4.0F, 11.5F, 2.9F);
        this.ClothBackR3.setTextureSize(128, 64);
        setRotation(this.ClothBackR3, 0.2268928F, 0.0F, 0.0F);

        this.ClothBackL1 = new ModelRenderer(this, 118, 16);
        this.ClothBackL1.addBox(0.0F, 0.0F, 0.0F, 4, 8, 1);
        this.ClothBackL1.setRotationPoint(0.0F, 11.5F, 2.9F);
        this.ClothBackL1.setTextureSize(128, 64);
        setRotation(this.ClothBackL1, 0.1047198F, 0.0F, 0.0F);

        this.ClothBackL2 = new ModelRenderer(this, 123, 9);
        this.ClothBackL2.mirror = true;
        this.ClothBackL2.addBox(3.0F, 7.8F, -0.9F, 1, 2, 1);
        this.ClothBackL2.setRotationPoint(0.0F, 11.5F, 2.9F);
        this.ClothBackL2.setTextureSize(128, 64);
        setRotation(this.ClothBackL2, 0.2268928F, 0.0F, 0.0F);

        this.ClothBackL3 = new ModelRenderer(this, 120, 12);
        this.ClothBackL3.addBox(0.0F, 7.8F, -0.9F, 3, 3, 1);
        this.ClothBackL3.setRotationPoint(0.0F, 11.5F, 2.9F);
        this.ClothBackL3.setTextureSize(128, 64);
        setRotation(this.ClothBackL3, 0.2268928F, 0.0F, 0.0F);

        // TODO child mods
        this.bipedHeadwear.cubeList.clear();
        this.bipedHead.cubeList.clear();
        this.bipedHead.addChild(this.Helmet);
        this.bipedHead.addChild(this.Helmet1);
        this.bipedHead.addChild(this.Helmet2);

        this.bipedBody.cubeList.clear();
        this.bipedRightLeg.cubeList.clear();
        this.bipedLeftLeg.cubeList.clear();

        this.bipedBody.addChild(this.Mbelt);
        this.bipedBody.addChild(this.MbeltL);
        this.bipedBody.addChild(this.MbeltR);
        this.bipedBody.addChild(this.MbeltB);
        if (f >= 1.0F) {
            this.bipedBody.addChild(this.Quiver);
            this.bipedBody.addChild(this.Chestthing);
            this.bipedBody.addChild(this.Backplate);
            this.bipedBody.addChild(this.Chestplate);
            this.bipedBody.addChild(this.clothchestL);
            this.bipedBody.addChild(this.clothchestR);
            this.bipedBody.addChild(this.BeltL);
            this.bipedBody.addChild(this.BeltR);
        } else {
            this.bipedBody.addChild(this.FrontclothR1);
            this.bipedBody.addChild(this.FrontclothR2);
            this.bipedBody.addChild(this.FrontclothL1);
            this.bipedBody.addChild(this.FrontclothL2);

            this.bipedBody.addChild(this.ClothBackR1);
            this.bipedBody.addChild(this.ClothBackR2);
            this.bipedBody.addChild(this.ClothBackR3);

            this.bipedBody.addChild(this.ClothBackL1);
            this.bipedBody.addChild(this.ClothBackL2);
            this.bipedBody.addChild(this.ClothBackL3);
        }
        this.bipedRightArm.cubeList.clear();
        this.bipedRightArm.addChild(this.ShoulderR);
        this.bipedRightArm.addChild(this.ShoulderR1);
        this.bipedRightArm.addChild(this.ShoulderR2);
        this.bipedRightArm.addChild(this.ShoulderR3);
        this.bipedRightArm.addChild(this.ShoulderR4);
        this.bipedRightArm.addChild(this.ShoulderR5);
        this.bipedRightArm.addChild(this.GauntletR);
        this.bipedRightArm.addChild(this.GauntletstrapR1);
        this.bipedRightArm.addChild(this.GauntletstrapR2);

        this.bipedLeftArm.cubeList.clear();
        this.bipedLeftArm.addChild(this.ShoulderL);
        this.bipedLeftArm.addChild(this.ShoulderL1);
        this.bipedLeftArm.addChild(this.ShoulderL2);
        this.bipedLeftArm.addChild(this.ShoulderL3);
        this.bipedLeftArm.addChild(this.ShoulderL4);
        this.bipedLeftArm.addChild(this.ShoulderL5);
        this.bipedLeftArm.addChild(this.GauntletL);
        this.bipedLeftArm.addChild(this.GauntletstrapL1);
        this.bipedLeftArm.addChild(this.GauntletstrapL2);

        this.bipedRightLeg.addChild(this.BackpanelR1);
        this.bipedRightLeg.addChild(this.BackpanelR2);
        this.bipedRightLeg.addChild(this.BackpanelR3);
        this.bipedRightLeg.addChild(this.BackpanelR4);

        this.bipedLeftLeg.addChild(this.BackpanelL1);
        this.bipedLeftLeg.addChild(this.BackpanelL2);
        this.bipedLeftLeg.addChild(this.BackpanelL3);
        this.bipedLeftLeg.addChild(this.BackpanelL4);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        if (((entity instanceof EntitySkeleton)) || ((entity instanceof EntityZombie))) {
            setRotationAnglesZombie(f, f1, f2, f3, f4, f5, entity);
        } else {
            setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        }
        float a = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
        float b = MathHelper.cos(f * 0.6662F + 3.1415927F) * 1.4F * f1;
        float c = Math.min(a, b);

        this.FrontclothR1.rotateAngleX = (this.FrontclothL1.rotateAngleX = c - 0.1047198F);
        this.FrontclothR2.rotateAngleX = (this.FrontclothL2.rotateAngleX = c - 0.3316126F);

        this.ClothBackR1.rotateAngleX = (this.ClothBackL1.rotateAngleX = -c + 0.1047198F);
        this.ClothBackR2.rotateAngleX = (this.ClothBackL2.rotateAngleX = this.ClothBackR3.rotateAngleX = this.ClothBackL3.rotateAngleX = -c
            + 0.2268928F);

        if (this.isChild) {
            float f6 = 2.0F;
            GL11.glPushMatrix();
            GL11.glScalef(1.5F / f6, 1.5F / f6, 1.5F / f6);
            GL11.glTranslatef(0.0F, 16.0F * f5, 0.0F);
            this.bipedHead.render(f5);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glScalef(1.0F / f6, 1.0F / f6, 1.0F / f6);
            GL11.glTranslatef(0.0F, 24.0F * f5, 0.0F);
            this.bipedBody.render(f5);
            this.bipedRightArm.render(f5);
            this.bipedLeftArm.render(f5);
            this.bipedRightLeg.render(f5);
            this.bipedLeftLeg.render(f5);
            this.bipedHeadwear.render(f5);
            GL11.glPopMatrix();
        } else {
            GL11.glPushMatrix();
            GL11.glScalef(1.01F, 1.01F, 1.01F);
            this.bipedHead.render(f5);
            GL11.glPopMatrix();
            this.bipedBody.render(f5);
            this.bipedRightArm.render(f5);
            this.bipedLeftArm.render(f5);
            this.bipedRightLeg.render(f5);
            this.bipedLeftLeg.render(f5);
            this.bipedHeadwear.render(f5);
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

        float f6 = MathHelper.sin(this.onGround * 3.1415927F);
        float f7 = MathHelper.sin((1.0F - (1.0F - this.onGround) * (1.0F - this.onGround)) * 3.1415927F);

        this.bipedRightArm.rotateAngleZ = 0.0F;
        this.bipedLeftArm.rotateAngleZ = 0.0F;
        this.bipedRightArm.rotateAngleY = (-(0.1F - f6 * 0.6F));
        this.bipedLeftArm.rotateAngleY = (0.1F - f6 * 0.6F);
        this.bipedRightArm.rotateAngleX = -1.5707964F;
        this.bipedLeftArm.rotateAngleX = -1.5707964F;
        this.bipedRightArm.rotateAngleX -= f6 * 1.2F - f7 * 0.4F;
        this.bipedLeftArm.rotateAngleX -= f6 * 1.2F - f7 * 0.4F;
        this.bipedRightArm.rotateAngleZ += MathHelper.cos(p_78087_3_ * 0.09F) * 0.05F + 0.05F;
        this.bipedLeftArm.rotateAngleZ -= MathHelper.cos(p_78087_3_ * 0.09F) * 0.05F + 0.05F;
        this.bipedRightArm.rotateAngleX += MathHelper.sin(p_78087_3_ * 0.067F) * 0.05F;
        this.bipedLeftArm.rotateAngleX -= MathHelper.sin(p_78087_3_ * 0.067F) * 0.05F;
    }
}
