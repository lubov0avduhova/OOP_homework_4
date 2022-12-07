import java.util.LinkedList;
import java.util.Queue;

public class QueueRealization {
    private Queue<Gamer> queue;


    public Gamer getFrontIsNull() {
        return queue.peek();
    }

    QueueRealization() {
        this.queue = new LinkedList<>();
    }

    //     вставка элемента в очередь
    public Queue<Gamer> insert(int elem1, int elem2) {

        queue.add(new Gamer(elem1, elem2));
        return queue;
    }

    // удаление элемента
    public Gamer remove() {
        return queue.poll();
    }


}

