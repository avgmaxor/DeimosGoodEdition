package me.earth.phobos.features.modules.client;

import me.earth.phobos.features.modules.Module;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.util.ResourceLocation;

import java.util.*;

public class Capes
        extends Module {
    public static final ResourceLocation THREEVT_CAPE = new ResourceLocation("textures/3vt2.png");
    public static final ResourceLocation ZBOB_CAPE = new ResourceLocation("textures/zb0b.png");
    public static final ResourceLocation OHARE_CAPE = new ResourceLocation("textures/ohare.png");
    public static final ResourceLocation SQUID_CAPE = new ResourceLocation("textures/squidcape.png");
    public static final ResourceLocation DEIMOS_CAPE = new ResourceLocation("textures/capedeimos.png");
    public static final ResourceLocation WDS_CAPE = new ResourceLocation("wds.png");
    public static Map<String, String[]> UUIDs = new HashMap<String, String[]>();
    private static Capes instance;

    public Capes() {
        super("Capes", "Renders the client's capes", Module.Category.CLIENT, false, false, false);
        UUIDs.put("Megyn", new String[]{"a5e36d37-5fbe-4481-b5be-1f06baee1f1c", "7de842e8-af08-49ed-9d0c-4071e2a99f00", "8ca55379-c872-4299-987d-d20962badd11", "e6e8bf7e-0b23-4d2e-b2ae-c40c5ff4eecc"});
        UUIDs.put("TheRealDunk", new String[]{"e95f8c71-47ee-4c1c-8690-f7600fbc5654"});
        UUIDs.put("3vt", new String[]{"19bf3f1f-fe06-4c86-bea5-3dad5df89714", "b0836db9-2472-4ba6-a1b7-92c605f5e80d"});
        UUIDs.put("twin0us", new String[]{"0fb898f6-5614-48e9-aca1-f8b39ecfb7fe"});
        UUIDs.put("Squid", new String[]{"811c9272-9793-4fdd-980d-778e8ad2e54c", "09410a87-dfc8-476c-9acb-04bd07126c6e", "2eb88d28-7a26-43ad-81aa-113bd818d977"});
        UUIDs.put("rpai", new String[]{"41a09a67-19fc-4cee-a2d5-517a80543490"});
        UUIDs.put("rTe_", new String[]{"98fbd85b-96fc-4101-8e56-ec7e689cea51"});
        UUIDs.put("Soulbond", new String[]{"b0fef2d5-c244-4a8f-b353-83f62b826391"});
        UUIDs.put("PyroClientUser", new String[]{"5f1b3187-b9e7-4af6-a272-5afde9bcb0fd"});
        UUIDs.put("xEuclides", new String[]{"de455cd2-cfcb-4e5e-a746-cc8df16e527c"});
        UUIDs.put("Tkoog", new String[]{"db7a606f-51c3-4f06-bf9f-9da888c8afad"});
        UUIDs.put("Ravenster2", new String[]{"ba235e70-f857-482c-ae20-ff207ea1109d"});
        UUIDs.put("CRYSTALPVPWAIFU", new String[]{"01e506da-3888-4a73-a67b-5c2848b01304"});
        UUIDs.put("WaifuDeathSquad", new String[]{"4b61aa99-70c4-4d51-bf8f-a016552c097b"});
        UUIDs.put("0quinny", new String[]{"a2d9bf24-2c1b-4974-ae42-d98e601e96fa"});
        UUIDs.put("Astolfo___", new String[]{"c30e8bb6-ae50-438a-81e4-07abf389f400"});
        UUIDs.put("_Risinq_", new String[]{"3ff7cd52-eff8-4e90-9490-d22df0aaa7b5"});
        UUIDs.put("Vunq", new String[]{"51803a6b-58d0-4c03-a132-7547020d6845"});
        instance = this;
    }

    public static Capes getInstance() {
        if (instance == null) {
            instance = new Capes();
        }
        return instance;
    }

    public static ResourceLocation getCapeResource(AbstractClientPlayer player) {
        for (String name : UUIDs.keySet()) {
            for (String uuid : UUIDs.get(name)) {
                if (name.equalsIgnoreCase("TheRealDunk") && player.getUniqueID().toString().equals(uuid)) {
                    return DEIMOS_CAPE;
                }
                if (name.equalsIgnoreCase("rpai") && player.getUniqueID().toString().equals(uuid)) {
                    return DEIMOS_CAPE;
                }
                if (name.equalsIgnoreCase("rTe_") && player.getUniqueID().toString().equals(uuid)) {
                    return DEIMOS_CAPE;
                }
                if (name.equalsIgnoreCase("twin0us") && player.getUniqueID().toString().equals(uuid)) {
                    return DEIMOS_CAPE;
    			}
                if (name.equalsIgnoreCase("Soulbond") && player.getUniqueID().toString().equals(uuid)) {
                    return DEIMOS_CAPE;
                }
                if (name.equalsIgnoreCase("PyroClientUser") && player.getUniqueID().toString().equals(uuid)) {
                    return WDS_CAPE;
                }
                if (name.equalsIgnoreCase("xEuclides") && player.getUniqueID().toString().equals(uuid)) {
                    return WDS_CAPE;
                }
                if (name.equalsIgnoreCase("Tkoqq") && player.getUniqueID().toString().equals(uuid)) {
                    return WDS_CAPE;
                }
                if (name.equalsIgnoreCase("Ravenster2") && player.getUniqueID().toString().equals(uuid)) {
                    return WDS_CAPE;
                }
                if (name.equalsIgnoreCase("CRYSTALPVPWAIFU") && player.getUniqueID().toString().equals(uuid)) {
                    return WDS_CAPE;
                }
                if (name.equalsIgnoreCase("WaifuDeathSquad") && player.getUniqueID().toString().equals(uuid)) {
                    return WDS_CAPE;
                }
                if (name.equalsIgnoreCase("0quinny") && player.getUniqueID().toString().equals(uuid)) {
                    return WDS_CAPE;
    			}
                if (name.equalsIgnoreCase("Astolfo___") && player.getUniqueID().toString().equals(uuid)) {
                    return WDS_CAPE;
                }
                if (name.equalsIgnoreCase("_Risinq_") && player.getUniqueID().toString().equals(uuid)) {
                    return WDS_CAPE;
                }
                if (name.equalsIgnoreCase("Vunq") && player.getUniqueID().toString().equals(uuid)) {
                    return WDS_CAPE;
                }
                if (!name.equalsIgnoreCase("oHare") || !player.getUniqueID().toString().equals(uuid)) continue;
                return OHARE_CAPE;
            }
        }
        return null;
    }

    public static boolean hasCape(UUID uuid) {
        Iterator<String> iterator = UUIDs.keySet().iterator();
        if (iterator.hasNext()) {
            String name = iterator.next();
            return Arrays.asList((Object[]) UUIDs.get(name)).contains(uuid.toString());
        }
        return false;
    }
}

