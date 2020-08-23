public class wiw_23
{
public static void main(String[] args) 
{
int wiw,kawinthara;
for (wiw=1; wiw<=5; wiw++)
	{
	System.out.print(wiw);
	for (kawinthara=wiw; kawinthara<=5; kawinthara++)
		{
		System.out.print("*");
		}
		for (kawinthara=2; kawinthara<=wiw; kawinthara++)
                {
		System.out.print(" ");
		}
		System.out.print(wiw);
		System.out.println();
		}
	}
}
