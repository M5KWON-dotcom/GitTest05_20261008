package java_chapter07_01;

public class Array06 {

	public static void main(String[] args) {
	
		int [] scores2 = {10,20,30,40,50};
		
        int sum=0;
        double avg=0;
        
		for(int i =0;i<scores2.length;i++) {
			sum += scores2[i];
		}System.out.println(sum);
		
		for(int i =0;i<scores2.length;i++) {
			avg = sum/(double)scores2.length;
		}System.out.println(avg);
	
	    String[] strArray = {"강감찬","이순신","김유신"};
	    //배열에서 이순신을 검색하시오.(문자열 배열에서 특정데이터를 검색)
	    for(int i=0;i<strArray.length;i++) {
	    	if(strArray[i]=="이순신") {//문자열 비교에서는 ==를 사용하지 않는다
	    		System.out.println((i+1)+"번째 이순신 찾기 성공");
	    	}
	    }
	
	    String name1 ="홍길동";
	    String name2 ="홍길동";
	    
	    if(name1.equals(name2)) {  //문자열 이름이 가지고있는 실제 저장되어있는 주소값 비교
	    	System.out.println("TRUE");
	    }else {
	    	System.out.println("FALSE");
	    }
	    
	    String str1="홍길동";
	    String str2= new String ("홍길동");
	    System.out.println("str1:"+ str1);
	    System.out.println("str2:"+ str2);

	    if(str1.equals(str2)) {
	    	System.out.println("TRUE");
	    }else {
	    	System.out.println("FALSE");
	}

	    for(int i =0;i<strArray.length;i++) {
	    	if(strArray[i].equals("이순신")) {
	    		
	    	}
	    }
	}
}
