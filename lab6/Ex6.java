package lab6;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.List;

public class Ex6 {

	public static void main(String[] args) {
				 
		Map <Integer,LocalDate> map=new HashMap<>();
		map.put(10,LocalDate.of(2000, 02, 23));
		map.put(20, LocalDate.of(1999, 10, 13));
		map.put(30, LocalDate.of(1999, 10, 25));
		map.put(40, LocalDate.of(2005, 03, 20));
		map.put(50, LocalDate.of(2007, 01, 24));
		
		Ex6 e=new Ex6();
		
		List<Integer> idList=e.votersList(map);
		System.out.println(idList);
		

	}
	
	List<Integer> votersList(Map<Integer,LocalDate> map){
		
		List<Integer> intList=new ArrayList<>();
		
			Set <Integer> set=map.keySet();
		
			for(int i:set) {
				Period period = Period.between(map.get(i), LocalDate.now());
				
				if(period.getYears()>=18) {
					
					intList.add(i);
					
				}
				
				
			}
			
		
		return intList;
		
	}

}
