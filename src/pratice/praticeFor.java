package pratice;

public class praticeFor {

	public static void main(String[] args) {
	    int[] numbers3 = {90,80,70,100,85};
	    int sum=0;
		for(int num : numbers3) {
			sum+=num;
		}System.out.println(sum);
		System.out.println("=========================");	
		
		
		double avg= sum/(double)numbers3.length;
		
		int[] scores= {10,20,30,40,50};
		for(int i=scores.length-1;i>=0;i--) {
			System.out.println(scores[i]);
			}
		System.out.println("=========================");
		
		
		int[] numbers= {11,32,75,33,52,36,60,9,31,13,23};
		int count =0;
		//for(int number:numbers){
		for(int i=0;i<numbers.length;i++) {
		if(numbers[i]%3==0) {count++;
		}
		}System.out.println(count);
		System.out.println("=========================");
		
		
	    int[] holsus= {10,20,30,40,50};
	    for(int i =0; i<holsus.length;i++) {
		if(i%2==1) {
			System.out.println(holsus[i]);
		}
	}System.out.println("=========================");
	
	
	    int sum1=1;
		int[] numbers2= {10,20,30,40,50};
		for(int i=0;i<numbers2.length;i++) {
		sum1=sum1*numbers2[i];
		}System.out.println(sum1);
		System.out.println("=========================");
		
		String[] javas={"Spring", "React", "Python", "Java", "Javascript"
	,"Java"};
        //for(String java1:javas){ 첫번째 자바를 찾았을때 몇번째인가
		//int count1=0;
		for (int i=0;i<javas.length;i++) {
	       // count++;
			if(javas[i].equals("Java")) {
		 //break;
				//System.out.println(count1+"번째 있습니다.");
			
	    	System.out.println((i+1)+"번째 있습니다.");
	}
}
	}
}

