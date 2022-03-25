import java.util.LinkedList;

public class MyLinkList {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        LinkedList<Integer> list2 = new LinkedList<Integer>();
        list1.add(3);
        list1.add(7);
        list1.add(8);
        list1.add(10);

        list2.add(99);
        list2.add(1);
        list2.add(8);
        list2.add(10);

        if (list1.size() == list2.size()) {
            for (int l = 0; l < list1.size(); l++) {
                if (list1.get(l) == list2.get(l)) {
                    System.out.println("Intersecting Node:"+list1.get(l));
                    break;

                }
            }
        }
    }
}
