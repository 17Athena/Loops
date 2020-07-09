import java.util.Scanner;

public class loopThree {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        int n;
        int sum=0;
        for(n=0; n<=20; n=n+2)
        {
            sum=sum+n;
        }
        System.out.println(sum);
    }
}


