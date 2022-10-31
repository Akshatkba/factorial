import java.util.Scanner;
public class factorial {
    // factorial method using recursion
        static int factorials(int x){
            int fact = 1;
            if(x==0||x==1){
                return 1;
            }
            else{
                fact = x * factorials(x-1);
                return fact;
            }
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();
        int ans = factorials(a);
        System.out.println(ans);
    }
}
