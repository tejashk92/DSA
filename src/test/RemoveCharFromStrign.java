package test;

public class RemoveCharFromStrign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("Tejash");
		sb.deleteCharAt(0);
		System.out.println(sb);
		//System.out.println(removeCharAt(4, "Tejash"));
	}
	
	public static String removeCharAt(int i,String str) {
		
		if(i < 0 || i >= str.length()) {
			throw new RuntimeException("Invalid index for removal");
		}
		
		if( i == 0) {
			str=str.substring(i+1);
			
		} else if( i == str.length()-1) {
			str = str.substring(0,i);
		}else {
			String first=str.substring(0,i);
			String last=str.substring(i+1,str.length());
			str=first+last;
		}
		
		return str;
	}

}
