package JukeBox;

import java.util.Comparator;

/**
 * Created by vlasyk on 24.07.14.
 */
public class ArtistCompare implements Comparator<Song> {



    @Override
    public int compare(Song o1, Song o2) {
        return o1.getArtist().compareTo(o2.getArtist());
    }
}
