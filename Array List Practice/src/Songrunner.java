import java.util.ArrayList; 

public class Songrunner
{
		static ArrayList<Song> playlist;
		public static void main(String[] args)
			{
			createPlaylist();
			printList();
			cutLengths();
			deleteSong();
			changeName();
			}
		

		public static void createPlaylist()
		{
			playlist = new ArrayList <Song>();
			playlist.add(new Song("Katy Perry", "Firework", 227));
			playlist.add(new Song("Taylor Swift", "15", 195));
			playlist.add(new Song("Beyonce", "Halo", 227));
			playlist.add(new Song("Britney Spears", "Womanizer", 224));
			playlist.add(new Song("Selena Gomez", "Naturally", 187));
		}
	
		public static void printList()
		{
			for(Song p: playlist)
				{
				System.out.println(p.getTitle() + ": " + p.getArtist() +", " + p.getLength() + " secs");	
				}		
		System.out.println();
		}
	
		public static void cutLengths()	
		{
		for(Song p: playlist)
			{
				p.setLength(p.getLength() - 10);
			}
		printList();
		}

		public static void deleteSong()
		{
		String longestTitle = playlist.get(0).getTitle();
		for(Song p: playlist)
			{
				if(p.getTitle().length()> longestTitle.length())
					{
						longestTitle = p.getTitle();
						playlist.remove(p);
						break;
					}
			}
		printList();
		System.out.println();
		}

		public static void changeName()
		{
		playlist.get(0).setArtist("Eric Sallinger");	
		printList();
		}



}
