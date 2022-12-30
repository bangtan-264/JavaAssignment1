import java.util.Scanner;
public class Sum {
    public static void main(String[] args){
        float x,y,a,b;
        Scanner sc=new Scanner(System.in);

        System.out.println("1st complex number :");
        System.out.print("Enter real part ");
        x=sc.nextFloat();
        System.out.print("Enter imaginary part ");
        y=sc.nextFloat();
        System.out.println("2st complex number :");
        System.out.print("Enter real part ");
        a=sc.nextFloat();
        System.out.print("Enter imaginary part ");
        b=sc.nextFloat();

        System.out.println("Sum of two complex numbers : "+(x+a)+" + i"+(y+b));
    }
}
