package test.failed;

/**
 * Asked in Zemoso Online test
 * https://www.coderbyte.com/editor/Min%20Window%20Substring:Java 
 * @author tejas
 *
 */
public class MinWindow {
	
	
	 public static String MinWindowSubstring(String[] strArr) {
		    // code goes here  
		    return strArr[0];
	}
	 
	public static boolean containsAll(String data , String searchstr) {
		StringBuilder sb= new StringBuilder(data);
		for(int i=0; i<searchstr.length();i++) {
			int index=sb.indexOf(searchstr.charAt(i)+"");
			if(index != -1) {
				//System.out.println(searchstr.charAt(i)+" is present in "+sb);
				sb.deleteCharAt(index);
			}else {
				//System.out.println(searchstr.charAt(i)+" is absent in "+sb);
				return false;
			}
		}
		return true;
	}
	
	public static String minimumSubstr(String data , String searchstr) {
		boolean result=true;
		
		//Trim from both ends
		do {
				String temp=data.substring(1,data.length()-1);
				result=containsAll(temp, searchstr);
				if(result) {
					data=temp;
				}
		}while(result && data.length() > 1);
		
		//Trim from front
		do {
				String temp=data.substring(1);
				result=containsAll(temp, searchstr);
				if(result) {
					data=temp;
				}
			}while(result && data.length() > 1);
		
		//Trim from back
		do {
				String temp=data.substring(0,data.length()-1);
				result=containsAll(temp, searchstr);
				if(result) {
					data=temp;
				}
			}while(result && data.length() > 1);
		
		return data;
	}
	
	public static String coderByte(String s1,String s2) {
	    String res = s1;
	    for (int i=0; i<s1.length(); i++){
	      for (int j=i+1; j<=s1.length(); j++){
	        String s = s1.substring(i, j);
	        if (containsAll(s, s2)){
	          if (s.length() < res.length()){
	            res = s;
	          }
	        }
	      }
	    }
	    return res;
	}
	
	 public static String MinWindowSubstringCB(String[] strArr) {
		    String N = strArr[0];
		    String K = strArr[1];
		    int min = Integer.MAX_VALUE;
		    String result = "";
		    for (int i = 0; i < N.length(); i++) {
		        StringBuilder match = new StringBuilder(K);
		        for (int j=i; j < N.length(); j++) {
		            if (match.toString().contains(String.valueOf(N.charAt(j)))) {
		                int index = match.indexOf(String.valueOf(N.charAt(j)));
		                match.replace(index, index + 1, "");
		            }

		            if (match.length() == 0) {
		                if (j - i < min) {
		                    min = j - i;
		                    result = N.substring(i, j+1);
		                }
		                break;
		            }
		        }
		    }

		        return result;
		  }
	
	
	public static void main(String[] args) {
		System.out.println(coderByte("aabdccdbcacd","aad"));
		
	}

}
