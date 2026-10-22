package net.mcreator.kimetsuanimationplayer.client;

import net.minecraft.client.model.PlayerModel;
import net.minecraft.world.entity.Entity;
import net.mcreator.kimetsuanimationplayer.KimetsuAnimationVariables;

/**
  * All player-pose animations, ported from the 1.16.5 MCreator procedures.
  * Client side only (references PlayerModel). Call order == original MCreator element order.
  */
public final class KimetsuAnimations {
    private KimetsuAnimations() {}

    public static void apply(Entity entity, PlayerModel<?> playerModel) {
        deathDemon(entity, playerModel);
        water1(entity, playerModel);
        water2(entity, playerModel);
        water3(entity, playerModel);
        water4(entity, playerModel);
        water5(entity, playerModel);
        water6(entity, playerModel);
        water7(entity, playerModel);
        water8(entity, playerModel);
        water9(entity, playerModel);
        water10(entity, playerModel);
        thunder1(entity, playerModel);
        compassNeedle(entity, playerModel);
        rotatingCircularSlashesFlyingBloodScythes(entity, playerModel);
        cuttingThreadRotation(entity, playerModel);
        diceSteakSenior(entity, playerModel);
        airType(entity, playerModel);
        disorder(entity, playerModel);
        wind1(entity, playerModel);
        wind2(entity, playerModel);
        wind3(entity, playerModel);
        wind4(entity, playerModel);
        wind5(entity, playerModel);
        wind6(entity, playerModel);
        wind7(entity, playerModel);
        wind8(entity, playerModel);
        wind9(entity, playerModel);
        sun1(entity, playerModel);
        sun2(entity, playerModel);
        sun3(entity, playerModel);
        sun4(entity, playerModel);
        sun5(entity, playerModel);
        sun6(entity, playerModel);
        sun7(entity, playerModel);
        sun8(entity, playerModel);
        sun9(entity, playerModel);
        sun10(entity, playerModel);
        sun11(entity, playerModel);
        sun12(entity, playerModel);
        flame1(entity, playerModel);
        flame2(entity, playerModel);
        flame3(entity, playerModel);
        flame4(entity, playerModel);
        flame5(entity, playerModel);
        flame9(entity, playerModel);
        thunder7(entity, playerModel);
        thunder2(entity, playerModel);
        thunder3(entity, playerModel);
        flower1(entity, playerModel);
        flower2(entity, playerModel);
        flower3(entity, playerModel);
        flower4(entity, playerModel);
        flower5(entity, playerModel);
        beast1(entity, playerModel);
        beast2(entity, playerModel);
        beast3(entity, playerModel);
        beast4(entity, playerModel);
        beast5(entity, playerModel);
        mist1(entity, playerModel);
        mist2(entity, playerModel);
        mist3(entity, playerModel);
        mist4(entity, playerModel);
        mist5(entity, playerModel);
        mist6(entity, playerModel);
    }

    // original procedure: DeathDemonProcedure
    private static void deathDemon(Entity entity, PlayerModel<?> playerModel) {
        double form = 0.0;
        form = 0.0;
        if ((!entity.isAlive() && entity.getPersistentData().getBoolean("oni"))) {
            playerModel.head.xRot = (playerModel.head.xRot * -1.0f);
            playerModel.head.y = (playerModel.head.y - 4.0f);
        }
    }

    // original procedure: Water1Procedure
    private static void water1(Entity entity, PlayerModel<?> playerModel) {
        double form = 0.0;
        double form2 = 0.0;
        form = 0.0;
        form2 = 0.0;
        if (entity.getPersistentData().getDouble("breathes") == 601.0) {
            form = Math.min((entity.getPersistentData().getDouble("cnt1") * 0.5), 1.0);
            form2 = Math.min((Math.max((entity.getPersistentData().getDouble("cnt1") - 1.0), 0.0) * 0.2), 1.0);
            playerModel.rightArm.xRot = (float)((Math.toRadians(-125.0) * form) + (Math.toRadians(145.0) * form2));
            playerModel.rightArm.yRot = (float)((Math.toRadians(-45.0) * form) + (Math.toRadians(45.0) * form2));
            playerModel.rightArm.zRot = (float)((Math.toRadians(45.0) * form) + (Math.toRadians(25.0) * form2));
            playerModel.leftArm.xRot = (float)((Math.toRadians(-100.0) * form) + (Math.toRadians(120.0) * form2));
            playerModel.leftArm.yRot = (float)((Math.toRadians(45.0) * form) + (Math.toRadians(-45.0) * form2));
            playerModel.leftArm.zRot = (float)((Math.toRadians(-45.0) * form) + (Math.toRadians(-25.0) * form2));
        }
    }

    // original procedure: Water2Procedure
    private static void water2(Entity entity, PlayerModel<?> playerModel) {
        double cnt_test = 0.0;
        cnt_test = 0.0;
        if (((entity.getPersistentData().getDouble("breathes") == 602.0 || entity.getPersistentData().getDouble("breathes") == 1201.0 || entity.getPersistentData().getDouble("breathes") == 201.0 || entity.getPersistentData().getDouble("breathes") == 1210.0 || entity.getPersistentData().getDouble("breathes") == 210.0) || (entity.getPersistentData().getDouble("breathes") == 1213.0 && (entity.getPersistentData().getDouble("cnt4") == 0.0 || entity.getPersistentData().getDouble("cnt4") == 9.0))) && entity.getPersistentData().getDouble("cnt1") <= 20.0) {
            if ((entity.getPersistentData().getDouble("breathes") == 1210.0 || (entity.getPersistentData().getDouble("breathes") == 210.0 || (entity.getPersistentData().getDouble("breathes") == 1213.0 && entity.getPersistentData().getDouble("cnt4") == 9.0)))) {
                cnt_test = Math.toRadians(Math.min((entity.getPersistentData().getDouble("cnt1") * 30.0), 360.0));
            } else {
                cnt_test = Math.toRadians(Math.min((entity.getPersistentData().getDouble("cnt1") * 45.0), 360.0));
            }
            playerModel.head.xRot = (float)(cnt_test + Math.toRadians(20.0));
            playerModel.head.y = (float)((double)playerModel.head.y + ((Math.cos(cnt_test) * -8.0) + 8.0));
            playerModel.head.z = (float)((double)playerModel.head.z + (Math.sin(cnt_test) * -8.0));
            playerModel.body.xRot = (float)cnt_test;
            playerModel.body.y = (float)((double)playerModel.body.y + ((Math.cos(cnt_test) * -8.0) + 8.0));
            playerModel.body.z = (float)((double)playerModel.body.z + (Math.sin(cnt_test) * -8.0));
            playerModel.rightArm.xRot = (float)(cnt_test - Math.toRadians(45.0));
            playerModel.rightArm.yRot = (float)(Math.toRadians(-22.5) * Math.cos(cnt_test));
            playerModel.rightArm.zRot = (float)Math.toRadians(-15.0);
            playerModel.rightArm.y = (float)((double)playerModel.rightArm.y + ((Math.cos(cnt_test) * -8.0) + 8.0));
            playerModel.rightArm.z = (float)((double)playerModel.rightArm.z + (Math.sin(cnt_test) * -8.0));
            playerModel.leftArm.xRot = (float)(cnt_test - Math.toRadians(45.0));
            playerModel.leftArm.yRot = (float)(Math.toRadians(22.5) * Math.cos(cnt_test));
            playerModel.leftArm.zRot = (float)Math.toRadians(15.0);
            playerModel.leftArm.y = (float)((double)playerModel.leftArm.y + ((Math.cos(cnt_test) * -8.0) + 8.0));
            playerModel.leftArm.z = (float)((double)playerModel.leftArm.z + (Math.sin(cnt_test) * -8.0));
            playerModel.rightLeg.xRot = (float)(cnt_test - Math.toRadians(20.0));
            playerModel.rightLeg.y = (float)((double)playerModel.rightLeg.y + ((Math.cos(cnt_test) * 4.0) - 4.0));
            playerModel.rightLeg.z = (float)((double)playerModel.rightLeg.z + (Math.sin(cnt_test) * 4.0));
            playerModel.leftLeg.xRot = (float)(cnt_test - Math.toRadians(10.0));
            playerModel.leftLeg.y = (float)((double)playerModel.leftLeg.y + ((Math.cos(cnt_test) * 4.0) - 4.0));
            playerModel.leftLeg.z = (float)((double)playerModel.leftLeg.z + (Math.sin(cnt_test) * 4.0));
        }
    }

    // original procedure: Water3Procedure
    private static void water3(Entity entity, PlayerModel<?> playerModel) {
        double form = 0.0;
        double form2 = 0.0;
        form = 0.0;
        form2 = 0.0;
        if (entity.getPersistentData().getDouble("breathes") == 603.0) {
            if ((KimetsuAnimationVariables.PlayerAnimeCnt == 0.0 || KimetsuAnimationVariables.PlayerAnimeCnt == 1.0)) {
                if ((double)Math.abs(playerModel.rightArm.yRot) > Math.toRadians(8.0)) {
                    if (!KimetsuAnimationVariables.PlayerAnimeFlag) {
                        KimetsuAnimationVariables.PlayerAnimeFlag = true;
                        KimetsuAnimationVariables.PlayerAnimeMode = (KimetsuAnimationVariables.PlayerAnimeMode + 1.0);
                    }
                } else {
                    KimetsuAnimationVariables.PlayerAnimeFlag = false;
                }
            }
            form = Math.min((entity.getPersistentData().getDouble("cnt1") * 0.15), 1.0);
            form2 = KimetsuAnimationVariables.PlayerAnimeCnt;
            playerModel.rightArm.xRot = (float)((Math.toRadians(-145.0) * form) + (Math.toRadians(10.0) * form2));
            playerModel.rightArm.yRot = (float)((Math.toRadians(55.0) * form) + (Math.toRadians(-92.0) * form2));
            playerModel.rightArm.zRot = (float)((Math.toRadians(-145.0) * form) + (Math.toRadians(200.0) * form2));
            playerModel.leftArm.xRot = (float)((Math.toRadians(-26.5) * form) + (Math.toRadians(-40.0) * form2));
            playerModel.leftArm.yRot = (float)((Math.toRadians(45.0) * form) + (Math.toRadians(20.0) * form2));
            playerModel.leftArm.zRot = (float)((Math.toRadians(15.0) * form) + (Math.toRadians(-12.0) * form2));
        }
    }

    // original procedure: Water4Procedure
    private static void water4(Entity entity, PlayerModel<?> playerModel) {
        double form = 0.0;
        double form2 = 0.0;
        form = 0.0;
        form2 = 0.0;
        if (entity.getPersistentData().getDouble("breathes") == 604.0) {
            form = Math.min((entity.getPersistentData().getDouble("cnt1") * 0.2), 1.0);
            form2 = Math.min((Math.max((entity.getPersistentData().getDouble("cnt1") - 5.0), 0.0) * 0.2), 1.0);
            playerModel.body.yRot = (float)((Math.toRadians(-22.5) * form) + (Math.toRadians(45.0) * form2));
            playerModel.rightArm.xRot = (float)((Math.toRadians(-115.0) * form) + (Math.toRadians(165.0) * form2));
            playerModel.rightArm.yRot = (float)((Math.toRadians(-70.0) * form) + (Math.toRadians(135.0) * form2));
            playerModel.rightArm.zRot = (float)((Math.toRadians(51.0) * form) + (Math.toRadians(51.0) * form2));
            playerModel.leftArm.xRot = (float)((Math.toRadians(-31.0) * form) + (Math.toRadians(-2.0) * form2));
            playerModel.leftArm.yRot = (float)((Math.toRadians(22.0) * form) + (Math.toRadians(-40.0) * form2));
            playerModel.leftArm.zRot = (float)((Math.toRadians(9.0) * form) + (Math.toRadians(-56.0) * form2));
            if (entity.onGround()) {
                playerModel.rightLeg.yRot = (float)((double)playerModel.rightLeg.yRot + ((Math.toRadians(-22.5) * form) + (Math.toRadians(45.0) * form2)));
                playerModel.leftLeg.yRot = (float)((double)playerModel.leftLeg.yRot + ((Math.toRadians(-22.5) * form) + (Math.toRadians(45.0) * form2)));
            } else {
                playerModel.rightLeg.yRot = (float)((Math.toRadians(-22.5) * form) + (Math.toRadians(45.0) * form2));
                playerModel.leftLeg.yRot = (float)((Math.toRadians(-22.5) * form) + (Math.toRadians(45.0) * form2));
            }
            playerModel.rightLeg.z = (float)((double)playerModel.rightLeg.z + ((-1.0 * form) + (2.0 * form2)));
            playerModel.leftLeg.z = (float)((double)playerModel.leftLeg.z + ((1.0 * form) + (-2.0 * form2)));
            playerModel.rightArm.z = (float)((double)playerModel.rightArm.z + ((-1.0 * form) + (2.0 * form2)));
            playerModel.leftArm.z = (float)((double)playerModel.leftArm.z + ((1.0 * form) + (-2.0 * form2)));
        }
    }

    // original procedure: Water5Procedure
    private static void water5(Entity entity, PlayerModel<?> playerModel) {
        double form = 0.0;
        double form2 = 0.0;
        form = 0.0;
        form2 = 0.0;
        if (entity.getPersistentData().getDouble("breathes") == 605.0) {
            if (entity.getPersistentData().getDouble("cnt1") == 1.0) {
                KimetsuAnimationVariables.PlayerAnimeFlag = false;
                KimetsuAnimationVariables.PlayerAnimeCnt = 1.0;
            }
            if ((entity.onGround() || entity.isInWater())) {
                KimetsuAnimationVariables.PlayerAnimeFlag = true;
            }
            form = Math.min((entity.getPersistentData().getDouble("cnt1") * 0.5), 1.0);
            form2 = Math.min((Math.max((entity.getPersistentData().getDouble("cnt1") - 1.0), 0.0) * 0.1), 1.0);
            playerModel.body.xRot = (float)(Math.toRadians(20.0) * form);
            playerModel.rightArm.xRot = (float)((Math.toRadians(-125.0) * form) + (Math.toRadians(145.0) * form2));
            playerModel.rightArm.yRot = (float)((Math.toRadians(-45.0) * form) + (Math.toRadians(45.0) * form2));
            playerModel.rightArm.zRot = (float)((Math.toRadians(45.0) * form) + (Math.toRadians(35.0) * form2));
            playerModel.leftArm.xRot = (float)((Math.toRadians(-55.0) * form) + (Math.toRadians(75.0) * form2));
            playerModel.leftArm.yRot = (float)((Math.toRadians(42.5) * form) + (Math.toRadians(-42.5) * form2));
            playerModel.leftArm.zRot = (float)((Math.toRadians(22.5) * form) + (Math.toRadians(-102.5) * form2));
            playerModel.rightLeg.xRot = (float)(((double)playerModel.rightLeg.xRot * KimetsuAnimationVariables.PlayerAnimeCnt) + ((Math.toRadians(-45.0) * form) * (1.0 - KimetsuAnimationVariables.PlayerAnimeCnt)));
            playerModel.leftLeg.xRot = (float)(((double)playerModel.leftLeg.xRot * KimetsuAnimationVariables.PlayerAnimeCnt) + ((Math.toRadians(22.5) * form) * (1.0 - KimetsuAnimationVariables.PlayerAnimeCnt)));
            playerModel.rightLeg.y = (float)((double)playerModel.rightLeg.y + (-1.0 * form));
            playerModel.rightLeg.z = (float)((double)playerModel.rightLeg.z + (4.0 * form));
            playerModel.leftLeg.y = (float)((double)playerModel.leftLeg.y + (-2.0 * form));
            playerModel.leftLeg.z = (float)((double)playerModel.leftLeg.z + (4.0 * form));
        }
    }

    // original procedure: Water6Procedure
    private static void water6(Entity entity, PlayerModel<?> playerModel) {
        double form = 0.0;
        double form2 = 0.0;
        form = 0.0;
        form2 = 0.0;
        if (entity.getPersistentData().getDouble("breathes") == 606.0) {
            form = Math.min((entity.getPersistentData().getDouble("cnt1") * 0.2), 1.0);
            form2 = Math.min((Math.max((entity.getPersistentData().getDouble("cnt1") - 5.0), 0.0) * 0.075), 1.0);
            playerModel.body.yRot = (float)((Math.toRadians(-45.0) * form) + (Math.toRadians(Math.toRadians(90.0)) * form2));
            playerModel.rightArm.xRot = (float)((Math.toRadians(-150.0) * form) + (Math.toRadians(0.0) * form2));
            playerModel.rightArm.yRot = (float)((Math.toRadians(-45.0) * form) + (Math.toRadians(40.0) * form2));
            playerModel.rightArm.zRot = (float)((Math.toRadians(80.0) * form) + (Math.toRadians(-205.0) * Math.sin(Math.toRadians((form2 * 90.0)))));
            playerModel.rightArm.x = (float)((double)playerModel.rightArm.x + ((3.0 * form) + (-2.0 * form2)));
            playerModel.rightArm.z = (float)((double)playerModel.rightArm.z + ((-4.0 * form) + (7.0 * form2)));
            playerModel.leftArm.xRot = (float)((Math.toRadians(-75.0) * form) + (Math.toRadians(0.0) * form2));
            playerModel.leftArm.yRot = (float)((Math.toRadians(-22.0) * form) + (Math.toRadians(110.0) * form2));
            playerModel.leftArm.zRot = (float)((Math.toRadians(-5.0) * form) + (Math.toRadians(0.0) * form2));
            playerModel.leftArm.x = (float)((double)playerModel.leftArm.x + ((-2.0 * form) + (-1.0 * form2)));
            playerModel.leftArm.z = (float)((double)playerModel.leftArm.z + ((3.0 * form) + (-7.0 * form2)));
            playerModel.rightLeg.xRot = (float)((Math.toRadians(-12.5) * form) + (Math.toRadians(25.0) * form2));
            playerModel.rightLeg.yRot = (float)((Math.toRadians(-22.5) * form) + (Math.toRadians(45.0) * form2));
            playerModel.rightLeg.zRot = (float)((Math.toRadians(2.5) * form) + (Math.toRadians(0.0) * form2));
            playerModel.rightLeg.z = (float)((double)playerModel.rightLeg.z + ((-2.0 * form) + (4.0 * form2)));
            playerModel.leftLeg.xRot = (float)((Math.toRadians(12.5) * form) + (Math.toRadians(-25.0) * form2));
            playerModel.leftLeg.yRot = (float)((Math.toRadians(-22.5) * form) + (Math.toRadians(45.0) * form2));
            playerModel.leftLeg.zRot = (float)((Math.toRadians(-2.5) * form) + (Math.toRadians(0.0) * form2));
            playerModel.leftLeg.z = (float)((double)playerModel.leftLeg.z + ((2.0 * form) + (-4.0 * form2)));
        }
    }

    // original procedure: Water7Procedure
    private static void water7(Entity entity, PlayerModel<?> playerModel) {
        double form = 0.0;
        form = 0.0;
        if ((entity.getPersistentData().getDouble("breathes") == 401.0 || (entity.getPersistentData().getDouble("breathes") == 607.0 || entity.getPersistentData().getDouble("breathes") == 902.0))) {
            form = Math.min((entity.getPersistentData().getDouble("cnt1") * 0.25), 1.0);
            playerModel.head.z = (float)((double)playerModel.head.z + (-7.0 * form));
            playerModel.head.y = (float)((double)playerModel.head.y + (3.0 * form));
            playerModel.body.y = (float)((double)playerModel.body.y + (3.0 * form));
            playerModel.body.z = (float)((double)playerModel.body.z + (-6.0 * form));
            playerModel.body.xRot = (float)(Math.toRadians(35.0) * form);
            playerModel.body.yRot = (float)(Math.toRadians(-35.0) * form);
            playerModel.body.zRot = (float)(Math.toRadians(-20.0) * form);
            playerModel.rightArm.x = (float)((double)playerModel.rightArm.x + (1.0 * form));
            playerModel.rightArm.y = (float)((double)playerModel.rightArm.y + (4.0 * form));
            playerModel.rightArm.z = (float)((double)playerModel.rightArm.z + (-9.0 * form));
            playerModel.rightArm.xRot = (float)(Math.toRadians(-50.0) * form);
            playerModel.rightArm.yRot = (float)(Math.toRadians(-22.5) * form);
            playerModel.rightArm.zRot = (float)(Math.toRadians(10.0) * form);
            playerModel.leftArm.x = (float)((double)playerModel.leftArm.x + (-2.0 * form));
            playerModel.leftArm.y = (float)((double)playerModel.leftArm.y + (1.0 * form));
            playerModel.leftArm.z = (float)((double)playerModel.leftArm.z + (-1.0 * form));
            playerModel.leftArm.xRot = (float)(Math.toRadians(45.0) * form);
            playerModel.leftArm.yRot = (float)(Math.toRadians(-22.5) * form);
            playerModel.leftArm.zRot = (float)(Math.toRadians(-45.0) * form);
            playerModel.rightLeg.y = (float)((double)playerModel.rightLeg.y + (0.5 * form));
            playerModel.rightLeg.z = (float)((double)playerModel.rightLeg.z + (-2.0 * form));
            playerModel.rightLeg.xRot = (float)(Math.toRadians(-30.0) * form);
            playerModel.rightLeg.yRot = (float)(Math.toRadians(-15.0) * form);
            playerModel.rightLeg.zRot = 0f;
            playerModel.leftLeg.y = (float)((double)playerModel.leftLeg.y + (1.0 * form));
            playerModel.leftLeg.z = (float)((double)playerModel.leftLeg.z + (1.0 * form));
            playerModel.leftLeg.xRot = (float)(Math.toRadians(40.0) * form);
            playerModel.leftLeg.yRot = (float)(Math.toRadians(-15.0) * form);
            playerModel.leftLeg.zRot = 0f;
        }
    }

    // original procedure: Water8Procedure
    private static void water8(Entity entity, PlayerModel<?> playerModel) {
        double form = 0.0;
        double form2 = 0.0;
        form = 0.0;
        form2 = 0.0;
        if (entity.getPersistentData().getDouble("breathes") == 608.0) {
            form = Math.min((entity.getPersistentData().getDouble("cnt1") * 0.15), 1.0);
            form2 = Math.min((entity.getPersistentData().getDouble("cnt3") * 0.11), 1.0);
            playerModel.head.y = (float)((double)playerModel.head.y + (5.0 * form2));
            playerModel.rightArm.y = (float)((double)playerModel.rightArm.y + (5.0 * form2));
            playerModel.rightArm.xRot = (float)((Math.toRadians(-130.0) * form) + (Math.toRadians(147.0) * form2));
            playerModel.rightArm.yRot = (float)((Math.toRadians(-25.0) * form) + (Math.toRadians(7.0) * form2));
            playerModel.rightArm.zRot = (float)((Math.toRadians(20.0) * form) + (Math.toRadians(-45.0) * form2));
            playerModel.leftArm.y = (float)((double)playerModel.leftArm.y + (5.0 * form2));
            playerModel.leftArm.xRot = (float)((Math.toRadians(-130.0) * form) + (Math.toRadians(147.0) * form2));
            playerModel.leftArm.yRot = (float)((Math.toRadians(25.0) * form) + (Math.toRadians(-7.0) * form2));
            playerModel.leftArm.zRot = (float)((Math.toRadians(-20.0) * form) + (Math.toRadians(45.0) * form2));
            playerModel.body.y = (float)((double)playerModel.body.y + (5.0 * form2));
            playerModel.body.xRot = (float)(Math.toRadians(45.0) * form2);
            playerModel.rightLeg.y = (float)(((double)playerModel.rightLeg.y + (-5.0 * form2)) + (5.0 * form2));
            playerModel.rightLeg.z = (float)((double)playerModel.rightLeg.z + (8.0 * form2));
            playerModel.leftLeg.y = (float)(((double)playerModel.leftLeg.y + (-5.0 * form2)) + (5.0 * form2));
            playerModel.leftLeg.z = (float)((double)playerModel.leftLeg.z + (8.0 * form2));
        }
    }

    // original procedure: Water9Procedure
    private static void water9(Entity entity, PlayerModel<?> playerModel) {
        double form = 0.0;
        form = 0.0;
        if (entity.getPersistentData().getDouble("breathes") == 609.0) {
            form = Math.min((entity.getPersistentData().getDouble("cnt1") * 0.2), 1.0);
            playerModel.head.y = (float)((double)playerModel.head.y + (1.0 * form));
            playerModel.body.y = (float)((double)playerModel.body.y + (1.0 * form));
            playerModel.body.xRot = (float)(Math.toRadians(12.5) * form);
            playerModel.rightArm.y = (float)((double)playerModel.rightArm.y + (1.0 * form));
            if ((double)Math.abs(playerModel.rightArm.yRot) < Math.toRadians(4.0)) {
                playerModel.rightArm.xRot = (float)(Math.toRadians(22.5) * form);
                playerModel.rightArm.yRot = (float)(Math.toRadians(22.5) * form);
                playerModel.rightArm.zRot = (float)(Math.toRadians(30.0) * form);
            }
            playerModel.leftArm.y = (float)((double)playerModel.leftArm.y + (1.0 * form));
            playerModel.leftArm.xRot = (float)(Math.toRadians(20.0) * form);
            playerModel.leftArm.yRot = (float)(Math.toRadians(-30.0) * form);
            playerModel.leftArm.zRot = (float)(Math.toRadians(-30.0) * form);
            playerModel.rightLeg.z = (float)((double)playerModel.rightLeg.z + (2.0 * form));
            playerModel.leftLeg.z = (float)((double)playerModel.leftLeg.z + (2.0 * form));
        }
    }

    // original procedure: Water10Procedure
    private static void water10(Entity entity, PlayerModel<?> playerModel) {
        double form = 0.0;
        double form2 = 0.0;
        form = 0.0;
        form2 = 0.0;
        if (entity.getPersistentData().getDouble("breathes") == 610.0) {
            if (entity.getPersistentData().getDouble("cnt2") >= 4.0) {
                form = Math.min((entity.getPersistentData().getDouble("cnt3") * 0.2), 1.0);
                form2 = Math.min((Math.max((entity.getPersistentData().getDouble("cnt3") - 5.0), 0.0) * 0.125), 1.0);
                playerModel.head.y = (float)((double)playerModel.head.y + (5.0 * form2));
                playerModel.rightArm.y = (float)((double)playerModel.rightArm.y + (5.0 * form2));
                playerModel.rightArm.xRot = (float)((Math.toRadians(-130.0) * form) + (Math.toRadians(147.0) * form2));
                playerModel.rightArm.yRot = (float)((Math.toRadians(-25.0) * form) + (Math.toRadians(7.0) * form2));
                playerModel.rightArm.zRot = (float)((Math.toRadians(20.0) * form) + (Math.toRadians(-45.0) * form2));
                playerModel.leftArm.y = (float)((double)playerModel.leftArm.y + (5.0 * form2));
                playerModel.leftArm.xRot = (float)((Math.toRadians(-130.0) * form) + (Math.toRadians(147.0) * form2));
                playerModel.leftArm.yRot = (float)((Math.toRadians(25.0) * form) + (Math.toRadians(-7.0) * form2));
                playerModel.leftArm.zRot = (float)((Math.toRadians(-20.0) * form) + (Math.toRadians(45.0) * form2));
                playerModel.body.y = (float)((double)playerModel.body.y + (5.0 * form2));
                playerModel.body.xRot = (float)(Math.toRadians(45.0) * form2);
                playerModel.rightLeg.y = (float)(((double)playerModel.rightLeg.y + (-5.0 * form2)) + (5.0 * form2));
                playerModel.rightLeg.z = (float)((double)playerModel.rightLeg.z + (8.0 * form2));
                playerModel.leftLeg.y = (float)(((double)playerModel.leftLeg.y + (-5.0 * form2)) + (5.0 * form2));
                playerModel.leftLeg.z = (float)((double)playerModel.leftLeg.z + (8.0 * form2));
            } else {
                form = 1.0;
                form2 = Math.min((Math.max((entity.getPersistentData().getDouble("cnt1") + 12.0), 0.0) * 0.125), 1.0);
                if ((entity.getPersistentData().getDouble("cnt2") % 2.0) == 1.0) {
                    form2 = (1.0 - form2);
                }
                playerModel.rightArm.xRot = (float)((Math.toRadians(-145.0) * form) + (Math.toRadians(10.0) * form2));
                playerModel.rightArm.yRot = (float)((Math.toRadians(55.0) * form) + (Math.toRadians(-92.0) * form2));
                playerModel.rightArm.zRot = (float)((Math.toRadians(-145.0) * form) + (Math.toRadians(200.0) * form2));
                playerModel.leftArm.xRot = (float)((Math.toRadians(-26.5) * form) + (Math.toRadians(-40.0) * form2));
                playerModel.leftArm.yRot = (float)((Math.toRadians(45.0) * form) + (Math.toRadians(20.0) * form2));
                playerModel.leftArm.zRot = (float)((Math.toRadians(15.0) * form) + (Math.toRadians(-12.0) * form2));
            }
        }
    }

    // original procedure: Thunder1Procedure
    private static void thunder1(Entity entity, PlayerModel<?> playerModel) {
        double form = 0.0;
        form = 0.0;
        if ((entity.getPersistentData().getDouble("breathes") == 101.0 || (entity.getPersistentData().getDouble("breathes") == 111.0 || (entity.getPersistentData().getDouble("breathes") == 112.0 || (entity.getPersistentData().getDouble("breathes") == 113.0 || entity.getPersistentData().getDouble("breathes") == 1701.0))))) {
            form = Math.min((entity.getPersistentData().getDouble("cnt1") * 0.1), 1.0);
            playerModel.head.z = (float)((double)playerModel.head.z - (3.0 * form));
            playerModel.head.y = (float)((double)playerModel.head.y + (7.0 * form));
            playerModel.body.z = (float)((double)playerModel.body.z - (4.0 * form));
            playerModel.body.y = (float)((double)playerModel.body.y + (4.0 * form));
            playerModel.rightArm.y = (float)((double)playerModel.rightArm.y + (5.0 * form));
            playerModel.rightArm.z = (float)((double)playerModel.rightArm.z - (2.0 * form));
            playerModel.leftArm.y = (float)((double)playerModel.leftArm.y + (4.0 * form));
            playerModel.leftArm.z = (float)((double)playerModel.leftArm.z - (2.0 * form));
            playerModel.rightLeg.y = (float)((double)playerModel.rightLeg.y + (1.0 * form));
            playerModel.rightLeg.z = (float)((double)playerModel.rightLeg.z + (3.0 * form));
            playerModel.leftLeg.y = (float)((double)playerModel.leftLeg.y + (3.0 * form));
            playerModel.leftLeg.z = (float)((double)playerModel.leftLeg.z + (1.5 * form));
            if ((entity.getPersistentData().getDouble("breathes") == 101.0 || entity.getPersistentData().getDouble("breathes") == 111.0)) {
                playerModel.head.xRot = (float)Math.toRadians((70.0 * form));
            }
            playerModel.body.xRot = (float)((double)playerModel.body.xRot + Math.toRadians((35.0 * form)));
            playerModel.rightArm.xRot = (float)((double)playerModel.rightArm.xRot - Math.toRadians((150.0 * form)));
            playerModel.rightArm.yRot = (float)((double)playerModel.rightArm.yRot - Math.toRadians((15.0 * form)));
            playerModel.rightArm.zRot = (float)((double)playerModel.rightArm.zRot + Math.toRadians((130.0 * form)));
            playerModel.leftArm.xRot = (float)((double)playerModel.leftArm.xRot + Math.toRadians((15.0 * form)));
            playerModel.leftLeg.xRot = (float)((double)playerModel.leftLeg.xRot + Math.toRadians((45.0 * form)));
            playerModel.rightLeg.xRot = (float)((double)playerModel.rightLeg.xRot - Math.toRadians((22.5 * form)));
        }
    }

    // original procedure: CompassNeedleProcedure
    private static void compassNeedle(Entity entity, PlayerModel<?> playerModel) {
        boolean CompassForm = false;
        double form = 0.0;
        double form3 = 0.0;
        double form2 = 0.0;
        CompassForm = false;
        form = 0.0;
        form3 = 0.0;
        form2 = 0.0;
        if ((entity.getPersistentData().getDouble("demon_art") == 400.0 || (entity.getPersistentData().getDouble("demon_art") == 408.0 || entity.getPersistentData().getDouble("demon_art") == 409.0))) {
            CompassForm = false;
            if (entity.getPersistentData().getDouble("cnt3") != 0.0) {
                if (entity.getPersistentData().getDouble("demon_art") == 400.0) {
                    CompassForm = true;
                } else {
                    if (entity.getPersistentData().getDouble("demon_art") == 408.0) {
                        if (entity.getPersistentData().getDouble("cnt2") > 0.0) {
                            form2 = 1.0;
                            form = 1.0;
                            form3 = Math.min(Math.max((entity.getPersistentData().getDouble("cnt3") * 0.2), 0.0), 1.0);
                            playerModel.head.y = (float)((4.0 * form) + (-2.5 * form3));
                            playerModel.body.y = (float)((2.0 * form) + (-1.0 * form3));
                            playerModel.body.xRot = (float)(Math.toRadians((22.5 * form)) + Math.toRadians((-12.5 * form3)));
                            playerModel.body.yRot = 0f;
                            playerModel.body.zRot = 0f;
                            playerModel.rightArm.y = (float)((double)playerModel.rightArm.y + (3.0 * form));
                            playerModel.rightArm.z = (float)((double)playerModel.rightArm.z + (2.0 * form));
                            playerModel.rightArm.xRot = (float)((Math.toRadians((-130.0 * form2)) + Math.toRadians((157.5 * form))) + Math.toRadians((-120.0 * form3)));
                            playerModel.rightArm.yRot = 0f;
                            playerModel.rightArm.zRot = (float)Math.toRadians((-35.0 * form2));
                            playerModel.leftArm.y = (float)((double)playerModel.leftArm.y + (3.0 * form));
                            playerModel.leftArm.z = (float)((double)playerModel.leftArm.z + (2.0 * form));
                            playerModel.rightArm.zRot = (float)Math.toRadians((80.0 * form));
                            playerModel.leftArm.xRot = (float)((Math.toRadians((-135.0 * form2)) + Math.toRadians((157.5 * form))) + Math.toRadians((-120.0 * form3)));
                            playerModel.leftArm.yRot = 0f;
                            playerModel.leftArm.zRot = (float)(Math.toRadians((-80.0 * form)) + Math.toRadians((15.0 * form2)));
                            playerModel.rightLeg.z = (float)(((double)playerModel.rightLeg.z + (4.0 * form)) + (-2.0 * form3));
                            playerModel.rightLeg.xRot = 0f;
                            playerModel.rightLeg.yRot = 0f;
                            playerModel.rightLeg.zRot = (float)Math.toRadians((7.5 * form));
                            playerModel.leftLeg.z = (float)(((double)playerModel.leftLeg.z + (4.0 * form)) + (-2.0 * form3));
                            playerModel.leftLeg.xRot = 0f;
                            playerModel.leftLeg.yRot = 0f;
                            playerModel.leftLeg.zRot = (float)Math.toRadians((-7.5 * form));
                        } else {
                            if (entity.getPersistentData().getDouble("cnt1") >= 20.0) {
                                CompassForm = false;
                            } else {
                                CompassForm = true;
                            }
                        }
                    } else {
                        if (entity.getPersistentData().getDouble("demon_art") == 409.0) {
                            if (entity.getPersistentData().getDouble("cnt1") > 18.0) {
                                form = Math.min(((entity.getPersistentData().getDouble("cnt1") - 18.0) * 0.25), 1.0);
                                playerModel.body.xRot = 0f;
                                playerModel.body.yRot = 0f;
                                playerModel.body.zRot = 0f;
                                playerModel.rightArm.xRot = 0f;
                                playerModel.rightArm.yRot = 0f;
                                playerModel.rightArm.zRot = (float)Math.toRadians((95.0 * form));
                                playerModel.leftArm.xRot = 0f;
                                playerModel.leftArm.yRot = 0f;
                                playerModel.leftArm.zRot = (float)Math.toRadians((-95.0 * form));
                                playerModel.rightLeg.xRot = 0f;
                                playerModel.rightLeg.yRot = 0f;
                                playerModel.rightLeg.zRot = (float)Math.toRadians((15.0 * form));
                                playerModel.leftLeg.xRot = 0f;
                                playerModel.leftLeg.yRot = 0f;
                                playerModel.leftLeg.zRot = (float)Math.toRadians((-15.0 * form));
                            } else {
                                CompassForm = true;
                            }
                        } else {
                            CompassForm = true;
                        }
                    }
                }
            }
            if (CompassForm) {
                if (entity.getPersistentData().getDouble("demon_art") == 409.0) {
                    form = Math.min((Math.max(entity.getPersistentData().getDouble("cnt1"), Math.max(entity.getPersistentData().getDouble("cnt2"), entity.getPersistentData().getDouble("cnt3"))) * 0.1), 1.0);
                } else {
                    form = Math.min((entity.getPersistentData().getDouble("cnt1") * 0.1), 1.0);
                }
                playerModel.body.yRot = (float)((double)playerModel.body.xRot - Math.toRadians((45.0 * form)));
                playerModel.rightArm.xRot = (float)((double)playerModel.rightArm.xRot - Math.toRadians((65.0 * form)));
                playerModel.rightArm.yRot = (float)((double)playerModel.rightArm.yRot - Math.toRadians((15.0 * form)));
                playerModel.rightArm.zRot = (float)((double)playerModel.rightArm.zRot - Math.toRadians((6.0 * form)));
                playerModel.leftArm.xRot = (float)((double)playerModel.leftArm.xRot - Math.toRadians((80.0 * form)));
                playerModel.leftArm.yRot = (float)((double)playerModel.leftArm.yRot + Math.toRadians((17.0 * form)));
                playerModel.leftArm.zRot = (float)((double)playerModel.leftArm.zRot + Math.toRadians((3.0 * form)));
                playerModel.rightLeg.xRot = (float)((double)playerModel.rightLeg.xRot - Math.toRadians((15.0 * form)));
                playerModel.leftLeg.xRot = (float)((double)playerModel.leftLeg.xRot + Math.toRadians((2.5 * form)));
                playerModel.leftLeg.zRot = (float)((double)playerModel.leftLeg.zRot - Math.toRadians((5.0 * form)));
                playerModel.leftArm.x = (float)((double)playerModel.leftArm.x - (2.0 * form));
                playerModel.leftArm.z = (float)((double)playerModel.leftArm.z + (4.0 * form));
                playerModel.rightArm.x = (float)((double)playerModel.rightArm.x + (1.0 * form));
                playerModel.rightArm.z = (float)((double)playerModel.rightArm.z - (1.0 * form));
                playerModel.rightLeg.z = (float)((double)playerModel.rightLeg.z - (2.0 * form));
                playerModel.leftLeg.z = (float)((double)playerModel.leftLeg.z + (2.0 * form));
            }
        }
    }

    // original procedure: RotatingCircularSlashesFlyingBloodScythesProcedure
    private static void rotatingCircularSlashesFlyingBloodScythes(Entity entity, PlayerModel<?> playerModel) {
        double form = 0.0;
        form = 0.0;
        if (entity.getPersistentData().getDouble("demon_art") == 502.0) {
            form = Math.min((entity.getPersistentData().getDouble("cnt1") * 0.2), 1.0);
            playerModel.body.xRot = 0f;
            playerModel.body.yRot = 0f;
            playerModel.body.zRot = 0f;
            playerModel.rightArm.xRot = 0f;
            playerModel.rightArm.yRot = 0f;
            playerModel.rightArm.zRot = (float)Math.toRadians((95.0 * form));
            playerModel.leftArm.xRot = 0f;
            playerModel.leftArm.yRot = 0f;
            playerModel.leftArm.zRot = (float)Math.toRadians((-95.0 * form));
            playerModel.rightLeg.xRot = 0f;
            playerModel.rightLeg.yRot = 0f;
            playerModel.rightLeg.zRot = (float)Math.toRadians((15.0 * form));
            playerModel.leftLeg.xRot = 0f;
            playerModel.leftLeg.yRot = 0f;
            playerModel.leftLeg.zRot = (float)Math.toRadians((-15.0 * form));
        }
    }

    // original procedure: CuttingThreadRotationProcedure
    private static void cuttingThreadRotation(Entity entity, PlayerModel<?> playerModel) {
        double form = 0.0;
        form = 0.0;
        if (entity.getPersistentData().getDouble("demon_art") == 203.0) {
            form = Math.min((entity.getPersistentData().getDouble("cnt1") * 0.2), 1.0);
            if (entity.getPersistentData().getDouble("cnt1") < 20.0) {
                playerModel.rightArm.xRot = (float)Math.toRadians((-85.0 * form));
                playerModel.leftArm.xRot = (float)Math.toRadians((-85.0 * form));
                playerModel.rightLeg.zRot = (float)((double)playerModel.rightLeg.zRot + Math.toRadians((5.0 * form)));
                playerModel.leftLeg.zRot = (float)((double)playerModel.leftLeg.zRot - Math.toRadians((5.0 * form)));
            }
        }
    }

    // original procedure: DiceSteakSeniorProcedure
    private static void diceSteakSenior(Entity entity, PlayerModel<?> playerModel) {
        double form = 0.0;
        form = 0.0;
        if ((entity.getPersistentData().getDouble("breathes") >= 1000.0 && entity.getPersistentData().getDouble("breathes") <= 1003.0)) {
            if (entity.isAlive()) {
                form = Math.min((entity.getPersistentData().getDouble("cnt1") * 0.2), 1.0);
                playerModel.body.yRot = (float)((double)playerModel.body.xRot - Math.toRadians((20.0 * form)));
                playerModel.rightArm.xRot = (float)Math.toRadians((-90.0 * form));
                playerModel.rightArm.yRot = (float)Math.toRadians((-75.0 * form));
                playerModel.rightArm.zRot = (float)Math.toRadians((17.0 * form));
                playerModel.leftArm.xRot = (float)Math.toRadians((-50.0 * form));
                playerModel.leftArm.yRot = 0f;
                playerModel.leftArm.zRot = 0f;
                playerModel.leftArm.z = (float)((double)playerModel.leftArm.z + (2.0 * form));
                playerModel.rightArm.x = (float)((double)playerModel.rightArm.x + (1.0 * form));
                playerModel.rightArm.z = (float)((double)playerModel.rightArm.z - (2.0 * form));
            } else {
                playerModel.head.y = (playerModel.head.y - 4.0f);
                playerModel.rightArm.x = (playerModel.rightArm.x - 4.0f);
                playerModel.leftArm.x = (playerModel.leftArm.x + 4.0f);
            }
        }
    }

    // original procedure: AirTypeProcedure
    private static void airType(Entity entity, PlayerModel<?> playerModel) {
        double form = 0.0;
        double cnt_test = 0.0;
        form = 0.0;
        cnt_test = 0.0;
        if (entity.getPersistentData().getDouble("demon_art") == 401.0) {
            if (entity.getPersistentData().getDouble("cnt2") <= 11.0) {
                form = Math.min((entity.getPersistentData().getDouble("cnt1") * 0.1), 1.0);
                playerModel.head.zRot = (float)(Math.toRadians(180.0) * form);
                playerModel.head.y = (float)(((double)playerModel.head.y + (16.0 * form)) - (16.0 * form));
                playerModel.body.zRot = (float)(Math.toRadians(180.0) * form);
                playerModel.body.y = (float)(((double)playerModel.body.y + (16.0 * form)) - (16.0 * form));
                playerModel.rightArm.zRot = (float)(Math.toRadians(180.0) * form);
                playerModel.rightArm.x = (float)((double)playerModel.rightArm.x + (10.0 * form));
                playerModel.rightArm.y = (float)(((double)playerModel.rightArm.y + (12.0 * form)) - (16.0 * form));
                playerModel.leftArm.zRot = (float)(Math.toRadians(180.0) * form);
                playerModel.leftArm.x = (float)((double)playerModel.leftArm.x - (10.0 * form));
                playerModel.leftArm.y = (float)(((double)playerModel.leftArm.y + (12.0 * form)) - (16.0 * form));
                if (entity.getPersistentData().getDouble("cnt2") > 0.0) {
                    playerModel.rightArm.xRot = (float)((double)playerModel.rightArm.xRot - Math.toRadians(45.0));
                    playerModel.leftArm.xRot = (float)((double)(playerModel.rightArm.xRot * -1.0f) - Math.toRadians(45.0));
                    playerModel.leftArm.yRot = (playerModel.rightArm.yRot * -1.0f);
                    playerModel.leftArm.zRot = (playerModel.rightArm.zRot * -1.0f);
                }
                playerModel.rightLeg.xRot = 0f;
                playerModel.rightLeg.yRot = 0f;
                playerModel.rightLeg.zRot = (float)((Math.toRadians(180.0) * form) + (Math.toRadians(15.0) * form));
                playerModel.rightLeg.x = (float)((double)playerModel.rightLeg.x + (4.0 * form));
                playerModel.rightLeg.y = (float)(((double)playerModel.rightLeg.y - (8.0 * form)) - (16.0 * form));
                playerModel.leftLeg.xRot = 0f;
                playerModel.leftLeg.yRot = 0f;
                playerModel.leftLeg.zRot = (float)((Math.toRadians(180.0) * form) - (Math.toRadians(15.0) * form));
                playerModel.leftLeg.x = (float)((double)playerModel.leftLeg.x - (4.0 * form));
                playerModel.leftLeg.y = (float)(((double)playerModel.leftLeg.y - (8.0 * form)) - (16.0 * form));
            } else {
                form = Math.min(Math.max(((entity.getPersistentData().getDouble("cnt2") - 15.0) * 0.125), 0.0), 1.0);
                cnt_test = (1.0 - form);
                playerModel.head.zRot = (float)(Math.toRadians(180.0) + (Math.toRadians(180.0) * form));
                playerModel.head.y = (float)(((double)playerModel.head.y + (16.0 * cnt_test)) - (16.0 * cnt_test));
                playerModel.body.zRot = (float)(Math.toRadians(180.0) + (Math.toRadians(180.0) * form));
                playerModel.body.y = (float)(((double)playerModel.body.y + (16.0 * cnt_test)) - (16.0 * cnt_test));
                playerModel.rightArm.zRot = (float)(Math.toRadians(180.0) + (Math.toRadians(180.0) * form));
                playerModel.rightArm.x = (float)((double)playerModel.rightArm.x + (10.0 * cnt_test));
                playerModel.rightArm.y = (float)(((double)playerModel.rightArm.y + (12.0 * cnt_test)) - (16.0 * cnt_test));
                playerModel.leftArm.zRot = (float)(Math.toRadians(180.0) + (Math.toRadians(180.0) * form));
                playerModel.leftArm.x = (float)((double)playerModel.leftArm.x - (10.0 * cnt_test));
                playerModel.leftArm.y = (float)(((double)playerModel.leftArm.y + (12.0 * cnt_test)) - (16.0 * cnt_test));
                playerModel.rightLeg.zRot = (float)(Math.toRadians(180.0) + ((Math.toRadians(180.0) * form) + (Math.toRadians(15.0) * cnt_test)));
                playerModel.rightLeg.x = (float)((double)playerModel.rightLeg.x + (4.0 * cnt_test));
                playerModel.rightLeg.y = (float)(((double)playerModel.rightLeg.y - (8.0 * cnt_test)) - (16.0 * cnt_test));
                playerModel.leftLeg.zRot = (float)(Math.toRadians(180.0) + ((Math.toRadians(180.0) * form) - (Math.toRadians(15.0) * cnt_test)));
                playerModel.leftLeg.x = (float)((double)playerModel.leftLeg.x - (4.0 * cnt_test));
                playerModel.leftLeg.y = (float)(((double)playerModel.leftLeg.y - (8.0 * cnt_test)) - (16.0 * cnt_test));
            }
        }
    }

    // original procedure: DisorderProcedure
    private static void disorder(Entity entity, PlayerModel<?> playerModel) {
        double form = 0.0;
        double cnt_test = 0.0;
        double form3 = 0.0;
        double form2 = 0.0;
        form = 0.0;
        cnt_test = 0.0;
        form3 = 0.0;
        form2 = 0.0;
        if ((entity.getPersistentData().getDouble("demon_art") == 402.0 || entity.getPersistentData().getDouble("demon_art") == 407.0)) {
            form2 = Math.min((entity.getPersistentData().getDouble("cnt1") * 0.25), 1.0);
            if (entity.getPersistentData().getDouble("cnt1") > 5.0) {
                form = Math.min(Math.max(((entity.getPersistentData().getDouble("cnt1") - 5.0) * 0.2), 0.0), 1.0);
            }
            if (entity.getPersistentData().getDouble("cnt1") > 12.0) {
                form3 = Math.min(Math.max(((entity.getPersistentData().getDouble("cnt1") - 12.0) * 0.2), 0.0), 1.0);
            }
            playerModel.head.y = (float)((4.0 * form) + (-2.5 * form3));
            playerModel.body.y = (float)((2.0 * form) + (-1.0 * form3));
            playerModel.body.xRot = (float)(Math.toRadians((22.5 * form)) + Math.toRadians((-12.5 * form3)));
            playerModel.body.yRot = 0f;
            playerModel.body.zRot = 0f;
            playerModel.rightArm.y = (float)((double)playerModel.rightArm.y + (3.0 * form));
            playerModel.rightArm.z = (float)((double)playerModel.rightArm.z + (2.0 * form));
            playerModel.rightArm.xRot = (float)((Math.toRadians((-130.0 * form2)) + Math.toRadians((157.5 * form))) + Math.toRadians((-120.0 * form3)));
            playerModel.rightArm.yRot = 0f;
            playerModel.rightArm.zRot = (float)Math.toRadians((-35.0 * form2));
            playerModel.leftArm.y = (float)((double)playerModel.leftArm.y + (3.0 * form));
            playerModel.leftArm.z = (float)((double)playerModel.leftArm.z + (2.0 * form));
            playerModel.rightArm.zRot = (float)Math.toRadians((80.0 * form));
            playerModel.leftArm.xRot = (float)((Math.toRadians((-135.0 * form2)) + Math.toRadians((157.5 * form))) + Math.toRadians((-120.0 * form3)));
            playerModel.leftArm.yRot = 0f;
            playerModel.leftArm.zRot = (float)(Math.toRadians((-80.0 * form)) + Math.toRadians((15.0 * form2)));
            playerModel.rightLeg.z = (float)(((double)playerModel.rightLeg.z + (4.0 * form)) + (-2.0 * form3));
            playerModel.rightLeg.xRot = 0f;
            playerModel.rightLeg.yRot = 0f;
            playerModel.rightLeg.zRot = (float)Math.toRadians((7.5 * form));
            playerModel.leftLeg.z = (float)(((double)playerModel.leftLeg.z + (4.0 * form)) + (-2.0 * form3));
            playerModel.leftLeg.xRot = 0f;
            playerModel.leftLeg.yRot = 0f;
            playerModel.leftLeg.zRot = (float)Math.toRadians((-7.5 * form));
        }
    }

    // original procedure: Wind1Procedure
    private static void wind1(Entity entity, PlayerModel<?> playerModel) {
    }

    // original procedure: Wind2Procedure
    private static void wind2(Entity entity, PlayerModel<?> playerModel) {
        double form = 0.0;
        double next_form = 0.0;
        double form2 = 0.0;
        form = 0.0;
        next_form = 0.0;
        form2 = 0.0;
        if (entity.getPersistentData().getDouble("breathes") == 502.0) {
            form = Math.min((entity.getPersistentData().getDouble("cnt1") * 0.1), 1.0);
            if (entity.getPersistentData().getBoolean("flag_breathes")) {
                form2 = Math.min((entity.getPersistentData().getDouble("cnt3") * 0.1), 1.0);
                next_form = entity.getPersistentData().getDouble("cnt3");
            }
            playerModel.rightArm.x = (float)((double)playerModel.rightArm.x + ((1.0 * form) + (2.0 * form2)));
            playerModel.rightArm.y = (float)((double)playerModel.rightArm.y + (-1.0 * form));
            playerModel.rightArm.xRot = (float)((Math.toRadians(-134.0) * form) + (Math.toRadians(139.0) * form2));
            playerModel.rightArm.yRot = (float)(Math.toRadians(7.0) * form2);
            playerModel.rightArm.zRot = (float)((Math.toRadians(-34.0) * form) + (Math.toRadians(-14.0) * form2));
            playerModel.leftArm.x = (float)((double)playerModel.leftArm.x + (-1.0 * form));
            playerModel.leftArm.xRot = (float)((Math.toRadians(-9.0) * form) + ((Math.toRadians(-32.0) * Math.min((next_form * 0.2), 1.0)) + (Math.toRadians(39.0) * Math.min((Math.max((next_form - 5.0), 0.0) * 0.2), 1.0))));
            playerModel.leftArm.zRot = (float)((Math.toRadians(132.0) * form) + (Math.toRadians(-121.0) * form2));
            playerModel.rightLeg.xRot = (float)(Math.toRadians(-13.0) * form);
            playerModel.leftLeg.xRot = (float)(Math.toRadians(23.0) * form);
        }
    }

    // original procedure: Wind3Procedure
    private static void wind3(Entity entity, PlayerModel<?> playerModel) {
    }

    // original procedure: Wind4Procedure
    private static void wind4(Entity entity, PlayerModel<?> playerModel) {
    }

    // original procedure: Wind5Procedure
    private static void wind5(Entity entity, PlayerModel<?> playerModel) {
        double form = 0.0;
        double form_math = 0.0;
        form = 0.0;
        form_math = 0.0;
        if ((entity.getPersistentData().getDouble("breathes") == 505.0 && entity.getPersistentData().getDouble("cnt1") >= 20.0)) {
            form_math = (((entity.getPersistentData().getDouble("cnt1") - entity.getPersistentData().getDouble("cnt1_box")) - 20.0) * 0.25);
            if ((entity.getPersistentData().getDouble("cnt1") % 4.0) == 0.0) {
                entity.getPersistentData().putDouble("cnt1_box", entity.getPersistentData().getDouble("cnt1"));
            }
            if ((entity.getPersistentData().getDouble("cnt1") - entity.getPersistentData().getDouble("cnt1_box")) <= 4.0) {
                form = Math.min(form_math, 1.0);
                playerModel.head.yRot = (float)(Math.toRadians(180.0) * form);
                playerModel.body.yRot = (float)(Math.toRadians(180.0) * form);
                playerModel.rightArm.xRot = (float)(Math.toRadians(180.0) * form);
                playerModel.rightArm.zRot = (float)(Math.toRadians(80.0) * form);
                playerModel.leftArm.yRot = (float)(Math.toRadians(180.0) * form);
                playerModel.rightLeg.yRot = (float)(Math.toRadians(180.0) * form);
                playerModel.leftLeg.yRot = (float)(Math.toRadians(180.0) * form);
            } else {
                form = Math.min(Math.max((form_math - 4.0), 0.0), 1.0);
                playerModel.head.yRot = (float)(Math.toRadians(180.0) + (Math.toRadians(180.0) * form));
                playerModel.body.yRot = (float)(Math.toRadians(180.0) + (Math.toRadians(180.0) * form));
                playerModel.rightArm.xRot = (float)(Math.toRadians(180.0) + (Math.toRadians(180.0) * form));
                playerModel.rightArm.zRot = (float)Math.toRadians(80.0);
                playerModel.leftArm.yRot = (float)(Math.toRadians(180.0) + (Math.toRadians(180.0) * form));
                playerModel.rightLeg.yRot = (float)(Math.toRadians(180.0) + (Math.toRadians(180.0) * form));
                playerModel.leftLeg.yRot = (float)(Math.toRadians(180.0) + (Math.toRadians(180.0) * form));
            }
        }
    }

    // original procedure: Wind6Procedure
    private static void wind6(Entity entity, PlayerModel<?> playerModel) {
    }

    // original procedure: Wind7Procedure
    private static void wind7(Entity entity, PlayerModel<?> playerModel) {
        double form = 0.0;
        double next_form = 0.0;
        double form2 = 0.0;
        form = 0.0;
        next_form = 0.0;
        form2 = 0.0;
        if (entity.getPersistentData().getDouble("breathes") == 507.0) {
            form = Math.min(((entity.getPersistentData().getDouble("cnt3") * 0.38) - entity.getPersistentData().getDouble("cnt1_box")), 1.0);
            if (entity.getPersistentData().getDouble("cnt3") <= 8.0) {
                next_form = Math.min((entity.getPersistentData().getDouble("cnt3") * 0.25), 1.0);
                form = Math.min((entity.getPersistentData().getDouble("cnt3") * 0.25), 1.0);
                form2 = Math.toRadians((entity.getPersistentData().getDouble("cnt3") * -37.5));
                playerModel.head.zRot = (float)(Math.toRadians(180.0) * next_form);
                playerModel.head.y = (float)((double)playerModel.head.y + ((16.0 * next_form) - (16.0 * next_form)));
                playerModel.body.zRot = (float)(Math.toRadians(180.0) * next_form);
                playerModel.body.y = (float)((double)playerModel.body.y + ((16.0 * next_form) - (16.0 * next_form)));
                playerModel.rightArm.x = (float)((double)playerModel.rightArm.x + (10.0 * next_form));
                playerModel.rightArm.y = (float)((double)playerModel.rightArm.y + ((12.0 * next_form) - (16.0 * next_form)));
                playerModel.leftArm.zRot = (float)(Math.toRadians(180.0) * next_form);
                playerModel.leftArm.x = (float)((double)playerModel.leftArm.x - (10.0 * next_form));
                playerModel.leftArm.y = (float)((double)playerModel.leftArm.y + ((12.0 * next_form) - (16.0 * next_form)));
                playerModel.rightLeg.xRot = 0f;
                playerModel.rightLeg.yRot = 0f;
                playerModel.rightLeg.zRot = (float)((Math.toRadians(180.0) * next_form) + (Math.toRadians(15.0) * next_form));
                playerModel.rightLeg.x = (float)((double)playerModel.rightLeg.x + (4.0 * next_form));
                playerModel.rightLeg.y = (float)((double)playerModel.rightLeg.y - (24.0 * next_form));
                playerModel.leftLeg.xRot = 0f;
                playerModel.leftLeg.yRot = 0f;
                playerModel.leftLeg.zRot = (float)((Math.toRadians(180.0) * next_form) - (Math.toRadians(15.0) * next_form));
                playerModel.leftLeg.x = (float)((double)playerModel.leftLeg.x - (4.0 * next_form));
                playerModel.leftLeg.y = (float)((double)playerModel.leftLeg.y - (24.0 * next_form));
                playerModel.rightArm.xRot = (float)Math.toRadians(((-15.0 * Math.sin(form2)) * form));
                playerModel.rightArm.yRot = (float)Math.toRadians(((52.5 * Math.cos(form2)) * form));
                playerModel.rightArm.zRot = (float)Math.toRadians(((52.5 * Math.sin(form2)) * form));
            } else {
                if (entity.getPersistentData().getDouble("cnt3") <= 16.0) {
                    next_form = Math.min(((entity.getPersistentData().getDouble("cnt3") - 8.0) * 0.25), 1.0);
                    form2 = (1.0 - next_form);
                    playerModel.head.zRot = (float)(Math.toRadians(180.0) + (Math.toRadians(180.0) * next_form));
                    playerModel.head.y = (float)((double)playerModel.head.y + ((16.0 * form2) - (16.0 * form2)));
                    playerModel.body.zRot = (float)(Math.toRadians(180.0) + (Math.toRadians(180.0) * next_form));
                    playerModel.body.y = (float)((double)playerModel.body.y + ((16.0 * form2) - (16.0 * form2)));
                    playerModel.rightArm.zRot = (float)(Math.toRadians(180.0) + (Math.toRadians(180.0) * next_form));
                    playerModel.rightArm.x = (float)((double)playerModel.rightArm.x + (10.0 * form2));
                    playerModel.rightArm.y = (float)((double)playerModel.rightArm.y + ((12.0 * form2) - (16.0 * form2)));
                    playerModel.leftArm.zRot = (float)(Math.toRadians(180.0) + (Math.toRadians(180.0) * next_form));
                    playerModel.leftArm.x = (float)((double)playerModel.leftArm.x - (10.0 * form2));
                    playerModel.leftArm.y = (float)((double)playerModel.leftArm.y + ((12.0 * form2) - (16.0 * form2)));
                    playerModel.rightLeg.xRot = 0f;
                    playerModel.rightLeg.yRot = 0f;
                    playerModel.rightLeg.zRot = (float)(Math.toRadians(180.0) + ((Math.toRadians(180.0) * next_form) + (Math.toRadians(15.0) * form2)));
                    playerModel.rightLeg.x = (float)((double)playerModel.rightLeg.x + (4.0 * form2));
                    playerModel.rightLeg.y = (float)((double)playerModel.rightLeg.y - (24.0 * form2));
                    playerModel.leftLeg.xRot = 0f;
                    playerModel.leftLeg.yRot = 0f;
                    playerModel.leftLeg.zRot = (float)(Math.toRadians(180.0) + ((Math.toRadians(180.0) * next_form) - (Math.toRadians(15.0) * form2)));
                    playerModel.leftLeg.x = (float)((double)playerModel.leftLeg.x - (4.0 * form2));
                    playerModel.leftLeg.y = (float)((double)playerModel.leftLeg.y - (24.0 * form2));
                }
            }
        }
    }

    // original procedure: Wind8Procedure
    private static void wind8(Entity entity, PlayerModel<?> playerModel) {
        double form = 0.0;
        form = 0.0;
        if (entity.getPersistentData().getDouble("breathes") == 508.0) {
            form = Math.min((entity.getPersistentData().getDouble("cnt1") * 0.25), 1.0);
            playerModel.head.xRot = (float)(Math.toRadians(90.0) * form);
            playerModel.head.y = (float)((double)playerModel.head.y + (-2.0 * form));
            playerModel.head.z = (float)((double)playerModel.head.z + (-8.0 * form));
            playerModel.body.y = (float)((double)playerModel.body.y + (-3.0 * form));
            playerModel.body.z = (float)((double)playerModel.body.z + (-7.0 * form));
            playerModel.body.xRot = (float)(Math.toRadians(45.0) * form);
            playerModel.rightArm.y = (float)((double)playerModel.rightArm.y + (-3.0 * form));
            playerModel.rightArm.z = (float)((double)playerModel.rightArm.z + (-6.0 * form));
            playerModel.rightArm.xRot = (float)(Math.toRadians(25.0) * form);
            playerModel.rightArm.zRot = (float)(Math.toRadians(70.0) * form);
            playerModel.leftArm.y = (float)((double)playerModel.leftArm.y + (-3.0 * form));
            playerModel.leftArm.z = (float)((double)playerModel.leftArm.z + (-6.0 * form));
            playerModel.leftArm.zRot = (float)(Math.toRadians(95.0) * form);
            playerModel.rightLeg.y = (float)((double)playerModel.rightLeg.y + (-5.0 * form));
            playerModel.rightLeg.z = (float)((double)playerModel.rightLeg.z + (-4.0 * form));
            playerModel.rightLeg.xRot = (float)(Math.toRadians(80.0) * form);
            playerModel.leftLeg.y = (float)((double)playerModel.leftLeg.y + (-5.0 * form));
            playerModel.leftLeg.xRot = (float)(Math.toRadians(65.0) * form);
        }
    }

    // original procedure: Wind9Procedure
    private static void wind9(Entity entity, PlayerModel<?> playerModel) {
        double cnt_test = 0.0;
        cnt_test = 0.0;
        if ((entity.getPersistentData().getDouble("breathes") == 509.0 && (entity.getPersistentData().getBoolean("flag_breathes") && entity.getPersistentData().getDouble("cnt3") <= 16.0))) {
            cnt_test = Math.toRadians(Math.min((entity.getPersistentData().getDouble("cnt3") * 22.5), 360.0));
            playerModel.head.xRot = (float)(cnt_test + Math.toRadians(20.0));
            playerModel.head.y = (float)((double)playerModel.head.y + ((Math.cos(cnt_test) * -8.0) + 8.0));
            playerModel.head.z = (float)((double)playerModel.head.z + (Math.sin(cnt_test) * -8.0));
            playerModel.body.xRot = (float)cnt_test;
            playerModel.body.y = (float)((double)playerModel.body.y + ((Math.cos(cnt_test) * -8.0) + 8.0));
            playerModel.body.z = (float)((double)playerModel.body.z + (Math.sin(cnt_test) * -8.0));
            playerModel.rightArm.xRot = (float)(cnt_test - Math.toRadians(45.0));
            playerModel.rightArm.yRot = (float)Math.toRadians(-22.5);
            playerModel.rightArm.zRot = (float)Math.toRadians(-15.0);
            playerModel.rightArm.y = (float)((double)playerModel.rightArm.y + ((Math.cos(cnt_test) * -8.0) + 8.0));
            playerModel.rightArm.z = (float)((double)playerModel.rightArm.z + (Math.sin(cnt_test) * -8.0));
            playerModel.leftArm.xRot = (float)(cnt_test - Math.toRadians(45.0));
            playerModel.leftArm.yRot = (float)Math.toRadians(22.5);
            playerModel.leftArm.zRot = (float)Math.toRadians(15.0);
            playerModel.leftArm.y = (float)((double)playerModel.leftArm.y + ((Math.cos(cnt_test) * -8.0) + 8.0));
            playerModel.leftArm.z = (float)((double)playerModel.leftArm.z + (Math.sin(cnt_test) * -8.0));
            playerModel.rightLeg.xRot = (float)(cnt_test - Math.toRadians(20.0));
            playerModel.rightLeg.y = (float)((double)playerModel.rightLeg.y + ((Math.cos(cnt_test) * 4.0) - 4.0));
            playerModel.rightLeg.z = (float)((double)playerModel.rightLeg.z + (Math.sin(cnt_test) * 4.0));
            playerModel.leftLeg.xRot = (float)(cnt_test - Math.toRadians(10.0));
            playerModel.leftLeg.y = (float)((double)playerModel.leftLeg.y + ((Math.cos(cnt_test) * 4.0) - 4.0));
            playerModel.leftLeg.z = (float)((double)playerModel.leftLeg.z + (Math.sin(cnt_test) * 4.0));
        }
    }

    // original procedure: Sun1Procedure
    private static void sun1(Entity entity, PlayerModel<?> playerModel) {
    }

    // original procedure: Sun2Procedure
    private static void sun2(Entity entity, PlayerModel<?> playerModel) {
        double form = 0.0;
        double form2 = 0.0;
        form = 0.0;
        form2 = 0.0;
        if ((entity.getPersistentData().getDouble("breathes") == 1202.0 || (entity.getPersistentData().getDouble("breathes") == 202.0 || (entity.getPersistentData().getDouble("breathes") == 1213.0 && entity.getPersistentData().getDouble("cnt4") == 1.0)))) {
            form = Math.min((entity.getPersistentData().getDouble("cnt1") * 0.125), 1.0);
            form2 = Math.min((entity.getPersistentData().getDouble("cnt2") * 0.15), 1.0);
            if (entity.getPersistentData().getDouble("cnt2") >= 20.0) {
                form = (1.0 - Math.min(((entity.getPersistentData().getDouble("cnt2") - 20.0) * 0.1), 1.0));
                form2 = (1.0 - Math.min(((entity.getPersistentData().getDouble("cnt2") - 20.0) * 0.1), 1.0));
            } else {
                playerModel.head.xRot = (float)((Math.toRadians(80.0) * form) + (Math.toRadians(1.0) * form2));
                playerModel.head.yRot = (float)(Math.toRadians(5.0) * form2);
                playerModel.head.zRot = (float)(Math.toRadians(30.0) * form2);
            }
            playerModel.body.xRot = (float)((Math.toRadians(80.0) * form) + (Math.toRadians(2.0) * form2));
            playerModel.body.yRot = (float)(Math.toRadians(7.0) * form2);
            playerModel.body.zRot = (float)(Math.toRadians(45.0) * form2);
            playerModel.rightArm.xRot = (float)((Math.toRadians(8.7) * form) + (Math.toRadians(-24.0) * form2));
            playerModel.rightArm.yRot = (float)((Math.toRadians(-50.0) * form) + (Math.toRadians(120.0) * form2));
            playerModel.rightArm.zRot = (float)((Math.toRadians(-57.0) * form) + (Math.toRadians(114.0) * form2));
            playerModel.leftArm.xRot = (float)((Math.toRadians(26.0) * form) + (Math.toRadians(-45.0) * form2));
            playerModel.leftArm.yRot = (float)((Math.toRadians(55.0) * form) + (Math.toRadians(4.0) * form2));
            playerModel.leftArm.zRot = (float)((Math.toRadians(55.0) * form) + (Math.toRadians(-15.0) * form2));
            playerModel.rightLeg.y = (float)((double)playerModel.rightLeg.y + ((-10.0 * form) + (-2.0 * form2)));
            playerModel.rightLeg.z = (float)(10.0 * form);
            playerModel.rightLeg.xRot = (float)(Math.toRadians(65.0) * form);
            playerModel.rightLeg.yRot = 0f;
            playerModel.rightLeg.zRot = (float)(Math.toRadians(15.0) * form);
            playerModel.leftLeg.y = (float)((double)playerModel.leftLeg.y + ((-10.0 * form) + (1.5 * form2)));
            playerModel.leftLeg.z = (float)(10.0 * form);
            playerModel.leftLeg.xRot = (float)(Math.toRadians(65.0) * form);
            playerModel.leftLeg.yRot = 0f;
            playerModel.leftLeg.zRot = (float)(Math.toRadians(-15.0) * form);
        }
    }

    // original procedure: Sun3Procedure
    private static void sun3(Entity entity, PlayerModel<?> playerModel) {
        double form = 0.0;
        double form2 = 0.0;
        form = 0.0;
        form2 = 0.0;
        if ((entity.getPersistentData().getDouble("breathes") == 1203.0 || (entity.getPersistentData().getDouble("breathes") == 203.0 || (entity.getPersistentData().getDouble("breathes") == 1213.0 && entity.getPersistentData().getDouble("cnt4") == 2.0)))) {
            if (entity.getPersistentData().getDouble("cnt3") == 1.0) {
                form = Math.min(((entity.getPersistentData().getDouble("cnt1") + 4.0) * 0.5), 1.0);
                form2 = Math.min((Math.max(((entity.getPersistentData().getDouble("cnt1") + 4.0) - 2.0), 0.0) * 0.38), 1.0);
                playerModel.rightArm.xRot = (float)((Math.toRadians(-135.0) * form) + (Math.toRadians(-65.0) * form2));
                playerModel.rightArm.yRot = (float)((Math.toRadians(-37.0) * form) + (Math.toRadians(-159.0) * form2));
                playerModel.rightArm.zRot = (float)((Math.toRadians(55.0) * form) + (Math.toRadians(195.0) * form2));
                playerModel.leftArm.xRot = (float)((Math.toRadians(-67.0) * form) + (Math.toRadians(-33.0) * form2));
                playerModel.leftArm.yRot = (float)((Math.toRadians(65.0) * form) + (Math.toRadians(0.0) * form2));
                playerModel.leftArm.zRot = (float)((Math.toRadians(-3.0) * form) + (Math.toRadians(0.0) * form2));
                playerModel.leftArm.x = (float)((double)playerModel.leftArm.x + (-5.0 * form2));
                entity.getPersistentData().putDouble("rax_left", (double)playerModel.leftArm.xRot);
                entity.getPersistentData().putDouble("ray_left", (double)playerModel.leftArm.yRot);
                entity.getPersistentData().putDouble("raz_left", (double)playerModel.leftArm.zRot);
            } else {
                if (entity.getPersistentData().getDouble("cnt3") == 2.0) {
                    form = Math.min(((entity.getPersistentData().getDouble("cnt1") + 4.0) * 0.5), 1.0);
                    form2 = Math.min(Math.max((((entity.getPersistentData().getDouble("cnt1") + 4.0) - 2.0) * 0.38), 0.0), 1.0);
                    playerModel.rightArm.x = (float)((double)playerModel.rightArm.x + ((5.0 * form) + (-5.0 * form2)));
                    playerModel.leftArm.x = (float)((double)playerModel.leftArm.x + (0.0 * form));
                    playerModel.rightArm.xRot = (float)((double)playerModel.rightArm.xRot + ((Math.toRadians(65.0) * form) + (Math.toRadians(106.0) * form2)));
                    playerModel.rightArm.yRot = (float)((double)playerModel.rightArm.yRot + ((Math.toRadians(233.0) * form) + (Math.toRadians(-24.0) * form2)));
                    playerModel.rightArm.zRot = (float)((double)playerModel.rightArm.zRot + ((Math.toRadians(-305.0) * form) + (Math.toRadians(23.0) * form2)));
                    playerModel.leftArm.xRot = (float)(entity.getPersistentData().getDouble("rax_left") + ((Math.toRadians(33.0) * form) + (Math.toRadians(-9.0) * form2)));
                    playerModel.leftArm.yRot = (float)(entity.getPersistentData().getDouble("ray_left") + ((Math.toRadians(0.0) * form) + (Math.toRadians(0.0) * form2)));
                    playerModel.leftArm.zRot = (float)(entity.getPersistentData().getDouble("raz_left") + ((Math.toRadians(0.0) * form) + (Math.toRadians(-22.0) * form2)));
                }
            }
        }
    }

    // original procedure: Sun4Procedure
    private static void sun4(Entity entity, PlayerModel<?> playerModel) {
        double form = 0.0;
        double form2 = 0.0;
        form = 0.0;
        form2 = 0.0;
        if ((entity.getPersistentData().getDouble("breathes") == 1204.0 || (entity.getPersistentData().getDouble("breathes") == 204.0 || (entity.getPersistentData().getDouble("breathes") == 1213.0 && entity.getPersistentData().getDouble("cnt4") == 3.0)))) {
            form = Math.min((entity.getPersistentData().getDouble("cnt1") * 0.2), 1.0);
            form2 = Math.toRadians((entity.getPersistentData().getDouble("cnt1") * -30.0));
            playerModel.rightArm.xRot = (float)(Math.toRadians((-45.0 + (30.0 * Math.sin(form2)))) * form);
            playerModel.rightArm.yRot = (float)(Math.toRadians((-22.5 + (30.0 * Math.cos(form2)))) * form);
            playerModel.rightArm.zRot = (float)(Math.toRadians((-22.5 + (30.0 * Math.sin(form2)))) * form);
            playerModel.leftArm.xRot = (float)(Math.toRadians((-45.0 + (30.0 * Math.sin(form2)))) * form);
            playerModel.leftArm.yRot = (float)(Math.toRadians((22.5 + (30.0 * Math.cos(form2)))) * form);
            playerModel.leftArm.zRot = (float)(Math.toRadians((22.5 + (30.0 * Math.sin(form2)))) * form);
        }
    }

    // original procedure: Sun5Procedure
    private static void sun5(Entity entity, PlayerModel<?> playerModel) {
        double form = 0.0;
        form = 0.0;
        if ((entity.getPersistentData().getDouble("breathes") == 1205.0 || (entity.getPersistentData().getDouble("breathes") == 205.0 || (entity.getPersistentData().getDouble("breathes") == 1213.0 && entity.getPersistentData().getDouble("cnt4") == 4.0)))) {
            form = Math.min((entity.getPersistentData().getDouble("cnt1") * 0.15), 1.0);
            playerModel.head.z = (float)((double)playerModel.head.z + (-6.0 * form));
            playerModel.head.y = (float)((double)playerModel.head.y + (2.0 * form));
            playerModel.body.y = (float)((double)playerModel.body.y + (2.0 * form));
            playerModel.body.z = (float)((double)playerModel.body.z + (-5.0 * form));
            playerModel.body.xRot = (float)(Math.toRadians(24.0) * form);
            playerModel.body.yRot = (float)(Math.toRadians(-20.0) * form);
            playerModel.body.zRot = (float)(Math.toRadians(-10.0) * form);
            playerModel.rightArm.x = (float)((double)playerModel.rightArm.x + (1.0 * form));
            playerModel.rightArm.y = (float)((double)playerModel.rightArm.y + (2.0 * form));
            playerModel.rightArm.z = (float)((double)playerModel.rightArm.z + (-6.0 * form));
            playerModel.rightArm.xRot = (float)(Math.toRadians(-31.0) * form);
            playerModel.rightArm.yRot = (float)(Math.toRadians(-24.0) * form);
            playerModel.rightArm.zRot = (float)(Math.toRadians(-24.0) * form);
            playerModel.leftArm.x = (float)((double)playerModel.leftArm.x + (-1.0 * form));
            playerModel.leftArm.y = (float)((double)playerModel.leftArm.yRot + (2.0 * form));
            playerModel.leftArm.z = (float)((double)playerModel.leftArm.z + (-5.0 * form));
            playerModel.leftArm.xRot = (float)(Math.toRadians(-20.0) * form);
            playerModel.leftArm.yRot = (float)(Math.toRadians(21.0) * form);
            playerModel.leftArm.zRot = (float)(Math.toRadians(13.0) * form);
            playerModel.rightLeg.y = (float)((double)playerModel.rightLeg.y + (0.5 * form));
            playerModel.rightLeg.xRot = (float)(Math.toRadians(-30.0) * form);
            playerModel.rightLeg.yRot = 0f;
            playerModel.rightLeg.zRot = 0f;
            playerModel.leftLeg.y = (float)((double)playerModel.leftLeg.y + (1.0 * form));
            playerModel.leftLeg.xRot = (float)(Math.toRadians(40.0) * form);
            playerModel.leftLeg.yRot = 0f;
            playerModel.leftLeg.zRot = 0f;
        }
    }

    // original procedure: Sun6Procedure
    private static void sun6(Entity entity, PlayerModel<?> playerModel) {
        double form = 0.0;
        double form2 = 0.0;
        form = 0.0;
        form2 = 0.0;
        if ((entity.getPersistentData().getDouble("breathes") == 1206.0 || (entity.getPersistentData().getDouble("breathes") == 206.0 || (entity.getPersistentData().getDouble("breathes") == 1213.0 && entity.getPersistentData().getDouble("cnt4") == 5.0)))) {
            if ((KimetsuAnimationVariables.PlayerAnimeCnt == 0.0 || KimetsuAnimationVariables.PlayerAnimeCnt == 1.0)) {
                if ((double)Math.abs(playerModel.rightArm.yRot) > Math.toRadians(8.0)) {
                    if (!KimetsuAnimationVariables.PlayerAnimeFlag) {
                        KimetsuAnimationVariables.PlayerAnimeFlag = true;
                        KimetsuAnimationVariables.PlayerAnimeMode = (KimetsuAnimationVariables.PlayerAnimeMode + 1.0);
                    }
                } else {
                    KimetsuAnimationVariables.PlayerAnimeFlag = false;
                }
            }
            form = Math.min((entity.getPersistentData().getDouble("cnt1") * 0.2), 1.0);
            form2 = KimetsuAnimationVariables.PlayerAnimeCnt;
            playerModel.rightArm.xRot = (float)((Math.toRadians(-145.0) * form) + (Math.toRadians(10.0) * form2));
            playerModel.rightArm.yRot = (float)((Math.toRadians(55.0) * form) + (Math.toRadians(-92.0) * form2));
            playerModel.rightArm.zRot = (float)((Math.toRadians(-145.0) * form) + (Math.toRadians(200.0) * form2));
            playerModel.leftArm.xRot = (float)((Math.toRadians(-26.5) * form) + (Math.toRadians(-40.0) * form2));
            playerModel.leftArm.yRot = (float)((Math.toRadians(45.0) * form) + (Math.toRadians(20.0) * form2));
            playerModel.leftArm.zRot = (float)((Math.toRadians(15.0) * form) + (Math.toRadians(-12.0) * form2));
        }
    }

    // original procedure: Sun7Procedure
    private static void sun7(Entity entity, PlayerModel<?> playerModel) {
        double form = 0.0;
        double rad = 0.0;
        double cnt_test = 0.0;
        form = 0.0;
        rad = 0.0;
        cnt_test = 0.0;
        if ((entity.getPersistentData().getDouble("breathes") == 1207.0 || (entity.getPersistentData().getDouble("breathes") == 207.0 || (entity.getPersistentData().getDouble("breathes") == 1213.0 && entity.getPersistentData().getDouble("cnt4") == 6.0)))) {
            if (entity.getPersistentData().getDouble("cnt1") <= 8.0) {
                form = Math.min((entity.getPersistentData().getDouble("cnt1") * 0.125), 1.0);
                playerModel.head.zRot = (float)(Math.toRadians(180.0) * form);
                playerModel.head.y = (float)(((double)playerModel.head.y + (16.0 * form)) - (16.0 * form));
                playerModel.body.zRot = (float)(Math.toRadians(180.0) * form);
                playerModel.body.y = (float)(((double)playerModel.body.y + (16.0 * form)) - (16.0 * form));
                playerModel.rightArm.zRot = (float)(Math.toRadians(180.0) * form);
                playerModel.rightArm.x = (float)((double)playerModel.rightArm.x + (10.0 * form));
                playerModel.rightArm.y = (float)(((double)playerModel.rightArm.y + (12.0 * form)) - (16.0 * form));
                playerModel.leftArm.zRot = (float)(Math.toRadians(180.0) * form);
                playerModel.leftArm.x = (float)((double)playerModel.leftArm.x - (10.0 * form));
                playerModel.leftArm.y = (float)(((double)playerModel.leftArm.y + (12.0 * form)) - (16.0 * form));
                playerModel.rightLeg.xRot = 0f;
                playerModel.rightLeg.yRot = 0f;
                playerModel.rightLeg.zRot = (float)((Math.toRadians(180.0) * form) + (Math.toRadians(15.0) * form));
                playerModel.rightLeg.x = (float)((double)playerModel.rightLeg.x + (4.0 * form));
                playerModel.rightLeg.y = (float)(((double)playerModel.rightLeg.y - (8.0 * form)) - (16.0 * form));
                playerModel.leftLeg.xRot = 0f;
                playerModel.leftLeg.yRot = 0f;
                playerModel.leftLeg.zRot = (float)((Math.toRadians(180.0) * form) - (Math.toRadians(15.0) * form));
                playerModel.leftLeg.x = (float)((double)playerModel.leftLeg.x - (4.0 * form));
                playerModel.leftLeg.y = (float)(((double)playerModel.leftLeg.y - (8.0 * form)) - (16.0 * form));
            } else {
                form = Math.min(((entity.getPersistentData().getDouble("cnt1") - 8.0) * 0.125), 1.0);
                cnt_test = (1.0 - form);
                playerModel.head.zRot = (float)(Math.toRadians(180.0) + (Math.toRadians(180.0) * form));
                playerModel.head.y = (float)(((double)playerModel.head.y + (16.0 * cnt_test)) - (16.0 * cnt_test));
                playerModel.body.zRot = (float)(Math.toRadians(180.0) + (Math.toRadians(180.0) * form));
                playerModel.body.y = (float)(((double)playerModel.body.y + (16.0 * cnt_test)) - (16.0 * cnt_test));
                playerModel.rightArm.zRot = (float)(Math.toRadians(180.0) + (Math.toRadians(180.0) * form));
                playerModel.rightArm.x = (float)((double)playerModel.rightArm.x + (10.0 * cnt_test));
                playerModel.rightArm.y = (float)(((double)playerModel.rightArm.y + (12.0 * cnt_test)) - (16.0 * cnt_test));
                playerModel.leftArm.zRot = (float)(Math.toRadians(180.0) + (Math.toRadians(180.0) * form));
                playerModel.leftArm.x = (float)((double)playerModel.leftArm.x - (10.0 * cnt_test));
                playerModel.leftArm.y = (float)(((double)playerModel.leftArm.y + (12.0 * cnt_test)) - (16.0 * cnt_test));
                playerModel.rightLeg.xRot = 0f;
                playerModel.rightLeg.yRot = 0f;
                playerModel.rightLeg.zRot = (float)(Math.toRadians(180.0) + ((Math.toRadians(180.0) * form) + (Math.toRadians(15.0) * cnt_test)));
                playerModel.rightLeg.x = (float)((double)playerModel.rightLeg.x + (4.0 * cnt_test));
                playerModel.rightLeg.y = (float)(((double)playerModel.rightLeg.y - (8.0 * cnt_test)) - (16.0 * cnt_test));
                playerModel.leftLeg.xRot = 0f;
                playerModel.leftLeg.yRot = 0f;
                playerModel.leftLeg.zRot = (float)(Math.toRadians(180.0) + ((Math.toRadians(180.0) * form) - (Math.toRadians(15.0) * cnt_test)));
                playerModel.leftLeg.x = (float)((double)playerModel.leftLeg.x - (4.0 * cnt_test));
                playerModel.leftLeg.y = (float)(((double)playerModel.leftLeg.y - (8.0 * cnt_test)) - (16.0 * cnt_test));
            }
        }
    }

    // original procedure: Sun8Procedure
    private static void sun8(Entity entity, PlayerModel<?> playerModel) {
        double form = 0.0;
        double form2 = 0.0;
        form = 0.0;
        form2 = 0.0;
    }

    // original procedure: Sun9Procedure
    private static void sun9(Entity entity, PlayerModel<?> playerModel) {
        double form = 0.0;
        double cnt_test = 0.0;
        form = 0.0;
        cnt_test = 0.0;
        if ((entity.getPersistentData().getDouble("breathes") == 1209.0 || (entity.getPersistentData().getDouble("breathes") == 209.0 || (entity.getPersistentData().getDouble("breathes") == 1213.0 && entity.getPersistentData().getDouble("cnt4") == 8.0)))) {
            if (entity.getPersistentData().getDouble("cnt1") <= 5.0) {
                form = Math.min((entity.getPersistentData().getDouble("cnt1") * 0.15), 1.0);
                playerModel.head.zRot = (float)(Math.toRadians(180.0) * form);
                playerModel.head.y = (float)(((double)playerModel.head.y + (16.0 * form)) - (16.0 * form));
                playerModel.body.zRot = (float)(Math.toRadians(180.0) * form);
                playerModel.body.y = (float)(((double)playerModel.body.y + (16.0 * form)) - (16.0 * form));
                playerModel.rightArm.zRot = (float)(Math.toRadians(180.0) * form);
                playerModel.rightArm.x = (float)((double)playerModel.rightArm.x + (10.0 * form));
                playerModel.rightArm.y = (float)(((double)playerModel.rightArm.y + (12.0 * form)) - (16.0 * form));
                playerModel.leftArm.zRot = (float)(Math.toRadians(180.0) * form);
                playerModel.leftArm.x = (float)((double)playerModel.leftArm.x - (10.0 * form));
                playerModel.leftArm.y = (float)(((double)playerModel.leftArm.y + (12.0 * form)) - (16.0 * form));
                playerModel.rightLeg.xRot = 0f;
                playerModel.rightLeg.yRot = 0f;
                playerModel.rightLeg.zRot = (float)((Math.toRadians(180.0) * form) + (Math.toRadians(15.0) * form));
                playerModel.rightLeg.x = (float)((double)playerModel.rightLeg.x + (4.0 * form));
                playerModel.rightLeg.y = (float)(((double)playerModel.rightLeg.y - (8.0 * form)) - (16.0 * form));
                playerModel.leftLeg.xRot = 0f;
                playerModel.leftLeg.yRot = 0f;
                playerModel.leftLeg.zRot = (float)((Math.toRadians(180.0) * form) - (Math.toRadians(15.0) * form));
                playerModel.leftLeg.x = (float)((double)playerModel.leftLeg.x - (4.0 * form));
                playerModel.leftLeg.y = (float)(((double)playerModel.leftLeg.y - (8.0 * form)) - (16.0 * form));
            } else {
                form = Math.min(((entity.getPersistentData().getDouble("cnt1") - 5.0) * 0.15), 1.0);
                cnt_test = (1.0 - form);
                playerModel.head.zRot = (float)(Math.toRadians(180.0) + (Math.toRadians(180.0) * form));
                playerModel.head.y = (float)(((double)playerModel.head.y + (16.0 * cnt_test)) - (16.0 * cnt_test));
                playerModel.body.zRot = (float)(Math.toRadians(180.0) + (Math.toRadians(180.0) * form));
                playerModel.body.y = (float)(((double)playerModel.body.y + (16.0 * cnt_test)) - (16.0 * cnt_test));
                playerModel.rightArm.zRot = (float)(Math.toRadians(180.0) + (Math.toRadians(180.0) * form));
                playerModel.rightArm.x = (float)((double)playerModel.rightArm.x + (10.0 * cnt_test));
                playerModel.rightArm.y = (float)(((double)playerModel.rightArm.y + (12.0 * cnt_test)) - (16.0 * cnt_test));
                playerModel.leftArm.zRot = (float)(Math.toRadians(180.0) + (Math.toRadians(180.0) * form));
                playerModel.leftArm.x = (float)((double)playerModel.leftArm.x - (10.0 * cnt_test));
                playerModel.leftArm.y = (float)(((double)playerModel.leftArm.y + (12.0 * cnt_test)) - (16.0 * cnt_test));
                playerModel.rightLeg.xRot = 0f;
                playerModel.rightLeg.yRot = 0f;
                playerModel.rightLeg.zRot = (float)(Math.toRadians(180.0) + ((Math.toRadians(180.0) * form) + (Math.toRadians(15.0) * cnt_test)));
                playerModel.rightLeg.x = (float)((double)playerModel.rightLeg.x + (4.0 * cnt_test));
                playerModel.rightLeg.y = (float)(((double)playerModel.rightLeg.y - (8.0 * cnt_test)) - (16.0 * cnt_test));
                playerModel.leftLeg.xRot = 0f;
                playerModel.leftLeg.yRot = 0f;
                playerModel.leftLeg.zRot = (float)(Math.toRadians(180.0) + ((Math.toRadians(180.0) * form) - (Math.toRadians(15.0) * cnt_test)));
                playerModel.leftLeg.x = (float)((double)playerModel.leftLeg.x - (4.0 * cnt_test));
                playerModel.leftLeg.y = (float)(((double)playerModel.leftLeg.y - (8.0 * cnt_test)) - (16.0 * cnt_test));
            }
        }
    }

    // original procedure: Sun10Procedure
    private static void sun10(Entity entity, PlayerModel<?> playerModel) {
    }

    // original procedure: Sun11Procedure
    private static void sun11(Entity entity, PlayerModel<?> playerModel) {
        double cnt_test = 0.0;
        cnt_test = 0.0;
        if ((entity.getPersistentData().getDouble("breathes") == 1211.0 || (entity.getPersistentData().getDouble("breathes") == 211.0 || (entity.getPersistentData().getDouble("breathes") == 1213.0 && entity.getPersistentData().getDouble("cnt4") == 10.0)))) {
            if (entity.getPersistentData().getDouble("cnt1") > 8.0) {
                cnt_test = Math.toRadians(360.0);
            }
            playerModel.head.xRot = (float)(cnt_test + Math.toRadians(20.0));
            playerModel.head.y = (float)((double)playerModel.head.y + ((Math.cos(cnt_test) * -8.0) + 8.0));
            playerModel.head.z = (float)((double)playerModel.head.z + (Math.sin(cnt_test) * -8.0));
            playerModel.body.xRot = (float)cnt_test;
            playerModel.body.y = (float)((double)playerModel.body.y + ((Math.cos(cnt_test) * -8.0) + 8.0));
            playerModel.body.z = (float)((double)playerModel.body.z + (Math.sin(cnt_test) * -8.0));
            playerModel.rightArm.xRot = (float)(cnt_test - Math.toRadians(45.0));
            playerModel.rightArm.yRot = (float)(Math.toRadians(-22.5) * Math.cos(cnt_test));
            playerModel.rightArm.zRot = (float)Math.toRadians(-15.0);
            playerModel.rightArm.y = (float)((double)playerModel.rightArm.y + ((Math.cos(cnt_test) * -8.0) + 8.0));
            playerModel.rightArm.z = (float)((double)playerModel.rightArm.z + (Math.sin(cnt_test) * -8.0));
            playerModel.leftArm.xRot = (float)(cnt_test - Math.toRadians(45.0));
            playerModel.leftArm.yRot = (float)(Math.toRadians(22.5) * Math.cos(cnt_test));
            playerModel.leftArm.zRot = (float)Math.toRadians(15.0);
            playerModel.leftArm.y = (float)((double)playerModel.leftArm.y + ((Math.cos(cnt_test) * -8.0) + 8.0));
            playerModel.leftArm.z = (float)((double)playerModel.leftArm.z + (Math.sin(cnt_test) * -8.0));
        }
    }

    // original procedure: Sun12Procedure
    private static void sun12(Entity entity, PlayerModel<?> playerModel) {
        double form = 0.0;
        double form2 = 0.0;
        form = 0.0;
        form2 = 0.0;
        if ((entity.getPersistentData().getDouble("breathes") == 1212.0 || (entity.getPersistentData().getDouble("breathes") == 212.0 || (entity.getPersistentData().getDouble("breathes") == 1213.0 && entity.getPersistentData().getDouble("cnt4") == 11.0)))) {
            if (entity.getPersistentData().getDouble("cnt3") == 0.0) {
                form = Math.min((entity.getPersistentData().getDouble("cnt1") * 1.0), 1.0);
                form2 = Math.min(Math.max(((entity.getPersistentData().getDouble("cnt1") - 1.0) * 0.38), 0.0), 1.0);
                playerModel.head.y = (float)(3.0 * form2);
                playerModel.head.z = (float)(-4.0 * form2);
                playerModel.body.y = (float)(2.0 * form2);
                playerModel.body.z = (float)(-4.0 * form2);
                playerModel.rightArm.y = (float)(2.0 * form2);
                playerModel.rightArm.z = (float)(-4.0 * form2);
                playerModel.leftArm.y = (float)(2.0 * form2);
                playerModel.leftArm.z = (float)(-4.0 * form2);
                playerModel.body.xRot = (float)(Math.toRadians(20.0) * form2);
                playerModel.rightLeg.xRot = (float)(Math.toRadians(-20.0) * form2);
                playerModel.leftLeg.xRot = (float)(Math.toRadians(15.0) * form2);
                playerModel.rightArm.xRot = (float)((Math.toRadians(-90.0) * form) + (Math.toRadians(62.0) * form2));
                playerModel.rightArm.zRot = (float)((Math.toRadians(28.0) * form) + (Math.toRadians(-56.0) * form2));
                playerModel.rightArm.yRot = (float)((Math.toRadians(-26.0) * form) + (Math.toRadians(13.0) * form2));
                playerModel.leftArm.xRot = (float)((Math.toRadians(-120.0) * form) + (Math.toRadians(92.0) * form2));
                playerModel.leftArm.zRot = (float)((Math.toRadians(-28.0) * form) + (Math.toRadians(0.0) * form2));
                playerModel.leftArm.yRot = (float)((Math.toRadians(26.0) * form) + (Math.toRadians(-5.0) * form2));
            } else {
                if (entity.getPersistentData().getDouble("cnt3") == 1.0) {
                    form = Math.min((entity.getPersistentData().getDouble("cnt1") * 1.0), 1.0);
                    form2 = Math.min(Math.max(((entity.getPersistentData().getDouble("cnt1") - 1.0) * 0.38), 0.0), 1.0);
                    playerModel.rightArm.y = (float)((double)playerModel.rightArm.y + (-2.0 * form));
                    playerModel.rightArm.z = (float)((double)playerModel.rightArm.z + (4.0 * form));
                    playerModel.leftArm.y = (float)((double)playerModel.leftArm.y + (-2.0 * form));
                    playerModel.leftArm.z = (float)((double)playerModel.leftArm.z + (8.0 * form));
                    playerModel.head.y = (float)((double)playerModel.head.y + (-3.0 * form));
                    playerModel.head.z = (float)((double)playerModel.head.z + (4.0 * form));
                    playerModel.body.y = (float)((double)playerModel.body.y + (-2.0 * form));
                    playerModel.body.z = (float)((double)playerModel.body.z + (4.0 * form));
                    playerModel.body.xRot = (float)((double)playerModel.body.xRot + (Math.toRadians(-20.0) * form));
                    playerModel.rightLeg.xRot = (float)(Math.toRadians(-20.0) * form);
                    playerModel.leftLeg.xRot = (float)(Math.toRadians(15.0) * form);
                    playerModel.rightArm.xRot = (float)((double)playerModel.rightArm.xRot + ((Math.toRadians(48.0) * form) + (Math.toRadians(0.0) * form2)));
                    playerModel.rightArm.yRot = (float)((double)playerModel.rightArm.yRot + ((Math.toRadians(-122.0) * form) + (Math.toRadians(122.0) * form2)));
                    playerModel.rightArm.zRot = (float)((double)playerModel.rightArm.zRot + ((Math.toRadians(-57.0) * form) + (Math.toRadians(122.0) * form2)));
                    playerModel.leftArm.xRot = (float)((double)playerModel.leftArm.xRot + ((Math.toRadians(-43.0) * form) + (Math.toRadians(-168.0) * form2)));
                    playerModel.leftArm.yRot = (float)((double)playerModel.leftArm.yRot + ((Math.toRadians(-21.0) * form) + (Math.toRadians(86.0) * form2)));
                    playerModel.leftArm.zRot = (float)((double)playerModel.leftArm.zRot + ((Math.toRadians(28.0) * form) + (Math.toRadians(-73.0) * form2)));
                }
            }
        }
    }

    // original procedure: Flame1Procedure
    private static void flame1(Entity entity, PlayerModel<?> playerModel) {
        double form = 0.0;
        double form2 = 0.0;
        form = 0.0;
        form2 = 0.0;
        if (entity.getPersistentData().getDouble("breathes") == 301.0) {
            if (entity.getPersistentData().getDouble("cnt3") == 0.0) {
                form = Math.min((entity.getPersistentData().getDouble("cnt1") * 0.15), 1.0);
                form2 = 0.0;
            } else {
                form = 1.0;
                form2 = Math.min((entity.getPersistentData().getDouble("cnt1") * 0.2), 1.0);
            }
            if (!entity.isShiftKeyDown()) {
                playerModel.head.y = (float)((double)playerModel.head.y + (2.0 * form));
                playerModel.head.z = (float)((double)playerModel.head.z + (-3.0 * form));
                playerModel.body.y = (float)((double)playerModel.body.y + (1.0 * form));
                playerModel.body.z = (float)((double)playerModel.body.z + (-3.0 * form));
                playerModel.rightArm.x = (float)((double)playerModel.rightArm.x + ((1.0 * form) + (2.0 * form2)));
                playerModel.rightArm.y = (float)((double)playerModel.rightArm.y + (1.0 * form));
                playerModel.rightArm.z = (float)((double)playerModel.rightArm.z + ((-2.0 * form) + (-3.0 * form2)));
                playerModel.leftArm.x = (float)((double)playerModel.leftArm.x + (-2.0 * form));
                playerModel.leftArm.y = (float)((double)playerModel.leftArm.y + ((1.0 * form) + (-1.0 * form2)));
                playerModel.leftArm.z = (float)((double)playerModel.leftArm.z + ((-5.0 * form) + (3.0 * form2)));
                playerModel.rightLeg.x = (float)((double)playerModel.rightLeg.x + ((1.0 * form) + (-2.0 * form2)));
                playerModel.rightLeg.y = (float)((double)playerModel.rightLeg.y + ((0.0 * form) + (0.0 * form2)));
                playerModel.rightLeg.z = (float)((double)playerModel.rightLeg.z + ((1.0 * form) + (-2.0 * form2)));
                playerModel.leftLeg.x = (float)((double)playerModel.leftLeg.x + ((1.0 * form) + (-2.0 * form2)));
                playerModel.leftLeg.y = (float)((double)playerModel.leftLeg.y + ((0.0 * form) + (0.0 * form2)));
                playerModel.leftLeg.z = (float)((double)playerModel.leftLeg.z + ((-1.0 * form) + (2.0 * form2)));
            }
            playerModel.body.xRot = (float)(Math.toRadians(15.0) * form);
            playerModel.body.yRot = (float)((Math.toRadians(22.5) * form) + (Math.toRadians(-45.0) * form2));
            playerModel.rightArm.xRot = (float)((Math.toRadians(30.0) * form) + (Math.toRadians(-60.0) * form2));
            playerModel.rightArm.yRot = (float)((Math.toRadians(180.0) * form) + (Math.toRadians(-170.0) * form2));
            playerModel.rightArm.zRot = (float)((Math.toRadians(30.0) * form) + (Math.toRadians(-100.0) * form2));
            playerModel.leftArm.xRot = (float)((Math.toRadians(-22.5) * form) + (Math.toRadians(-67.5) * form2));
            playerModel.leftArm.yRot = (float)((Math.toRadians(10.0) * form) + (Math.toRadians(-40.0) * form2));
            playerModel.leftArm.zRot = (float)((Math.toRadians(60.0) * form) + (Math.toRadians(-15.0) * form2));
            playerModel.rightLeg.xRot = (float)((Math.toRadians(10.0) * form) + (Math.toRadians(-20.0) * form2));
            playerModel.leftLeg.xRot = (float)((Math.toRadians(-20.0) * form) + (Math.toRadians(40.0) * form2));
        }
    }

    // original procedure: Flame2Procedure
    private static void flame2(Entity entity, PlayerModel<?> playerModel) {
        double form = 0.0;
        double form2 = 0.0;
        form = 0.0;
        form2 = 0.0;
        if ((entity.getPersistentData().getDouble("breathes") == 302.0 || entity.getPersistentData().getDouble("breathes") == 506.0)) {
            form = Math.min((entity.getPersistentData().getDouble("cnt1") * 0.2), 1.0);
            playerModel.rightArm.x = (playerModel.rightArm.x + 2f);
            playerModel.rightArm.z = (playerModel.rightArm.z + -3.0f);
            playerModel.rightArm.xRot = (float)(Math.toRadians(4.0) + (Math.toRadians(-184.0) * form));
            playerModel.rightArm.yRot = (float)(Math.toRadians(-195.0) + (Math.toRadians(195.0) * form));
            if ((entity.getPersistentData().getDouble("cnt1") * 0.2) >= 1.0) {
                playerModel.rightArm.yRot = (float)Math.toRadians(-180.0);
            }
            playerModel.rightArm.zRot = (float)(Math.toRadians(-43.0) + (Math.toRadians(43.0) * form));
            playerModel.leftArm.y = (float)(0.0 + (-2.0 * form));
            playerModel.leftArm.xRot = (float)(Math.toRadians(6.0) + (Math.toRadians(-175.0) * form));
            playerModel.leftArm.zRot = (float)(Math.toRadians(14.0) + (Math.toRadians(-52.0) * form));
            playerModel.rightLeg.xRot = (float)Math.toRadians(-25.0);
            playerModel.leftLeg.xRot = (float)Math.toRadians(25.0);
        }
    }

    // original procedure: Flame3Procedure
    private static void flame3(Entity entity, PlayerModel<?> playerModel) {
        double form = 0.0;
        double form2 = 0.0;
        form = 0.0;
        form2 = 0.0;
        if (entity.getPersistentData().getDouble("breathes") == 303.0) {
            form = Math.min((entity.getPersistentData().getDouble("cnt1") * 0.15), 1.0);
            form2 = Math.min(Math.max(((entity.getPersistentData().getDouble("cnt1") - 10.0) * 0.1), 0.0), 1.0);
            playerModel.head.y = (float)((double)playerModel.head.y + (5.0 * form2));
            playerModel.rightArm.y = (float)((double)playerModel.rightArm.y + (5.0 * form2));
            playerModel.rightArm.xRot = (float)((Math.toRadians(-130.0) * form) + (Math.toRadians(147.0) * form2));
            playerModel.rightArm.yRot = (float)((Math.toRadians(-25.0) * form) + (Math.toRadians(7.0) * form2));
            playerModel.rightArm.zRot = (float)((Math.toRadians(20.0) * form) + (Math.toRadians(-45.0) * form2));
            playerModel.leftArm.y = (float)((double)playerModel.leftArm.y + (5.0 * form2));
            playerModel.leftArm.xRot = (float)((Math.toRadians(-130.0) * form) + (Math.toRadians(147.0) * form2));
            playerModel.leftArm.yRot = (float)((Math.toRadians(25.0) * form) + (Math.toRadians(-7.0) * form2));
            playerModel.leftArm.zRot = (float)((Math.toRadians(-20.0) * form) + (Math.toRadians(45.0) * form2));
            playerModel.body.y = (float)((double)playerModel.body.y + (5.0 * form2));
            playerModel.body.xRot = (float)(Math.toRadians(45.0) * form2);
            playerModel.rightLeg.y = (float)(((double)playerModel.rightLeg.y + (-5.0 * form2)) + (5.0 * form2));
            playerModel.rightLeg.z = (float)((double)playerModel.rightLeg.z + (8.0 * form2));
            playerModel.leftLeg.y = (float)(((double)playerModel.leftLeg.y + (-5.0 * form2)) + (5.0 * form2));
            playerModel.leftLeg.z = (float)((double)playerModel.leftLeg.z + (8.0 * form2));
        }
    }

    // original procedure: Flame4Procedure
    private static void flame4(Entity entity, PlayerModel<?> playerModel) {
        double form = 0.0;
        double form2 = 0.0;
        form = 0.0;
        form2 = 0.0;
        if (entity.getPersistentData().getDouble("breathes") == 304.0) {
            form = Math.min((entity.getPersistentData().getDouble("cnt1") * 0.2), 1.0);
            form2 = Math.toRadians((entity.getPersistentData().getDouble("cnt1") * -30.0));
            playerModel.rightArm.xRot = (float)(Math.toRadians((-45.0 + (30.0 * Math.sin(form2)))) * form);
            playerModel.rightArm.yRot = (float)(Math.toRadians((-22.5 + (30.0 * Math.cos(form2)))) * form);
            playerModel.rightArm.zRot = (float)(Math.toRadians((-22.5 + (30.0 * Math.sin(form2)))) * form);
            playerModel.leftArm.xRot = (float)(Math.toRadians((-45.0 + (30.0 * Math.sin(form2)))) * form);
            playerModel.leftArm.yRot = (float)(Math.toRadians((22.5 + (30.0 * Math.cos(form2)))) * form);
            playerModel.leftArm.zRot = (float)(Math.toRadians((22.5 + (30.0 * Math.sin(form2)))) * form);
        }
    }

    // original procedure: Flame5Procedure
    private static void flame5(Entity entity, PlayerModel<?> playerModel) {
        double form = 0.0;
        double form2 = 0.0;
        form = 0.0;
        form2 = 0.0;
        if (entity.getPersistentData().getDouble("breathes") == 305.0) {
            form = Math.min((entity.getPersistentData().getDouble("cnt1") * 0.15), 1.0);
            form2 = Math.min(Math.max(((entity.getPersistentData().getDouble("cnt1") - 10.0) * 0.1), 0.0), 1.0);
            playerModel.head.y = (float)((double)playerModel.head.y + (5.0 * form2));
            playerModel.rightArm.y = (float)((double)playerModel.rightArm.y + (5.0 * form2));
            playerModel.rightArm.xRot = (float)((Math.toRadians(-130.0) * form) + (Math.toRadians(147.0) * form2));
            playerModel.rightArm.yRot = (float)((Math.toRadians(-25.0) * form) + (Math.toRadians(7.0) * form2));
            playerModel.rightArm.zRot = (float)((Math.toRadians(20.0) * form) + (Math.toRadians(-45.0) * form2));
            playerModel.leftArm.y = (float)((double)playerModel.leftArm.y + (5.0 * form2));
            playerModel.leftArm.xRot = (float)((Math.toRadians(-130.0) * form) + (Math.toRadians(147.0) * form2));
            playerModel.leftArm.yRot = (float)((Math.toRadians(25.0) * form) + (Math.toRadians(-7.0) * form2));
            playerModel.leftArm.zRot = (float)((Math.toRadians(-20.0) * form) + (Math.toRadians(45.0) * form2));
            playerModel.body.y = (float)((double)playerModel.body.y + (5.0 * form2));
            playerModel.body.xRot = (float)(Math.toRadians(45.0) * form2);
            playerModel.rightLeg.y = (float)(((double)playerModel.rightLeg.y + (-5.0 * form2)) + (5.0 * form2));
            playerModel.rightLeg.z = (float)((double)playerModel.rightLeg.z + (8.0 * form2));
            playerModel.leftLeg.y = (float)(((double)playerModel.leftLeg.y + (-5.0 * form2)) + (5.0 * form2));
            playerModel.leftLeg.z = (float)((double)playerModel.leftLeg.z + (8.0 * form2));
        }
    }

    // original procedure: Flame9Procedure
    private static void flame9(Entity entity, PlayerModel<?> playerModel) {
        double form = 0.0;
        double form2 = 0.0;
        double form3 = 0.0;
        form = 0.0;
        form2 = 0.0;
        form3 = 0.0;
        if (entity.getPersistentData().getDouble("breathes") == 309.0) {
            if (entity.getPersistentData().getDouble("cnt3") <= 0.0) {
                form = Math.min((Math.max(entity.getPersistentData().getDouble("cnt1"), 0.0) * 0.05), 1.0);
                form2 = 0.0;
                form3 = 0.0;
            } else {
                if (entity.getPersistentData().getDouble("cnt2") == 0.0) {
                    form = 1.0;
                    form2 = Math.min((Math.max((entity.getPersistentData().getDouble("cnt1") - 30.0), 0.0) * 0.2), 1.0);
                    form3 = 0.0;
                }
            }
            if ((entity.getPersistentData().getDouble("cnt2") > 0.0 || entity.getPersistentData().getDouble("cnt1") > 35.0)) {
                form = 1.0;
                form2 = 1.0;
                form3 = Math.min(Math.max((Math.max(entity.getPersistentData().getDouble("cnt2"), 0.0) * 0.2), ((entity.getPersistentData().getDouble("cnt1") - 45.0) * 0.05)), 1.0);
            }
            if (!entity.isShiftKeyDown()) {
                playerModel.head.x = (float)((double)playerModel.head.x + ((-2.0 * form) + (2.0 * form2)));
                playerModel.head.y = (float)((double)playerModel.head.y + ((6.0 * form) + (1.0 * form2)));
                playerModel.head.z = (float)((double)playerModel.head.z + (-3.0 * form));
                playerModel.body.x = (float)((double)playerModel.body.x + ((-2.0 * form) + (2.0 * form2)));
                playerModel.body.y = (float)((double)playerModel.body.y + (6.0 * form));
                playerModel.body.z = (float)((double)playerModel.body.z + ((0.0 * form) + (-2.0 * form2)));
                playerModel.rightArm.x = (float)((double)playerModel.rightArm.x + ((5.0 * form) + (-2.0 * form2)));
                playerModel.rightArm.y = (float)((double)playerModel.rightArm.y + (4.0 * form));
                playerModel.rightArm.z = (float)((double)playerModel.rightArm.z + ((2.0 * form) + (-5.0 * form2)));
                playerModel.leftArm.x = (float)((double)playerModel.leftArm.x + ((-8.0 * form) + ((1.0 * form2) + (5.0 * form3))));
                playerModel.leftArm.y = (float)((double)playerModel.leftArm.y + ((5.0 * form) + (-1.0 * form2)));
                playerModel.leftArm.z = (float)((double)playerModel.leftArm.z + ((-2.0 * form) + ((-2.0 * form2) + (7.0 * form3))));
                playerModel.rightLeg.x = (float)((double)playerModel.rightLeg.x + (((6.0 * form) + (-3.0 * form2)) + (0.0 * form3)));
                playerModel.rightLeg.y = (float)(((double)playerModel.rightLeg.y + (1.0 * form)) + (1.0 * form2));
                playerModel.rightLeg.z = (float)((double)playerModel.rightLeg.z + ((0.0 * form) + ((5.0 * form2) + (-3.0 * form3))));
                playerModel.leftLeg.x = (float)(((double)playerModel.leftLeg.x + (2.0 * form)) + ((-1.0 * form2) + (-2.0 * form3)));
                playerModel.leftLeg.y = (float)(((double)playerModel.leftLeg.y + (1.0 * form)) + (-1.0 * form2));
                playerModel.leftLeg.z = (float)((double)playerModel.leftLeg.z + ((-3.0 * form) + ((5.0 * form2) + (0.0 * form3))));
            }
            playerModel.head.yRot = (float)((double)playerModel.head.yRot + ((Math.toRadians(25.0) * form) + (Math.toRadians(-25.0) * form2)));
            playerModel.body.xRot = (float)(((Math.toRadians(40.0) * form) + (Math.toRadians(0.0) * form2)) + (Math.toRadians(-10.0) * form3));
            playerModel.body.yRot = (float)(((Math.toRadians(110.0) * form) + (Math.toRadians(-80.0) * form2)) + (Math.toRadians(-40.0) * form3));
            playerModel.body.zRot = (float)(((Math.toRadians(0.0) * form) + (Math.toRadians(15.0) * form2)) + (Math.toRadians(-15.0) * form3));
            playerModel.rightArm.xRot = (float)(((Math.toRadians(-235.0) * form) + (Math.toRadians(-20.0) * form2)) + (Math.toRadians(220.0) * form3));
            playerModel.rightArm.yRot = (float)((Math.toRadians(45.0) * form) + (Math.toRadians(0.0) * form2));
            playerModel.rightArm.zRot = (float)((Math.toRadians(235.0) * form) + ((Math.toRadians(-20.0) * form2) + (Math.toRadians(55.0) * form3)));
            playerModel.leftArm.xRot = (float)(((Math.toRadians(70.0) * form) + (Math.toRadians(-30.0) * form2)) + (Math.toRadians(-160.0) * form3));
            playerModel.leftArm.yRot = (float)((Math.toRadians(-10.0) * form) + ((Math.toRadians(-10.0) * form2) + (Math.toRadians(-25.0) * form3)));
            playerModel.leftArm.zRot = (float)((Math.toRadians(90.0) * form) + (Math.toRadians(0.0) * form2));
            playerModel.rightLeg.xRot = (float)((Math.toRadians(0.0) * form) + ((Math.toRadians(45.0) * form2) + (Math.toRadians(-75.0) * form3)));
            playerModel.rightLeg.yRot = (float)((Math.toRadians(45.0) * form) + (Math.toRadians(-45.0) * form2));
            playerModel.rightLeg.zRot = (float)((Math.toRadians(30.0) * form) + (Math.toRadians(-25.0) * form2));
            playerModel.leftLeg.xRot = (float)((Math.toRadians(0.0) * form) + ((Math.toRadians(-10.0) * form2) + (Math.toRadians(40.0) * form3)));
            playerModel.leftLeg.yRot = (float)((Math.toRadians(40.0) * form) + (Math.toRadians(-60.0) * form2));
            playerModel.leftLeg.zRot = (float)((Math.toRadians(-30.0) * form) + (Math.toRadians(30.0) * form2));
        }
    }

    // original procedure: Thunder7Procedure
    private static void thunder7(Entity entity, PlayerModel<?> playerModel) {
        double form = 0.0;
        double form2 = 0.0;
        form = 0.0;
        form2 = 0.0;
        if (entity.getPersistentData().getDouble("breathes") == 107.0) {
            form = Math.min((entity.getPersistentData().getDouble("cnt1") * 0.1), 1.0);
            form2 = Math.min((entity.getPersistentData().getDouble("cnt2") * 0.2), 1.0);
            playerModel.head.z = (float)((double)playerModel.head.z + ((-3.0 * form) + (-3.0 * form2)));
            playerModel.head.y = (float)((double)playerModel.head.y + ((7.0 * form) + (5.0 * form2)));
            playerModel.body.z = (float)((double)playerModel.body.z + ((-4.0 * form) + (-3.0 * form2)));
            playerModel.body.y = (float)((double)playerModel.body.y + ((4.0 * form) + (7.0 * form2)));
            playerModel.rightArm.y = (float)((double)playerModel.rightArm.y + ((5.0 * form) + (5.0 * form2)));
            playerModel.rightArm.z = (float)((double)playerModel.rightArm.z + ((-2.0 * form) + (-4.0 * form2)));
            playerModel.leftArm.y = (float)((double)playerModel.leftArm.y + ((4.0 * form) + (6.0 * form2)));
            playerModel.leftArm.z = (float)((double)playerModel.leftArm.z + ((-2.0 * form) + (-4.0 * form2)));
            playerModel.rightLeg.y = (float)((double)playerModel.rightLeg.y + ((1.0 * form) + (1.0 * form2)));
            playerModel.rightLeg.z = (float)((double)playerModel.rightLeg.z + (3.0 * form));
            playerModel.leftLeg.y = (float)((double)playerModel.leftLeg.y + (3.0 * form));
            playerModel.leftLeg.z = (float)((double)playerModel.leftLeg.z + (1.5 * form));
            playerModel.head.xRot = (float)Math.toRadians(((70.0 * form) + (45.0 * form2)));
            playerModel.body.xRot = (float)Math.toRadians(((35.0 * form) + (30.0 * form2)));
            playerModel.rightArm.xRot = (float)Math.toRadians(((-150.0 * form) + (150.0 * form2)));
            playerModel.rightArm.yRot = (float)Math.toRadians((-15.0 * form));
            playerModel.rightArm.zRot = (float)Math.toRadians((130.0 * form));
            playerModel.leftArm.xRot = (float)Math.toRadians(((15.0 * form) + (20.0 * form2)));
            playerModel.leftArm.yRot = (float)Math.toRadians((0.0 * form));
            playerModel.leftArm.zRot = (float)Math.toRadians(((0.0 * form) + (7.5 * form2)));
            playerModel.leftLeg.xRot = (float)((double)playerModel.leftLeg.xRot + Math.toRadians((45.0 * form)));
            playerModel.rightLeg.xRot = (float)((double)playerModel.rightLeg.xRot - Math.toRadians((22.5 * form)));
        }
    }

    // original procedure: Thunder2Procedure
    private static void thunder2(Entity entity, PlayerModel<?> playerModel) {
        double form = 0.0;
        double form2 = 0.0;
        form = 0.0;
        form2 = 0.0;
    }

    // original procedure: Thunder3Procedure
    private static void thunder3(Entity entity, PlayerModel<?> playerModel) {
        double form = 0.0;
        double form2 = 0.0;
        double next_form = 0.0;
        form = 0.0;
        form2 = 0.0;
        next_form = 0.0;
        if (entity.getPersistentData().getDouble("breathes") == 103.0) {
            form = Math.min(((entity.getPersistentData().getDouble("cnt1") * 0.38) - entity.getPersistentData().getDouble("cnt1_box")), 1.0);
            if ((entity.getPersistentData().getDouble("cnt1") % 3.0) == 0.0) {
                entity.getPersistentData().putDouble("cnt1_box", entity.getPersistentData().getDouble("cnt1"));
                entity.getPersistentData().putDouble("hand_direction1", (double)Math.round((Math.random() * 360.0)));
                entity.getPersistentData().putDouble("hand_direction2", (double)Math.round((Math.random() * 360.0)));
                entity.getPersistentData().putDouble("hand_direction3", (double)Math.round((Math.random() * 360.0)));
                entity.getPersistentData().putDouble("hand_direction4", (double)Math.round((Math.random() * 360.0)));
                entity.getPersistentData().putDouble("hand_direction5", (double)Math.round((Math.random() * 360.0)));
                entity.getPersistentData().putDouble("hand_direction6", (double)Math.round((Math.random() * 360.0)));
            }
            if (entity.getPersistentData().getDouble("cnt1") <= 20.0) {
                next_form = Math.min((entity.getPersistentData().getDouble("cnt1") * 0.2), 1.0);
                playerModel.head.zRot = (float)(Math.toRadians(180.0) * next_form);
                playerModel.head.y = (float)((double)playerModel.head.y + ((16.0 * next_form) - (16.0 * next_form)));
                playerModel.body.zRot = (float)(Math.toRadians(180.0) * next_form);
                playerModel.body.y = (float)((double)playerModel.body.y + ((16.0 * next_form) - (16.0 * next_form)));
                playerModel.rightArm.zRot = (float)(Math.toRadians(180.0) * next_form);
                playerModel.rightArm.x = (float)((double)playerModel.rightArm.x + (10.0 * next_form));
                playerModel.rightArm.y = (float)((double)playerModel.rightArm.y + ((12.0 * next_form) - (16.0 * next_form)));
                playerModel.leftArm.zRot = (float)(Math.toRadians(180.0) * next_form);
                playerModel.leftArm.x = (float)((double)playerModel.leftArm.x - (10.0 * next_form));
                playerModel.leftArm.y = (float)((double)playerModel.leftArm.y + ((12.0 * next_form) - (16.0 * next_form)));
                playerModel.rightLeg.xRot = 0f;
                playerModel.rightLeg.yRot = 0f;
                playerModel.rightLeg.zRot = (float)((Math.toRadians(180.0) * next_form) + (Math.toRadians(15.0) * next_form));
                playerModel.rightLeg.x = (float)((double)playerModel.rightLeg.x + (4.0 * next_form));
                playerModel.rightLeg.y = (float)((double)playerModel.rightLeg.y - (24.0 * next_form));
                playerModel.leftLeg.xRot = 0f;
                playerModel.leftLeg.yRot = 0f;
                playerModel.leftLeg.zRot = (float)((Math.toRadians(180.0) * next_form) - (Math.toRadians(15.0) * next_form));
                playerModel.leftLeg.x = (float)((double)playerModel.leftLeg.x - (4.0 * next_form));
                playerModel.leftLeg.y = (float)((double)playerModel.leftLeg.y - (24.0 * next_form));
            } else {
                next_form = Math.min(((entity.getPersistentData().getDouble("cnt1") - 20.0) * 0.2), 1.0);
                form2 = (1.0 - next_form);
                playerModel.head.zRot = (float)(Math.toRadians(180.0) + (Math.toRadians(180.0) * next_form));
                playerModel.head.y = (float)((double)playerModel.head.y + ((16.0 * form2) - (16.0 * form2)));
                playerModel.body.zRot = (float)(Math.toRadians(180.0) + (Math.toRadians(180.0) * next_form));
                playerModel.body.y = (float)((double)playerModel.body.y + ((16.0 * form2) - (16.0 * form2)));
                playerModel.rightArm.zRot = (float)(Math.toRadians(180.0) + (Math.toRadians(180.0) * next_form));
                playerModel.rightArm.x = (float)((double)playerModel.rightArm.x + (10.0 * form2));
                playerModel.rightArm.y = (float)((double)playerModel.rightArm.y + ((12.0 * form2) - (16.0 * form2)));
                playerModel.leftArm.zRot = (float)(Math.toRadians(180.0) + (Math.toRadians(180.0) * next_form));
                playerModel.leftArm.x = (float)((double)playerModel.leftArm.x - (10.0 * form2));
                playerModel.leftArm.y = (float)((double)playerModel.leftArm.y + ((12.0 * form2) - (16.0 * form2)));
                playerModel.rightLeg.xRot = 0f;
                playerModel.rightLeg.yRot = 0f;
                playerModel.rightLeg.zRot = (float)(Math.toRadians(180.0) + ((Math.toRadians(180.0) * next_form) + (Math.toRadians(15.0) * form2)));
                playerModel.rightLeg.x = (float)((double)playerModel.rightLeg.x + (4.0 * form2));
                playerModel.rightLeg.y = (float)((double)playerModel.rightLeg.y - (24.0 * form2));
                playerModel.leftLeg.xRot = 0f;
                playerModel.leftLeg.yRot = 0f;
                playerModel.leftLeg.zRot = (float)(Math.toRadians(180.0) + ((Math.toRadians(180.0) * next_form) - (Math.toRadians(15.0) * form2)));
                playerModel.leftLeg.x = (float)((double)playerModel.leftLeg.x - (4.0 * form2));
                playerModel.leftLeg.y = (float)((double)playerModel.leftLeg.y - (24.0 * form2));
            }
            playerModel.rightArm.xRot = (float)((double)playerModel.rightArm.xRot + ((Math.toRadians(entity.getPersistentData().getDouble("hand_direction1")) - (double)playerModel.rightArm.xRot) * form));
            playerModel.rightArm.yRot = (float)((double)playerModel.rightArm.yRot + ((Math.toRadians(entity.getPersistentData().getDouble("hand_direction2")) - (double)playerModel.rightArm.yRot) * form));
            playerModel.rightArm.zRot = (float)((double)playerModel.rightArm.zRot + ((Math.toRadians(entity.getPersistentData().getDouble("hand_direction3")) - (double)playerModel.rightArm.zRot) * form));
        }
    }

    // original procedure: Flower1Procedure
    private static void flower1(Entity entity, PlayerModel<?> playerModel) {
        double form = 0.0;
        double form2 = 0.0;
        form = 0.0;
        form2 = 0.0;
    }

    // original procedure: Flower2Procedure
    private static void flower2(Entity entity, PlayerModel<?> playerModel) {
        double form = 0.0;
        double form2 = 0.0;
        form = 0.0;
        form2 = 0.0;
    }

    // original procedure: Flower3Procedure
    private static void flower3(Entity entity, PlayerModel<?> playerModel) {
        double form = 0.0;
        double form2 = 0.0;
        form = 0.0;
        form2 = 0.0;
    }

    // original procedure: Flower4Procedure
    private static void flower4(Entity entity, PlayerModel<?> playerModel) {
        double form = 0.0;
        double form2 = 0.0;
        form = 0.0;
        form2 = 0.0;
        if (entity.getPersistentData().getDouble("breathes") == 1404.0) {
            form = Math.min((entity.getPersistentData().getDouble("cnt1") * 1.0), 1.0);
            form2 = Math.min((Math.max((entity.getPersistentData().getDouble("cnt1") - 1.0), 0.0) * 0.38), 1.0);
            playerModel.rightArm.xRot = (float)((Math.toRadians(-105.0) * form) + (Math.toRadians(-41.0) * form2));
            playerModel.rightArm.yRot = (float)((Math.toRadians(-37.0) * form) + (Math.toRadians(-147.0) * form2));
            playerModel.rightArm.zRot = (float)((Math.toRadians(66.0) * form) + (Math.toRadians(173.0) * form2));
            playerModel.leftArm.xRot = (float)((Math.toRadians(-75.0) * form) + (Math.toRadians(-15.0) * form2));
            playerModel.leftArm.yRot = (float)((Math.toRadians(40.0) * form) + (Math.toRadians(46.0) * form2));
            playerModel.leftArm.zRot = (float)((Math.toRadians(0.0) * form) + (Math.toRadians(-7.0) * form2));
            playerModel.rightLeg.xRot = (float)(Math.toRadians(15.0) * form);
            playerModel.leftLeg.xRot = (float)(Math.toRadians(9.0) * form);
            playerModel.head.y = (float)((double)playerModel.head.y + (-4.0 * form));
            playerModel.body.y = (float)((double)playerModel.body.y + (-4.0 * form));
            playerModel.rightArm.x = (float)((double)playerModel.rightArm.x + (1.0 * form2));
            playerModel.rightArm.y = (float)((double)playerModel.rightArm.y + (-4.0 * form));
            playerModel.leftArm.x = (float)((double)playerModel.leftArm.x + (-3.0 * form2));
            playerModel.leftArm.y = (float)((double)playerModel.leftArm.y + (-4.0 * form));
            playerModel.rightLeg.y = (float)((double)playerModel.rightLeg.y + (-4.0 * form));
            playerModel.rightLeg.z = (float)((double)playerModel.rightLeg.z + (2.0 * form));
            playerModel.leftLeg.y = (float)((double)playerModel.leftLeg.y + (-6.0 * form));
            playerModel.leftLeg.z = (float)((double)playerModel.leftLeg.z + (-3.0 * form));
        }
    }

    // original procedure: Flower5Procedure
    private static void flower5(Entity entity, PlayerModel<?> playerModel) {
        double form = 0.0;
        double form2 = 0.0;
        double cnt_num = 0.0;
        form = 0.0;
        form2 = 0.0;
        cnt_num = 0.0;
        if ((entity.getPersistentData().getDouble("breathes") == 1405.0 || entity.getPersistentData().getDouble("breathes") == 102.0)) {
            cnt_num = entity.getPersistentData().getDouble("cnt3");
            form = Math.min(((cnt_num * 0.38) - entity.getPersistentData().getDouble("cnt3_box")), 1.0);
            if ((cnt_num % 3.0) == 0.0) {
                entity.getPersistentData().putDouble("cnt3_box", cnt_num);
                entity.getPersistentData().putDouble("hand_direction1", (double)Math.round(((Math.random() * 90.0) * -1.0)));
                entity.getPersistentData().putDouble("hand_direction2", (double)Math.round(((Math.random() * 60.0) * -1.0)));
                entity.getPersistentData().putDouble("hand_direction3", (double)Math.round(((Math.random() * 90.0) * -1.0)));
            }
            playerModel.rightArm.xRot = (float)((double)playerModel.rightArm.xRot + ((Math.toRadians(entity.getPersistentData().getDouble("hand_direction1")) - (double)playerModel.rightArm.xRot) * form));
            playerModel.rightArm.yRot = (float)Math.max((Math.toRadians(entity.getPersistentData().getDouble("hand_direction2")) * form), Math.toRadians(-60.0));
            playerModel.rightArm.zRot = (float)((double)playerModel.rightArm.zRot + ((Math.toRadians(entity.getPersistentData().getDouble("hand_direction3")) - (double)playerModel.rightArm.zRot) * form));
        }
    }

    // original procedure: Beast1Procedure
    private static void beast1(Entity entity, PlayerModel<?> playerModel) {
        double form = 0.0;
        double form2 = 0.0;
        form = 0.0;
        form2 = 0.0;
    }

    // original procedure: Beast2Procedure
    private static void beast2(Entity entity, PlayerModel<?> playerModel) {
        double form = 0.0;
        double form2 = 0.0;
        form = 0.0;
        form2 = 0.0;
    }

    // original procedure: Beast3Procedure
    private static void beast3(Entity entity, PlayerModel<?> playerModel) {
        double form = 0.0;
        double form2 = 0.0;
        form = 0.0;
        form2 = 0.0;
    }

    // original procedure: Beast4Procedure
    private static void beast4(Entity entity, PlayerModel<?> playerModel) {
        double form = 0.0;
        double form2 = 0.0;
        form = 0.0;
        form2 = 0.0;
    }

    // original procedure: Beast5Procedure
    private static void beast5(Entity entity, PlayerModel<?> playerModel) {
        double form = 0.0;
        double form2 = 0.0;
        form = 0.0;
        form2 = 0.0;
        if ((entity.getPersistentData().getDouble("breathes") == 302.0 || entity.getPersistentData().getDouble("breathes") == 506.0)) {
            form = Math.min((entity.getPersistentData().getDouble("cnt1") * 0.2), 1.0);
            playerModel.rightArm.x = (playerModel.rightArm.x + 2f);
            playerModel.rightArm.z = (playerModel.rightArm.z + -3.0f);
            playerModel.rightArm.xRot = (float)(Math.toRadians(4.0) + (Math.toRadians(-184.0) * form));
            playerModel.rightArm.yRot = (float)(Math.toRadians(-195.0) + (Math.toRadians(195.0) * form));
            if ((entity.getPersistentData().getDouble("cnt1") * 0.2) >= 1.0) {
                playerModel.rightArm.yRot = (float)Math.toRadians(-180.0);
            }
            playerModel.rightArm.zRot = (float)(Math.toRadians(-43.0) + (Math.toRadians(43.0) * form));
            playerModel.leftArm.y = (float)(0.0 + (-2.0 * form));
            playerModel.leftArm.xRot = (float)(Math.toRadians(6.0) + (Math.toRadians(-175.0) * form));
            playerModel.leftArm.zRot = (float)(Math.toRadians(14.0) + (Math.toRadians(-52.0) * form));
            playerModel.rightLeg.xRot = (float)Math.toRadians(-25.0);
            playerModel.leftLeg.xRot = (float)Math.toRadians(25.0);
        }
    }

    // original procedure: Mist1Procedure
    private static void mist1(Entity entity, PlayerModel<?> playerModel) {
    }

    // original procedure: Mist2Procedure
    private static void mist2(Entity entity, PlayerModel<?> playerModel) {
    }

    // original procedure: Mist3Procedure
    private static void mist3(Entity entity, PlayerModel<?> playerModel) {
        double form = 0.0;
        double form_math = 0.0;
        form = 0.0;
        form_math = 0.0;
        if (entity.getPersistentData().getDouble("breathes") == 403.0) {
            form_math = (entity.getPersistentData().getDouble("cnt1") * 0.25);
            if (entity.getPersistentData().getDouble("cnt1") < 5.0) {
                form = Math.min(form_math, 1.0);
                playerModel.head.yRot = (float)(Math.toRadians(180.0) * form);
                playerModel.body.yRot = (float)(Math.toRadians(180.0) * form);
                playerModel.rightArm.xRot = (float)(Math.toRadians(180.0) * form);
                playerModel.rightArm.zRot = (float)(Math.toRadians(80.0) * form);
                playerModel.leftArm.yRot = (float)(Math.toRadians(180.0) * form);
                playerModel.rightLeg.yRot = (float)(Math.toRadians(180.0) * form);
                playerModel.leftLeg.yRot = (float)(Math.toRadians(180.0) * form);
            } else {
                form = Math.min(Math.max((form_math - 4.0), 0.0), 1.0);
                playerModel.head.yRot = (float)((double)playerModel.head.yRot + (Math.toRadians(180.0) * form));
                playerModel.body.yRot = (float)((double)playerModel.body.yRot + (Math.toRadians(180.0) * form));
                playerModel.rightArm.xRot = (float)((double)playerModel.rightArm.yRot + (Math.toRadians(180.0) * form));
                playerModel.rightArm.zRot = (float)Math.toRadians(80.0);
                playerModel.leftArm.yRot = (float)((double)playerModel.leftArm.yRot + (Math.toRadians(180.0) * form));
                playerModel.rightLeg.yRot = (float)((double)playerModel.rightLeg.yRot + (Math.toRadians(180.0) * form));
                playerModel.leftLeg.yRot = (float)((double)playerModel.leftLeg.yRot + (Math.toRadians(180.0) * form));
            }
        }
    }

    // original procedure: Mist4Procedure
    private static void mist4(Entity entity, PlayerModel<?> playerModel) {
    }

    // original procedure: Mist5Procedure
    private static void mist5(Entity entity, PlayerModel<?> playerModel) {
        double form = 0.0;
        double next_form = 0.0;
        form = 0.0;
        next_form = 0.0;
        if ((entity.getPersistentData().getDouble("breathes") == 405.0 || entity.getPersistentData().getDouble("breathes") == 1702.0)) {
            if (entity.getPersistentData().getDouble("breathes") == 1702.0) {
                next_form = entity.getPersistentData().getDouble("cnt2");
            } else {
                next_form = entity.getPersistentData().getDouble("cnt1");
            }
            form = Math.min(((next_form * 0.38) - entity.getPersistentData().getDouble("cnt1_box")), 1.0);
            if ((entity.getPersistentData().getDouble("cnt1") % 3.0) == 0.0) {
                entity.getPersistentData().putDouble("cnt1_box", next_form);
                entity.getPersistentData().putDouble("hand_direction1", (double)Math.round((Math.random() * 180.0)));
                entity.getPersistentData().putDouble("hand_direction2", (double)Math.round((Math.random() * 180.0)));
                entity.getPersistentData().putDouble("hand_direction3", (double)Math.round((Math.random() * 180.0)));
            }
            playerModel.rightArm.xRot = (float)((double)playerModel.rightArm.xRot + ((Math.toRadians(entity.getPersistentData().getDouble("hand_direction1")) - (double)playerModel.rightArm.xRot) * form));
            playerModel.rightArm.yRot = (float)((double)playerModel.rightArm.yRot + ((Math.toRadians(entity.getPersistentData().getDouble("hand_direction2")) - (double)playerModel.rightArm.yRot) * form));
            playerModel.rightArm.zRot = (float)((double)playerModel.rightArm.zRot + ((Math.toRadians(entity.getPersistentData().getDouble("hand_direction3")) - (double)playerModel.rightArm.zRot) * form));
        }
    }

    // original procedure: Mist6Procedure
    private static void mist6(Entity entity, PlayerModel<?> playerModel) {
        double form = 0.0;
        form = 0.0;
        if (entity.getPersistentData().getDouble("breathes") == 406.0) {
            form = Math.min((entity.getPersistentData().getDouble("cnt1") * 0.2), 1.0);
            playerModel.head.y = (float)((double)playerModel.head.y + (10.0 * form));
            playerModel.head.yRot = (float)(Math.toRadians(45.0) * form);
            playerModel.head.zRot = (float)(Math.toRadians(180.0) * form);
            playerModel.body.y = (float)((double)playerModel.body.y + (11.0 * form));
            playerModel.body.xRot = (float)(Math.toRadians(27.0) * form);
            playerModel.body.zRot = (float)(Math.toRadians(180.0) * form);
            playerModel.rightArm.x = (float)((double)playerModel.rightArm.x + (10.0 * form));
            playerModel.rightArm.y = (float)((double)playerModel.rightArm.y + (6.0 * form));
            playerModel.rightArm.xRot = (float)(Math.toRadians(-39.0) * form);
            playerModel.rightArm.zRot = (float)(Math.toRadians(140.0) * form);
            playerModel.leftArm.x = (float)((double)playerModel.leftArm.x + (-10.0 * form));
            playerModel.leftArm.y = (float)((double)playerModel.leftArm.y + (6.0 * form));
            playerModel.leftArm.xRot = (float)(Math.toRadians(-33.0) * form);
            playerModel.leftArm.zRot = (float)(Math.toRadians(198.0) * form);
            playerModel.rightLeg.x = (float)((double)playerModel.rightLeg.x + (4.0 * form));
            playerModel.rightLeg.y = (float)((double)playerModel.rightLeg.y + (-10.0 * form));
            playerModel.rightLeg.z = (float)((double)playerModel.rightLeg.z + (5.0 * form));
            playerModel.rightLeg.xRot = (float)(Math.toRadians(104.0) * form);
            playerModel.rightLeg.zRot = (float)(Math.toRadians(180.0) * form);
            playerModel.leftLeg.x = (float)((double)playerModel.leftLeg.x + (-4.0 * form));
            playerModel.leftLeg.y = (float)((double)playerModel.leftLeg.y + (-10.0 * form));
            playerModel.leftLeg.z = (float)((double)playerModel.leftLeg.z + (5.0 * form));
            playerModel.leftLeg.xRot = (float)(Math.toRadians(-35.0) * form);
            playerModel.leftLeg.zRot = (float)(Math.toRadians(180.0) * form);
        }
    }

}
