public class Item {
    public String name;
    public int price;
    public String category;
    public Item[] buildPath;
    public int counter;

    public Item(String name, int price, String category, Item[] buildPath){
        this.name = name;
        this.price = price;
        this.category = category;
        this.buildPath = buildPath;
        this.counter = 1;
    }

    public void changeBuildPath(Item[] newBuildPath){
        this.buildPath = newBuildPath;
    }

    public Item(){
        this.name = "";
        this.price = 0;
        this.category = "";
        this.buildPath = null;
        this.counter = 0;
    }
}
