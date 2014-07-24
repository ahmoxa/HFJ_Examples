package SortMountains;


public class Mountain {
    String name;
    Integer height;

    Mountain(String name, int height){
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString(){
        return name + " " + String.valueOf(height);
    }
}
