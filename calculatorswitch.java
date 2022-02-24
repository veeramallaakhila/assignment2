package assignment;
import java.util.Scanner;
public class calculatorswitch {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter what operation u want ");
        System.out.println("1 = Add"+" 2 = Sub"+ " 3 = multi"+" 4 = division"+" 5 = Modulus"+" 6 = Trignometric Fuctions");
        int Function= sc.nextInt();

        //if condition
        if(Function<=5)
        {
            Scanner a =new Scanner(System.in);
            System.out.println("enter the value of first number here=");
            int aValue= a.nextInt();
            Scanner b=new Scanner(System.in);
            System.out.println("enter the value of second number here=");
            int bvalue = b.nextInt();

            switch (Function) {

                case 1:
                {
                    //Addition
                    int c;
                    c = aValue + bvalue;
                    System.out.println("the Addition of 2 numbers is =" + c);
                    break;
                }
                case 2:
                {
                    //subtraction
                    int c;
                    c = aValue - bvalue;
                    System.out.println("the subtraction of 2 numbers is " + c);
                    break;
                }
                case 3:
                {
                    //multiplication
                    int c;
                    c = aValue * bvalue;
                    System.out.println("the multiplication of 2 numbers is " + c);
                    break;
                }
                case 4:
                {
                    //division
                    double c;
                    c = aValue / bvalue;
                    System.out.println("the division of 2 numbers is " + c);
                    break;
                }
                case 5:
                {
                    //modules
                    int c;
                    c = aValue % bvalue;
                    System.out.println("the modulues of 2 numbers is " + c);
                    break;
                }
                default:
                    break;
            }
        }
        else if(Function==6) {
            Scanner sc1 = new Scanner(System.in);
            System.out.println("enter the Trignometric function here=");
            System.out.println(" 1 = sin" + "  2 = cos" + "  3 = tan" + " 4 = cot");

            int aa = sc1.nextInt();
            Scanner sc2 = new Scanner(System.in);
            System.out.println("enter the degrees");
            double n = sc1.nextDouble();


            switch (aa) {
                case 1:
                    Double vv = (Math.toRadians(Math.sin(n)));
                    System.out.println("the sin of " + n + " is " + vv);
                    break;
                case 2:
                    Double vvv = (Math.toRadians(Math.cos(n)));
                    System.out.println("the cos of " + n + " is " + vvv);
                    break;
                case 3:
                    Double xx = (Math.toRadians(Math.tan(n)));
                    System.out.println("the tan of " + n + " is " + xx);
                    break;
                case 4:
                    Double vvx = (Math.toRadians(Math.cos(n) / Math.sin(n)));
                    System.out.println("the cot of " + n + " is " + vvx);
                    break;
                default:
                    break;


            }
        }
        else{
            System.out.println("you have entered the wrong number");

        }
    }


}