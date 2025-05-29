package thaumicdyes.client.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.util.MathHelper;

import org.lwjgl.opengl.GL11;

public class ModelPraetor extends ModelBiped {

    ModelRenderer Helmet;
    ModelRenderer CollarF;
    ModelRenderer CollarB;
    ModelRenderer CollarR;
    ModelRenderer CollarL;
    ModelRenderer BeltR;
    ModelRenderer Mbelt;
    ModelRenderer MbeltL;
    ModelRenderer MbeltR;
    ModelRenderer BeltL;
    ModelRenderer CloakTL;
    ModelRenderer Cloak3;
    ModelRenderer CloakTR;
    ModelRenderer Cloak1;
    ModelRenderer Cloak2;
    ModelRenderer Chestplate;
    ModelRenderer ChestOrnament;
    ModelRenderer ChestClothL;
    ModelRenderer ChestClothR;
    ModelRenderer Backplate;
    ModelRenderer GauntletstrapR1;
    ModelRenderer GauntletstrapR2;
    ModelRenderer ShoulderR;
    ModelRenderer ShoulderR1;
    ModelRenderer ShoulderR2;
    ModelRenderer ShoulderR5;
    ModelRenderer ShoulderR3;
    ModelRenderer ShoulderR4;
    ModelRenderer GauntletR2;
    ModelRenderer GauntletR;
    ModelRenderer GauntletL2;
    ModelRenderer GauntletstrapL1;
    ModelRenderer GauntletstrapL2;
    ModelRenderer ShoulderL;
    ModelRenderer ShoulderL1;
    ModelRenderer ShoulderL2;
    ModelRenderer ShoulderL3;
    ModelRenderer ShoulderL5;
    ModelRenderer ShoulderL4;
    ModelRenderer GauntletL;
    ModelRenderer LegClothR;
    ModelRenderer BackpanelR2;
    ModelRenderer BackpanelR3;
    ModelRenderer BackpanelR4;
    ModelRenderer LegClothL;
    ModelRenderer BackpanelL4;
    ModelRenderer BackpanelL2;
    ModelRenderer BackpanelL3;
    ModelRenderer BackpanelL1;
    ModelRenderer BackpanelR1;

    public ModelPraetor(float f) {
        super(f, 0.0F, 128, 64);
        super.textureWidth = 128;
        super.textureHeight = 64;
        this.Helmet = new ModelRenderer(this, 41, 8);
        this.Helmet.addBox(-4.5F, -9.0F, -4.5F, 9, 9, 9);
        this.Helmet.setTextureSize(128, 64);
        this.setRotation(this.Helmet, 0.0F, 0.0F, 0.0F);
        this.CollarF = new ModelRenderer(this, 17, 31);
        this.CollarF.addBox(-4.5F, -1.5F, -3.0F, 9, 4, 1);
        this.CollarF.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.setRotation(this.CollarF, 0.226893F, 0.0F, 0.0F);
        this.CollarB = new ModelRenderer(this, 17, 26);
        this.CollarB.addBox(-4.5F, -1.5F, 7.0F, 9, 4, 1);
        this.CollarB.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.setRotation(this.CollarB, 0.226893F, 0.0F, 0.0F);
        this.CollarR = new ModelRenderer(this, 17, 11);
        this.CollarR.addBox(-5.5F, -1.5F, -3.0F, 1, 4, 11);
        this.CollarR.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.setRotation(this.CollarR, 0.226893F, 0.0F, 0.0F);
        this.CollarL = new ModelRenderer(this, 17, 11);
        this.CollarL.addBox(4.5F, -1.5F, -3.0F, 1, 4, 11);
        this.CollarL.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.setRotation(this.CollarL, 0.226893F, 0.0F, 0.0F);
        this.BeltR = new ModelRenderer(this, 76, 44);
        this.BeltR.addBox(-5.0F, 4.0F, -3.0F, 1, 3, 6);
        this.Mbelt = new ModelRenderer(this, 56, 55);
        this.Mbelt.addBox(-4.0F, 8.0F, -3.0F, 8, 4, 1);
        this.MbeltL = new ModelRenderer(this, 76, 44);
        this.MbeltL.addBox(4.0F, 8.0F, -3.0F, 1, 3, 6);
        this.MbeltR = new ModelRenderer(this, 76, 44);
        this.MbeltR.addBox(-5.0F, 8.0F, -3.0F, 1, 3, 6);
        this.BeltL = new ModelRenderer(this, 76, 44);
        this.BeltL.addBox(4.0F, 4.0F, -3.0F, 1, 3, 6);
        this.CloakTL = new ModelRenderer(this, 0, 43);
        this.CloakTL.addBox(2.5F, 1.0F, -1.0F, 2, 1, 3);
        this.CloakTL.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.setRotation(this.CloakTL, 0.1396263F, 0.0F, 0.0F);
        this.Cloak3 = new ModelRenderer(this, 0, 59);
        this.Cloak3.addBox(-4.5F, 17.0F, -3.7F, 9, 4, 1);
        this.Cloak3.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.setRotation(this.Cloak3, 0.4465716F, 0.0F, 0.0F);
        this.CloakTR = new ModelRenderer(this, 0, 43);
        this.CloakTR.addBox(-4.5F, 1.0F, -1.0F, 2, 1, 3);
        this.CloakTR.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.setRotation(this.CloakTR, 0.1396263F, 0.0F, 0.0F);
        this.Cloak1 = new ModelRenderer(this, 0, 47);
        this.Cloak1.addBox(-4.5F, 2.0F, 1.0F, 9, 12, 1);
        this.Cloak1.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.setRotation(this.Cloak1, 0.1396263F, 0.0F, 0.0F);
        this.Cloak2 = new ModelRenderer(this, 0, 59);
        this.Cloak2.addBox(-4.5F, 14.0F, -1.3F, 9, 4, 1);
        this.Cloak2.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.setRotation(this.Cloak2, 0.306945F, 0.0F, 0.0F);
        this.Chestplate = new ModelRenderer(this, 56, 45);
        this.Chestplate.addBox(-4.0F, 1.0F, -3.8F, 8, 7, 2);
        this.ChestOrnament = new ModelRenderer(this, 76, 53);
        this.ChestOrnament.addBox(-2.5F, 3.0F, -4.8F, 5, 5, 1);
        this.ChestClothL = new ModelRenderer(this, 20, 47);
        this.ChestClothL.mirror = true;
        this.ChestClothL.addBox(1.5F, 1.2F, -4.5F, 3, 9, 1);
        this.setRotation(this.ChestClothL, 0.0663225F, 0.0F, 0.0F);
        this.ChestClothR = new ModelRenderer(this, 20, 47);
        this.ChestClothR.addBox(-4.5F, 1.2F, -4.5F, 3, 9, 1);
        this.setRotation(this.ChestClothR, 0.0663225F, 0.0F, 0.0F);
        this.Backplate = new ModelRenderer(this, 36, 45);
        this.Backplate.addBox(-4.0F, 1.0F, 2.0F, 8, 11, 2);
        this.GauntletR = new ModelRenderer(this, 100, 26);
        this.GauntletR.addBox(-3.5F, 3.5F, -2.5F, 2, 6, 5);
        this.GauntletL = new ModelRenderer(this, 114, 26);
        this.GauntletL.addBox(1.5F, 3.5F, -2.5F, 2, 6, 5);
        this.GauntletstrapL1 = new ModelRenderer(this, 84, 31);
        this.GauntletstrapL1.mirror = true;
        this.GauntletstrapL1.addBox(-1.5F, 3.5F, -2.5F, 3, 1, 5);
        this.GauntletstrapL2 = new ModelRenderer(this, 84, 31);
        this.GauntletstrapL2.mirror = true;
        this.GauntletstrapL2.addBox(-1.5F, 6.5F, -2.5F, 3, 1, 5);
        this.GauntletstrapR1 = new ModelRenderer(this, 84, 31);
        this.GauntletstrapR1.addBox(-1.5F, 3.5F, -2.5F, 3, 1, 5);
        this.GauntletstrapR2 = new ModelRenderer(this, 84, 31);
        this.GauntletstrapR2.addBox(-1.5F, 6.5F, -2.5F, 3, 1, 5);
        this.GauntletR2 = new ModelRenderer(this, 102, 37);
        this.GauntletR2.addBox(-5.0F, 3.5F, -2.0F, 1, 5, 4);
        this.setRotation(this.GauntletR2, 0.0F, 0.0F, -0.1675516F);
        this.GauntletL2 = new ModelRenderer(this, 102, 37);
        this.GauntletL2.addBox(4.0F, 3.5F, -2.0F, 1, 5, 4);
        this.setRotation(this.GauntletL2, 0.0F, 0.0F, 0.1675516F);

        // TODO
        this.ShoulderR = new ModelRenderer(this, 56, 35);
        this.ShoulderR.addBox(-3.5F, -2.5F, -2.5F, 5, 5, 5, 0.0F);

        this.ShoulderR1 = new ModelRenderer(this, 0, 0);
        this.ShoulderR1.addBox(-4.3F, -1.5F, -3.0F, 3, 5, 6);
        this.setRotation(this.ShoulderR1, 0.0F, 0.0F, 0.7853982F);
        this.ShoulderR2 = new ModelRenderer(this, 0, 19);
        this.ShoulderR2.addBox(-3.3F, 3.5F, -2.5F, 1, 1, 5);
        this.setRotation(this.ShoulderR2, 0.0F, 0.0F, 0.7853982F);
        this.ShoulderR5 = new ModelRenderer(this, 18, 4);
        this.ShoulderR5.addBox(-2.3F, -1.5F, 3.0F, 1, 6, 1);
        this.setRotation(this.ShoulderR5, 0.0F, 0.0F, 0.7853982F);
        this.ShoulderR3 = new ModelRenderer(this, 0, 11);
        this.ShoulderR3.addBox(-2.3F, 3.5F, -3.0F, 1, 2, 6);
        this.setRotation(this.ShoulderR3, 0.0F, 0.0F, 0.7853982F);
        this.ShoulderR4 = new ModelRenderer(this, 18, 4);
        this.ShoulderR4.addBox(-2.3F, -1.5F, -4.0F, 1, 6, 1);
        this.setRotation(this.ShoulderR4, 0.0F, 0.0F, 0.7853982F);

        // TODO
        this.ShoulderL = new ModelRenderer(this, 56, 35);
        this.ShoulderL.mirror = true;
        this.ShoulderL.addBox(-1.5F, -2.5F, -2.5F, 5, 5, 5, 0.0F);

        this.ShoulderL1 = new ModelRenderer(this, 0, 0);
        this.ShoulderL1.addBox(1.3F, -1.5F, -3.0F, 3, 5, 6);
        this.setRotation(this.ShoulderL1, 0.0F, 0.0F, -0.7853982F);
        this.ShoulderL2 = new ModelRenderer(this, 0, 19);
        this.ShoulderL2.mirror = true;
        this.ShoulderL2.addBox(2.3F, 3.5F, -2.5F, 1, 1, 5);
        this.setRotation(this.ShoulderL2, 0.0F, 0.0F, -0.7853982F);
        this.ShoulderL3 = new ModelRenderer(this, 0, 11);
        this.ShoulderL3.addBox(1.3F, 3.5F, -3.0F, 1, 2, 6);
        this.setRotation(this.ShoulderL3, 0.0F, 0.0F, -0.7853982F);
        this.ShoulderL5 = new ModelRenderer(this, 18, 4);
        this.ShoulderL5.addBox(1.3F, -1.5F, 3.0F, 1, 6, 1);
        this.ShoulderL5.setTextureSize(128, 64);
        this.setRotation(this.ShoulderL5, 0.0F, 0.0F, -0.7853982F);
        this.ShoulderL4 = new ModelRenderer(this, 18, 4);
        this.ShoulderL4.addBox(1.3F, -1.5F, -4.0F, 1, 6, 1);
        this.setRotation(this.ShoulderL4, 0.0F, 0.0F, -0.7853982F);
        this.LegClothR = new ModelRenderer(this, 20, 55);
        this.LegClothR.addBox(0.0F, 0.0F, 0.0F, 3, 8, 1);
        this.LegClothR.setRotationPoint(-4.5F, 10.4F, -3.9F);
        this.setRotation(this.LegClothR, -0.034907F, 0.0F, 0.0F);
        this.LegClothL = new ModelRenderer(this, 20, 55);
        this.LegClothL.mirror = true;
        this.LegClothL.addBox(0.0F, 0.0F, 0.0F, 3, 8, 1);
        this.LegClothL.setRotationPoint(1.5F, 10.4F, -3.9F);
        this.setRotation(this.LegClothL, -0.034907F, 0.0F, 0.0F);
        this.BackpanelR1 = new ModelRenderer(this, 0, 25);
        this.BackpanelR1.addBox(-3.0F, -0.5F, 2.5F, 5, 7, 1);
        this.setRotation(this.BackpanelR1, 0.0698132F, 0.0F, 0.0F);
        this.BackpanelR2 = new ModelRenderer(this, 96, 14);
        this.BackpanelR2.addBox(-3.0F, -0.5F, -2.5F, 5, 3, 5);
        this.setRotation(this.BackpanelR2, 0.0F, 0.0F, 0.1396263F);
        this.BackpanelR3 = new ModelRenderer(this, 116, 13);
        this.BackpanelR3.addBox(-3.0F, 2.5F, -2.5F, 1, 4, 5);
        this.setRotation(this.BackpanelR3, 0.0F, 0.0F, 0.1396263F);
        this.BackpanelR4 = new ModelRenderer(this, 0, 25);
        this.BackpanelR4.mirror = true;
        this.BackpanelR4.addBox(-3.0F, -0.5F, -3.5F, 5, 7, 1);
        this.setRotation(this.BackpanelR4, -0.034907F, 0.0F, 0.0F);
        this.BackpanelL1 = new ModelRenderer(this, 0, 25);
        this.BackpanelL1.addBox(-2.0F, -0.5F, 2.5F, 5, 7, 1);
        this.setRotation(this.BackpanelL1, 0.0698132F, 0.0F, 0.0F);
        this.BackpanelL4 = new ModelRenderer(this, 0, 25);
        this.BackpanelL4.addBox(-2.0F, -0.5F, -3.5F, 5, 7, 1);
        this.setRotation(this.BackpanelL4, -0.034907F, 0.0F, 0.0F);
        this.BackpanelL2 = new ModelRenderer(this, 96, 14);
        this.BackpanelL2.addBox(-2.0F, -0.5F, -2.5F, 5, 3, 5);
        this.setRotation(this.BackpanelL2, 0.0F, 0.0F, -0.1396263F);
        this.BackpanelL3 = new ModelRenderer(this, 116, 13);
        this.BackpanelL3.addBox(2.0F, 2.5F, -2.5F, 1, 4, 5);
        this.setRotation(this.BackpanelL3, 0.0F, 0.0F, -0.1396263F);

        super.bipedHeadwear.cubeList.clear();
        super.bipedHead.cubeList.clear();
        super.bipedHead.addChild(this.Helmet);
        super.bipedBody.cubeList.clear();
        super.bipedRightLeg.cubeList.clear();
        super.bipedLeftLeg.cubeList.clear();
        super.bipedBody.addChild(this.Mbelt);
        super.bipedBody.addChild(this.MbeltL);
        super.bipedBody.addChild(this.MbeltR);

        if (f >= 1.0F) {
            super.bipedBody.addChild(this.BeltL);
            super.bipedBody.addChild(this.BeltR);
            super.bipedBody.addChild(this.Chestplate);
            super.bipedBody.addChild(this.ChestOrnament);
            super.bipedBody.addChild(this.ChestClothR);
            super.bipedBody.addChild(this.ChestClothL);
            super.bipedBody.addChild(this.LegClothR);
            super.bipedBody.addChild(this.LegClothL);
            super.bipedBody.addChild(this.Backplate);
            super.bipedBody.addChild(this.CollarB);
            super.bipedBody.addChild(this.CollarR);
            super.bipedBody.addChild(this.CollarL);
            super.bipedBody.addChild(this.CollarF);
            super.bipedBody.addChild(this.Cloak1);
            super.bipedBody.addChild(this.Cloak2);
            super.bipedBody.addChild(this.Cloak3);
            super.bipedBody.addChild(this.CloakTL);
            super.bipedBody.addChild(this.CloakTR);
        }

        super.bipedRightArm.cubeList.clear();
        super.bipedRightArm.addChild(this.ShoulderR);
        super.bipedRightArm.addChild(this.ShoulderR1);
        super.bipedRightArm.addChild(this.ShoulderR2);
        super.bipedRightArm.addChild(this.ShoulderR3);
        super.bipedRightArm.addChild(this.ShoulderR4);
        super.bipedRightArm.addChild(this.ShoulderR5);
        super.bipedRightArm.addChild(this.GauntletR);
        super.bipedRightArm.addChild(this.GauntletR2);
        super.bipedRightArm.addChild(this.GauntletstrapR1);
        super.bipedRightArm.addChild(this.GauntletstrapR2);

        super.bipedLeftArm.cubeList.clear();
        super.bipedLeftArm.addChild(this.ShoulderL);
        super.bipedLeftArm.addChild(this.ShoulderL1);
        super.bipedLeftArm.addChild(this.ShoulderL2);
        super.bipedLeftArm.addChild(this.ShoulderL3);
        super.bipedLeftArm.addChild(this.ShoulderL4);
        super.bipedLeftArm.addChild(this.ShoulderL5);
        super.bipedLeftArm.addChild(this.GauntletL);
        super.bipedLeftArm.addChild(this.GauntletL2);
        super.bipedLeftArm.addChild(this.GauntletstrapL1);
        super.bipedLeftArm.addChild(this.GauntletstrapL2);

        super.bipedRightLeg.addChild(this.BackpanelR1);
        super.bipedRightLeg.addChild(this.BackpanelR2);
        super.bipedRightLeg.addChild(this.BackpanelR3);
        super.bipedRightLeg.addChild(this.BackpanelR4);

        super.bipedLeftLeg.addChild(this.BackpanelL1);
        super.bipedLeftLeg.addChild(this.BackpanelL2);
        super.bipedLeftLeg.addChild(this.BackpanelL3);
        super.bipedLeftLeg.addChild(this.BackpanelL4);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        if (!(entity instanceof EntitySkeleton) && !(entity instanceof EntityZombie)) {
            this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        } else {
            this.setRotationAnglesZombie(f, f1, f2, f3, f4, f5, entity);
        }

        float a = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
        float b = MathHelper.cos(f * 0.6662F + 3.141593F) * 1.4F * f1;
        float c = Math.min(a, b);
        this.LegClothR.rotateAngleX = a - 0.10472F;
        this.LegClothL.rotateAngleX = b - 0.10472F;
        this.Cloak1.rotateAngleX = -c / 2.0F + 0.1396263F;
        this.Cloak2.rotateAngleX = -c / 2.0F + 0.306945F;
        this.Cloak3.rotateAngleX = -c / 2.0F + 0.4465716F;
        if (super.isChild) {
            float f6 = 2.0F;
            GL11.glPushMatrix();
            GL11.glScalef(1.5F / f6, 1.5F / f6, 1.5F / f6);
            GL11.glTranslatef(0.0F, 16.0F * f5, 0.0F);
            super.bipedHead.render(f5);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glScalef(1.0F / f6, 1.0F / f6, 1.0F / f6);
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
