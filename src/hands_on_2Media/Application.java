package hands_on_2Media;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Book bk1= new Book();
		Book bk2= new Book();
		Book bk3= new Book();
		
		bk1.get_details("Java","Anand", "Java", 1);
		bk2.get_details("Ja","Anand", "j", 2);
		bk3.get_details("C++","Anand", "prog", 3);
		
		bk1.get_rest("Is42334324");
		bk2.get_rest("Is4233344gfh24");
		bk3.get_rest("Is44353434324");
		
		Book bk_arr[] = {bk1,bk2,bk3};
		
		
		Periodicals pd1 = new Periodicals();
		Periodicals pd2 = new Periodicals();
		Periodicals pd3 = new Periodicals();
		
		pd1.get_details("t", "author", "Prog", 3);
		pd2.get_details("t1", "author1", "Prog1", 4);
		pd3.get_details("t2", "author2", "Prog1", 5);
		
		
		Periodicals pd_arr[] = {pd1,pd2,pd3};
		
		Dvd dv = new Dvd();
		Dvd dv1 = new Dvd();

		
		dv.get_details("dv1", "Me", "gf" , 4);
		dv.get_details("dv2", "Me1", "gf4" , 6);
		
		dv.get_rest(3, 5);
		dv1.get_rest(1, 4);
		
		Dvd dv_arr[] = {dv, dv1};
		
		Bang_on_screen.print_media(dv_arr);
		System.out.println( dv_arr[0].getAuthor());

	}

}
