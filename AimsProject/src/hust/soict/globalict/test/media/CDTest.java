package hust.soict.globalict.test.media;

import hust.soict.globalict.aims.media.CompactDisc;
import hust.soict.globalict.aims.media.Track;

public class CDTest {
    public static void main(String[] args) {
        CompactDisc compactDisc = new CompactDisc();
        Track track1 = new Track("Track1", 50);
        compactDisc.addTrack(track1);
        Track track2 = new Track("Track2", 40);
        compactDisc.addTrack(track2);
        Track track3 = new Track("Track3", 20);
        compactDisc.addTrack(track3);
        compactDisc.play();
    }
}