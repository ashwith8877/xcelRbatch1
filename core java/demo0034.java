import java.util.*;

class demo0034{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int a = sc.nextInt();
        if(a%2==0){
            System.out.println(+a+" is even");
        }
        else{
            System.out.println(+a+" is odd");
        }
    }
}