import java.util.LinkedList;
import java.util.Queue;

public class QueueRealization {
    private Queue<Point> queue;

    public Queue<Point> getQueue() {
        return queue;
    }

    public Point getFrontIsNull() {
        return queue.peek();
    }

    QueueRealization() {
        queue = new LinkedList<>();
    }

    //     вставка элемента в очередь
    public void insert(int elem1, int elem2) {
        queue.add(new Point(elem1, elem2));

    }

    // удаление элемента
    public void remove() {
       queue.poll();
    }

    @Override
    public String toString() {
        return queue.toString();
    }


}

