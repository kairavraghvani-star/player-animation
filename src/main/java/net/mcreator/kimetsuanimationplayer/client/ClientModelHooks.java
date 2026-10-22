package net.mcreator.kimetsuanimationplayer.client;

import net.mcreator.kimetsuanimationplayer.KimetsuanimationplayerMod;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.player.PlayerRenderer;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/** Swaps the model of the default/slim player renderers for {@link AnimatedPlayerModel}. */
@Mod.EventBusSubscriber(modid = KimetsuanimationplayerMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public final class ClientModelHooks {
    private ClientModelHooks() {}

    private static Field modelField;

    @SubscribeEvent
    public static void onAddLayers(EntityRenderersEvent.AddLayers event) {
        for (String skin : event.getSkins()) {
            EntityRenderer<? extends Player> renderer = event.getSkin(skin);
            if (renderer instanceof PlayerRenderer playerRenderer) {
                install(playerRenderer, "slim".equals(skin), event.getEntityModels());
            }
        }
    }

    private static void install(PlayerRenderer renderer, boolean slim, EntityModelSet models) {
        try {
            if (modelField == null) {
                // located by type, so it works regardless of mapping names
                for (Field f : LivingEntityRenderer.class.getDeclaredFields()) {
                    if (!Modifier.isStatic(f.getModifiers()) && EntityModel.class.isAssignableFrom(f.getType())) {
                        f.setAccessible(true);
                        modelField = f;
                        break;
                    }
                }
            }
            if (modelField == null) throw new IllegalStateException("model field not found");
            modelField.set(renderer, new AnimatedPlayerModel(
                    models.bakeLayer(slim ? ModelLayers.PLAYER_SLIM : ModelLayers.PLAYER), slim));
        } catch (Exception e) {
            KimetsuanimationplayerMod.LOGGER.error("Could not install Kimetsu animation model", e);
        }
    }
}
