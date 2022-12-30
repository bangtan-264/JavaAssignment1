import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            float a,b,product;
            Scanner in=new Scanner(System.in);

            System.out.println("Enter two floating point numbers");
            a=in.nextFloat();
            b=in.nextFloat();

            product=a*b;

            System.out.println("Product of a and b is: "+product);

    }
}