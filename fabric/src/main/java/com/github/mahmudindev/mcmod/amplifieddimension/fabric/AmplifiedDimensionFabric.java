package com.github.mahmudindev.mcmod.amplifieddimension.fabric;

import com.github.mahmudindev.mcmod.amplifieddimension.AmplifiedDimension;
import net.fabricmc.api.ModInitializer;

public final class AmplifiedDimensionFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        // Run our common setup.
        AmplifiedDimension.init();
    }
}
