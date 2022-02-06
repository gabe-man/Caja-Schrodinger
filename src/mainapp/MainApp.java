package mainapp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import generics.*;

import animales.*;

public class MainApp {

	public static void main(String[] args) {
		ArrayList<Animales> listaAnimales = new ArrayList<Animales>();
		Gato gato1 = new Gato("Tiger", "A111");
		Perro perro1 = new Perro("Dido", "B222");
		Pajaro pajaro1 = new Pajaro("Perico", "C333");
		Gato gato2 = new Gato("Duque", "D444");
		Perro perro2 = new Perro("Toby", "E555");
		
		listaAnimales.add(gato1);
		listaAnimales.add(perro1);
		listaAnimales.add(pajaro1);
		listaAnimales.add(gato2);
		listaAnimales.add(perro2);
		
		ListIterator<Animales> iterador = listaAnimales.listIterator();
		
		System.out.println("Lista Original");
		
		System.out.println("");
		
		for (int i = 0; i < listaAnimales.size(); i++) {
			System.out.println(listaAnimales.get(i));
		}
		
		while(iterador.hasNext())
		{
			CajaSchrodinger<Animales> caja = new CajaSchrodinger<Animales>(iterador.next());
			iterador.set(caja.observar());
		}
		
		System.out.println("Lista Final");
		
		System.out.println("");
		
		for (int i = 0; i < listaAnimales.size(); i++) {
			System.out.println(listaAnimales.get(i));
		}

	}

}
