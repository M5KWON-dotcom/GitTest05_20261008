package java_chapter07_01;
import java.util.ArrayList;

public class ArrayList01 {
	
	     public static void main(String[] args) {
	      // TODO Auto-generated method stub
	      
	      Book book1 = new Book("조정래", "태백산맥", 20000);
	      Book book2 = new Book("박경리", "토지", 30000);
	      Book book3 = new Book("헤르만헤세", "데미안", 40000);
	      Book book4 = new Book("이우혁", "퇴마록", 30000);
	      
	      ArrayList<Book> booklist = new ArrayList<Book>(); //ArrayList 선언
	      
	      //ArrayList에 Book 객체 담기
	      booklist.add(book1);
	      booklist.add(book2);
	      booklist.add(book3);
	      booklist.add(book4);
	      
	      //ArrayList에 들어있는 북객체 꺼내기
	      System.out.println(booklist.get(1).title); //토지
	      System.out.println(booklist.get(1).writer); //박경리
	      System.out.println("=============================");
	      
	      //모든 책의 작가를 출력하시오.
	      for(int i=0;i<booklist.size();i++) {
	         Book book = booklist.get(i);
	         System.out.println(book.writer);
	      }
	      System.out.println("===========삭제전=============");
	      
	      
	      booklist.set(1, book4); //수정 1->4
	      booklist.remove(0);
	      for(int i=0;i<booklist.size();i++) {
		         Book book = booklist.get(i);
		         System.out.println(book.writer);
	      }
	      System.out.println("============================="); 
	      System.out.println(booklist.get(1).title); //퇴마록
	      System.out.println(booklist.get(1).writer); //이우혁
	      
	   }

	}



