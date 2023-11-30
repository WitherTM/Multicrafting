package tm.wither.multicrafting;

import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.ModConfigSpec;

// An example config class. This is not required, but it's a good idea to have one to keep your config organized.
// Demonstrates how to use Forge's config APIs
@Mod.EventBusSubscriber(modid = MultiCrafting.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Config {
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    // a list of strings that are treated as resource locations for items

    static final ModConfigSpec SPEC = BUILDER.build();

}
