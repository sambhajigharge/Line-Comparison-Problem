package LineComparison;

import java.util.Scanner;

public class LineComparisonComputation {
    public static void main(String[] args) {
        System.out.println("Menu card");
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Calculate Length\n2.Check Equality\n3.Compare Lines\n4.Exit");
        System.out.println("Enter the choice =");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("To calculate the length");
                UC1 obj1 = new UC1();
                obj1.Lengths();
                break;
            case 2:
                System.out.println("To check the equality of two line");
                UC2 obj2 = new UC2();
                obj2.Equal();
                break;
            case 3:
                System.out.println("To compare two lines");
                UC3 obj3 = new UC3();
                obj3.CompareTo();
                break;
            default:
                System.out.println("Enter the correct choice");
                break;
        }
    }
}

class UC1 {
    public void Lengths() {
        System.out.println("Calculate Length Between Two Point");
        int x1, x2, y1, y2;
        double Length;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter x1=");
        x1 = sc.nextInt();
        System.out.println("enter x2=");
        x2 = sc.nextInt();
        System.out.println("enter y1=");
        y1 = sc.nextInt();
        System.out.println("enter y2=");
        y2 = sc.nextInt();
        Length = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("Length Between" + "(" + x1 + "," + y1 + ")," + "(" + x2 + "," + y2 + ")=" + Length);
    }
}

class UC2 {
    public void Equal() {
        System.out.println("Calculate Length Between Two Point");
        int x1, x2, y1, y2;
        double Length1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter x1=");
        x1 = sc.nextInt();
        System.out.println("enter x2=");
        x2 = sc.nextInt();
        System.out.println("enter y1=");
        y1 = sc.nextInt();
        System.out.println("enter y2=");
        y2 = sc.nextInt();
        Length1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("Length Between" + "(" + x1 + "," + y1 + ")," + "(" + x2 + "," + y2 + ")=" + Length1);
        int p1, p2, q1, q2;
        double Length2;
        System.out.println("enter p1 =");
        p1 = sc.nextInt();
        System.out.println("enter p2 =");
        p2 = sc.nextInt();
        System.out.println("enter q1 =");
        q1 = sc.nextInt();
        System.out.println("enter q2 =");
        q2 = sc.nextInt();
        Length2 = Math.sqrt((p2 - p1) * (p2 - p1) + (q2 - q1) * (q2 - q1));
        System.out.println("Length between" + "(" + p1 + "," + q1 + ")," + "(" + p2 + "," + q2 + ")=" + Length2);
        Double obj1 = Length1;
        Double obj2 = Length2;
        if (obj1.equals(obj2)) {
            System.out.println("Both lines are equal");
        } else {
            System.out.println("Both lines are not equal");
        }
    }
}

class UC3 {
    public void CompareTo() {
        System.out.println("Calculate Length Between Two Point");
        int x1, x2, y1, y2;
        double Length1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter x1=");
        x1 = sc.nextInt();
        System.out.println("enter x2=");
        x2 = sc.nextInt();
        System.out.println("enter y1=");
        y1 = sc.nextInt();
        System.out.println("enter y2=");
        y2 = sc.nextInt();
        Length1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("Length Between" + "(" + x1 + "," + y1 + ")," + "(" + x2 + "," + y2 + ")=" + Length1);
        int p1, p2, q1, q2;
        double Length2;
        System.out.println("enter p1 =");
        p1 = sc.nextInt();
        System.out.println("enter p2 =");
        p2 = sc.nextInt();
        System.out.println("enter q1 =");
        q1 = sc.nextInt();
        System.out.println("enter q2 =");
        q2 = sc.nextInt();
        Length2 = Math.sqrt((p2 - p1) * (p2 - p1) + (q2 - q1) * (q2 - q1));
        System.out.println("Length between" + "(" + p1 + "," + q1 + ")," + "(" + p2 + "," + q2 + ")=" + Length2);
        Double obj1 = Length1;
        Double obj2 = Length2;
        int compareValue = obj1.compareTo(obj2);
        if (compareValue == 0) {
            System.out.println("Both lines are same");
        } else if (compareValue > 0) {
            System.out.println("Length1 is greater than Length2");
        } else {
            System.out.println("Length1 is less than Length2");
        }
    }
}
