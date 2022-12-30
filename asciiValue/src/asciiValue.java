import java.util.Scanner;
public class asciiValue {
    public static void main(String[] args){
        char ch;
        Scanner sc=new Scanner(System.in);
//        sc.useDelimiter(" ");
        System.out.println("Enter a character");
        ch=sc.next().charAt(0);

        System.out.println("The ASCII value of "+ch+" is :"+(int)ch);
    }

}
