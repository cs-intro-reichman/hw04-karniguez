public class Primes {
    public static void main(String[] args) {
        // Replace this statement with your code
        int n = Integer.parseInt(args[0]);
        int i = 2;
        int m = (int) Math.sqrt(n);
        int co = 0;
        System.out.println("Prime numbers up to " + n + ":");
        while (i <= n){
            boolean isPrime = true;
            for (int j = 2; j <= m; j++){
                if (i == j){
                    break;
                   
                }
                if ((i % j)== 0){
                    isPrime = false;
                    break;
                   
                }
                
            }
            if (isPrime){
            System.out.println(i);
            co++;
            }
            i++;

        
            
        }
        int per = (co * 100) / n;
        System.out.println("There are " + co +" primes between 2 and " + n + " (" + per + "% are primes)");
    }
    
}
