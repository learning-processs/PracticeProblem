package ds.arrayList;

import java.util.ArrayList;

public class ArrlListEx {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(22);
        list.add(24);
        list.add(26);
        list.add(27);
        System.out.println(list.contains(44));
        list.set(0, 33);
        list.remove(1);
        System.out.println(list);
    }
}
