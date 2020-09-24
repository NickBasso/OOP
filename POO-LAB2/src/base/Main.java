package base;

public class Main {

    public static void main(String[] args) {
        Box box = new Box(2, 3, 5);
        Box box1 = new Box(3, 2, 8);

        box.printSurface();
        box.printVolume();

        Queue queue = new Queue(2);
        Queue limitlessQueue = new Queue();

        System.out.println(queue.getSize());
        System.out.println(queue.isFull());
        queue.push(box);
        queue.push(box);
        System.out.println(queue.isFull());
        queue.push(box);
        queue.push(box);
        limitlessQueue.pop();
        limitlessQueue.push(box);
        limitlessQueue.push(box);
        limitlessQueue.pop();
        limitlessQueue.pop();
        limitlessQueue.pop();
        limitlessQueue.push(box1);

        System.out.println("\n\n");

        System.out.println(queue);
        System.out.println("\tlast element: " + queue.getBoxOrNull(queue.getCurIndex()));

        System.out.println(limitlessQueue);
        System.out.println("\tlast element: " + limitlessQueue.getBoxOrNull(limitlessQueue.getCurIndex()));
    }
}

