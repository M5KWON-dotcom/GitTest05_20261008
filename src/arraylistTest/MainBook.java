package arraylistTest;

import java.util.ArrayList;

public class MainBook {

	public static void main(String[] args) {
	
		Book book0 = new Book("조정래","태백산맥",20000);
		Book book1 = new Book("박경리","토지",30000);
		Book book2 = new Book("헤르만헤세","데미안",40000);
		Book book3 = new Book("유시민","어떻게 살 것인가",10000);
		Book book4 = new Book("생텍쥐페리","어린왕자",10000);
		
		ArrayList<Book> booklist = new ArrayList<Book>();
		
		booklist.add(book0);
		booklist.add(book1);
		booklist.add(book2);
		booklist.add(book3);
		booklist.add(book4);
		
		System.out.println(booklist.get(1).title);
		System.out.println(booklist.get(2).writer);
		System.out.println(booklist.get(0).price);

		for(int i=0;i<booklist.size();i++) {
			Book book =booklist.get(i);
			
			System.out.println(book.writer);
			}
		
}
}