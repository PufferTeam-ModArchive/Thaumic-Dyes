package thaumicdyes.common.items.runic;

import java.util.List;
import java.util.UUID;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerEvent.NameFormat;
import thaumcraft.api.IGoggles;
import thaumcraft.api.IVisDiscountGear;
import thaumcraft.api.IWarpingGear;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.nodes.IRevealer;
import thaumcraft.common.config.ConfigItems;
import thaumicdyes.client.models.ModelRobesSpecial;
import thaumicdyes.common.ThaumicDyes;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

//YOU'RE NOT SUPPOSED TO BE IN HERE
//YOU'LL RUIN THE SURPRISE


public class ItemRunicArmorPrimal extends ItemRunicArmor implements IRevealer, IGoggles, IWarpingGear, IVisDiscountGear  {

	public ItemRunicArmorPrimal(ItemArmor.ArmorMaterial enumarmormaterial, int j, int k) {
		super(enumarmormaterial, j, k);
		this.setCreativeTab(ThaumicDyes.tabTD);
		MinecraftForge.EVENT_BUS.register(this);
	}

	
	@Override
    public int getRunicCharge(ItemStack itemstack) {
    	//return (this.armorType == 0) ? itemstack.getMaxDamage() : ((this.armorType == 1) ? itemstack.getMaxDamage() : ((this.armorType == 2) ? itemstack.getMaxDamage() : itemstack.getMaxDamage()));
    	//return 0;
    	//math wasn't behaving, so values are manual
    	if ( (getUpgrade(itemstack) == 2) 
			|| (getUpgrade2(itemstack) == 2)
    		|| (getUpgrade3(itemstack) == 2)  )
    	{
    		if ( (getUpgrade(itemstack) == 2) && (getUpgrade2(itemstack) == 2) 
	    		|| (getUpgrade(itemstack) == 2) && (getUpgrade3(itemstack) == 2)
	    		|| (getUpgrade2(itemstack) == 2) && (getUpgrade3(itemstack) == 2)  )
	    	{
    			if ( (getUpgrade(itemstack) == 2) && (getUpgrade2(itemstack) == 2) && (getUpgrade3(itemstack) == 2) ) 
    			{
    				return (this.armorType == 0) ?  20 : ((this.armorType == 1) ? 60 : ((this.armorType == 2) ? 40 : 20 )); //140 total. what madman would actually do this?
    			}
    			
    			else {
    				return (this.armorType == 0) ?  16 : ((this.armorType == 1) ? 48 : ((this.armorType == 2) ? 32 : 16 )); //112 total
    			}
	    	}
    		else {
    			return (this.armorType == 0) ?  12 : ((this.armorType == 1) ? 36 : ((this.armorType == 2) ? 24 : 12 )); //84 total
    		}	
  	  }
    	return (this.armorType == 0) ? 8 : ((this.armorType == 1) ? 24 : ((this.armorType == 2) ? 16 : 8 )); //56 total
	}
	
	
	
	
	@Override
	public ArmorProperties getProperties(EntityLivingBase player, ItemStack armor, DamageSource source, double damage, int slot)
	{
		int priority = 0;
		double ratio = this.damageReduceAmount / 25.0D;
	      
		/*
	    if (getUpgrade(armor) == 5 || getUpgrade2(armor) == 5 || getUpgrade3(armor) == 5) {
		    if ( (getUpgrade(armor) == 5 && getUpgrade2(armor) == 5) 
		    	|| (getUpgrade(armor) == 5 && getUpgrade3(armor) == 5) 
		    	|| (getUpgrade2(armor) == 5 && getUpgrade3(armor) == 5) )
		    {
		    	priority = 1;
		        ratio = this.damageReduceAmount / 8.3D; //more classic manual values, 25/3
		        
		        //I'm limiting this to only a max of 8 upgrades total, because the higher level 25/4 one 
		        //basically made the player invincible. 
		        //Primal's higher base armour (if I keep it, keep changing my mind) should discourage people from stacking this one anyway
		    }
		    else {
		    	priority = 1;
		        ratio = this.damageReduceAmount / 12.5D;
		    }
	    }*/
	    
	    if (source.isUnblockable())
	      {
	        priority = 0;
	        ratio = 0.0D;
	      }
	    return new ArmorProperties(priority, ratio, armor.getMaxDamage() + 1 - armor.getItemDamage());
	}
	  
	
	@Override
	public int getArmorDisplay(EntityPlayer player, ItemStack armor, int slot) {
	    int dra = ((ItemArmor)armor.getItem()).damageReduceAmount;
	    /*
	    if (getUpgrade(armor) == 5 || getUpgrade2(armor) == 5 || getUpgrade3(armor) == 5) {
		    if ( (getUpgrade(armor) == 5 && getUpgrade2(armor) == 5)
	    		|| (getUpgrade(armor) == 5 && getUpgrade3(armor) == 5)
	    		|| (getUpgrade2(armor) == 5 && getUpgrade3(armor) == 5) )
		    {
		    	dra *= 3;
		    }
		    else {
		    	dra *= 2;
		    }
	    }*/
		return dra;
	}
	

	@Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4)
    {
	    //list.add(EnumChatFormatting.GOLD + StatCollector.translateToLocal("item.runic.charge") + ": " + (stack.getMaxDamage() - stack.getItemDamage()) + "/" + stack.getMaxDamage());
	    
		int u = getUpgrade(stack);
	    if (u > 0) {
	      list.add(EnumChatFormatting.DARK_AQUA + StatCollector.translateToLocal(new StringBuilder().append("item.runic.upgrade.").append(u).toString()) );
	    } else { list.add(EnumChatFormatting.DARK_GRAY + StatCollector.translateToLocal(new StringBuilder().append("item.runic.upgrade.").append(u).toString()) );
	    }
	    u = getUpgrade2(stack);
	    if (u > 0) {
	      list.add(EnumChatFormatting.DARK_AQUA + StatCollector.translateToLocal(new StringBuilder().append("item.runic.upgrade.").append(u).toString()) );
	    }else { list.add(EnumChatFormatting.DARK_GRAY + StatCollector.translateToLocal(new StringBuilder().append("item.runic.upgrade.").append(u).toString()) );
	    }
	    u = getUpgrade3(stack);
	    if (u > 0) {
	      list.add(EnumChatFormatting.DARK_AQUA + StatCollector.translateToLocal(new StringBuilder().append("item.runic.upgrade.").append(u).toString()) );
	    }else { list.add(EnumChatFormatting.DARK_GRAY + StatCollector.translateToLocal(new StringBuilder().append("item.runic.upgrade.").append(u).toString()) );
	    }
	    
    	if (getVisDiscount(stack, player, null) > 0) {
    		list.add(EnumChatFormatting.DARK_PURPLE + StatCollector.translateToLocal("tc.visdiscount") + ": " + getVisDiscount(stack, player, null) + "%");
    	}

    }
	
	
	public static int getUpgrade(ItemStack armor)
	{
	    if ((armor.hasTagCompound()) && (armor.stackTagCompound.hasKey("upgrade"))) {
	    	return armor.stackTagCompound.getByte("upgrade");
		}
		return 0;
	}
	public static int getUpgrade2(ItemStack armor)
	{
	    if ((armor.hasTagCompound()) && (armor.stackTagCompound.hasKey("upgrade2"))) {
	    	return armor.stackTagCompound.getByte("upgrade2");
		}
		return 0;
	}
	public static int getUpgrade3(ItemStack armor)
	{
	    if ((armor.hasTagCompound()) && (armor.stackTagCompound.hasKey("upgrade3"))) {
	    	return armor.stackTagCompound.getByte("upgrade3");
		}
		return 0;
	}
	
	
	
	@Override
	public EnumRarity getRarity(ItemStack itemstack)
	{
		return EnumRarity.epic; //
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister ir)
	{
		this.iconHelm = ir.registerIcon("thaumicdyes:runicHelmPrimal");
	    this.iconChest = ir.registerIcon("thaumicdyes:runicChestPrimal");
	    this.iconLegs = ir.registerIcon("thaumicdyes:runicLegsPrimal");
	    //this.iconBoots = ir.registerIcon("thaumicdyes:runicBootsPrimal");
	}
	  
	
    public boolean onItemUse(ItemStack item, EntityPlayer player, World world, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
    {
    	
    	if (this.getUpgrade(item) > 0 || this.getUpgrade2(item) > 0 || this.getUpgrade3(item) > 0) {
    		int u1 = this.getUpgrade(item);
    		int u2 = this.getUpgrade2(item);
    		int u3 = this.getUpgrade3(item);
    		item.stackTagCompound.setByte("upgrade",(byte) u2);
    		item.stackTagCompound.setByte("upgrade2",(byte) u3);
    		item.stackTagCompound.setByte("upgrade3",(byte) u1);
    		return true;
    	}
    	return false;
    }
    
    public int getVisDiscount(ItemStack stack, EntityPlayer player, Aspect aspect)
    {
        //return this.armorType == 3 ? 1 : 2;
    	return 5;
    }
    
    public int getWarp(ItemStack itemstack, EntityPlayer player)
    {
      return 3;
    }

	@Override
	public boolean showIngamePopups(ItemStack itemstack, EntityLivingBase player) {
		return true;
	}
	
	@Override
	public boolean showNodes(ItemStack itemstack, EntityLivingBase player) {
		return true;
	}
	
	@SubscribeEvent  
	public void nameFormatEvent(NameFormat event) {
		if (event.entity instanceof EntityPlayer) {
			final EntityPlayer player = (EntityPlayer)event.entity;
			int set = 0;
			
			for (int a = 0; a < 4; a++) {
			    if (player.inventory.armorItemInSlot(a) != null 
		    		&& (player.inventory.armorItemInSlot(a).getItem() instanceof ItemRunicArmorPrimal) )  
			    {
			    	set++;
			    }
			}
			if(set == 4 && player.inventory.hasItemStack(new ItemStack(ConfigItems.itemEldritchObject, 1, 3))) {
				//event.displayname = player.getCommandSenderName()+StatCollector.translateToLocal("tdyes.nameAppend");
				event.displayname = player.getCommandSenderName()+" the Warped";
				//player.refreshDisplayName(); //errors out
			} 
		}
    }
	
	//trying to get a knockback resistance mod to work
	//thanks TBases for that, botania one was shit for that, but odin code for health boost is good
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Multimap getAttributeModifiers(ItemStack armor)
    {
    	HashMultimap map = HashMultimap.create();
    	final UUID uuid = new UUID(this.getUnlocalizedName().hashCode(), 0L);
    	
    	if (getUpgrade(armor) == 7 || getUpgrade2(armor) == 7 || getUpgrade3(armor) == 7) {
			map.put(SharedMonsterAttributes.knockbackResistance.getAttributeUnlocalizedName(), 
					new AttributeModifier(uuid, "Runic knockback " + aType, 0.2, 0));
		}
		if (getUpgrade(armor) == 8 || getUpgrade2(armor) == 8 || getUpgrade3(armor) == 8) {
			map.put(SharedMonsterAttributes.maxHealth.getAttributeUnlocalizedName(), 
					new AttributeModifier(uuid, "Runic vitality", 10, 0));;
		}
		if (this.armorType == 3) { 
			if (getUpgrade(armor) == 9 || getUpgrade2(armor) == 9  || getUpgrade3(armor) == 9 ) {
				map.put(SharedMonsterAttributes.movementSpeed.getAttributeUnlocalizedName(), 
						new AttributeModifier(uuid, "Runic speed", 0.03, 0)); //haste1/2/3 is 0.015/0.03/0.045
			}
		}
		if (getUpgrade(armor) == 10 || getUpgrade2(armor) == 10 || getUpgrade3(armor) == 10) {
			map.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), 
					new AttributeModifier(uuid, "Runic ravager", 2, 0));;
		}
		
		
    	//map.put(SharedMonsterAttributes.knockbackResistance.getAttributeUnlocalizedName(),new AttributeModifier(uuid, "Runic knockback", this.getArmorDisplay(null, armor, aType) / 20.0, 0)); 
		//this one scales with Hardened effect, but starts lower. Keeping it for reference
		
    	return map;
    }
	
	
	ModelBiped model1 = null;
	ModelBiped model2 = null;
   	ModelBiped model = null;
   	
   	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
   		if (entity instanceof EntityPlayer) {
   			final EntityPlayer player = (EntityPlayer)entity;
   			if (player.getUniqueID().toString() == "8c3dbe36-8161-4207-a2d6-e303dfe260ba") { //because dev perks. purely asstheticc
   				return "thaumicdyes:textures/models/guardian_robe_armor_warden1.png";
   			}
   			if (player.inventory.hasItemStack(new ItemStack(ConfigItems.itemEldritchObject, 1, 0))) {
   				if (player.inventory.hasItemStack(new ItemStack(ConfigItems.itemEldritchObject, 1, 3))) {
   					if (checkHardened(stack)) {
   						return "thaumicdyes:textures/models/guardian_robe_armor_warden.png";
   					}
   	   				return "thaumicdyes:textures/models/guardian_robe_armor_warden_t.png";
   	   			}
   				if (checkHardened(stack)) {
   					return "thaumicdyes:textures/models/guardian_robe_armor1.png";
				}
   				return "thaumicdyes:textures/models/guardian_robe_armor1_t.png";
   			}
   		}
   		if (checkHardened(stack)) {
   			return "thaumicdyes:textures/models/guardian_robe_armor.png";
		}
        return "thaumicdyes:textures/models/guardian_robe_armor_t.png";
        
        /*
         * /guardian_robe_armor - flat
         * /guardian_robe_armor1 - 60% opacity
         * /guardian_robe_armor2 - 60%, warden cloth and metal changes only, no eyes
         * /guardian_robe_armor_warden - flat
         * /guardian_robe_armor_warden1 - 60% opacity
         * 
         * armor1 is the prefered one, flat ones are just for testing
         */
     }
	
	@SideOnly(Side.CLIENT)
	   public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, int armorSlot) {
	      int type = ((ItemArmor)itemStack.getItem()).armorType;
	      if(this.model1 == null) {
	         this.model1 = new ModelRobesSpecial(1.0F);
	      }

	      if(this.model2 == null) {
	         this.model2 = new ModelRobesSpecial(0.5F);
	      }

	      if(type != 1 && type != 3) {
	         this.model = this.model2;
	      } else {
	         this.model = this.model1;
	      }

	      if(this.model != null) {
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
	         this.model.heldItemRight = entityLiving.getHeldItem() != null?1:0;
	         if(entityLiving instanceof EntityPlayer && ((EntityPlayer)entityLiving).getItemInUseDuration() > 0) {
	            EnumAction enumaction = ((EntityPlayer)entityLiving).getItemInUse().getItemUseAction();
	            if(enumaction == EnumAction.block) {
	               this.model.heldItemRight = 3;
	            } else if(enumaction == EnumAction.bow) {
	               this.model.aimedBow = true;
	            }
	         }
	      }

	      return this.model;
	   }
	
	public static boolean checkHardened(ItemStack armor) {
		
		if (getUpgrade(armor) == 5 || getUpgrade2(armor) == 5 || getUpgrade3(armor) == 5) {
			return true;
		}
		return false;
	}
	
	public boolean isBookEnchantable(final ItemStack armor, final ItemStack book) {
		if (checkHardened(armor)) {
			return true;
		}
        return false;
    }
	
	public boolean isItemTool(ItemStack armor) {
		if (checkHardened(armor)) {
			return true;
		}
        return false;
    }
	
	
	//put a check in - if armour has enchants but not hardened, wipe enchants
	public void onUpdate(ItemStack stack, World world, Entity entity, int par4, boolean par5) {
		//stack.hasTagCompound();
		//stack.isItemEnchanted();
		if ( !checkHardened(stack) && stack.isItemEnchanted() ) {
			stack.stackTagCompound.removeTag("ench");
		}
		
	}

}