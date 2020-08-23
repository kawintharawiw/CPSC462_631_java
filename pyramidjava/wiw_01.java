public class wiw_01
{
	public static void main(String[] args) 
	{	 
	for(int wiw=1; wiw<=4; wiw++){
		for(int kawinthara=1; kawinthara<=wiw; kawinthara++)
		{
		System.out.print(" ");
		}
		System.out.print(wiw +""+ wiw);
		for(int kawinthara=3; kawinthara>=wiw; kawinthara--)
		{
		System.out.print("**");
		}
		System.out.print(wiw +""+ wiw);
		System.out.println();            
		}
	}
}