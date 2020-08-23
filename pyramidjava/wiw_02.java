public class wiw_02
{
	public static void main(String[] args) {
	for (int wiw=1; wiw<=4; wiw++)
	{
		for (int kawinthara=wiw; kawinthara<=wiw+2; kawinthara++)
		{
		System.out.print(kawinthara); 
		}
		for (int kawinthara=1; kawinthara<=(wiw+2); kawinthara++)
		{
		System.out.print("*"); 
		}
		System.out.println(); 
		}
	}
}
