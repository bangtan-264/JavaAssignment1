import java.util.Scanner;
import java.lang.Math;
public class compoundInterest {
    public static void main(String[] args){
        float amount,rate,time,principal,cInterest;

        Scanner in=new Scanner(System.in);
        System.out.println("Enter principal amount,time and rate of interest(in percentage)");
        principal=in.nextFloat();
        time=in.nextFloat();
        rate=in.nextFloat();

        rate=rate/100;

        //Method I:
        amount=principal*(float)Math.pow((1+rate),time);

        //Method II:
//        amount=principal;
//        for(int i=0;i<time;i++){
//            amount*=(1+rate);
//        }

        cInterest=amount-principal;
        System.out.println("Compound Interest: "+cInterest);
    }
}
