public class wiw_34
{
public static void main(String[] args) 
{
int wiw,kawinthara;
for (wiw=1; wiw<=3; wiw++)
	{
	for (kawinthara=3; kawinthara>=wiw; kawinthara--)
	{
	System.out.print(" ");
	}
	System.out.print("*");
	for (kawinthara=1; kawinthara<=wiw; kawinthara++)
	{
	System.out.print(wiw);
	}
	for (kawinthara=2; kawinthara<=wiw; kawinthara++)
	{
	System.out.print(wiw);
	}
	System.out.print("*");
                
		System.out.println();
		}
		for (wiw=1; wiw<=2; wiw++)
		{
		for (kawinthara=1; kawinthara<=wiw+1; kawinthara++)
		{
		System.out.print(" ");
		}
		System.out.print("*");
		for (kawinthara=wiw; kawinthara<=2; kawinthara++)
		{
		System.out.print(3-wiw);
		}
		for (kawinthara=wiw; kawinthara<=1; kawinthara++)
		{
		System.out.print(3-wiw);
		}
		System.out.print("*");
		System.out.println();
		}
	}
}
