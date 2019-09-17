import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NodeTest {
    private MyLinkedList list;
    private Node head;
    private Node tail;

    @Before
    public void setup() {
        head = new Node("first", null);
    }

    @Test
    public void testaGetNext() {
        Assert.assertEquals(null, head.getNext());
    }
}
