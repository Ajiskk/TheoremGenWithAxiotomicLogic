import java.util.ArrayList;

public class PrimeNumberGenerator 
{

	public static ArrayList<Integer> primes;
	public static ArrayList<Integer> realPrimes = new ArrayList<Integer>();
	
	
	public static ArrayList<Integer> primeGenerator(int n)
    {
		primes = new ArrayList<Integer>();
        // Create a boolean array "prime[0..n]" and initialize
        // all entries it as true. A value in prime[i] will
        // finally be false if i is Not a prime, else true.
        boolean prime[] = new boolean[n+1];
        for(int i=0;i<n;i++)
            prime[i] = true;
         
        for(int p = 2; p*p <=n; p++)
        {
            // If prime[p] is not changed, then it is a prime
            if(prime[p] == true)
            {
                // Update all multiples of p
                for(int i = p*2; i <= n; i += p)
                    prime[i] = false;
            }
        }
         
        // Print all prime numbers
        for(int i = 2; i <= n; i++)
        {
            if(prime[i] == true)
                primes.add(i);
        }
        
        primes.remove(Integer.valueOf(2));
        primes.remove(Integer.valueOf(3));
        primes.remove(Integer.valueOf(5));
        primes.remove(Integer.valueOf(7));
        primes.remove(Integer.valueOf(11));
        
       return primes;
    }
	
public static void generatePrimes()
{
	int n = 50;
	while(true)
	{
		realPrimes = primeGenerator(n);
		n+= (n*2);
	}
}

public static ArrayList<Integer> getRealPrimes()
{
	return realPrimes;
}
	
	
}