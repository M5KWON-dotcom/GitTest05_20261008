package java_chapter07_01;

public class Array04 {

	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50};
		
		//일반적인 for문
		for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
			}
		System.out.println("==================================");
		//향상된 for문
		for(int num : arr){
		System.out.println(num);
		}
		System.out.println("==================================");
		for(int num : arr){
			if(num%3==0) {
		System.out.println(num);
		}
		}
		System.out.println("==================================");
		int sum =0;
		for(int num : arr){
            sum += num;
        }
		System.out.println(sum);
		
	}
}
		


