public class wiw_07
{
public static void main(String[] args) 
{
int wiw,kawinthara;
for (wiw=1; wiw<=7; wiw++)
	{
	for (kawinthara=7; kawinthara>=wiw; kawinthara--)
	{
	System.out.print(" ");
	}
	for (kawinthara=1; kawinthara<=wiw; kawinthara++)
	{
	System.out.print(kawinthara);
	}
	System.out.print(wiw);

		for (kawinthara=wiw; kawinthara>=1; kawinthara--)
		{
		System.out.print(kawinthara);
		}
		System.out.println();
		}
	}
}
