<?php
class Person {
    public $name;
    public $age;
    public $isAdmin = true;

    public function __construct($name, $age) {
        $this->name = $name;
        $this->age = $age;
    }

    public function display() {
        echo "Name: {$this->name}, Age: {$this->age}";
    }
}

$person = new Person("John Doe", 30);

$serialied_person = serialize($person);
echo 'Serialized valuue: ' . $serialied_person;
