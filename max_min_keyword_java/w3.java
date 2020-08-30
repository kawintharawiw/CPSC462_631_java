public class w3 {
	public static void main(String args[]){

	// 5 6 7 8 9 1000 999 99
	int max=0;
	int min=999;
	int total=0;
	int n = args.length;
	for(int i = 0; i<n; i++){

	if(Integer.parseInt(args[i])>max)
	{
 	max =Integer.parseInt(args[i]);
	}

	if(Integer.parseInt(args[i])<min)
	{
	min =Integer.parseInt(args[i]);
	}
	total +=Integer.parseInt(args[i]);
	}

	System.out.println("max="+max);
	System.out.println("min="+min);
	System.out.println("total="+total);
	System.out.println("average="+total/n);
	}
}
