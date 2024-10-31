import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SongTracker {
    // Map to store each song and its play count
    private final Map<String, Integer> songPlayCount;

    // PriorityQueue to keep the songs sorted by play count in descending order
    private final PriorityQueue<Map.Entry<String, Integer>> mostPlayedSongs;

    // Constructor
    public SongTracker() {
        this.songPlayCount = new HashMap<>();
        this.mostPlayedSongs = new PriorityQueue<>(
                (a, b) -> b.getValue().compareTo(a.getValue()) // sort by play count descending
        );
    }

    // Method to play a song (increments play count)
    public void playSong(String songName) {
        // Increment play count in the map
        songPlayCount.put(songName, songPlayCount.getOrDefault(songName, 0) + 1);
        updateMostPlayedQueue();
    }

    // Method to get the most played song(s)
    public String getMostPlayedSong() {
        if (mostPlayedSongs.isEmpty()) {
            return "No songs have been played.";
        }
        return mostPlayedSongs.peek().getKey();
    }

    // Private method to update the priority queue
    private void updateMostPlayedQueue() {
        // Clear and repopulate the queue for fresh ordering
        mostPlayedSongs.clear();
        mostPlayedSongs.addAll(songPlayCount.entrySet());
    }

    // For getting the top N most-played songs
    public void printTopNMostPlayedSongs(int n) {
        System.out.println("Top " + n + " Most Played Songs:");
        mostPlayedSongs.stream().limit(n).forEach(song ->
                System.out.println(song.getKey() + ": " + song.getValue() + " plays")
        );
    }
}
