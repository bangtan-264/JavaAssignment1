import java.util.Scanner;
public class perimeter {
    public static void main(String[] args){
        float length,breadth,per;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter length & breadth of the rectangle");
        length=sc.nextFloat();
        breadth=sc.nextFloat();
        per=2*(length+breadth);

        System.out.println("The perimeter of rectangle is : "+per);
    }
}
