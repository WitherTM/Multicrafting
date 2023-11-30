package tm.wither.multicrafting;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.crafting.ShapelessRecipe;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModRecipeTypes {
    public static final DeferredRegister<RecipeType<?>> RECIPE_TYPES =
            DeferredRegister.create(BuiltInRegistries.RECIPE_TYPE, MultiCrafting.MOD_ID);
    public static final DeferredHolder<RecipeType<?>, RecipeType<?>> MULTI_SHAPELESS = RECIPE_TYPES.register("shapeless",
            () -> RecipeType.register("shapeless"));
}
