import java.sql.SQLOutput;
import java.util.PriorityQueue;

public class SongApplication {

    public static void main(String[] args){
        SongTracker tracker = new SongTracker();
        tracker.addSong("Song A", 15);
        tracker.addSong("Song B", 25);
        tracker.addSong("Song C", 5);

        PriorityQueue<String> mostPlayedSongs = tracker.getMostPlayedSongsQueue();

        while(!mostPlayedSongs.isEmpty()){
            String song = mostPlayedSongs.poll();
            System.out.println(song + " -> " + tracker.songPlayCount.get(song));
        }
    }
}
