import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.util.Base64;

import java.io.Serializable;

 class AccessTokenUser implements Serializable {
    private final String username;
    private final String accessToken;

    public AccessTokenUser(String username, String accessToken) {
        this.username = username;
        this.accessToken = accessToken;
    }

    public String getUsername() {
        return username;
    }

    public String getAccessToken() {
        return accessToken;
    }
}
public class DeserializeObjectFromString {
    public static void main(String[] args) throws Exception {
        // This is the Base64 encoded string from the previous step
        String serializedObject = "rO0ABXNyAC9sYWIuYWN0aW9ucy5jb21tb24uc2VyaWFsaXphYmxlLkFjY2Vzc1Rva2VuVXNlchlR/OUSJ6mBAgACTAALYWNjZXNzVG9rZW50ABJMamF2YS9sYW5nL1N0cmluZztMAAh1c2VybmFtZXEAfgABeHB0ACBpeTYwNGdxem1zMmJ6czg1djhjdnV2Nmhhaml5dzNhOXQABndpZW5lcg==";

        // Decode the Base64 string to a byte array
        byte[] data = Base64.getDecoder().decode(serializedObject);

        // Deserialize the byte array to an object
        ByteArrayInputStream byteIn = new ByteArrayInputStream(data);
        ObjectInputStream in = new ObjectInputStream(byteIn);
        Object deserializedPerson = in.readObject();
        if (deserializedPerson instanceof AccessTokenUser){
            deserializedPerson = (AccessTokenUser) deserializedPerson;
            System.out.println("true");
        }
        in.close();

        // Print the deserialized object
        System.out.println("Deserialized Object: " + deserializedPerson); 
    }
}
