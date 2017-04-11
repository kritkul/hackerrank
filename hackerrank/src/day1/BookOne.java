package day1;

public class BookOne extends Book {
	int price;
	
	BookOne(String title,String author,int price){
		super(title, author);
		this.price = price;
	}
	
	@Override
	void display() {
		System.out.println("Title: " + title
				+ "\nAuthor: " + author
				+ "\nPrice: " + price);
		
	}

}
