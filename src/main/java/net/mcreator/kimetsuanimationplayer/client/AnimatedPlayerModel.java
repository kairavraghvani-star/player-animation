package net.mcreator.kimetsuanimationplayer.client;

import net.minecraft.client.model.PlayerModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.player.AbstractClientPlayer;

/**
 * Replacement for Obfuscate's PlayerModelEvent.SetupAngles.Post: runs the Kimetsu poses
 * right after vanilla has set up the player's limb angles.
 */
public class AnimatedPlayerModel extends PlayerModel<AbstractClientPlayer> {
    public AnimatedPlayerModel(ModelPart root, boolean slim) {
        super(root, slim);
    }

    @Override
    public void setupAnim(AbstractClientPlayer entity, float limbSwing, float limbSwingAmount,
                          float ageInTicks, float netHeadYaw, float headPitch) {
        super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        KimetsuAnimations.apply(entity, this);
        // keep the skin overlay layers glued to the (possibly moved) base parts, as vanilla does
        this.hat.copyFrom(this.head);
        this.jacket.copyFrom(this.body);
        this.leftPants.copyFrom(this.leftLeg);
        this.rightPants.copyFrom(this.rightLeg);
        this.leftSleeve.copyFrom(this.leftArm);
        this.rightSleeve.copyFrom(this.rightArm);
    }
}
