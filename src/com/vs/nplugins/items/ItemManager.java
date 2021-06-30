package com.vs.nplugins.items;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ItemManager {

    public static ItemStack wand;

    public static void init() {

        createWand();

    }

    private static void createWand() {

        ItemStack item = new ItemStack(Material.STICK, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("manyas stick");
        List<String> lore = new ArrayList<>();
        lore.add("A powerful artifact ");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);

        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        item.setItemMeta(meta);

        wand = item;

        //recipes
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("wand"),item);
        sr.shape("B  "," S ","  S");
        sr.setIngredient('B',Material.BLAZE_ROD);
        sr.setIngredient('S',Material.STICK);
        Bukkit.getServer().addRecipe(sr);






    }

}
