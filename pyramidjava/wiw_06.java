public class wiw_06
{
public static void main(String[] args) 
{
int wiw,kawinthara;
for (wiw=1; wiw<=7; wiw++)
{
	for (kawinthara=1; kawinthara<=wiw; kawinthara++)
	{
	System.out.print(" ");
	}
	for (kawinthara=6; kawinthara>=wiw; kawinthara--)
	{
	System.out.print((kawinthara-1)%2);
	}
	System.out.print((wiw)%2);
                
		for (kawinthara=wiw; kawinthara<=6; kawinthara++)
		{
		System.out.print((kawinthara-1)%2);
		}
		System.out.println();
		}
	}
}
