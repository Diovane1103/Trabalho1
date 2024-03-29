public class Node {
    private String data;
    private Node next;

    public Node() {}

    public Node(String data, Node next){
        this.data = data;
        this.next = next;
    }

    public String getData() {
        return next.toString();
    }

    public void setData(String data) {
        data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public String toString() {
        return data;
    }
}
