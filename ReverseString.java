package reverseString;
	 
	public class ReverseString
	{
	    static String leftrotate(String str, int d) 
    {  
	    	String ans = str.substring(d) + str.substring(0, d); 
   
	    	return ans; 
           
    } 
	    static String rightrotate(String str, int d) 
	    { 
	            return leftrotate(str, str.length() - d); 
	    } 
	  
	    public static void main(String args[]) 
	    { 
	            String str = "benitorex"; 
	           
	            
	            for(int i=0;i<str.length() - 6 ;i++) {
	            	System.out.println(rightrotate(str, i));
	            	
	            }
	}

	}
