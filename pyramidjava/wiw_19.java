public class wiw_19
{
public static void main(String[] args) 
{
int wiw,kawinthara;
for (wiw=1; wiw<=5; wiw++)
{
System.out.print(wiw);

		for (kawinthara=wiw; kawinthara<=9; kawinthara++)
		{
		System.out.print("*");
		}
		for (kawinthara=2; kawinthara<=wiw; kawinthara++)
		{
		System.out.print(" ");
		}
		System.out.print(6-wiw);
		System.out.println();
		}
	}
}
