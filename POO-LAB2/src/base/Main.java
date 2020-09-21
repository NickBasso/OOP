package base;

public class Main {

    public static void main(String[] args) {
        Box box = new Box(2, 3, 5);

        box.printSurface();
        box.printVolume();

        Queue queue = new Queue(2);
        System.out.println(queue.getSize());
        System.out.println(queue.isFull());
        queue.addElement(box);
        queue.addElement(box);
        System.out.println(queue.isFull());
        queue.addElement(box);
        queue.addElement(box);

        System.out.println(box);
        System.out.println(queue);
    }
}

