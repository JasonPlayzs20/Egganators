package com.jasonplayzs20.egganators;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.entity.Zombie;

public class EggCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (player.hasPermission("op")) {
                Zombie zombie = Bukkit.getWorld("world").spawn(player.getLocation(), Zombie.class);
                zombie.setBaby();
                zombie.setAI(false);
                zombie.setSilent(true);
                zombie.setCustomName("EGGA");
                zombie.setCustomNameVisible(false);
                zombie.setCanPickupItems(false);
                zombie.setCollidable(false);
                zombie.setAware(false);
                zombie.setInvulnerable(true);
                zombie.setPersistent(true);
                player.setInvisible(true);

            }
        }
        return false;
    }
}
