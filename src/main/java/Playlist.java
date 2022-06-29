import java.util.ArrayList;

public class Playlist {
    public static void main(String[] args) {
        // create a playlist
        ArrayList<String> myCodingPlaylist = new ArrayList<>();

        System.out.println("**************  Welcome to myCodingPlaylist! Let's get on with writing some code :)  ************** ");

        // adding songs to playlist
        myCodingPlaylist.add("She Drives Me Crazy - Fine Young Cannibals");
        myCodingPlaylist.add("\nDeadly Valentine (Soulwax Remix) - Charlotte Gainsbourg");
        myCodingPlaylist.add("\nShivers - Ed Sheeran");
        myCodingPlaylist.add("\nShow Me Your Soul - Red Hot Chili Peppers");
        myCodingPlaylist.add("\nWhat, Me Worry? - Portugal The Man");
        myCodingPlaylist.add("\nChapstick - COIN");
        myCodingPlaylist.add("\nLet 'Em Cry - Red Hot Chili Peppers");
        myCodingPlaylist.add("\nI Will Survive - CAKE");
        myCodingPlaylist.add("\nSigue - Ed Sheeran");
        myCodingPlaylist.add("\nMiss Prince - Hey Steve");
        myCodingPlaylist.add("\nWhen We Break - Total Giovanni");
        myCodingPlaylist.add("\nBig Energy - Latto");
        myCodingPlaylist.add("\nBam Bam (feat. Ed Sheeran) - Camilla Cabello");
        myCodingPlaylist.add("\nDancing In The Moonlight - King Harvest");

        //print the playlist
        System.out.println(myCodingPlaylist);
//
//       // checking playlist size
        System.out.println("*********** MyCodingPlaylist's size is " + myCodingPlaylist.size() + "**************");

        // removing songs
        ArrayList<String> removedSongs = new ArrayList<>();
        removedSongs.add("Chapstick - COIN");
        removedSongs.add("\nWhat, Me Worry? - Portugal The Man");
        removedSongs.add("\nSigue - Ed Sheeran");
        System.out.println("Removing these songs from the playlist: \n" + removedSongs);


        myCodingPlaylist.remove("\nChapstick - COIN");
        myCodingPlaylist.remove("\nWhat, Me Worry? - Portugal The Man");
        myCodingPlaylist.remove("\nSigue - Ed Sheeran");
        //System.out.println(myCodingPlaylist.size());

        System.out.println("********** MyCodingPlaylist's size is now " + myCodingPlaylist.size() + " ***********");
        System.out.println(myCodingPlaylist);

        System.out.println(" ********* Swap 'Bam Bam' with 'Big Energy' **********");

        // swapping songs
        int indexA = myCodingPlaylist.indexOf("\nBam Bam (feat. Ed Sheeran) - Camilla Cabello");
        int indexB = myCodingPlaylist.indexOf("\nBig Energy - Latto");

        String tempA = "\nBam Bam (feat. Ed Sheeran) - Camilla Cabello";

        myCodingPlaylist.set(indexA, "\nBig Energy - Latto");
        myCodingPlaylist.set(indexB, tempA);
        System.out.println(myCodingPlaylist);

        System.out.println("******** Play track 5 ******** " + myCodingPlaylist.get(5));

    }
}
