package me.earth.phobos.manager;

import me.earth.phobos.features.modules.client.Cosmetics;
import me.earth.phobos.util.Util;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.player.EntityPlayer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CosmeticsManager
        implements Util {
    public Map<String, List<ModelBase>> cosmeticsUserMap = new HashMap<String, List<ModelBase>>();

    public CosmeticsManager() {
        this.cosmeticsUserMap.put("0fb898f6-5614-48e9-aca1-f8b39ecfb7fe", Arrays.asList(Cosmetics.INSTANCE.santaHatModel, Cosmetics.INSTANCE.glassesModel));
        this.cosmeticsUserMap.put("0fb898f6-5614-48e9-aca1-f8b39ecfb7fe", Arrays.asList(new ModelBase[]{Cosmetics.INSTANCE.cloutGoggles}));
        this.cosmeticsUserMap.put("0fb898f6-5614-48e9-aca1-f8b39ecfb7fe", Arrays.asList(new ModelBase[]{Cosmetics.INSTANCE.cloutGoggles}));
        this.cosmeticsUserMap.put("0fb898f6-5614-48e9-aca1-f8b39ecfb7fe", Arrays.asList(new ModelBase[]{Cosmetics.INSTANCE.squidLauncher}));
        this.cosmeticsUserMap.put("0fb898f6-5614-48e9-aca1-f8b39ecfb7fe", Arrays.asList(new ModelBase[]{Cosmetics.INSTANCE.squidLauncher}));
        this.cosmeticsUserMap.put("0fb898f6-5614-48e9-aca1-f8b39ecfb7fe", Arrays.asList(new ModelBase[]{Cosmetics.INSTANCE.squidLauncher}));
        this.cosmeticsUserMap.put("0fb898f6-5614-48e9-aca1-f8b39ecfb7fe", Arrays.asList(Cosmetics.INSTANCE.glassesModel, Cosmetics.INSTANCE.squidLauncher));
        this.cosmeticsUserMap.put("0fb898f6-5614-48e9-aca1-f8b39ecfb7fe", Arrays.asList(new ModelBase[]{Cosmetics.INSTANCE.santaHatModel}));
    }

    public List<ModelBase> getRenderModels(EntityPlayer player) {
        return this.cosmeticsUserMap.get(player.getUniqueID().toString());
    }

    public boolean hasCosmetics(EntityPlayer player) {
        return this.cosmeticsUserMap.containsKey(player.getUniqueID().toString());
    }
}

