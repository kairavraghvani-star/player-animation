# kimetsuAnimationPlayer - Minecraft 1.20.1 (Forge 47.x) port

Build (Java 17 + Gradle 8.x installed, internet needed once):

    gradle wrapper --gradle-version 8.1.1     # only if you have no ./gradlew yet
    ./gradlew build

The jar appears in build/libs/. Test in-game with `./gradlew runClient`.

## What changed vs. the 1.16.5 mod
- Obfuscate dependency removed. Its PlayerModelEvent hook is replaced by `AnimatedPlayerModel`,
  swapped into the default/slim player renderers (client/ClientModelHooks).
- All 64 pose procedures are in client/KimetsuAnimations (same math, same order as the original MCreator element order).
- ArmorToughness / Water3Tick / Water5Tick / Sun6Tick logic is in KimetsuTickEvents.
- Mapping changes: ModelRenderer->ModelPart, rotateAngle*->xRot/yRot/zRot, rotationPoint*->x/y/z,
  CompoundNBT->CompoundTag, LivingUpdateEvent->LivingTickEvent, isCrouching()->isShiftKeyDown() (shift flag), etc.
- Same NBT keys as before (breathes, cnt1..cnt4, demon_art, ...): whatever set them in 1.16.5 must exist in 1.20.1.

## No local setup: build the jar on GitHub
1. Create a new GitHub repository and upload everything in this folder (including the hidden `.github` folder).
2. Open the repository's **Actions** tab and wait for "Build mod jar" to finish (a few minutes).
3. Open that run and download the **KimetsuAnimation-1.20.1-jar** artifact. The .jar inside goes in your 1.20.1 Forge `mods` folder.
