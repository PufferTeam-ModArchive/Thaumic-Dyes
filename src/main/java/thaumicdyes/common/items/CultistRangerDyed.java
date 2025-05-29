package thaumicdyes.common.items;

import java.util.List;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IIcon;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import thaumcraft.api.IGoggles;
import thaumcraft.api.IRepairable;
import thaumcraft.api.IRunicArmor;
import thaumcraft.api.IVisDiscountGear;
import thaumcraft.api.IWarpingGear;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.nodes.IRevealer;
import thaumicdyes.client.models.ModelRanger;

public class CultistRangerDyed extends ItemArmor
    implements IRepairable, IRunicArmor, IVisDiscountGear, IGoggles, IRevealer, IWarpingGear/* , ISpecialArmor */ {

    public IIcon iconHelm;
    public IIcon iconChest;
    public IIcon iconLegs;
    public IIcon iconChestOver;
    public IIcon iconLegsOver;
    public IIcon iconBlank;
    public IIcon iconHelmOver;

    public CultistRangerDyed(ArmorMaterial enumarmormaterial, int j, int k) {
        super(enumarmormaterial, j, k);
        this.setCreativeTab(CreativeTabs.tabCombat);
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister ir) {
        this.iconHelmOver = ir.registerIcon("thaumicdyes:icon/cultist_ranger_helm"); //
        this.iconChestOver = ir.registerIcon("thaumicdyes:icon/cultist_ranger_chest"); //
        this.iconLegsOver = ir.registerIcon("thaumicdyes:icon/cultist_ranger_legs"); //
        this.iconBlank = ir.registerIcon("thaumicdyes:blank");
        this.iconChest = ir.registerIcon("thaumicdyes:blank");
        this.iconLegs = ir.registerIcon("thaumicdyes:blank");
        this.iconHelm = ir.registerIcon("thaumicdyes:blank");
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
        return type == null ? "thaumicdyes:textures/models/cultist_ranger_overlay.png"
            : "thaumicdyes:textures/models/cultist_ranger_base.png";
    }

    @SideOnly(Side.CLIENT)
    public boolean requiresMultipleRenderPasses() {
        return true;
    }

    // helm over
    public IIcon getIconFromDamageForRenderPass(int par1, int par2) {
        return super.armorType == 2 ? this.iconLegsOver
            : (super.armorType == 1 ? this.iconChestOver
                : (super.armorType == 0 ? this.iconHelmOver
                    : (super.armorType == 2 ? this.iconLegs
                        : (super.armorType == 1 ? this.iconChest
                            : (super.armorType == 0 ? this.iconHelm : this.iconBlank)))));
    }

    public EnumRarity getRarity(ItemStack itemstack) {
        return EnumRarity.uncommon;
    }

    public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack) {
        return par2ItemStack.isItemEqual(new ItemStack(Items.iron_ingot)) ? true
            : super.getIsRepairable(par1ItemStack, par2ItemStack);
    }

    /*
     * public void onUpdate(ItemStack stack, World world, Entity entity, int p_77663_4_, boolean p_77663_5_) {
     * super.onUpdate(stack, world, entity, p_77663_4_, p_77663_5_);
     * if(!world.isRemote && stack.isItemDamaged() && entity.ticksExisted % 20 == 0 && entity instanceof
     * EntityLivingBase) {
     * stack.damageItem(-1, (EntityLivingBase)entity);
     * }
     * }
     * public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {
     * super.onArmorTick(world, player, armor);
     * if(!world.isRemote && armor.getItemDamage() > 0 && player.ticksExisted % 20 == 0) {
     * armor.damageItem(-1, player);
     * }
     * }
     */

    public int getRunicCharge(ItemStack itemstack) {
        return 0;
    }

    public int getVisDiscount(ItemStack stack, EntityPlayer player, Aspect aspect) {
        return this.armorType == 0 ? 0 : 2;
    }

    public int getWarp(ItemStack itemstack, EntityPlayer player) {
        return 0;
    }

    ModelBiped model1 = null;
    ModelBiped model2 = null;
    ModelBiped model = null;

    @SideOnly(Side.CLIENT)
    public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, int armorSlot) {
        int type = ((ItemArmor) itemStack.getItem()).armorType;
        if (this.model1 == null) {
            this.model1 = new ModelRanger(1.0F);
        }

        if (this.model2 == null) {
            this.model2 = new ModelRanger(0.5F);
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

    public boolean hasColor(ItemStack par1ItemStack) {
        return true;
    }

    public int getColor(ItemStack par1ItemStack) {
        NBTTagCompound nbttagcompound = par1ItemStack.getTagCompound();
        if (nbttagcompound == null) {
            return 16777215;
        } else {
            NBTTagCompound nbttagcompound1 = nbttagcompound.getCompoundTag("display");
            return nbttagcompound1.hasKey("color") ? nbttagcompound1.getInteger("color")
                : (nbttagcompound1 == null ? 6961280 : 6961280);
        }
    }

    public void removeColor(ItemStack par1ItemStack) {
        NBTTagCompound nbttagcompound = par1ItemStack.getTagCompound();
        if (nbttagcompound != null) {
            NBTTagCompound nbttagcompound1 = nbttagcompound.getCompoundTag("display");
            if (nbttagcompound1.hasKey("color")) {
                nbttagcompound1.removeTag("color");
            }
        }
    }

    public void func_82813_b(ItemStack par1ItemStack, int par2) {
        NBTTagCompound nbttagcompound = par1ItemStack.getTagCompound();
        if (nbttagcompound == null) {
            nbttagcompound = new NBTTagCompound();
            par1ItemStack.setTagCompound(nbttagcompound);
        }

        NBTTagCompound nbttagcompound1 = nbttagcompound.getCompoundTag("display");
        if (!nbttagcompound.hasKey("display")) {
            nbttagcompound.setTag("display", nbttagcompound1);
        }

        nbttagcompound1.setInteger("color", par2);
    }

    /*
     * public ArmorProperties getProperties(EntityLivingBase player, ItemStack armor, DamageSource source, double
     * damage, int slot) {
     * byte priority = 0;
     * double ratio = (double)super.damageReduceAmount / 25.0D;
     * if(source.isMagicDamage()) {
     * priority = 1;
     * ratio = (double)super.damageReduceAmount / 35.0D;
     * } else if(source.isUnblockable()) {
     * priority = 0;
     * ratio = 0.0D;
     * }
     * return new ArmorProperties(priority, ratio, armor.getMaxDamage() + 1 - armor.getItemDamage());
     * }
     * public int getArmorDisplay(EntityPlayer player, ItemStack armor, int slot) {
     * return super.damageReduceAmount;
     * }
     */

    public void damageArmor(EntityLivingBase entity, ItemStack stack, DamageSource source, int damage, int slot) {
        if (source != DamageSource.fall) {
            stack.damageItem(damage, entity);
        }

    }

    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
        if ((stack.hasTagCompound()) && (stack.stackTagCompound.hasKey("mask"))
            && (stack.stackTagCompound.getInteger("mask") == 0)) {
            list.add(EnumChatFormatting.DARK_PURPLE + StatCollector.translateToLocal("item.ItemGoggles.name"));
        }
        if ((stack.hasTagCompound()) && (stack.stackTagCompound.hasKey("mask"))) {
            list.add(
                EnumChatFormatting.GOLD + StatCollector.translateToLocal(
                    new StringBuilder().append("item.HelmetCultistRanger.mask.")
                        .append(stack.stackTagCompound.getInteger("mask"))
                        .toString()));
        }
        if (getVisDiscount(stack, player, null) > 0) {
            list.add(
                EnumChatFormatting.DARK_PURPLE + StatCollector.translateToLocal("tc.visdiscount")
                    + ": "
                    + getVisDiscount(stack, player, null)
                    + "%");
        }
        super.addInformation(stack, player, list, par4);
    }

    public boolean showNodes(ItemStack itemstack, EntityLivingBase player) {
        return ((itemstack.hasTagCompound()) && (itemstack.stackTagCompound.hasKey("mask"))
            && (itemstack.stackTagCompound.getInteger("mask") == 0));
    }

    public boolean showIngamePopups(ItemStack itemstack, EntityLivingBase player) {
        return ((itemstack.hasTagCompound()) && (itemstack.stackTagCompound.hasKey("mask"))
            && (itemstack.stackTagCompound.getInteger("mask") == 0));
    }

    public boolean onItemUseFirst(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side,
        float hitX, float hitY, float hitZ) {
        if (!world.isRemote && world.getBlock(x, y, z) == Blocks.cauldron && world.getBlockMetadata(x, y, z) > 0) {
            this.removeColor(stack);
            world.setBlockMetadataWithNotify(x, y, z, world.getBlockMetadata(x, y, z) - 1, 2);
            world.func_147453_f(x, y, z, Blocks.cauldron);
            return true;
        } else {
            return super.onItemUseFirst(stack, player, world, x, y, z, side, hitX, hitY, hitZ);
        }
    }
}
