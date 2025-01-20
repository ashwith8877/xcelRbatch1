import java.util.*;

class Arraylist1{

    void arraylistmethod(){
        Arraylist<String> arraylist = new Arraylist<>();

        arraylist.add("ashwith");
        arraylist.add("sandy");
        arraylist.add("karthik");

        System.out.println("Friends names");

        Iterator<String> iterate = arraylist.iterator();

        while(iterate.hasNext()){
            System.out.println(iterate.next);
        }
    }
    public class demo030{
        public static void main (String []args){
            Arraylist1 obj = new Arraylist1();
            obj.arraylistmethod();
        }
    }
}