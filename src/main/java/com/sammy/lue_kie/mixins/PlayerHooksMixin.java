package com.sammy.lue_kie.mixins;

import com.legacy.blue_skies.asm_hooks.PlayerHooks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlayerHooks.class)
abstract class PlayerHooksMixin {
    @Inject(method = "isNerfableTool", at = @At("HEAD"), cancellable = true, remap = false)
    private static synchronized void isNerfableToolMixin(ItemStack stack, BlockState state, CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(false);
    }
}