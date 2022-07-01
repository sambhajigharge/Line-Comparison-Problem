package LineComparison;
import java.util.Scanner;

public class LineComparisonComputation {
    public static void main(String[] args) {
        System.out.println("Welcome to the Line Comparison Computation Program");

        System.out.println("Calculate Length Between Two Point");
        int x1,x2,y1,y2;
        double Length;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter x1=");
        x1=sc.nextInt();
        System.out.println("enter y1=");
        y1=sc.nextInt();
        System.out.println("enter x2=");
        x2=sc.nextInt();
        System.out.println("enter y2=");
        y2=sc.nextInt();
        Length=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println("Length Between"+"("+x1+","+y1+"),"+"("+x2+","+y2+")="+Length);
    }
}


