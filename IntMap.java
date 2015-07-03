

import java.util.Scanner;

public class IntMap {

	public static void main(String[] args) 
	{

		String s;
		char c;
		int ascii;
		Scanner in=new Scanner(System.in);
		System.out.println("enter the string:");
		s=in.nextLine();
		
		int result=0,i=0,len;
		
		len=s.length()-1;
		while(len>=0)
		{
			c=s.charAt(i);
			ascii=(int)c;
			result+=((ascii-64)*(Math.pow(26, len)));
			i++;
			len--;
		}
		result-=1;
		System.out.println(result);
		}

}
