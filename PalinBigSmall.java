import java.util.Scanner;

public class PalinBigSmall {
	
	static void printLongShort(String s)
	{
		//System.out.println(s);
		String[] words = s.trim().split(" ");
		/*
		 * for(String w1:words) { System.out.print(w1+" "); }
		 */
		String[] palin = new String[words.length];
		int p = 0;
		for(int i=0;i<words.length;i++)
		{
			String word = words[i].toLowerCase();
			int n = word.length();
			int c = 0;
			for(int j=0;j<n;j++)
			{
				if(word.charAt(j)==word.charAt(n-1-j))
				{
					c++;
				}else
					break;
			}
			if(c==n)
			{
				palin[p] = words[i];
				p++;
			}
		}
		/*
		 * for(String p1:palin) { System.out.print(p1+" "); }
		 */
		int max = 0;
		int min = 99999;
		String maxPal = "";
		String minPal = "";
		for(int i=0;i<palin.length;i++)
		{
			if(min>palin[i].length())
			{
				min = palin[i].length();
				minPal = palin[i];
			}
			if(max<palin[i].length())
			{
				max = palin[i].length();
				maxPal = palin[i];
			}
		}
		
		
		System.out.println("Minimum Palindrome Word: "+minPal);
		System.out.println("Maximum Palindrome Word: "+maxPal);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		printLongShort(input);
		
	}

}
