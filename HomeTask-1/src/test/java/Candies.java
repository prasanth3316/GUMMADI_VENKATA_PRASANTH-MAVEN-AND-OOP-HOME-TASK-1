import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Candies implements Choclates{
	Scanner sc = new Scanner(System.in);
	 static  ArrayList<String> n=new ArrayList<String>();
	static ArrayList<Integer> w=new ArrayList<Integer>();
	static ArrayList<Integer> c=new ArrayList<Integer>();
	public Candies()
	{
		System.out.println("Enter the name of choclate:");
		String str3=sc.next();
		System.out.println("Enter the weight of choclate:");
		int n3=sc.nextInt();
		System.out.println("Enter the cost of choclate:");
		int c1=sc.nextInt();
		addchocaltename(str3);
		addchocalteweight(n3);
	    addchoclatecost(c1);
	}
	
	 public void addchocaltename(String p)
	 {
		 System.out.println("The choclate gifted is:"+p+"\n");
		 n.add(p);
	 }
	 public void addchocalteweight(int q) {
			 w.add(q);
		}
	 public void addchoclatecost(int y)
	 {
		 c.add(y);
	 }

	  static void sortbyweights()
	 {
	 Collections.sort(w);
	 System.out.println("Sorted order of weights");
	 System.out.println(w);
	 }
	 
	 static void sortbycosts()
	 {
	 Collections.sort(c);
	 System.out.println("Sorted order of costs");
	 System.out.println(c);
	 }
	
	
}

