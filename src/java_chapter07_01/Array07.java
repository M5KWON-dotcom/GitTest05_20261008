package java_chapter07_01;

public class Array07 {

	public static void main(String[] args) {
		int[][] scores = {
				{70,75,85},
				{60,95,90},
				{80,50,65},
				{90,80,70}  //4행(row)3열(col) 배열, 4x3 배열
		};

		for(int i=0;i<scores.length;i++) {  //행이 부모 for문
			for(int j=0;j<scores[i].length;j++) {  //열이 자식 for문
				System.out.println(scores[i][j]); //2차원 배열의 모든요소 출력
			}
		}
	}

}
