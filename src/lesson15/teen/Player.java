package lesson15.teen;

import java.io.Serializable;

public class Player implements Serializable {
    private String nickname;
    private int id;
    private String serverLocation;
    private long points;

    public Player(String nickname, int id, String serverLocation, long points) {
        this.nickname = nickname;
        this.id = id;
        this.serverLocation = serverLocation;
        this.points = points;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getServerLocation() {
        return serverLocation;
    }

    public void setServerLocation(String serverLocation) {
        this.serverLocation = serverLocation;
    }

    public long getPoints() {
        return points;
    }

    public void setPoints(long points) {
        this.points = points;
    }
}
