import ds.linear.list.SinglyLinkedList;

public class Main {
    public static void main(String[] args){
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.addFirst(1);
        list.addFirst(2);
        list.add(1, 3);

        System.out.println(list.remove(0));
        System.out.println(list.remove(0));
        System.out.println(list.remove(0));
    }
}
