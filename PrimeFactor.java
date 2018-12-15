package all.program.com;

public class PrimeFactor {
	public static void main(String args[])
	{
		int n=24;
		primeNum(n);
	}

	private static void primeNum(int n) {
		
        while (n%2==0) 
        { 
            System.out.print(2 + " "); 
            n /= 2; 
        } 
  
      
        for (int i = 3; i <= Math.sqrt(n); i+= 2) 
        { 
            // While i divides n, print i and divide n 
            while (n%i == 0) 
            { 
                System.out.print(i + " "); 
                n /= i; 
            } 
        } 
  
        // This condition is to handle the case whien 
        // n is a prime number greater than 2 
        if (n > 2) 
            System.out.print(n); 
	}

}
