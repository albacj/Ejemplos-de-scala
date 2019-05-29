import java.io._

class Punto(val xc: Int, val yc: Int) {
  var x: Int = xc;
  var y: Int = yc;
  
  def move(dx: Int, dy: Int){
    x = x + dx;
    y = y + dy;
    
    println("Localizaci�n punto X: " + x);
    println("Localizaci�n punto Y: " + y);
  }
  
}

object Demo{
  
  def main(args: Array[String]){
    val pt = new Punto(10, 20);
    
    pt.move(10, 10);
  }
  
}