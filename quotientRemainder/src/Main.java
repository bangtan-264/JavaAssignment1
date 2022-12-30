import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int num1,num2,quot,rem;
        Scanner in=new Scanner(System.in);

        System.out.println("Enter a dividend and a divisor");
        num1=in.nextInt();
        num2=in.nextInt();

        quot=num1/num2;
        rem=num1%num2;

        System.out.println("Remainder: "+rem+" Quotient: "+quot);
    }
}
