package com.jaime.prueba;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin{

	
	@Override
	public void onEnable() {
		System.out.println("PLUGIN ENCENDIOD PAPU");
	}
	
	
	@Override
	public void onDisable() {
		System.out.println("PLUGIN CHAO");
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String lable, String[] args) {
		
		if (cmd.getName().equals("Dalepoder")) {
			if (sender instanceof Player) {
				Player player = (Player) sender;
				player.sendMessage(ChatColor.DARK_RED + "Hola" + " " + ChatColor.GREEN + player.getName() + ChatColor.AQUA + " Disfruta de tu velocidad");
				player.setFlySpeed(0.4f);
				player.setGameMode(GameMode.CREATIVE);
		
			 
			 }
		 } else {
			 System.out.print("No puedes ejecutar este comando desde la consola");
		 }
		return false;
	}	
}
