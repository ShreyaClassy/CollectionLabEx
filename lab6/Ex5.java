package lab6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex5 {

	public static void main(String[] args) {
		
		int[] arr= {25,30,12,10,9,87};
		Ex5 e=new Ex5();
	
		int ans=e.getSecondSmallest(arr);
		System.out.println(ans);
		
		


		

	}
	
public int getSecondSmallest(int[] arr){
		
		List <Integer> intList=new ArrayList<>();
		for(int i: arr) {
			intList.add(i);
		}
		
		Collections.sort(intList);
		System.out.println(intList);
		return intList.get(1);
		
		
	}
}
