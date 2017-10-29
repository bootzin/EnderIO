package crazypants.enderio.machine.soul;

import static crazypants.enderio.machine.MachineObject.itemMaterial;

import crazypants.enderio.config.Config;
import crazypants.enderio.material.material.Material;
import crazypants.util.CapturedMob;
import net.minecraft.item.ItemStack;

public class SoulBinderPrecientCystalRecipe extends AbstractSoulBinderRecipe {

  public static SoulBinderPrecientCystalRecipe instance = new SoulBinderPrecientCystalRecipe();

  private SoulBinderPrecientCystalRecipe() {
    super(Config.soulBinderPrecientCystalRF, Config.soulBinderPrecientCystalLevels, "SoulBinderPrecientCystalRecipe", "Shulker");
  }

  @Override
  public ItemStack getInputStack() {
    return new ItemStack(itemMaterial.getItem(), 1, Material.VIBRANT_CYSTAL.ordinal());
  }

  @Override
  public ItemStack getOutputStack() {
    return new ItemStack(itemMaterial.getItem(), 1, Material.PRECIENT_CRYSTAL.ordinal());
  }

  @Override
  protected ItemStack getOutputStack(ItemStack input, CapturedMob mobType) {
    return getOutputStack();
  }

}
