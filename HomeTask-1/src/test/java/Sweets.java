import java.util.ArrayList;
import java.util.Scanner;
public class Sweets {
	Scanner sc = new Scanner(System.in);
	  static ArrayList<Integer> s=new ArrayList<Integer>();
	public Sweets()
	{
		System.out.println("Enter the sweet name:");
		String str1=sc.next();
		String s1=sc.nextLine();
		System.out.println("Enter the quantity of Sweet");
		int n1=sc.nextInt();
		s.add(n1);
		gift_Sweet(str1);
	}
public void gift_Sweet(String s)
{
	System.out.println("The Sweet gifted is:"+s+"\n");
}

static public void getweight()
{
	int sum=0;
	for(int i=0;i<s.size();i++)
	{
		sum= sum+s.get(i);
	}
	System.out.println("The Total weight of Sweets is:"+sum);
}

}
