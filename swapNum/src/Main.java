import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int a,b;

        Scanner in=new Scanner(System.in);

        System.out.println("Enter two numbers to be swapped");
        a=in.nextInt();
        b=in.nextInt();

        int temp=a;
        a=b;
        b=temp;

        System.out.println("Two numbers are: "+a+" "+b);
    }
}
