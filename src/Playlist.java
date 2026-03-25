import java.util.ArrayList;

public class Playlist {
    public static void main(String[] args) {
        // Step 1: Create your ArrayList to hold song titles
        ArrayList<String> playlist = new ArrayList<String>();

        // Step 2: Add your 6 song titles using .add()

        // Example: playlist.add("Song Title Here");
        playlist.add("luther");
        playlist.add("Sweet Home");
        playlist.add("Mr. Brightside");
        playlist.add("Now or Never");
        playlist.add("E85");
        playlist.add("Who Knows");


        // Step 3: Print the full playlist with track numbers
        // Track numbers should start at 1, not 0
        for(int i = 0; i<playlist.size(); i++){
            System.out.println(i+1 + ". " + playlist.get(i));
        }


        // Step 4: Print the first song in the playlist
        System.out.println("First Song: " + playlist.get(0));


        // Step 5: Print the last song in the playlist
        System.out.println("Last Song: " + playlist.get(5));
        

    }
}
