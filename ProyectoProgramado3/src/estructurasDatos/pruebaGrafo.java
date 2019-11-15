package estructurasDatos;
public class pruebaGrafo{



	public static void main(String args[]){
		Grafo g = new Grafo();


		//Prueba en grafo conexo
		g.agregarVertice(1);
		g.agregarVertice(2);
		g.agregarVertice(3);
		g.agregarVertice(4);
		g.agregarVertice(5);

		g.agregarArista(1,1,0);
		g.agregarArista(1,2,0);
		g.agregarArista(1,4,0);
		g.agregarArista(2,1,0);
		g.agregarArista(2,2,0);
		g.agregarArista(2,3,0);
		g.agregarArista(2,5,0);
		g.agregarArista(3,2,0);
		g.agregarArista(3,4,0);
		g.agregarArista(4,1,0);
		g.agregarArista(4,3,0);
		g.agregarArista(4,5,0);
		g.agregarArista(5,2,0);
		g.agregarArista(5,4,0);

		//g.eliminarVertice(2);
		//g.eliminarArista(4,5);


/*
		//Prueba en grafo NO conexo
		g.agregarVertice(1);
		g.agregarVertice(2);
		g.agregarVertice(3);
		g.agregarVertice(4);
		g.agregarVertice(5);
		g.agregarVertice(6);

		g.agregarArista(1,2,0);
		g.agregarArista(1,3,0);
		g.agregarArista(2,1,0);
		g.agregarArista(2,4,0);
		g.agregarArista(3,1,0);
		g.agregarArista(3,4,0);
		g.agregarArista(4,2,0);
		g.agregarArista(4,3,0);
		g.agregarArista(5,6,0);
		g.agregarArista(6,5,0);
*/

		g.imprimeGrafo();
		g.recorridoProfundidad(1);
		g.recorridoAnchura(1);

	}


}