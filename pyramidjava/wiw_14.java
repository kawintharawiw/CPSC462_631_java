public class wiw_14
{
public static void main(String[] args) 
{
int wiw,kawinthara;
for (wiw=1; wiw<=5; wiw++)
{
	for (kawinthara=1; kawinthara<=wiw; kawinthara++)
	{
	System.out.print(" ");
	}
	for (kawinthara=0; kawinthara<2; kawinthara++)
	{
	System.out.print(kawinthara+wiw);
	}
	for (kawinthara=4; kawinthara>=wiw; kawinthara--)
	{
	System.out.print(" ");
	}
	for (kawinthara=4; kawinthara>=wiw; kawinthara--)
	{
	System.out.print(" ");
	}
		for (kawinthara=1; kawinthara<3; kawinthara++)
		{
		System.out.print(((wiw+1)*2)-(kawinthara+wiw));
		}          
		System.out.println();
		}
	}
}
