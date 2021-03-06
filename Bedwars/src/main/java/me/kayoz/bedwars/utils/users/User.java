package me.kayoz.bedwars.utils.users;

import lombok.Getter;
import lombok.Setter;
import me.kayoz.bedwars.utils.team.Team;
import org.bukkit.Color;
import org.bukkit.entity.Player;

/**
 * Created by KaYoz on 8/7/2017.
 * Subscribe to me on Youtube:
 * http://www.youtube.com/c/KaYozMC/
 */

public class User {
    @Getter @Setter
    private Player player;
    @Getter @Setter
    private int kills;
    @Getter @Setter
    private int deaths;
    @Getter @Setter
    private Team team;
    @Getter @Setter
    private Color color;

    public User(Player p){
        this.player = p;
        UserManager.register(this);
    }
}
