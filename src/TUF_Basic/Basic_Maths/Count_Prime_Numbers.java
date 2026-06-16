package TUF_Basic.Basic_Maths;

// You are given an integer n. 
// You need to find out the number of prime numbers in the range [1, n] (inclusive). 
// Return the number of prime numbers in the range.
public class Count_Prime_Numbers
{
    public int countPrimes(int n) {
        if (n <= 1) {
            return 0;
        }

        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Count_Prime_Numbers obj = new Count_Prime_Numbers();
        int n = 10; // Example number
        int primeCount = obj.countPrimes(n);
        System.out.println("Number of prime numbers in the range [1, " + n + "] is: " + primeCount);
    }
}

// Output: Number of prime numbers in the range [1, 10] is: 4