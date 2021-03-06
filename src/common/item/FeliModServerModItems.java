package common.item;

import java.awt.Color;

import common.FeliModServerMod;
import common.block.FeliModServerModBlocks;
import common.food.itemFoodsample;
import common.food.itemLimoneFood;
import common.food.itemSaba;
import common.food.itemSabakanFood;
import common.food.itemYakinikudonburi;
import common.food.itemYakinikudonburi_mk2;
import common.food.itemYakinikudonburi_mk3;
import common.food.itemYakinikudonburi_mk4;
import common.food.itemYakinikudonburi_mk5;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemSpade;
import net.minecraftforge.common.util.EnumHelper;

public class FeliModServerModItems
{
	public static Item itemFoodsample;

	public static Item itemLimoneFood;

	public static Item itemSabakanFood;
	public static Item itemSaba;

	public static Item itemDebug;
	public static Item ItemFoodCrystal;

	public static Item itemYakinikudonburi;
	public static Item itemYakinikudonburi_mk2;
	public static Item itemYakinikudonburi_mk3;
	public static Item itemYakinikudonburi_mk4;
	public static Item itemYakinikudonburi_mk5;
	public static Item itemRice;

	public static Item itemRiceSeed;

	public static Item itemEnderCannon;
	public static Item ItemStarCannon;
	public static Item FelModiItemBucket;

	public static Item ItemFooderPickaxe;
	public static Item ItemFooderShovel;
	public static Item ItemFooderAxe;
	public static Item ItemFooderSword;
	public static Item ItemFooderToolMaster;

	public static Item itemFooderArmorHelmet;
	public static Item itemFooderArmorChestPlate;
	public static Item itemFooderArmorLeggings;
	public static Item itemFooderArmorBoots;

	public static void registerFeliModServerItems()
	{
		itemFoodsample = new itemFoodsample(400, 5, false).setCreativeTab(FeliModServerMod.tabFeliModServerMod);
		GameRegistry.registerItem(itemFoodsample, "test");

		itemLimoneFood = new itemLimoneFood(401, 5, false).setCreativeTab(FeliModServerMod.tabFeliModServerMod);
		GameRegistry.registerItem(itemLimoneFood, "Limone Food");

		itemSabakanFood = new itemSabakanFood(402, 5, false).setCreativeTab(FeliModServerMod.tabFeliModServerMod);
		GameRegistry.registerItem(itemSabakanFood, "Sabakan");

		itemSaba = new itemSaba().setCreativeTab(FeliModServerMod.tabFeliModServerMod);
		GameRegistry.registerItem(itemSaba, "Saba");

		itemDebug = new itemDebug().setCreativeTab(FeliModServerMod.tabFeliModServerMod);
		GameRegistry.registerItem(itemDebug, "Debugger Item");

		itemYakinikudonburi = new itemYakinikudonburi(403, 5, false).setCreativeTab(FeliModServerMod.tabFeliModServerMod);
		GameRegistry.registerItem(itemYakinikudonburi, "Yakinikudonburi");

		itemYakinikudonburi_mk2 = new itemYakinikudonburi_mk2(404, 5, false).setCreativeTab(FeliModServerMod.tabFeliModServerMod);
		GameRegistry.registerItem(itemYakinikudonburi_mk2, "Yakinikudonburi Mk2");

		itemYakinikudonburi_mk3 = new itemYakinikudonburi_mk3(405, 5, false).setCreativeTab(FeliModServerMod.tabFeliModServerMod);
		GameRegistry.registerItem(itemYakinikudonburi_mk3, "Yakinikudonburi Mk3");

		itemYakinikudonburi_mk4 = new itemYakinikudonburi_mk4(406, 5, false).setCreativeTab(FeliModServerMod.tabFeliModServerMod);
		GameRegistry.registerItem(itemYakinikudonburi_mk4, "Yakinikudonburi Mk4");

		itemYakinikudonburi_mk5 = new itemYakinikudonburi_mk5(407, 5, false).setCreativeTab(FeliModServerMod.tabFeliModServerMod);
		GameRegistry.registerItem(itemYakinikudonburi_mk5, "Yakinikudonburi Mk5");

		ItemFoodCrystal = new ItemFoodCrystal().setCreativeTab(FeliModServerMod.tabFeliModServerMod).setUnlocalizedName("itemFoodCrystal");
		GameRegistry.registerItem(ItemFoodCrystal, "FoodCrystal");

		itemRiceSeed = new ItemSeeds(FeliModServerModBlocks.BlockRice, Blocks.farmland).setCreativeTab(FeliModServerMod.tabFeliModServerMod).setUnlocalizedName("felimodserver:itemRiceSeed").setTextureName("felimodserver:seeds_rice");
		GameRegistry.registerItem(itemRiceSeed, "Rice Seed");

		itemRice = new ItemRice().setCreativeTab(FeliModServerMod.tabFeliModServerMod).setTextureName("felimodserver:item_rice")
				.setUnlocalizedName("itemRice");
		GameRegistry.registerItem(itemRice, "item_Rice");

		itemEnderCannon = new ItemEnderCannon().setCreativeTab(FeliModServerMod.tabFeliModServerMod).setUnlocalizedName("enderCannon");
		GameRegistry.registerItem(itemEnderCannon, "Ender Canonn");

		Item.ToolMaterial fooderTool = EnumHelper.addToolMaterial("fooderTool", 3, -1, 500.0F, 998.0F, 10);

		ItemFooderPickaxe = new ItemFooderPickaxe(fooderTool).setCreativeTab(FeliModServerMod.tabFeliModServerMod)
				.setTextureName("felimodserver:fooder_pickaxe")
				.setUnlocalizedName("felimodserver:fooder_pickaxe");
		GameRegistry.registerItem(ItemFooderPickaxe, "Fooder's Tool [Pickaxe]");

		ItemFooderShovel = new ItemSpade(fooderTool).setCreativeTab(FeliModServerMod.tabFeliModServerMod)
				.setTextureName("felimodserver:fooder_shovel")
				.setUnlocalizedName("felimodserver:fooder_shovel");
		GameRegistry.registerItem(ItemFooderShovel, "Fooder's Tool [Shovel]");

		ItemFooderAxe = new ItemFooderAxe(fooderTool).setCreativeTab(FeliModServerMod.tabFeliModServerMod)
				.setTextureName("felimodserver:fooder_axe")
				.setUnlocalizedName("felimodserver:fooder_axe");
		GameRegistry.registerItem(ItemFooderAxe, "Fooder's Tool [Axe]");

		ItemFooderToolMaster = new ItemFooderToolMaster(fooderTool).setCreativeTab(FeliModServerMod.tabFeliModServerMod)
				.setTextureName("felimodserver:fooder_tool_master")
				.setUnlocalizedName("felimodserver:fooder_tool_master");
		GameRegistry.registerItem(ItemFooderToolMaster, "Fooder's Tool [Master]");


		//装填数，射程距離(弓の最大1.0F)，攻撃力補正，攻撃後のWAIT，リロード後のWAIT，効果音，ノックバックの有無，炎上効果の有無
		ItemStarCannon = new ItemStarCannon(6, 1.0F, 2.0D, 10, 30, "Star Cannon" ,false ,false)
				.setCreativeTab(FeliModServerMod.tabFeliModServerMod)
				.setUnlocalizedName("felimodserver:starCannon");
		GameRegistry.registerItem(ItemStarCannon, "Star Cannon");


		Item itemSpawnEgg = new ItemSpawnEggLychever(Color.RED.getRGB(), Color.WHITE.getRGB())
			    .setUnlocalizedName("sample:spawn_egg")
			    .setTextureName("spawn_egg")
			    .setCreativeTab(FeliModServerMod.tabFeliModServerMod);


		IItemArmor.ArmorMaterial itemArmor = EnumHelper.addArmorMaterial("FeliModServerItemArmor", -1, new int[]{500,500,500,500}, 5);
		itemArmor.customCraftingMaterial = FeliModServerModItems.itemSaba;

		itemFooderArmorHelmet = new ItemArmor(itemArmor, 0, 0).setCreativeTab(FeliModServerMod.tabFeliModServerMod)
				.setUnlocalizedName("fooder_armor_helmet").setTextureName("felimodserver:_armor_helmet");
		GameRegistry.registerItem(itemFooderArmorHelmet, "fooder_armor_helmet");

		itemFooderArmorChestPlate = new ItemArmor(itemArmor, 0, 1).setCreativeTab(FeliModServerMod.tabFeliModServerMod)
				.setUnlocalizedName("fooder_armor_chestplate").setTextureName("felimodserver:_armor_chestplate");
		GameRegistry.registerItem(itemFooderArmorChestPlate, "fooder_armor_chestplate");

		itemFooderArmorLeggings = new ItemArmor(itemArmor, 0, 2).setCreativeTab(FeliModServerMod.tabFeliModServerMod)
				.setUnlocalizedName("fooder_armor_leggings").setTextureName("felimodserver:_armor_leggings");
		GameRegistry.registerItem(itemFooderArmorLeggings, "fooder_armor_leggings");

		itemFooderArmorBoots = new ItemArmor(itemArmor, 0, 3).setCreativeTab(FeliModServerMod.tabFeliModServerMod)
				.setUnlocalizedName("fooder_armor_boots").setTextureName("felimodserver:_armor_boots");
		GameRegistry.registerItem(itemFooderArmorBoots, "fooder_armor_boots");
	}
}
