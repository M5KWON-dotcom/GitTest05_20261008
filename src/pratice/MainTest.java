package pratice;

import java.util.ArrayList;

import arraylistTest.Book;

public class MainTest {

	public static void main(String[] args) {
		
		ArrayList<String> cart = new ArrayList<String>();
		cart.add("TV");
		cart.add("세탁기");
		cart.add("냉장고");
		cart.add("스마트폰");
		cart.add("에어컨");
		
		for(int i=0;i<cart.size();i++) {		
		System.out.println(cart.get(i));
	}
		
		cart.set(3, "아이폰");
		System.out.println(cart.get(3));
		
		cart.remove(2);
		System.out.println(cart.get(2));
		
		int count=0;
		for(int i=0;i<cart.size();i++) {
			count++;
		}System.out.println(count);
}
}