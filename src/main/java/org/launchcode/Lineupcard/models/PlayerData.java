package org.launchcode.Lineupcard.models;

import java.util.ArrayList;

public class PlayerData {

    private ArrayList<Player> players = new ArrayList<>();

    public void add(Player player){
        this.players.add(player);
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public Player findById(int id){
        Player thePlayer = null;
        for(Player player: players){
            if(player.getPlayerId() == id){
                thePlayer = player;
            }
        }
        return thePlayer;
    }
}
