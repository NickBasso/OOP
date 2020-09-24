package base;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Queue {
    private List<Box> boxes;
    private boolean isFixedSize;
    private int maxSize;
    private int curIndex;

    public Queue(){
        isFixedSize = false;
        boxes = new ArrayList<>();
        curIndex = -1;
    }

    public Queue(int maxSize){
        isFixedSize = true;
        maxSize = maxSize;
        boxes = Arrays.asList(new Box[maxSize]);
        curIndex = -1;
    }

    public int getSize(){
        return boxes.size();
    }

    public int getCurIndex(){
        return curIndex;
    }

    public Box getBoxOrNull(int index){
        if(index <= curIndex) {
            return boxes.get(index);
        }

        return null;
    }

    public void push(Box box){
        if(!isFull() && isFixedSize == true){
            curIndex++;
            boxes.set(curIndex, box);
            System.out.println("box added: " + box);
        } else if(!isFull() && isFixedSize == false){
            curIndex++;
            boxes.add(box);
            System.out.println("box added: " + box);
        }
        else {
            System.out.println("Element could not be added : queue is full!");
        }
    }

    public void pop(){
        if((isFixedSize == true && curIndex == -1) || (isFixedSize == false && boxes.size() == 0)){
            System.out.println("Element could not be removed : queue is already empty!");
        } else if(isFixedSize == true){
            System.out.println("box removed: " + boxes.get(curIndex));
            boxes.remove(curIndex);
            curIndex--;
        } else {
            System.out.println("box removed: " + boxes.get(curIndex));
            boxes.remove(boxes.size() - 1);
            curIndex--;
        }
    }

    public boolean isFull(){
        return (isFixedSize == false) ? false : (curIndex < getSize() - 1 ? false : true);
    }

    public boolean isEmpty(){
        return curIndex < 0 ? true : false;
    }

    @Override
    public String toString(){
        return super.toString() + " | maxsize: " + (isFixedSize ? maxSize : "unlimited") + " | current size: " + (curIndex + 1);
    }
}
