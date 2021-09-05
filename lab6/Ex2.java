package lab6;
import java.util.HashMap;
import java.util.Map;
public class Ex2 {

	public static void main(String[] args) {
		
		char[] charArr= {'a','e','e','z','a','y'};
		
	
		
		Ex2 e=new Ex2();
		Map<Character,Integer> num=e.countChars(charArr);
		System.out.println(num);

	}
	
	Map<Character,Integer> countChars(char[] arr){
		
		Map<Character,Integer> map=new HashMap<>();
		
		for(char c:arr) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			
			else {
				map.put(c, 1);
			}
		}
		
		return map;
	}
			
		
		
		
		
			
		
	}


