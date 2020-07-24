import java.util.*;
public class NewYear{
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	Sweets s1 = new Sweets();
	Sweets s2 = new Sweets();
	Sweets.getweight();
	Choclates c1,c2,c3;
	c1 =new Candies();
	c2 =new Candies();
	c3 =new Candies();
	System.out.println("Choose to sort choclates by 1.weight 2.cost");
	int c=sc.nextInt();
	if(c==1)
	{
	Candies.sortbyweights();
	}
	else
	{
	Candies.sortbycosts();
	}
	
}
}
