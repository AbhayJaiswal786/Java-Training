/*
6.Given a string, s , and two indices, start and end , print a substring consisting of all characters in 
the inclusive range from start to end -1 . You'll find the String class' substring method helpful in 
completing this challenge.
Input Format
The first line contains a single string denoting .
The second line contains two space-separated integers denoting the respective values of start and 
end.
Constraints
• 1 <= |s| <= 100
• 0 <= start < end <=n
• String s consists of English alphabetic letters (i.e.,[a-z A - Z] ) only.
Output Format
Print the substring in the inclusive range from start to end -1 .
Sample Input
Helloworld
3 7
Sample Output
lowo
*/

import java.util.Scanner;

public class Question_6 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		int start = scanner.nextInt();
		int end = scanner.nextInt();
		for (int i = start; i <= end; i++) {
			System.out.print(string.charAt(i));
		}

	}
}