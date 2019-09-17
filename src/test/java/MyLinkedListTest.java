import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyLinkedListTest {

    private MyLinkedList list;
    private Node head = new Node();

    @Before
    public void setup(){
       list = new MyLinkedList();
    }

    @Test
    public void testaAddNoteInLast() {
        // Da null pointer direto quando é passado head
        Node node = new Node();
        node.setData("tail");
        node.setNext(null);
        head.setData("head");
        head.setNext(node);

        list.addNoteInLast(head);
        list.addNoteInLast(node);

        Assert.assertEquals(2, list.getSize());
    }
}
