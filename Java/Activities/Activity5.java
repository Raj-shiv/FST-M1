package Activities;

abstract class Book {
    String title;
    
    abstract void setTitle(String s);
    
    //Concrete method
    String getTitle() {
        return title;
    }
}

class MyBook extends Book {
    //Define abstract method
    public void setTitle(String s) {
        title = s;
    }
}

public class Activity5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyBook newNovel = new MyBook();
		newNovel.setTitle("Art of Living");
		System.out.println("The Title of the Book is : "+newNovel.getTitle());
	}

}
