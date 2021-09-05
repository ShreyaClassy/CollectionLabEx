package lab6;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Ex4 {

	public static void main(String[] args) {
		
		Map <String,Integer> map=new HashMap<>();
		map.put("R100", 70);
		map.put("R101", 89);
		map.put("R102", 92);
		map.put("R103", 60);
		
		Ex4 e=new Ex4();
		Map<String,String> result=e.getStudents(map);
		System.out.println(result);

			
	}
	
	Map<String,String> getStudents(Map<String,Integer> map){
		
		Map <String,String> medal=new HashMap<>();
		
		Set <String> set=map.keySet();
		
		for(String i:set) {
			
			Integer marks=map.get(i);
			
			if(marks>=90) {
				medal.put(i, "Gold");
				
			}
			
			else if(marks>=80 && marks<90) {
				medal.put(i,"Silver");
				
			}
			
			else if(marks>=70 && marks<80) {
				medal.put(i, "Bronze");
			}
			
			else {
				
				medal.put(i, "Not Eligible");
				
			}
			
		
		}
		return medal;	
	}

}
