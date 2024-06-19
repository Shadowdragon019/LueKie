package com.sammy.lue_kie.mixins;

import com.legacy.blue_skies.asm_hooks.LivingEntityHooks;
import net.minecraft.world.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LivingEntityHooks.class)
abstract public class LivingEntityHooksMixin {
    @Inject(method = "getArmorValue", at = @At("HEAD"), cancellable = true, remap = false)
    private static void getArmorValueMixin(int original, LivingEntity entity, CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(original);
    }
}
