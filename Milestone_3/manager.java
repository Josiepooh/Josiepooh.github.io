import java.util.ArrayList;
import java.util.List;

public class manager {
	
	static List<artist> artists = new ArrayList<>();

	public static void main(String[] args) {
		beatles();
		highKings();
		artists.get(1).getSongs();
		artists.get(1).getAlbums();
		artists.get(1).getMembers();
	}
	
	public static void beatles() {
		artist beatles = new artist("Beatles");
		beatles.setSong("Abbey Road");
		beatles.setSong("Yellow Submarine");
		beatles.setSong("Lucy in the Sky");
		beatles.setMembers("John Lennon");
		beatles.setMembers("George Harrison");
		beatles.setMembers("Ringo Star");
		beatles.setMembers("Paul McCartney");
		beatles.setAlbums("Abbey Road");
		beatles.setAlbums("Sergeant Peppers Lonely Hearts Club Band");
		artists.add(beatles);
	}
	
	public static void highKings() {
		artist highKings = new artist("The High Kings");
		highKings.setSong("The Parting Glass");
		highKings.setSong("Red is the Rose");
		highKings.setSong("Rising of the Moon");
		highKings.setAlbums("Memory Lane");
		highKings.setMembers("Finbarr Clancy");
		highKings.setMembers("Brian Dunphy");
		highKings.setMembers("Darren Holden");
		artists.add(highKings);
	}
}