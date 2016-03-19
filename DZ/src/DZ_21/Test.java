package DZ_21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            list.add(i);
        }
        System.out.println(list);

//        for (Integer elementForRemove : list){
//            list.remove(elementForRemove);
//        }

        Iterator<Integer> iterator = list.iterator(); // бегает с 0 и вперед
        while(iterator.hasNext()){
            System.out.println(iterator.next());
            iterator.remove();
        }
        ListIterator<Integer> integerListIterator = list.listIterator(list.size()); // бегает туда сюда по массиву
        while(integerListIterator.hasPrevious()){
            System.out.println(integerListIterator.previous() + " ");
        }
        LinkedList<Integer> linkedList = new LinkedList<>(); // вторая реализация листа
        for (int i = 0; i <10; i++){
            linkedList.add(i);
        }
        System.out.println("linkedList = " + linkedList);
        Iterator<Integer> integerIterator = linkedList.descendingIterator();
        while(integerIterator.hasNext()){
            System.out.println(integerIterator.next() + " --- ");

        }
        List ints = Arrays.asList(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0});
//        ints.remove(1);// удалить из листа при использовании asList нельзя
//        ints.remove(2);
        for (Object i : ints){
            System.out.println("i = " + i);
        }


    }
}
