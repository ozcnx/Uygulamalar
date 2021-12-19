package Day_1208;

public class C02 {

	public static void main(String[] args) {
		
		
		   int n1 = 30, n2 = 40,ebob=1, ekok=1;

	       for(int i = 1; i <= n1 && i <= n2; ++i)
	        {
	            if(n1 % i == 0 && n2 % i == 0)
	                ebob = i;
	        }

	        ekok = (n1 * n2) / ebob;
	       System.out.println(ebob);
	       System.out.println(ekok);
	}

}
