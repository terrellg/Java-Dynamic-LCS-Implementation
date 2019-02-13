/*
 * Java Implementation of Mock Google Interview Question
 * 	

 * found here: https://www.youtube.com/watch?v=10WnvBk9sZc&t=1593s
 * 
 * 
 * 
 * Write a function that takes two strings s1 and s2
 *  and returns the longest common subsequence of s1 and s2
 *  	
 *  
 *  	implementation based off dynamic programming algorithm found at
 *		https://en.wikipedia.org/wiki/Longest_common_subsequence_problem#Reading_out_a_LCS
 *  
 *  "ABAZDC", "BACBAD" => "ABAD"
 *  "AGGTAB", "GXTXAYB" => "GTAB"
 *  "aaaa", "aa" => "aa"
 * 
 */

/*	012345
 *  ABAZDC
 *  BACBAD
 *  
 */


public class SubSequence {
	public  String SubSequence(String s1, String s2) {
		String subsequence="";
		int[][] store = new int[s1.length()+1][s2.length()+1]; //dynamic programming to store length of LCS
		int s1_length = s1.length();
		int s2_length = s2.length();
		
		//	edge case  if s1 and s2 are equal can return s1 //example s1 = a s2 = a LCS =a
		if(s1==s2) {
			subsequence=s1;
			return subsequence;
		}
		//edge case if either s1 or s2 are empty return sum of both //example s1= "" s2 =bb LCS = bb
		if(s1.isEmpty()|| s2.isEmpty()) {
			subsequence=s1+s2;
			return subsequence;
		}
		for(int i=0;i<s1.length();++i) {
			for(int j=0;j<s2.length();++j) {
				if(s1.charAt(i)==s2.charAt(j)) {
					store[i+1][j+1] = 1+store[i][j];
				}
				else {
					store[i+1][j+1] = Math.max(store[i+1][j], store[i][j+1]);
					//length of LCS
				}
			}

		}
		
		
		StringBuilder sb = new StringBuilder();
		int i=0; int j=0;
		while(s1_length > i && s2_length>j) {
			if(store[s1_length][s2_length]== store[s1_length-1][s2_length]) {
				//sb.append(s1.charAt(s1position-1));
				s1_length--;
			}
			else if(store[s1_length][s2_length]== store[s1_length][s2_length-1]) {
				s2_length--;
			}
			else {
			if(	s1.charAt(s1_length-1) == s2.charAt(s2_length-1)){
				
			
			sb.append(s1.charAt(s1_length-1));
			s1_length--;
			s2_length--;
			}
			}
		}
		subsequence=sb.reverse().toString();
		return subsequence;

	}


public static void main(String[] args) {
	SubSequence ss = new SubSequence();
	ss.SubSequence("ABAZDC", "BACBAD");
}
}
