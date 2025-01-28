import java.util.*;

class demo044{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value");
        int a = sc.nextInt();
        System.out.println("Enter a value");
        int b = sc.nextInt();
        // swapping method
        int temp = a;
        a = b;
        b = temp;
        System.out.println("temp value: "+temp);

    }
}