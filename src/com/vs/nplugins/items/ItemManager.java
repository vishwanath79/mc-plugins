package com.vs.nplugins.items;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
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


    }

}
