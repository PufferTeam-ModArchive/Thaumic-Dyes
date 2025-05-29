package thaumicdyes.common.lib.event;

import java.util.List;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraftforge.event.entity.living.LivingEvent;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.network.internal.FMLProxyPacket;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufOutputStream;
import io.netty.buffer.Unpooled;
import thaumcraft.client.fx.bolt.FXLightningBolt;
import thaumicdyes.common.ThaumicDyes;
import thaumicdyes.common.items.ItemHandler;

public class EventHandlerTXMask {

    private EntityLivingBase target;
    private MovingObjectPosition objectMouseOver;
    private Entity pointedEntity;
    private EntityLivingBase pointedEntityLiving;
    private EntityLivingBase lastPointedEntityLiving;
    private int watchTicks = 0;
    public static int ticks = 0;

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public void tickStart(final LivingEvent.LivingUpdateEvent event) {
        ticks++;
        if (event.entity instanceof EntityPlayer) {

            final EntityPlayer player = (EntityPlayer) event.entity;
            ItemStack item = player.inventory.armorItemInSlot(3);
            /*
             * if ((player.inventory.armorItemInSlot(0) != null) &&
             * (player.inventory.armorItemInSlot(0).getItem() == ThaumicExploration.bootsMeteor)) {
             * }
             */
            if (item != null) {
                if (item.getItem() == ItemHandler.itemHelmetMaskTX) {
                    this.lastPointedEntityLiving = pointedEntityLiving;
                    this.getMouseOver(0L);
                    if (this.pointedEntityLiving != null) {

                        if (this.pointedEntityLiving != this.lastPointedEntityLiving) {
                            this.watchTicks = 0;
                        }
                        //
                        /*
                         * if (player.worldObj.rand.nextInt(2) == 0) {
                         * FXBoreParticles fb = new FXBoreParticles(player.worldObj, this.pointedEntityLiving.posX,
                         * this.pointedEntityLiving.boundingBox.maxY - 0.5F, this.pointedEntityLiving.posZ, player.posX,
                         * player.boundingBox.minY + player.height / 2.0F + 0.25D, player.posZ, Items.coal,
                         * player.worldObj.rand.nextInt(6), 3);
                         * fb.setAlphaF(0.3F);
                         * fb.motionX = ((float)player.worldObj.rand.nextGaussian() * 0.03F);
                         * fb.motionY = ((float)player.worldObj.rand.nextGaussian() * 0.03F);
                         * fb.motionZ = ((float)player.worldObj.rand.nextGaussian() * 0.03F);
                         * FMLClientHandler.instance().getClient().effectRenderer.addEffect(fb);
                         * }
                         * else
                         * {
                         * FXBoreSparkle fb = new FXBoreSparkle(player.worldObj, this.pointedEntityLiving.posX,
                         * this.pointedEntityLiving.boundingBox.maxY - 0.5F, this.pointedEntityLiving.posZ, player.posX,
                         * player.boundingBox.minY + player.height / 2.0F + 0.25D, player.posZ);
                         * fb.setRBGColorF(0.4F +player.worldObj.rand.nextFloat() * 0.2F, 0.2F, 0.6F +
                         * player.worldObj.rand.nextFloat() * 0.3F);
                         * FMLClientHandler.instance().getClient().effectRenderer.addEffect(fb);
                         * }
                         */
                        //

                        this.watchTicks += 1;
                        if (this.watchTicks > 0) {
                            if (this.watchTicks % 5 == 0) {
                                float offset = 0.0F;
                                if (Minecraft.getMinecraft().gameSettings.thirdPersonView == 0) offset = 0.3F;
                                FXLightningBolt bolt = new FXLightningBolt(
                                    player.worldObj,
                                    player.posX,
                                    player.boundingBox.minY + player.height / 2.0F + 0.75D - offset,
                                    player.posZ,
                                    this.pointedEntityLiving.posX,
                                    this.pointedEntityLiving.boundingBox.maxY - 0.5F,
                                    this.pointedEntityLiving.posZ,
                                    player.worldObj.rand.nextLong(),
                                    6,
                                    0.5F,
                                    5);
                                bolt.defaultFractal();
                                bolt.setType(5);
                                bolt.setWidth(0.125F);
                                bolt.finalizeBolt();

                                ByteBuf buf = Unpooled.buffer();
                                ByteBufOutputStream out = new ByteBufOutputStream(buf);

                                // System.out.println("bolt test");

                                try {
                                    out.writeByte(2);
                                    out.writeInt(Minecraft.getMinecraft().thePlayer.worldObj.provider.dimensionId);
                                    out.writeInt(this.pointedEntityLiving.getEntityId());
                                    out.writeInt(Minecraft.getMinecraft().thePlayer.getEntityId());
                                    FMLProxyPacket packet = new FMLProxyPacket(buf, "tDyes");
                                    ThaumicDyes.channel.sendToServer(packet);
                                    out.close();

                                    // System.out.println("packet test");
                                } catch (Exception ex) {
                                    ex.printStackTrace();
                                }
                            }

                        } else {
                            if (this.watchTicks % 5 == 0) {
                                float offset = 0.0F;
                                if (Minecraft.getMinecraft().gameSettings.thirdPersonView == 0) offset = 0.3F;
                                FXLightningBolt bolt = new FXLightningBolt(
                                    player.worldObj,
                                    player.posX,
                                    player.boundingBox.minY + player.height / 2.0F + 0.75D - offset,
                                    player.posZ,
                                    this.pointedEntityLiving.posX,
                                    this.pointedEntityLiving.boundingBox.maxY - 0.5F,
                                    this.pointedEntityLiving.posZ,
                                    player.worldObj.rand.nextLong(),
                                    6,
                                    0.5F,
                                    5);
                                bolt.defaultFractal();
                                bolt.setType(5);
                                bolt.setWidth(0.0625F);
                                bolt.finalizeBolt();

                                // System.out.println("3p test");
                            }
                        }
                    } else {
                        this.watchTicks = 0;
                    }
                }
            }
        }

    }

    public void getMouseOver(float par1) {
        if (Minecraft.getMinecraft().renderViewEntity != null) {
            if (Minecraft.getMinecraft().theWorld != null) {
                this.pointedEntityLiving = null;
                double d0 = 24.0F;
                this.objectMouseOver = Minecraft.getMinecraft().renderViewEntity.rayTrace(d0, par1);
                double d1 = d0;
                Vec3 vec3 = Minecraft.getMinecraft().renderViewEntity.getPosition(par1);

                if (this.objectMouseOver != null) {
                    d1 = this.objectMouseOver.hitVec.distanceTo(vec3);
                }

                Vec3 vec31 = Minecraft.getMinecraft().renderViewEntity.getLook(par1);
                Vec3 vec32 = vec3.addVector(vec31.xCoord * d0, vec31.yCoord * d0, vec31.zCoord * d0);
                this.pointedEntity = null;
                float f1 = 1.0F;
                List list = Minecraft.getMinecraft().theWorld.getEntitiesWithinAABBExcludingEntity(
                    Minecraft.getMinecraft().renderViewEntity,
                    Minecraft.getMinecraft().renderViewEntity.boundingBox
                        .addCoord(vec31.xCoord * d0, vec31.yCoord * d0, vec31.zCoord * d0)
                        .expand((double) f1, (double) f1, (double) f1));
                double d2 = d1;

                for (int i = 0; i < list.size(); ++i) {
                    Entity entity = (Entity) list.get(i);

                    if (entity.canBeCollidedWith()) {
                        float f2 = entity.getCollisionBorderSize();
                        AxisAlignedBB axisalignedbb = entity.boundingBox.expand((double) f2, (double) f2, (double) f2);
                        MovingObjectPosition movingobjectposition = axisalignedbb.calculateIntercept(vec3, vec32);

                        if (axisalignedbb.isVecInside(vec3)) {
                            if (0.0D < d2 || d2 == 0.0D) {
                                this.pointedEntity = entity;
                                d2 = 0.0D;
                            }
                        } else if (movingobjectposition != null) {
                            double d3 = vec3.distanceTo(movingobjectposition.hitVec);

                            if (d3 < d2 || d2 == 0.0D) {
                                if (entity == Minecraft.getMinecraft().renderViewEntity.ridingEntity
                                    && !entity.canRiderInteract()) {
                                    if (d2 == 0.0D) {
                                        this.pointedEntity = entity;
                                    }
                                } else {
                                    this.pointedEntity = entity;
                                    d2 = d3;
                                }
                            }
                        }
                    }
                }

                if (this.pointedEntity != null && (d2 < d1 || this.objectMouseOver == null)) {
                    this.objectMouseOver = new MovingObjectPosition(this.pointedEntity);

                    if (this.pointedEntity instanceof EntityLivingBase) {
                        this.pointedEntityLiving = (EntityLivingBase) this.pointedEntity;
                    }
                }
            }
        }
    }

}
