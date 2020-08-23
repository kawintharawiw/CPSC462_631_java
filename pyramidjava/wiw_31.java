public class wiw_31
{
public static void main(String[] args) 
{
int wiw,kawinthara;
for (wiw=1; wiw<=5; wiw++)
	{
		for (kawinthara=5; kawinthara>=wiw; kawinthara--)
		{
		System.out.print(wiw);
		}
		for (kawinthara=2; kawinthara<=wiw; kawinthara++)
		{
		System.out.print(" ");
		}
		for (kawinthara=2; kawinthara<=wiw; kawinthara++)
		{
		System.out.print(" ");
		}
		for (kawinthara=5; kawinthara>=wiw; kawinthara--)
		{
		System.out.print("*");
		}   
		System.out.println();
		}
	}
}
