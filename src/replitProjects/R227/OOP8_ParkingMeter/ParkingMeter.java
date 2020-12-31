package replitProjects.R227.OOP8_ParkingMeter;

public class ParkingMeter {

    public int timeLeft = 0, maxTime;

    public ParkingMeter(int maxTime) {
        this.maxTime = maxTime;
        if(maxTime == 25 ){
            timeLeft += 30;
        }else{
            this.timeLeft = timeLeft;
        }
    }


}
/*
public String title;
    public String artist;
    public int playCount = 0;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getPlayCount() {
        return playCount;
    }

    public void setPlayCount(int playCount) {
        this.playCount = playCount;
    }
 */