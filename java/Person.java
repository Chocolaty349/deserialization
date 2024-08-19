import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;
    // private boolean isAdmin;

    public Person(String name, int age, boolean isAdmin) {
        this.name = name;
        this.age = age;
        // this.isAdmin = isAdmin;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // public boolean isAdmin() {
    //     return isAdmin;
    // }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
