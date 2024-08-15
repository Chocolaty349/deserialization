<?php

class myobj{
    public $attb1;

    public function __wakeup()
    {
        $this.$attb1 = new Description();
    }
}

class Description
{
    public $HTML_DESC;
    public $TEXT_DESC;

    public function __construct()
    {
        // @Carlos, what were you thinking with these descriptions? Please refactor!
        $this->HTML_DESC = '<p>This product is <blink>SUPER</blink> cool in html</p>';
        $this->TEXT_DESC = 'This product is cool in text';
    }
}
?>