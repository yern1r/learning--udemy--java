package OOP_tasks.Box;

public class Box {
    private int length;
    private int width;
    private int height;

    public Box() {
        this.height = 0;
        this.width = 0;
        this.length = 0;
    }

    public Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Box(int size){
        width = size;
        length = size;
        height = size;
    }
    public void showInfo(){
        System.out.println("Length: " + length + " Width: "+ width + " Height: " + height);
    }

}
