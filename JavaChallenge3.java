package javachallenge;

public class JavaChallenge3 {


public static void main(String[] args) {
		
	
	String s="A man,a plan,a canal:Panama";
	String rev="";
	String s1=s.replaceAll("[^a-zA-Z0-9]", "");
	int length = s1.length();
	char[] charArray = s1.toCharArray();
	
	for( int i=charArray.length-1;i>=0;i--) {
		rev=rev+charArray[i];
	}
	//System.out.println(s1);

	
	if(rev.equalsIgnoreCase(s1)) {
		System.out.println(s1 + "true is a palindrome");
	}
	else {
		System.out.println("false is not a palindrome");
	}
	String ss="race a car";
	String rev1="";
	int length2 = ss.length();
    char[] charArray2 = ss.toCharArray();
    for(int j=charArray2.length;j<=0;j++) {
    	rev1=rev1+charArray2[j];
    }
    if(rev1.equalsIgnoreCase(ss)) {
    	System.out.println(ss + "true is a palindrome");
    }
    else {
    	System.out.println(ss + "false is not a palindrome");
    }
    String str=" ";
    String rev2="";
    
   
     }
}

