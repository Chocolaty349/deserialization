class MyClass:
    def __init__(self, attb1=None, attb2=None):
        if attb1 is not None:
            self.attb1 = attb1
        if attb2 is not None:
            self.attb2 = attb2

# Create two instances with new attribute names and values
obj1 = MyClass(attb1="value1")
obj2 = MyClass(attb2="value2")

# Print the attributes and their values
print(f'obj1: attb1={obj1.attb1}, attb2={getattr(obj1, "attb2", "N/A")}')
print(f'obj2: attb1={getattr(obj2, "attb1", "N/A")}, attb2={obj2.attb2}')

# Check if they belong to the same class
print("obj1 is instance of MyClass: " + str(isinstance(obj1, MyClass)))  # Output: True
print("obj2 is instance of MyClass: " + str(isinstance(obj2, MyClass)))  # Output: True

