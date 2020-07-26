package JUNIT.test;

public class Removal {
	String remove(String input){
		String result = input;
		int len = input.length();
		if(len>=2) {
			if(input.charAt(0) == 'A' && input.charAt(1) == 'A')
				result = result.substring(2);
			else if(input.charAt(0) == 'A' && input.charAt(1) != 'A')
				result = result.substring(1);
			else if(input.charAt(0) != 'A' && input.charAt(1) == 'A')
				result = result.substring(0,1) + result.substring(2);
		}
		else if(len == 1) {
			result = input.charAt(0) == 'A' ? "" : result; 
		}
		return result;
		
	}
}
