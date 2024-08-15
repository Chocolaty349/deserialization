public class MyClass {
    private String attb1;
    private String attb2;

    public MyClass(String attb1, String attb2) {
        this.attb1 = attb1;
        this.attb2 = attb2;
    }

    public MyClass(String attb1) {
        this(attb1, null);
    }

    public MyClass() {
        this(null, null);
    }

    public String getAttb1() {
        return attb1;
    }

    public String getAttb2() {
        return attb2;
    }

    public static void main(String[] args) {
        MyClass obj1 = new MyClass("value1");
        MyClass obj2 = new MyClass();
        obj2.attb2 = "value2";
        // Print the attributes and their values
        System.out.println(
                "obj1: attb1=" + obj1.getAttb1() + ", attb2=" + (obj1.getAttb2() != null ? obj1.getAttb2() : "N/A"));
        System.out.println(
                "obj2: attb1=" + (obj2.getAttb1() != null ? obj2.getAttb1() : "N/A") + ", attb2=" + obj2.getAttb2());
        
        // Check if they belong to the same class
        System.out.println("Two object is same class: ");
        System.out.println(obj1.getClass() == obj2.getClass()); // Output: true

    }
}
