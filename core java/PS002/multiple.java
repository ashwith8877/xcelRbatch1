import java.util.Scanner;

class multiple{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num: ");
        int num = sc.nextInt();

        if(num<=0){
            System.out.println(-1);
        }
        else{
            int nextmultiple = ((num/100)+1)*100;
            System.out.println("next multiple is:"+nextmultiple);
        }

    }
}