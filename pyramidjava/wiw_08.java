public class wiw_08
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
		for (kawinthara=0; kawinthara<3; kawinthara++)
		{
		System.out.print(kawinthara+wiw);
		}
		for (kawinthara=0; kawinthara<=wiw; kawinthara++)
		{
		System.out.print("*");
		}
		System.out.println();
		}
	}
}
