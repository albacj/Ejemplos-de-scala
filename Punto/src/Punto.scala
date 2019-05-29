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

class Localizacion(override val xc: Int, override val yc: Int, val zc: Int) extends Punto(xc, yc){
    var z: Int = zc;
    
    def move(dx: Int, dy: Int, dz: Int){
      x = x + dx;
      y = y + dy;
      z = z + dz;
      
      println("Localizaci�n punto X: " + x);
      println("Localizaci�n punto Y: " + y);
      println("Localizaci�n punto Z: " + z);
    }
  
}

object Demo{
  
  def main(args: Array[String]){
    val pt = new Punto(10, 20);
    pt.move(10, 10); // Se mueve a la nueva localizaci�n.
    
    def printPunto{
      println("Localizaci�n punto X: " + pt.x);
      println("Localizaci�n punto Y: " + pt.y);
    }
    
//    val loc = new Localizacion(10, 20, 15);
//    loc.move(10, 10, 5);
  }
  
}