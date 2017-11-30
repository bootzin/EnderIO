package crazypants.enderio.machines.machine.slicensplice;

import crazypants.enderio.base.recipe.MachineRecipeRegistry;
import crazypants.enderio.base.recipe.ManyToOneMachineRecipe;
import crazypants.enderio.base.recipe.ManyToOneRecipeManager;
import crazypants.enderio.machines.init.MachineObject;

public class SliceAndSpliceRecipeManager extends ManyToOneRecipeManager {

  static final SliceAndSpliceRecipeManager instance = new SliceAndSpliceRecipeManager();

  public static SliceAndSpliceRecipeManager getInstance() {
    return instance;
  }

  public SliceAndSpliceRecipeManager() {
    super("SliceAndSpliceRecipes_Core.xml", "SliceAndSpliceRecipes_User.xml", "Slice'N'Splice");
  }

  @Override
  public void loadRecipesFromConfig() {
    super.loadRecipesFromConfig();
    MachineRecipeRegistry.instance.registerRecipe(MachineObject.block_slice_and_splice.getUnlocalisedName(), new ManyToOneMachineRecipe("SpliceAndSpliceRecipe",
        MachineObject.block_alloy_smelter.getUnlocalisedName(), this));
  }

}