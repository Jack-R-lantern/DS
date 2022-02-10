import ds.linear.list.SinglyLinkedList;

public class Main {
    public static void main(String[] args){
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.addFirst(1);
        list.addFirst(0);
        list.add(7);
        list.add(8);
        list.add(0, -1);
        list.add(0, -2);
        list.add(7, 6);
        list.add(7, 5);

        // Standard output result: -2 -1 0 1 2 3 4 5 6 7 8
        while (list.size() != 0)
            System.out.print(list.removeFirst() + " ");
    }
}
