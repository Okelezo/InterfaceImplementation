import java.util.ArrayDeque;
import java.util.Deque;

public abstract class DequeueInterfaceImpl implements DequeueInterface {
    private Deque<Object> dandy;


    public DequeueInterfaceImpl() {
        dandy = new ArrayDeque<>();
    }

    @Override
    public void addFront(Object o) {
    dandy.addFirst(o);
    }

    @Override
    public void addRear(Object o) {
    dandy.addLast(o);
    }

    @Override
    public Object removeFront() {
        return dandy.removeFirst();
    }

    @Override
    public Object removeRear() {
        return dandy.removeLast();

    }

    @Override
    public void show() {

    }
}
