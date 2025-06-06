package thaumicdyes.common.items;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.IIcon;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import thaumcraft.api.IRepairable;
import thaumcraft.api.IRunicArmor;
import thaumicdyes.client.models.ModelArcher;

public class CultistArcher extends ItemArmor implements IRepairable, IRunicArmor/* , ISpecialArmor */ {

    public IIcon iconHelm;
    public IIcon iconChest;
    public IIcon iconLegs;
    ModelBiped model1 = null;
    ModelBiped model2 = null;
    ModelBiped model = null;

    public CultistArcher(ArmorMaterial enumarmormaterial, int j, int k) {
        super(enumarmormaterial, j, k);
        this.setCreativeTab(CreativeTabs.tabCombat);
    }

    @SideOnly(Side.CLIENT) // replace all these
    public void registerIcons(IIconRegister ir) {
        this.iconHelm = ir.registerIcon("thaumicdyes:icon/cultist_archer_helm");
        this.iconChest = ir.registerIcon("thaumcraft:cultistplatechest");
        this.iconLegs = ir.registerIcon("thaumcraft:cultistplatelegs");
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
        // return type ==
        // null?"thaumicdyes:textures/models/cultist_plate_armor_overlay.png":"thaumicdyes:textures/models/cultist_plate_armor.png";
        return "thaumicdyes:textures/models/cultist_archer_armor.png";
    }// replace

    @SideOnly(Side.CLIENT)
    public IIcon getIconFromDamage(int par1) {
        return this.armorType == 1 ? this.iconChest : this.armorType == 0 ? this.iconHelm : this.iconLegs;
    }

    public EnumRarity getRarity(ItemStack itemstack) {
        return EnumRarity.uncommon;
    }

    public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack) {
        return par2ItemStack.isItemEqual(new ItemStack(Items.iron_ingot)) ? true
            : super.getIsRepairable(par1ItemStack, par2ItemStack);
    }

    public int getRunicCharge(ItemStack itemstack) {
        return 0;
    }

    @SideOnly(Side.CLIENT)
    public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, int armorSlot) {
        int type = ((ItemArmor) itemStack.getItem()).armorType;
        if (this.model1 == null) {
            this.model1 = new ModelArcher(1.0F);
        }

        if (this.model2 == null) {
            this.model2 = new ModelArcher(0.5F);
        }

        if (type != 1 && type != 3) {
            this.model = this.model2;
        } else {
            this.model = this.model1;
        }

        if (this.model != null) {
            this.model.bipedHead.showModel = armorSlot == 0;
            this.model.bipedHeadwear.showModel = armorSlot == 0;
            this.model.bipedBody.showModel = armorSlot == 1 || armorSlot == 2;
            this.model.bipedRightArm.showModel = armorSlot == 1;
            this.model.bipedLeftArm.showModel = armorSlot == 1;
            this.model.bipedRightLeg.showModel = armorSlot == 2;
            this.model.bipedLeftLeg.showModel = armorSlot == 2;
            this.model.isSneak = entityLiving.isSneaking();
            this.model.isRiding = entityLiving.isRiding();
            this.model.isChild = entityLiving.isChild();
            this.model.aimedBow = false;
            this.model.heldItemRight = entityLiving.getHeldItem() != null ? 1 : 0;
            if (entityLiving instanceof EntityPlayer && ((EntityPlayer) entityLiving).getItemInUseDuration() > 0) {
                EnumAction enumaction = ((EntityPlayer) entityLiving).getItemInUse()
                    .getItemUseAction();
                if (enumaction == EnumAction.block) {
                    this.model.heldItemRight = 3;
                } else if (enumaction == EnumAction.bow) {
                    this.model.aimedBow = true;
                }
            }
        }

        return this.model;
    }

    public void damageArmor(EntityLivingBase entity, ItemStack stack, DamageSource source, int damage, int slot) {
        if (source != DamageSource.fall) {
            stack.damageItem(damage, entity);
        }

    }

}
