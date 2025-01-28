import java.util.*;

class demo041{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character");
        char Character = sc.next().toLowerCase().charAt(0);
        if (Character == 'a' || Character == 'e' || Character == 'i' || Character == 'o' || Character == 'u')
        {
            System.out.println("Character is vowel");

        }
        else{
            System.out.println("Entered character is consonant");
        }
        sc.close();

    }
}