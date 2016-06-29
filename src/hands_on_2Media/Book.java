package hands_on_2Media;

public class Book extends Media {
	
	private 
	String title;
	String  author;
	String ISBN_number;
	String subject;
	int volume_number;
	
	
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
	 * @return the iSBN_number
	 */
	public String getISBN_number() {
		return ISBN_number;
	}


	/**
	 * @param iSBN_number the iSBN_number to set
	 */
	public void setISBN_number(String iSBN_number) {
		ISBN_number = iSBN_number;
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


	public void get_rest(String iSBN_number){
		 ISBN_number = iSBN_number;
	 }
	 
	 
	
}
