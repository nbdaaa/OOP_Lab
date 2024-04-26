package hust.soict.globalict.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable{
	private String artist;
	private List<Track> tracks = new ArrayList<Track>();
	public List<String> getTracksName() {
		List<String> tracksName = new ArrayList<String>();
		for (int i=0;i<tracks.size();i++){
			tracksName.add(tracks.get(i).getTitle());
		}
 		return tracksName;
	}
	public String getArtist() {
		return artist;
	}
	public CompactDisc (int id, String title, String category, float cost, String director, String artist) {
		super(id, title, category, cost, director );
		this.artist = artist;
	}
	public CompactDisc (int id, String title, String category, float cost) {
		super(id, title, category, cost);
	}
	public CompactDisc() {
        super();
    }
	public void addTrack(Track track) {
		if(!tracks.contains(track)){
            tracks.add(track);
        }
        else{
            System.out.println("The track is already in the list");
        }
	}
	public void removeTrack(Track track) {
		if(tracks.contains(track)){
            tracks.remove(track);
        }
        else{
            System.out.println("The track is not in the list");
        }
	}
	
	@Override
	public int getLength() {
		int totalLength = 0;
        for(int i = 0; i < tracks.size(); i++){
            totalLength += tracks.get(i).getLength();
        }
        return totalLength;
	}
	public void play() {
		for (int i=0;i<tracks.size();i++) {
			if (tracks.get(i).getLength() > 0){
				tracks.get(i).play();
			}
			else {
				System.out.println("The track " + tracks.get(i).getTitle() + " cannot be played");
			}
		}
	}
	public String toString() {
        return "CD: " + super.toString() + " - " + getArtist() + " - " + getTracksName();
    }
}
