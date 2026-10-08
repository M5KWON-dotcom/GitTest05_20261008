package java_chapter07_01;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		int[] array = {10,20,30,40,50};
		double[] array1 = {0.1,0.2,0.3};
		String[] strs1 = {"대한민국","일본","미국"};
		
	//	ArrayList<int> arrayList1 = new ArrayList<int>();
		
		ArrayList<String> arrayList1 = new ArrayList<String>();
		
		arrayList1.add("대한민국");
		arrayList1.add("일본");
		arrayList1.add("미국");
		
		for(int i=0;i<arrayList1.size();i++) {
			System.out.println(arrayList1.get(i));
		}
		//Wrapper 클래스
		ArrayList<NumInt> numArrayList = new ArrayList<NumInt>();
		NumInt numint1 =new NumInt(10);
		NumInt numint2 =new NumInt(20);
		NumInt numint3 =new NumInt(30);
		NumInt numint4 =new NumInt(40);
		NumInt numint5 =new NumInt(50);
		
		numArrayList.add(numint1);
		numArrayList.add(numint2);
		numArrayList.add(numint3);
		numArrayList.add(numint4);
		numArrayList.add(numint5);
		
		System.out.println(numArrayList.get(2).num);
		
		//정수형 값을 가지는 ArrayList를 선언
		ArrayList<Integer> intArray=new ArrayList<Integer>();
        //Integer 같은 클래스를 Wrapper 클래스라고한다.
		intArray.add(10);
		intArray.add(20);
		intArray.add(30);
		intArray.add(40);
		intArray.add(50);
		
		System.out.println(intArray.get(0));
		//integer, Double,Boolean,Character -> Wrapper클래스
		
		//intArray.clear();//전체 한번에 삭제
		System.out.println(intArray.isEmpty());
		//isEmpty()->ArrayList 안에 비어있는지의 여부를 true 또는 False로 반환
	}

}
