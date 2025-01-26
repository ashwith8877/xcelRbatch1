import java.util.*;

class demo044{
public static void main(String []args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter a value :");
int a = sc.nextInt();

System.out.println("Enter b value :");
int b = sc.nextInt();

System.out.println("before swapping");

a = a+b;//30
b = a-b;//10
a = a-b;//20

System.out.println("After swapping");

System.out.println("a:"+a);
System.out.println("b"+b);
}
}