import java.util.*;
class Main{
    public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        String src="Chennai";
		String dst="Covai";
		char a='a', b='b', c='c', d='d';
		int fare, n, tot;
		System.out.println("Enter the place you boarded:");
		char ch;
		ch=sc.next().charAt(0);
		switch(ch) 
		{
			case 'a':
			{
		     System.out.println("Enter the no. of tickets needed:");
			 n=sc.nextInt();
			 fare=100;
			 tot=fare*n;
			 System.out.println("Your Total cost is "+tot);
			 break;
			}
		    case 'b':
			{
		     System.out.println("Enter the no. of tickets needed:");
			 n=sc.nextInt();
			 fare=200;
			 tot=fare*n;
			 System.out.println("Your Total cost is "+tot);
			break;
			}
		   case 'c':
			{
		     System.out.println("Enter the no. of tickets needed:");
			 n=sc.nextInt();
			 fare=300;
			 tot=fare*n;
			 System.out.println("Your Total cost is "+tot);
			 break;
			 }
		   case 'd':
			{
		     System.out.println("Enter the no. of tickets needed:");
			 n=sc.nextInt();
			 fare=400;
			 tot=fare*n;
			 System.out.println("Your Total cost is "+tot);
			 break;
			}
			default:
			{
			System.out.println(" Enter valid choice");
			break;
			}
		}
		
    }
}
