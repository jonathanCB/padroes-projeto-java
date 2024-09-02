package br.com.cod3r.builder.meal.after.builder;

public class JustFriesBuilder extends FastFoodMealBuilder {
	@Override
	public void buildSide() {
		meal.setSide("Large Fries");
	}
}
