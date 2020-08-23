public class wiw_04
{
	public static void main(String[] args) {
	for (int wiw=1; wiw<= 4; wiw++)
	{
		for (int kawinthara=1; kawinthara<=wiw; kawinthara++)
                {
		System.out.print("*");
		}
		for (int kawinthara=wiw; kawinthara>=2; kawinthara--)
		{
		System.out.print(kawinthara);
		}
		for (int kawinthara=1; kawinthara<=wiw; kawinthara++)
		{
		System.out.print(kawinthara);
		}
		System.out.println();
		}
	}
}
