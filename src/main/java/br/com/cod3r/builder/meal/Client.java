package br.com.cod3r.builder.meal;

import br.com.cod3r.builder.meal.builder.FatMealBuilder;
import br.com.cod3r.builder.meal.builder.Menu1Builder;
import br.com.cod3r.builder.meal.director.MealDirector;

public class Client {
	
	public static void main(String[] args) {
		//Temos que passar um builder para o MealDirector poder construir o combo desejado:
		// MealDirector director = new MealDirector(new FatMealBuilder());
		MealDirector director = new MealDirector(new Menu1Builder());
		director.constructCombo();
		System.out.println(director.getCombo());
	}
}