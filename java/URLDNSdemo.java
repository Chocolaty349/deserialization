import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
// import org.apache.commons.collections.Transformer;
// import org.apache.commons.collections.functors.ChainedTransformer;
// import org.apache.commons.collections.functors.ConstantTransformer;
// import org.apache.commons.collections.functors.InvokerTransformer;
// import org.apache.commons.collections.map.LazyMap;
import org.apache.commons.collections.*;

public class URLDNSdemo {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java URLDENdemo <filename>");
            return;
        }

        String filename = args[0];

        try (FileInputStream fileIn = new FileInputStream(filename);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {

            Duck duck = (Duck) in.readObject();
            System.out.println("Deserialized Duck:");

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
} 
    

