import pickle

class Person:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def __str__(self):
        return f"Person(name={self.name}, age={self.age})"

# Create an instance of the Person class
person = Person("John Doe", 30)
serialized_person = pickle.dumps(person)
print(serialized_person)