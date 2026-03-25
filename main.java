package me.tayyib;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Main extends JavaPlugin implements CommandExecutor {

    @Override
    public void onEnable() {
        getCommand("tybgrlbot").setExecutor(this);
        getLogger().info("TybgrlBot aktif, emirlerinizi bekliyor Efendim!");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (label.equalsIgnoreCase("tybgrlbot") && sender instanceof Player) {
            Player p = (Player) sender;
            String mesaj = String.join(" ", args).toLowerCase();

            if (mesaj.contains("elmas getir")) {
                p.sendMessage("§b[Bot] §7Elmas getirme emri alındı. Sistemler entegre ediliyor.");
            } 
            else if (mesaj.contains("odun kes")) {
                p.sendMessage("§e[Bot] §7Odun kesme emri alındı. Balta kontrol ediliyor.");
            }
            return true;
        }
        return false;
    }
}
