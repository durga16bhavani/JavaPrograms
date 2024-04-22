package Day6assignments;

import java.util.ArrayList;
import java.util.List;

public class RemoveEverySecondElement {

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(6);
        myList.add(7);
        myList.add(8);

        System.out.println("Original List: " + myList);
        removeEverySecondElement(myList);
        System.out.println("List after removing every second element: " + myList);
    }

    public static void removeEverySecondElement(List<?> list) {
        for (int i = 1; i < list.size(); i++) {
            list.remove(i);
        }
    }
}

