package com.github.mahmudindev.mcmod.amplifieddimension;

import com.github.mahmudindev.mcmod.amplifieddimension.platform.Services;
import com.github.mahmudindev.mcmod.amplifieddimension.platform.services.IPlatformHelper;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public final class AmplifiedDimension {
    public static final String MOD_ID = "amplifieddimension";
    public static final Logger LOGGER = LogUtils.getLogger();
    public static final IPlatformHelper PLATFORM = Services.PLATFORM;

    public static void init() {
        // Write common init code here.
    }
}
