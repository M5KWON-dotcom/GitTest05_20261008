package pratice;

import java.util.ArrayList;

public class MainTestStudent {

	public static void main(String[] args) {
	
		
		Student student1 = new Student("홍길동",70);
		Student student2 = new Student("이순신",80);
		Student student3 = new Student("김유신",90);
		
		ArrayList<Student> students = new ArrayList<Student>();//위에서 만든걸로 <>이름 바뀜
		
		students.add(student1);
		students.add(student2);
		students.add(student3);
		
		for(Student student:students) { //향상된 for문
			//클래스 변수이름 : 배열이름
			System.out.println(student.name);
			System.out.println(student.score);
		}
		System.out.println("================================");
		for(int i=0;i<students.size();i++) {		
			System.out.println(students.get(i).name);//이름 헷갈리지않게 수정
			System.out.println(students.get(i).score);
		}
		System.out.println("================================");
		
       int sum=0;
		for(Student student:students) {//향상된 for문
    	   sum =sum+student.score;
       }
		double avg= sum/(double)students.size();
		System.out.println(avg);
				
		int sum1=0;
        double avg1=0;
        for(int i=0;i<students.size();i++) { //size=lengh
        	sum1+=students.get(i).score;
        	avg1= sum1/(double)students.size();
        }System.out.println(avg1);
	}
}

