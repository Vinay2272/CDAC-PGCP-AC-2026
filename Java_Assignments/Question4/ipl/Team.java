package Question4.ipl;

import java.util.ArrayList;

public class Team {
    private int teamId;
    private String tname;
    private String coachName;
    private ArrayList<Player> players;

    public Team(int teamId, String tname, String coachName) {
        this.teamId = teamId;
        this.tname = tname;
        this.coachName = coachName;
        this.players = new ArrayList<>();
    }

    public int getTeamId() {
        return teamId;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void addPlayer(Player p) {
        players.add(p);
    }

    public void removePlayer(int pid) {
        players.removeIf(p -> p.getPid() == pid);
    }

    public void setCoachName(String coachName) {
        this.coachName = coachName;
    }

    @Override
    public String toString() {
        return teamId + " " + tname + " Coach: " + coachName + " Players: " + players;
    }
}