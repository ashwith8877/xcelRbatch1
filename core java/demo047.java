import java.util.*;

class demo047{
public static void main(String []args){

Scanner sc = new Scanner(System.in);
System.out.println("Enter num: ");
int num = sc.nextInt();

int count=0;

if(num<0){

System.out.println(num=-num);
}
else if(num==0){
System.out.println(num=1);
}
else{
while(num>0){
num/=10;
System.out.println("the no of digits in num are: "+count++);
}

}
}
}