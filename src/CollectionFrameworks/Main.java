package CollectionFrameworks;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList <Integer> arrayList = new ArrayList();
        arrayList.add(1); //0
        arrayList.add(8); //1
        arrayList.add(15); //2
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.size()); //total elements

       List <Integer> list =List.of(1,2,3,4); // IT IS IMMUTABLE


        //printing all elements
        for (int i: arrayList){
            System.out.println(i);
        }
    }
}
