package lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collection;

class Ex1 {
	
	public static void main(String[] args) {
		
		Map <String,String> countryMap=new HashMap<>();
		countryMap.put("India","New Delhi");
		countryMap.put("UK", "London");
		countryMap.put("US", "Washington");
		countryMap.put("Russia", "Moscow");
		Ex1 e=new Ex1();
		List<String> result=e.getValues(countryMap);
		System.out.println(result);
			
	}	
		
	
	List<String> getValues(Map<String, String> map){
		
		Collection <String> data=map.values();
		ArrayList<String> intList=new ArrayList<>(data);
		Collections.sort(intList);
		return intList;
	}
		
		
		
		
	
}


