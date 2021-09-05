package lab6;

import java.util.Map;
import java.util.HashMap;

public class Ex3 {

	public static void main(String[] args) {
		
		int[] arr= {2,1,3,4};
		Ex3 sq=new Ex3();
		Map<Integer,Integer> ans=sq.getSquares(arr);
		System.out.println(ans);

	}
	
	Map<Integer,Integer> getSquares(int[] arr){
		
		Map<Integer,Integer> map=new HashMap<>();
		
		
		for(int i:arr) {
		
		map.put(i, i*i);
		
	}
		
		return map;

}
}
