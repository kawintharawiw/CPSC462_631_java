public class wiw_36
{
public static void main(String[] args) 
{
int wiw,kawinthara;
for (wiw=1; wiw<=3; wiw++)
	{
	for (kawinthara=wiw; kawinthara<=3; kawinthara++)
	{
	System.out.print(kawinthara);
	}
	for (kawinthara=1; kawinthara<=wiw; kawinthara++)
	{
	System.out.print("*");
	}
	for (kawinthara=2; kawinthara<=wiw; kawinthara++)
	{
	System.out.print("*");
	}
	for (kawinthara=3; kawinthara>=wiw; kawinthara--)
	{
	System.out.print(kawinthara);
	}

		System.out.println();
		}
		for (wiw=2; wiw<=3; wiw++)
		{
		for (kawinthara=1; kawinthara<=wiw; kawinthara++)
		{
		System.out.print(4-(4-kawinthara));
		}
		for (kawinthara=wiw; kawinthara<=3; kawinthara++)
		{
		System.out.print("*");
		}
		for (kawinthara=wiw; kawinthara<=2; kawinthara++)
		{
		System.out.print("*");
		}
		for (kawinthara=1; kawinthara<=wiw; kawinthara++)
		{
		System.out.print(4-kawinthara);
		}
		System.out.println();
		} 
	}
}
