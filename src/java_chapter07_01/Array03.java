package java_chapter07_01;

public class Array03 {

	public static void main(String[] args) {
		
		int[] arr1 = {10,20,30,40,50};
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		System.out.println(arr1[4]);
		System.out.println("=======================================");
		
		for(int i=0;i<arr1.length;i++) {//5회전 반복되는 for문,  i= 0,1,2,3,4
			System.out.println(arr1[i]);
		}
		System.out.println("=======================================");
		
		int[] arr2 = new int[10];
				
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
		System.out.println("=======================================");
		
		int[] scores = {90,80,100,65,77};
		int sum= 0;
				
		for(int i=0;i<scores.length;i++) {
			sum += scores[i];
			}System.out.println("총점: "+ sum);
		
		double avg = (double)sum/scores.length;//sum 형변환
			 System.out.println("평균: "+ avg);
			 System.out.println("=======================================");
			
			 int[] numbers = {45,12,78,34,90,23};
				int max = numbers[0];// 초기값으로 배열의 첫번째 요소 값 max의 초기값으로 지정 max->25
				
				for(int i=1;i<numbers.length;i++) {
					if(max < numbers[i]) {
						max = numbers[i];
					}
					}System.out.println("최대값: "+ max);	 
					
				int min = numbers[0];
				
				for(int i=1;i<numbers.length;i++) {
					if(min > numbers[i]) {
						min = numbers[i];
					}
					}System.out.println("최소값: "+ min);	 
					 System.out.println("=======================================");
				
					 int[] nums = {10,20,30,10,30,50,30,70,60,80,90};
					 int count = 0;
					 for(int i=1;i<nums.length;i++) {
							if(nums[i]==30) {
								count++;							
					}
	                }System.out.println("count값: "+count);
	                 System.out.println("=======================================");
	
	                 String str="korea";
	                 char ch ='k';
	                 char[] strs = {'k','o','r','e','a'};
	                 
	                 String[] names = {"홍길동","이순신","강감찬","김유신"};
	                 for(int i=-0;i<names.length;i++) {
	                	 System.out.println(names[i]);
	                	
	                 } System.out.println(nums); 
	                 System.out.println(scores);//메모리주소값 
	                 
	                 int[] arr01= {10,20,30};
	                 int[] arr02;
	                 arr02 =arr01;
	                 
	                 System.out.println(arr02[0]);
	                 System.out.println(arr02[1]);
	                 System.out.println(arr02[2]);
	                 System.out.println("=======================================");
	                 
	                 arr02[1] =200;
	                 System.out.println("arr02[1]"+ arr02[1]);
	                 System.out.println("arr01[1]"+ arr01[1]);
	                 
	                 System.out.println("arr02[1]"+ arr02);
	                 System.out.println("arr01[1]"+ arr01);
	                 System.out.println("=======================================");
	                 int a=10;
	                 int b;
	                 b=a;
	                 
	                 System.out.println(b);
	                 
	}
}
	

