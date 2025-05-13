import java.util.*;

public class InsertionSort{
    public InsertionSort(){}

    public static ArrayList<Integer> insertionSort(ArrayList<Integer> list){
        ArrayList<Integer> clist = new ArrayList<Integer>(list);
        int i, key;

        for(int j=1; j < clist.size(); j++){
            key = clist.get(j);
            i = j-1;
            while(i>=0 && (int)clist.get(i)>key){
                clist.set(i+1,clist.get(i));
                i--;
            }
            clist.set(i+1, (Integer)key);
        }

        return  clist;
    }


    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(1);
        list.add(3);

        System.out.println("Before sorting: " + list);
        ArrayList<Integer> sortedList = insertionSort(list);
        System.out.println("After sorting: " + sortedList);
    }
}