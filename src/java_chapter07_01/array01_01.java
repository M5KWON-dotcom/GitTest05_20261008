package java_chapter07_01;

public class array01_01 {

	public static void main(String[] args) {
	
	int[] arr1 = new int[4];  //배열 요소 4개의 값이 0으로 초기화된 상태로 생성
	arr1[0]= 1000;


	//배열은 초기화 하지않더라도 사용가능
	double[] arr2 = new double[4];
	
	arr2[0] = 1.5;
	arr2[2] = 3;
	
	System.out.println(arr2[0]);
	System.out.println(arr2[2]);
	double a;
	a = 3;
	
	System.out.println(arr2[1]);
	
	String[] arr3 = new String[5];	
	arr3[0] = "대한민국";
	
	System.out.println(arr3[0]);
	
	
	System.out.println(arr3.length);
	
	}

}
