package hands_on_2Media;


public class Bang_on_screen {
	public static void print_media(Media[] md){
		for(Media bk:md){
			if(bk instanceof Book){
				Book b = (Book)bk;
			System.out.println(((Book) bk).getAuthor());
			
		}}

}}
