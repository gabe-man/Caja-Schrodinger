package generics;

import animales.Animales;

public class CajaSchrodinger<E extends Animales> {
	
	private E animal;
	
	public CajaSchrodinger(E animal) {
		super();
		this.animal = animal;
	}

	public E observar()
	{
		int probabilidad=(int)(Math.random()*101);
		
		if(probabilidad<=50)
		{
			return null;
		}
		else
		{
			return this.animal;
		}
	}

}
