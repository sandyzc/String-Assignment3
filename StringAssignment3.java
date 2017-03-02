package Assignment1;

import java.util.Scanner;

public class StringAssignment3 {

	

	    public static void main(String[] args) {
	    	Scanner sc= new Scanner(System.in);
	    	System.out.println("Enter a string");
	    	String sub = sc.next();
	    	String main =  "The quick brown fox jumps over the lazy dog";
	    	
	        
	        if(findMe(sub,main)== true){
	        	
	        	System.out.println("Substring found");
	        	
	        } else if(findMe(sub,main)!= true){
	        	
	        	System.out.println("Substring not found");
	        	
	        }
	        
	        
	    }
	 
	    public static boolean findMe(String subString, String mainString) {
	        boolean foundme = false;
	        int max = mainString.length() - subString.length();
	 
	 
	        // To find weather main string has substring
	        checkrecusion: for (int i = 0; i <= max; i++) {
	            int n = subString.length();
	 
	            int j = i;
	            int k = 0;
	 
	            while (n-- != 0) {
	                if (mainString.charAt(j++) != subString.charAt(k++)) {
	                    continue checkrecusion;
	                }
	            }
	            foundme = true;
	            break checkrecusion;
	        }

	        return foundme;
	    }
	

	}


