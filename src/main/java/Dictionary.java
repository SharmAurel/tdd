public class Dictionary {
    private String name;
    public Dictionary(String name) {
        this.name=name;

    }

    String getName(){
        return this.name;
    }

    public boolean isEmpty() {
        return name.isEmpty();
    }
}
