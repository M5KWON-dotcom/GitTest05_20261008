package java_chapter07_01;

public class Array05 {

	public static void main(String[] args) {
		int[]stu1={80,90,70};
		int[]stu2={60,50,70};
		//int[]stu3={80,90,60};
		
		int[][]student= {{80,90,70},
				         {60,50,70}};
				    //     {80,90,60}};
		
		System.out.println(student[1][0]);//[행번호] [열번호]
		System.out.println("===============================");
	//	int[][]arr= {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i=0;i<2;i++) {//i 행번호
			for(int j=0;j<3;j++) { //j 열번호
				System.out.print(student[i][j]+" ");
		}System.out.println();
		}
		int[][]arr2 = {{20,30,40},{50,60,70}};
		
		for(int[] arr1:arr2) {
			for(int score:arr1) {
				
				System.out.println(score);
		}
	}
}
}