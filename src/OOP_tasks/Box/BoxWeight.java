package OOP_tasks.Box;

public class BoxWeight extends Box{
    private int weight;

    public BoxWeight() {
        super();
        this.weight = 0;
    }

    public BoxWeight(int length, int width, int height, int weight) {
        super(length, width, height);
        this.weight = weight;
    }

    public BoxWeight(int size, int weight) {
        super(size);
        this.weight = weight;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Also weight: " + weight);
    }
}
