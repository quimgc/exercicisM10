<?php

class Punt {

    private $x;
    private $y;

    function __construct($x, $y) {
        $this->x = $x;
        $this->y = $y;
    }

    function getX() {
        return $this->x;
    }

    function getY() {
        return $this->y;
    }

    public function distanciaPunt($p) {
        return sqrt(pow(($p->x - $this->x), 2) + pow(($p->y - $this->y), 2));
    }

    public function distanciaX($p) {
        return ($p->x - $this->x);
    }

    public function distanciaY($p) {
        return ($p->y - $this->y);
    }

    public static function demanarPunt() {
       $x = 0;
        $y = 0;
        fscanf(STDIN, "%d\n", $x);
        fscanf(STDIN, "%d\n", $y);

        return new Punt($x, $y);
    }

    public function toString() {
        return "(" . $this->x . ", " . $this->y . ")";
    }

}


Class Esfera{
    private $p;
    private $radi;
    
    
    function __construct($punt, $radi){
        $this->p = $punt;
        $this->radi = $radi;
        
    }
    function calcularCentre(){
        return $this->p;

    }
    
    function calcularSuperficie(){
        return 4*Math.pi()*Math.pow($this->radi, 2);
                
    }
    
    function calcularVolum(){
        return 4/3*Math.pi()*Math.pow($this->radi,3);
    }
    
}