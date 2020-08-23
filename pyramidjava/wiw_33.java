public class wiw_33
{
public static void main(String[] args) 
{
int wiw,kawinthar;
for (wiw=1; wiw<=3; wiw++)
	{
	for (kawinthar=3; kawinthar>=wiw; kawinthar--)
	{
	System.out.print(" ");
	}
	for (kawinthar=1; kawinthar<=wiw; kawinthar++)
	{
	System.out.print("*");
	}
	for (kawinthar=2; kawinthar<=wiw; kawinthar++)
	{
	System.out.print("*");
	}      
         
		System.out.println();
		}
		for (wiw=1; wiw<=2; wiw++)
		{
		for (kawinthar=1; kawinthar<=wiw+1; kawinthar++)
		{
		System.out.print(" ");
		}
		for (kawinthar=wiw; kawinthar<=2; kawinthar++)
		{
		System.out.print("*");
		}
		for (kawinthar=wiw; kawinthar<=1; kawinthar++)
		{
		System.out.print("*");
		}
		System.out.println();
		}
	}
}
