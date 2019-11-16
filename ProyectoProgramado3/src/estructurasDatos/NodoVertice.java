package estructurasDatos;
import java.util.*;


public class NodoVertice{
 	public int vertice;					//Almacena el dato del v�rtice
 	public boolean visitado;			//Indica si el v�rtice ha sido visitado o no
 	public LinkedList <Nodo> aristas;	//Almacena la lista de aristas del v�rtice

 	public NodoVertice(){
		this.vertice = 0;
		this.visitado = false;
		this.aristas  = new LinkedList<Nodo>();
	}//fin del constructor

	public NodoVertice(int v){
			this.vertice = v;
			this.visitado = false;
			this.aristas  = new LinkedList<Nodo>();
	}//fin del constructor Nodo

	public String aCadena(){
		return "|" + this.vertice + "|" + "|->";
	}//fin m�todo aCadena

}//fin class NodoVertice
