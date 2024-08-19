<?php

class Person
{
    public $name;
    public $age;

    public function __construct($name, $age)
    {
        $this->name = $name;
        $this->age = $age;
    }

    public function __destruct()
    {
        echo "magic method __destruct() called: " . call_user_func($this->name, $this->age);
    }
}

if ($argc < 2) {
    die("Usage: php script.php '<serialized_data>'\n");
}

$serializedData = $argv[1];

try {
    $person = unserialize($serializedData);

    if ($person instanceof Person) {
        echo "Name: " . $person->name . "\n";
        echo "Age: " . $person->age . "\n";
    } else {
        echo "Error: Unserialized object is not a Person.\n";
    }
    if ($person->isAdmin){
        echo "You are admin\n";
    }
} catch (Exception $e) {
    echo "Error during unserialization: " . $e->getMessage() . "\n";
}
