<?php
class Person {
    public $name;
    protected $age;
    private $password;

    public function __construct($name, $age, $password) {
        $this->name = $name;
        $this->age = $age;
        $this->password = $password;
    }

    public function display() {
        echo "Name: {$this->name}, Age: {$this->age}";
    }
}

$person = new Person("John Doe", 30, "secret");

$serialied_person = serialize($person);
echo 'Serialized valuue: ' . $serialied_person;
?>
