import java.util.ArrayList;

public class ToBeDeleted {
    public ArrayList<Integer> slots;
    public int reducedPrice;

    public ToBeDeleted(){
        this.slots = new ArrayList<Integer>();
        this.reducedPrice = 0;
    }

    public void addSlot(int slot){
        this.slots.add(slot);
    }

    public void increasePrice(int sum){
        this.reducedPrice += sum;
    }
}
