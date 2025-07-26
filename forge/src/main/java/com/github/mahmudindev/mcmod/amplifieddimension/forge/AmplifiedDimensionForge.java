package com.github.mahmudindev.mcmod.amplifieddimension.forge;

import com.github.mahmudindev.mcmod.amplifieddimension.AmplifiedDimension;
import net.minecraftforge.fml.common.Mod;

@Mod(AmplifiedDimension.MOD_ID)
public final class AmplifiedDimensionForge {
    public AmplifiedDimensionForge() {
        // Run our common setup.
        AmplifiedDimension.init();
    }
}
