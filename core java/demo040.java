import java.util.*;

class demo040{
    public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the character");
    char ch = sc.next().charAt(0);
        if(Character.isLowerCase(ch)){
            System.out.println("character is lower case");
        }
        else if(Character.isUpperCase(ch)){
            System.out.println("character is upper case");
        }
        else if(Character.isDigit(ch)){
            System.out.println("character is Digit");

        }
        else{
            System.out.println("character is Special character");
        }
}
}