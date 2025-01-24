public class Encapsulation {
    private String name;

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName; // `this` keyword is used to refer to the current object.
    }

    public static void main(String[] args) {
        Encapsulation myObj = new Encapsulation();
        myObj.setName("Howie");
        System.out.println(myObj.getName());
    }
}
