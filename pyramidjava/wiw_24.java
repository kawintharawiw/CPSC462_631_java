public class wiw_24
{
public static void main(String[] args) 
{
int wiw,kawinthara;
for (wiw=1; wiw<=5; wiw++)
	{
	System.out.print(wiw);
	for (kawinthara=1; kawinthara<=wiw; kawinthara++)
		{
		System.out.print("*");
		}
		for (kawinthara=2; kawinthara<=wiw; kawinthara++)
		{
		System.out.print("*");
		}
		for (kawinthara=5; kawinthara>=wiw; kawinthara--)
		{
		System.out.print(wiw);
		}
		for (kawinthara=5; kawinthara>=wiw; kawinthara--)
		{
		System.out.print(wiw);
		}               
		System.out.println();
		}
	}
}
