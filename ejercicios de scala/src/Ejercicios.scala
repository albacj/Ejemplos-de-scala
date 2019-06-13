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
    
    /* Junta dos listas intercalando los elementos sin repetir */
    
    def merge(lista1: List[Integer], lista2: List[Integer]): List[(Integer, Integer)] = {
      
      val listaRes = lista1 zip lista2
      val copia : List[Integer] = List()
      
      for(x <- listaRes){
        if(copia.contains(x)){
          listaRes.updated(listaRes.indexOf(x), Nil)
        }else{
          copia ::: List(x)
        }
      }
      
      return listaRes
    }
    
  }
}