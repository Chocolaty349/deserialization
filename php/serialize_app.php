<?php
class Person {
    public $name;
    public $age;
    public $isAdmin = true;

    public function __construct($name, $age) {
        $this->name = $name;
        $this->age = $age;
    }
}

$person = new Person("exec", "whoami");

$serialied_person = serialize($person);
echo 'Serialized valuue: ' . $serialied_person;
