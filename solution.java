# longest_common_prefix
package longest_common_prefix;
import java.lang.String;

public class solution {
public String longestCommonPrefix(String[] strs) {
	StringBuilder prefix=new StringBuilder();
	if (strs==null||strs.length==0)
	{
		return "";
	}	
	for(int i=0;i<strs.length;i++){
		if(strs[i].length()==0)
			return "";
	}
    int min=strs[0].length();
	for(int i=0;i<strs.length-1;i++)
	{
		if(strs[i+1].length()>strs[i].length())
			min=strs[i+1].length();
	}
	for (int i = 0; i < min; i++)
	{
		for (int j = 1; j < strs.length; j++)
		{
			if ((strs[0].charAt(i) != strs[j].charAt(i)))
			{
				return prefix.toString();
			}				
		}
		prefix.append(strs[0].charAt(i));
	}
	System.out.println(prefix.toString());
	return prefix.toString();
	}
}
