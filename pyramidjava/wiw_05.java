public class wiw_05
{
public static void main(String[] args) 
{
int wiw,kawinthara;
for (wiw=1; wiw<=4; wiw++)
	{            
	for (kawinthara=4; kawinthara>=wiw; kawinthara--)
	{
	System.out.print(" "); 
	}
	System.out.print(wiw); 
	for (kawinthara=2; kawinthara<=wiw; kawinthara++)
	{
	System.out.print("**"); 
	}
	System.out.print(wiw); 
            
	System.out.println(); 
	}
            
		for (wiw=2; wiw<=4; wiw++)
		{
             
		for (kawinthara=1; kawinthara<=wiw; kawinthara++)
		{
		System.out.print(" "); 
		}
		System.out.print(5-wiw); 
		for (kawinthara=3; kawinthara>=wiw; kawinthara--)
		{
		System.out.print("**");
		}
		System.out.print(5-wiw); 
            
		System.out.println();
		}
	}
}