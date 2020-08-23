public class wiw_21
{
public static void main(String[] args) 
{
int wiw,kawinthara;
for (wiw=1; wiw<=5; wiw++)
	{
	for (kawinthara=wiw; kawinthara<=7; kawinthara++)
		{
		System.out.print("*");
		}
		System.out.print(wiw);
		for (kawinthara=1; kawinthara<=wiw; kawinthara++)
		{
		System.out.print("*");
		}
		System.out.print(8-wiw);
		System.out.println();
		}
	}
}
