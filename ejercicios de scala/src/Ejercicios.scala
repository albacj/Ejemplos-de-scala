import scala.collection.mutable.ListBuffer

class Ejercicios {
  object Ejercicios{
    
    /* Elimina los elementos duplicados de una lista de cadenas. */
    def quitaDuplicados(list: List[String]){
      val listaEntrada = ListBuffer(list)
      var copia : List[String] = List()
      
      for(element <- listaEntrada){
        if(copia.contains(element)){
          listaEntrada.updated(listaEntrada.indexOf(element), Nil)
        }else{
          copia ::: List(element)
        }
      }
      
    }
  }
}