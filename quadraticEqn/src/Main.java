import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args){
        int a,b,c;
        float d,D,root1,root2;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a,b,c for quadratic equation of the form ax^2+bx+c");
        a= in.nextInt();
        b= in.nextInt();
        c= in.nextInt();

        d=(float)Math.pow(b,2)-(4*a*c);
        D=(float)Math.sqrt(d);

        if(d>0){
            root1=(-b+D)/2*a;
            root2=(-b-D)/2*a;
            System.out.println("Roots are real and distinct: "+root1+" "+root2);
        }else if(d==0){
            root1=(-b)/(2*a);
            root2=root1;
            System.out.println("Root is real and u nique: "+root1);
        }else{
            System.out.println("Roots are imaginary");
        }
    }
}
