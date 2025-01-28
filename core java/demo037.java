import java.util.*;

class demo037{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int a = sc.nextInt();
        System.out.println("Enter b value: ");
        int b = sc.nextInt();
        System.out.println("Enter c value: ");
        int c = sc.nextInt();
        System.out.println("Enter d value: ");
        int d = sc.nextInt();
        if(a>b && a>c && a>d){
            System.out.println( "a is greater than b & c");
        }
        else if(b>a && b>c && b>d){
            System.out.println( "b is greater than c & a");
        }
        else if(c>a && c>b && c>d){
            System.out.println( "b is greater than c & a");
        }
        else{
            System.out.println("d is greater than a & b & c");
        }
        
    }
}