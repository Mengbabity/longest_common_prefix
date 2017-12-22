package longest_common_prefix;
import java.lang.String;

public class solution {
public String longestCommonPrefix(String[] strs) {
	 if(strs == null||strs.length==0)    
	 return null;
	 String prefix = strs[0];   //put the first word into the prefix
	 int i = 1;
	 while(i < strs.length)   //the number of word
	 {
		while(strs[i].indexOf(prefix) != 0)   //if there is no prefix in the word
	        prefix = prefix.substring(0,prefix.length()-1);
	    i++;
	 }
	 System.out.println(prefix);
	 return prefix;
	}
}
