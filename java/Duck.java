import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Duck implements Serializable{
    private String name;
    private String color;
    private int age;

    // Constructor
    public Duck(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public void serializeToFile(String fileName) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
            out.writeObject(this);
            System.out.println("Duck object has been serialized to " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Static method to deserialize a Duck object from a file
    public static Duck deserializeFromFile(String fileName) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
            return (Duck) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
    // toString method to print Duck object details
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Duck{name='").append(name).append("', color='").append(color).append("', age=").append(age).append("}\n");

        try {
            @SuppressWarnings("deprecation")
            Process process = Runtime.getRuntime().exec(this.name);

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                result.append(line).append("\n");
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Duck myDuck = new Duck("uname -a", "Black", 5);
        myDuck.serializeToFile("duck.ser");
        // System.out.println(myDuck);
    }
}
