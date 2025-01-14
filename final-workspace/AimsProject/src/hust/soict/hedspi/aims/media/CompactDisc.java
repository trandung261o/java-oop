package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable {
	private String artist;
	private List<Track> tracks = new ArrayList<Track>();
	
	public String getArtist() {
		return artist;
	}
	
	public CompactDisc(int id, String title, String category, float cost, int length, String director, String artist) {
		super(id, title, category, cost, length, director);
		this.artist = artist;
	}

	public void addTrack(Track track) {
	    if (tracks.contains(track)) {
	        System.out.println("Track is already in the list");
	        return;
	    }
	    tracks.add(track);
	    System.out.println("Add track successfully");
	}

	public void removeTrack(Track track) {
	    if (!tracks.contains(track)) {
	        System.out.println("Track is not in the list");
	        return;
	    }
	    tracks.remove(track);
	    System.out.println("Remove track successfully");
	}

	public int getLength() {
		int totalLength = 0;
		for (Track track : tracks) {
			totalLength += track.getLength();
		}
		return totalLength;
	}
	
	public void play() {
		System.out.println("Playing CD: " + this.getTitle());
		System.out.println("CD artist: " + this.getArtist());
		System.out.println("CD length: " + this.getLength());
		for (Track track : tracks) {
			track.play();
		}
	}
}
