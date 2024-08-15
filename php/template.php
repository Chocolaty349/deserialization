<?php


class CustomTemplate {
    public $lock_file_path;
    //private $lock_file_path;

    public function __construct($template_file_path) {
        $this->lock_file_path = $template_file_path;
        //$this->lock_file_path = $template_file_path . ".lock";
    }

    // private function isTemplateLocked() {
    //     return file_exists($this->lock_file_path);
    // }

    // public function getTemplate() {
    //     return file_get_contents($this->template_file_path);
    // }

    // public function saveTemplate($template) {
    //     if (!isTemplateLocked()) {
    //         if (file_put_contents($this->lock_file_path, "") === false) {
    //             throw new Exception("Could not write to " . $this->lock_file_path);
    //         }
    //         if (file_put_contents($this->template_file_path, $template) === false) {
    //             throw new Exception("Could not write to " . $this->template_file_path);
    //         }
    //     }
    // }

    // function __destruct() {
    //     // Carlos thought this would be a good idea
    //     if (file_exists($this->lock_file_path)) {
    //         unlink($this->lock_file_path);
    //     }
    // }
}

// Create a new instance of the CustomTemplate class
$template = new CustomTemplate('/home/carlos/morale.txt');

// Serialize the instance
$serializedTemplate = serialize($template);

// Print the serialized instance
echo $serializedTemplate;

?>
