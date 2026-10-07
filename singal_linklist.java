import java.util.ArrayList;
import java.util.*;

class demo {
    public int data;
    public demo next;

    public demo(int data,demo next){
        this.data=data;
        this.next=next;

     }
    
}
public class singal_linklist{
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(10);
         list.add(7);
         list.add(3);
        list.add(9);

        //assinging values to the nodes
        demo x1=new demo(list.get(0),null);
        demo x2=new demo(list.get(1),null);
        demo x3=new demo(list.get(2),null);
        demo x4=new demo(list.get(3),null);
        demo x5=new demo(list.get(4),null);


        x1.next=x2;
        x2.next=x3;
        x3.next=x4;
        x4.next=x5;

        System.out.println(x1.data + " " + x1.next);
        System.out.println(x2.data + " " + x2.next);
        System.out.println(x3.data + " " + x3.next);
        System.out.println(x4.data + " " + x4.next);
        System.out.println(x5.data + " " + x5.next);





    }
}
