
public class Song
{
		private String title, artist;
		private int length;

	public Song (String art, String ttl, int l)
	{
		artist = art;
		title = ttl;		
		length = l;
	}

	public String getTitle()
		{
			return title;
		}

	public void setTitle(String title)
		{
			this.title = title;
		}

	public String getArtist()
		{
			return artist;
		}

	public void setArtist(String artist)
		{
			this.artist = artist;
		}

	public int getLength()
		{
			return length;
		}

	public void setLength(int length)
		{
			this.length = length;
		}
		

}
