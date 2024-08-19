public class DuckDeserializer {
    public static void main(String[] args) {
        // Deserialize the Duck object from the file
        Duck deserializedDuck = Duck.deserializeFromFile("duck.ser");

        // Print the deserialized Duck object
        if (deserializedDuck != null) {
            System.out.println("Deserialized Duck object:");
            System.out.println(deserializedDuck); //toString() called
        } else {
            System.out.println("Failed to deserialize Duck object.");
        }
    }
}
