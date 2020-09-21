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
        this.isFixedSize = false;
        this.boxes = new ArrayList<>();
    }

    public Queue(int maxSize){
        this.isFixedSize = true;
        this.maxSize = maxSize;
        this.boxes = Arrays.asList(new Box[maxSize]);
        this.curIndex = 0;
    }

    public int getSize(){
        return this.boxes.size();
    }

    public void addElement(Box box){
        if(!this.isFull()){
            boxes.set(curIndex, box);
            curIndex++;
        } else {
            System.out.println("Element could be added : array is full!");
        }
    }

    public boolean isFull(){
        return (isFixedSize == false) ? false : (curIndex < this.getSize() - 1 ? false : true);
    }

    public String toString(){
        return super.toString() + " | maxsize: " + this.maxSize + " | current size: " + (this.curIndex + 1);
    }
}
