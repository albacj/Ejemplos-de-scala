

class Fuera {
  class Dentro{
    private def f(){
      println("f")
    }
    
    class MasProfundo{
      f() // Ok
    }
  }
  
  //(new Dentro).f() // Error: f no es accesible. De hecho marca error si se descomenta.
}

package p{
  
  class Super{
    protected def f(){
      println("f")
    }
  }
  
  class Sub extends Super{
    f()
  }
  
  class Otro{
   // (new Super).f() // Error: f no es accesible.
  }
  
}

package society{
  package professional{
    class Executive{
      private[professional] var detallesTrabajo = null
      private[society] var amigos = null
      private[this] var secretos = null
      
      def ayuda(another: Executive){
        println(another.detallesTrabajo)
        //println(another.secretos) // Error: secretos no es miembro de society.professional.Executive
      }
    }
  }
}