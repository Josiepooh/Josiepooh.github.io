import java.util.ArrayList;
import java.util.List;

public class artist {

	private String name;
	private List<String> songs = new ArrayList<>();
	private List<String> albums = new ArrayList<>();
	private List<String> members = new ArrayList<>();
	
	public artist(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void getSongs() {
		System.out.println("The songs for " + name +" are:");
		int j = 1;
		for(int i = 0; i < songs.size(); i++) {
			System.out.println("" + j + ": " + songs.get(i));
			j++;
		}	
	}
	
	public void getAlbums() {
		System.out.println("The albums for " + name +" are:");
		int j = 1;
		for(int i = 0; i < albums.size(); i++) {
			System.out.println("" + j + ": " + albums.get(i));
			j++;
		}	
	}
	
	public void getMembers() {
		System.out.println("The members of " + name +" are:");
		int j = 1;
		for(int i = 0; i < members.size(); i++) {
			System.out.println("" + j + ": " + members.get(i));
			j++;
		}	
	}
	
	public void setSong(String song) {
		songs.add(song);
	}
	
	public void setAlbums(String album) {
		albums.add(album);
	}
	
	public void setMembers(String member) {
		members.add(member);
	}
	
	
}
