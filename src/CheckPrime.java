import java.util.Scanner;
public class CheckPrime {
        // TODO: Read n
        // TODO: Check if n is prime
        // Hint:
        // 1. If n <= 1, it is Not Prime.
        // 2. Loop from 2 to sqrt(n). If n is divisible by any number, it is Not Prime.
        // 3. Otherwise, it is Prime.
        // TODO: Print "Prime" or "Not Prime"
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int f = 0;
                if (n <= 1)
                        System.out.println("Not Prime");
                else{
                        for(int i=2; i <= Math.sqrt(n); i++){
                                if(n % i == 0){
                                        f = 1;
                                        break;
                                }
                        }
                        if(f==1)
                                System.out.println("Not Prime");
                        else
                                System.out.println("Prime");
                }
        }
    
}

