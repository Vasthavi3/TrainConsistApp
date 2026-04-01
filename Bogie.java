public class Bogie {

    String name;
    int capacity;
    String type;

    public Bogie(String name, int capacity, String type) {
        this.name = name;
        this.capacity = capacity;
        this.type = type;
    }

    @Override
    public String toString() {
        return name + " (" + type + ") -> Capacity: " + capacity;
    }
}