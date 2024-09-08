package lvl14.newlinkedlist;

public class StringLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement != null) && (currentElement != last)) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

    public void add(String value) {
        //напишите тут ваш код

        Node sred = new Node();
        sred.value = value;
        if(last.prev==null){
            sred.next = last;
            first.next = sred;
            sred.prev = first;
            last.prev = sred;
        }else {

            last.prev.next = sred;
            sred.prev = last.prev;
            sred.next = last;
            last.prev = sred;


        }
    }
    public String get(int index) {
        Node temp = first.next;
        if (index < 0 || first.next == null){ return null;}

        for (int i = 0; i < index; i++) {
            if (temp.next == null) {return null;}
                temp = temp.next;
        }
        return temp.value;


    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}
