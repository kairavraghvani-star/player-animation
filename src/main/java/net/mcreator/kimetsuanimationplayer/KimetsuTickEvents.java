package net.mcreator.kimetsuanimationplayer;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

/** Server+client tick logic ported from the original ArmorToughness / Water3Tick / Water5Tick / Sun6Tick procedures. */
@Mod.EventBusSubscriber(modid = KimetsuanimationplayerMod.MODID)
public final class KimetsuTickEvents {
    private KimetsuTickEvents() {}

    @SubscribeEvent
    public static void onLivingTick(LivingEvent.LivingTickEvent event) {
        armorToughness(event.getEntity());
    }

    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
        if (event.phase != TickEvent.Phase.END) return;
        Entity entity = event.player;
        water3Tick(entity);
        water5Tick(entity);
        sun6Tick(entity);
    }

    private static void armorToughness(Entity entity) {
        entity.getPersistentData().putDouble("generic.armorToughness", ((LivingEntity) entity).getAttribute(Attributes.ARMOR_TOUGHNESS).getBaseValue());
    }

    private static void water3Tick(Entity entity) {
        if (entity.getPersistentData().getDouble("breathes") == 603.0) {
            if ((KimetsuAnimationVariables.PlayerAnimeMode % 2.0) == 0.0) {
                KimetsuAnimationVariables.PlayerAnimeCnt = Math.max((KimetsuAnimationVariables.PlayerAnimeCnt - 0.2), 0.0);
            } else {
                KimetsuAnimationVariables.PlayerAnimeCnt = Math.min((KimetsuAnimationVariables.PlayerAnimeCnt + 0.2), 1.0);
            }
        }
    }

    private static void water5Tick(Entity entity) {
        if (entity.getPersistentData().getDouble("breathes") == 605.0) {
            if (KimetsuAnimationVariables.PlayerAnimeFlag) {
                KimetsuAnimationVariables.PlayerAnimeCnt = Math.max((KimetsuAnimationVariables.PlayerAnimeCnt - 0.2), 0.0);
            } else {
                KimetsuAnimationVariables.PlayerAnimeCnt = Math.min((KimetsuAnimationVariables.PlayerAnimeCnt + 0.2), 0.0);
            }
        }
    }

    private static void sun6Tick(Entity entity) {
        double form = 0.0;
        double form2 = 0.0;
        form = 0.0;
        form2 = 0.0;
        if ((entity.getPersistentData().getDouble("breathes") == 1206.0 || (entity.getPersistentData().getDouble("breathes") == 206.0 || (entity.getPersistentData().getDouble("breathes") == 1213.0 && entity.getPersistentData().getDouble("cnt4") == 5.0)))) {
            if ((KimetsuAnimationVariables.PlayerAnimeMode % 2.0) == 0.0) {
                KimetsuAnimationVariables.PlayerAnimeCnt = Math.max((KimetsuAnimationVariables.PlayerAnimeCnt - 0.2), 0.0);
            } else {
                KimetsuAnimationVariables.PlayerAnimeCnt = Math.min((KimetsuAnimationVariables.PlayerAnimeCnt + 0.2), 1.0);
            }
        }
    }

}
