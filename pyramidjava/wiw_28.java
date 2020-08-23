public class wiw_28
{
public static void main(String[] args) 
{
int wiw,kawinthara;
for (wiw=1; wiw<=5; wiw++)
{
	for (kawinthara=5; kawinthara>=wiw; kawinthara--)
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
		for (kawinthara=wiw; kawinthara<=5; kawinthara++)
		{
		System.out.print(kawinthara);
		} 
		System.out.println();
		}
	}
}
