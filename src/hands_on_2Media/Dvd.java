package hands_on_2Media;

public class Dvd extends Media{
	
	private 
	String title;
	String  author;
	String subject;
	int volume_number;
	int length;
	int rating;
	
	public void get_details(String title,String  author,
			String subject,int volume_number ){
	this.author = author;
	this.subject = subject;
	this.title = title;
	this.volume_number = volume_number;
	
	
}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}
	/**
	 * @param subject the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}
	/**
	 * @return the volume_number
	 */
	public int getVolume_number() {
		return volume_number;
	}
	/**
	 * @param volume_number the volume_number to set
	 */
	public void setVolume_number(int volume_number) {
		this.volume_number = volume_number;
	}
	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}
	/**
	 * @param length the length to set
	 */
	public void setLength(int length) {
		this.length = length;
	}
	/**
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}
	/**
	 * @param rating the rating to set
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}
	public void get_rest(int length,int rating){
		this.length =length;
		this.rating = rating;
		
	}
	

}
