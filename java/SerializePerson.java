import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.util.Base64;

public class SerializePerson {
    public static void main(String[] args) {
        try {
            Person person = new Person("John Doe", 30, true);

            // Serialize to a byte array
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(person);
            oos.close();

            // Convert byte array to base64 string for use in a query string
            String serializedPerson = Base64.getEncoder().encodeToString(baos.toByteArray());
            System.out.println("Serialized Person: " + serializedPerson);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}