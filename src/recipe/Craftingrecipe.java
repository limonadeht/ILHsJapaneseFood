package recipe;

import common.Register;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Craftingrecipe{
	public static void registerFeliModServerModCraftingRecipes(){
        GameRegistry.addRecipe(new ItemStack(Register.itemSaba),
                "c",
                "f",
                "c",
                'f', Items.fish,
                'c', Items.coal
        );
        GameRegistry.addRecipe(new ItemStack(Register.itemSabakanFood),
                "iii",
                "isi",
                "iii",
                's', Register.itemSaba,
                'i', Items.iron_ingot
        );
        GameRegistry.addRecipe(new ItemStack(Register.itemEnderCannon),
                "c",
                "f",
                "c",
                'f', Register.ItemFoodCrystal,
                'c', Items.ender_pearl
        );
   }

	/*public void onCrafting(EntityPlayer player, ItemStack item, IInventory craftMatrix) {
		for (int i = 0; i < craftMatrix.getSizeInventory(); i++) // Checks all
																	// the slots
		{
			if (craftMatrix.getStackInSlot(i) != null) // If there is an item
			{
				ItemStack j = craftMatrix.getStackInSlot(i); // Gets the item
				if (j.getItem() != null && j.getItem() == FeliModServerModItems.ItemFoodCrystal)
				{
					ItemStack k = new ItemStack(FeliModServerModItems.ItemFoodCrystal, 2, (j.getItemDamage() + 1));
					if (k.getItemDamage() >= k.getMaxDamage()) {
						k.stackSize--;
					}
					craftMatrix.setInventorySlotContents(i, k);
				}
			}
		}
	}*/
}

