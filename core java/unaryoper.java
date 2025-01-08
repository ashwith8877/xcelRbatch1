import java.util.Scanner;

class unary{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter a value: "+a);
        System.out.println("pre increment: "+(++a));
        System.out.println("pre decrement: "+(--a));
        System.out.println("post increment"+(a++));
        System.out.println("post increment"+(a--));
    }
}