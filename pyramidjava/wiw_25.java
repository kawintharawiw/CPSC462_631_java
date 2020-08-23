public class wiw_25
{
public static void main(String[] args) 
{
int wiw,kawinthara;
for (wiw=1; wiw<=5; wiw++)
	{
	for (kawinthara=4; kawinthara>=wiw; kawinthara--)
		{
		System.out.print("*");
		}
		for (kawinthara=1; kawinthara<=wiw; kawinthara++)
		{
		System.out.print(6-wiw);
		}
		for (kawinthara=2; kawinthara<=wiw; kawinthara++)
		{
		System.out.print(6-wiw);
		}
		for (kawinthara=5; kawinthara>=wiw; kawinthara--)
		{
		System.out.print("*");
		} 
		System.out.println();
		}
	}
}
