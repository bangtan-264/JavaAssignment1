import java.util.Scanner;
import java.lang.Math;
public class surfaceAreaOfSphere {
    public static void main(String[] args){
        final double pi=3.14;
        double r,area;
        Scanner sc=new Scanner(System.in);
        System.out.println("Input radius : ");
        r=sc.nextFloat();
        area=Math.pow(r,2)*4*pi;

        System.out.println("Surface area of Sphere: "+area);
    }
}
