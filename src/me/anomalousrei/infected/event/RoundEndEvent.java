package me.anomalousrei.infected.event;

import me.anomalousrei.infected.util.Team;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class RoundEndEvent extends Event {
    private static final HandlerList handlers = new HandlerList();

    Team winner = Team.ZOMBIE;

    public RoundEndEvent(Team team) {
        winner = team;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public HandlerList getHandlers() {
        return handlers;
    }

    public Team getWinner() {
        return winner;
    }
}
