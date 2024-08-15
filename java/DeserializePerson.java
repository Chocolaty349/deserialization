import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.util.Base64;

public class DeserializePerson {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java DeserializePerson <base64_serialized_person>");
            return;
        }

        try {
            // Decode the base64 string to byte array
            byte[] data = Base64.getDecoder().decode(args[0]);
            ByteArrayInputStream bais = new ByteArrayInputStream(data);
            ObjectInputStream ois = new ObjectInputStream(bais);

            // Deserialize the person object
            Person person = (Person) ois.readObject();
            ois.close();

            // Print the person information
            System.out.println("Deserialized Person: " + person);

            if (person.isAdmin()) {
                System.out.println("You are admin");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
} 
