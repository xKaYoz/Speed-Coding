package me.kayoz.bedwars.utils;

import lombok.Getter;

import java.util.ArrayList;

/**
 * Created by KaYoz on 9/13/2017.
 * Subscribe to me on Youtube:
 * http://www.youtube.com/c/KaYozMC/
 */

public class MapManager {

    @Getter
    private static ArrayList<Map> maps = new ArrayList<>();

    public static Map getMap(String name){
        for(Map map : maps){
            if(map.getName().equalsIgnoreCase(name)) return map;
        }
        return null;
    }

    public static void register(Map map){
        if(!maps.contains(map)) maps.add(map);
    }

    public static void unregister(Map map){
        if(maps.contains(map)) maps.remove(map);
    }

}
