package lab6;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex7 {

	public static void main(String[] args) {
		
		Integer[] arr= {79,76,54,98,2,3,1};
		Ex7 t=new Ex7();
		List<Integer> answer=t.getSorted(arr);
		System.out.println(answer);
        
    }
	
	List<Integer> getSorted(Integer[] arr) {
		
		//convert integer array to List using Arrays.asList(arr)
		List<Integer> list=Arrays.asList(arr);
		
		Collections.reverse(list);
		System.out.println("Reversed List:"+list);
	    Collections.sort(list);
	    return list;
		
	}
}
		
		 
        
  
