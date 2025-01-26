import java.util.*;

class demo049{
public static void main(String []args){

Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");
int num = sc.nextInt();

int reversed_num = 0;

while(num>0){

int last_digit = num%10;

reversed_num = reversed_num * 10 +  last_digit ;

num /=10;

}
if(num<0){

reversed_num = -reversed_num;

}

System.out.println("reversed_num: "+reversed_num);

}
}