package com.pokemon.playapp;

import java.util.Random;

public class PokeBall {
	Pokemon givePokemon() {
		Random r = new Random();
		int n = r.nextInt(5) + 1;

		if (n == 1)
			return new Pichachu("white", 3.5);

		else if (n == 2)
			return new Charmander("black", 4.2);

		else if (n == 3)
			return new Bulbazar("yellow");

		else
			return null;

	}

}
