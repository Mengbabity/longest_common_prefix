# longest_common_prefix
#include<iostream>
#include<vector>
#include<string>
using namespace std;

class Solution {
public :
	string longestCommonPrefix(vector<string> strs) {
		
		string prefix="";
		if (strs.empty())   //string is null
		{
			cout << "null" << endl;
			return "";
		}
			
	    
		for (int i = 0; i < strs[0].size(); i++)   //the length of the first word
		{
			for (int j = 1; j < strs.size(); j++)   //compare the letter in order
			{
				if ((strs[0][i] != strs[j][i]))
				{
					cout << prefix << endl;
					return prefix;
				}				
			}
			prefix = prefix + strs[0][i]; 
		}
		return prefix;
	}
};

void main(){
	Solution s;
	s.longestCommonPrefix({ "carp", "carpet","carpture","cat"});
//	s.longestCommonPrefix({});
}
