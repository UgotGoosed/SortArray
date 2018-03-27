/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortarray;

/**
 *
 * @author gansc
 */
import java.util.ArrayList;
public class SortArray {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);
        SortArray.shuffle(list);
        System.out.println(list);
        sort(list);
        System.out.println(list);

    }

    public static <E extends Comparable<E>> void sort(ArrayList<E> list) {


        for (int i = 0; i < list.size() - 1; i++) {
            E currentMin = list.get(i);
            int min = i;
            for (int j = i + 1; j < list.size(); j++) {

                if (list.get(j).compareTo(currentMin) < 0) {
                    currentMin = list.get(j);
                    min = j;
                }
            }

            if (min != i) {
                list.set(min, list.get(i));
                list.set(i, currentMin);
            }
        }
    }
    
    public static <E> void shuffle(ArrayList<E> list) {

        for (int i = 0; i < list.size(); i++) {
            int random = (int) (Math.random() * list.size());
            E tmp = list.get(random);
            list.set(random, list.get(i));
            list.set(i, tmp);
        }
    }
    
}
