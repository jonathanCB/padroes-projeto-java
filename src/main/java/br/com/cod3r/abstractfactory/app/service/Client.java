package br.com.cod3r.abstractfactory.app.service;

import br.com.cod3r.abstractfactory.app.service.factory.EJBAbstractFactory;
import br.com.cod3r.abstractfactory.app.service.factory.RestAbstractFactory;
import br.com.cod3r.abstractfactory.app.service.factory.ServicesAbstractFactory;
import br.com.cod3r.abstractfactory.app.service.services.CarService;
import br.com.cod3r.abstractfactory.app.service.services.UserService;

public class Client {

	public static void main(String[] args) {
		/*
			Abstract Factory => Lida com uma "família" de objetos, 
			e não com apenas um objeto como era o padrão Factory que 
			lidava apenas com o objeto IPhone. Neste exemplo vamos
			trabalhar com os objetos "Certificate" e "Packing".
		*/
		//ServicesAbstractFactory factory = new EJBAbstractFactory();
		ServicesAbstractFactory factory = new RestAbstractFactory();

		UserService userService = factory.getUserService();
		userService.save("Jonathan");
		userService.delete(5);

		CarService carService = factory.getCarService();
		carService.save("Tiida SL");
		carService.update("Celta");
	}
}
