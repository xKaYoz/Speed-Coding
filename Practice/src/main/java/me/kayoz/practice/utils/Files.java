package me.kayoz.practice.utils;

import me.kayoz.practice.Practice;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

/**
 * Created by KaYoz on 8/7/2017.
 * Subscribe to me on Youtube:
 * http://www.youtube.com/c/KaYozMC/
 */

public class Files {

    private File file;
    private YamlConfiguration config;


    public void createFile(String name) {
        this.file = new File(Practice.getInstance().getDataFolder(), name + ".yml");

        if (!Practice.getInstance().getDataFolder().exists()) {
            Practice.getInstance().getDataFolder().mkdir();
        }

        if (!this.file.exists()) {
            try {
                this.file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
            this.config = YamlConfiguration.loadConfiguration(file);
        } else {
            try {
                throw new IOException();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void createFile(String dir, String name) {
        File f = new File(Practice.getInstance().getDataFolder() + File.separator + dir);
        this.file = new File(f, name + ".yml");

        if (!f.isDirectory()) {
            f.mkdirs();
        }

        if (!this.file.exists()) {
            try {
                this.file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
            this.config = YamlConfiguration.loadConfiguration(file);
        } else {
            try {
                throw new IOException();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public File getFile(String name) {
        this.file = new File(Practice.getInstance().getDataFolder(), name + ".yml");

        if (!this.file.exists()) {
            return null;
        }

        return this.file;
    }

    public File getFile(String dir, String name) {
        this.file = new File(Practice.getInstance().getDataFolder() + File.separator + dir, name + ".yml");

        if (!this.file.exists()) {
            return null;
        }

        return this.file;
    }

    public File getDir(String dir) {
        this.file = new File(Practice.getInstance().getDataFolder() + File.separator + dir);

        if (!this.file.exists()) {
            return null;
        }

        return this.file;

    }

    public YamlConfiguration getConfig(String name) {
        this.file = new File(Practice.getInstance().getDataFolder(), name + ".yml");

        if (!this.file.exists()) {
            return null;
        }

        this.config = YamlConfiguration.loadConfiguration(this.file);
        return this.config;
    }

    public YamlConfiguration getConfig(String dir, String name) {
        this.file = new File(Practice.getInstance().getDataFolder() + File.separator + dir, name + ".yml");

        if (!this.file.exists()) {
            return null;
        }

        this.config = YamlConfiguration.loadConfiguration(this.file);
        return this.config;
    }

}
