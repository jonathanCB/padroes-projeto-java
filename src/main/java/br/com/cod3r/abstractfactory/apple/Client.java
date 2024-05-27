package br.com.cod3r.abstractfactory.apple;

import br.com.cod3r.abstractfactory.apple.factory.IPhone11Factory;
import br.com.cod3r.abstractfactory.apple.factory.IPhoneFactory;
import br.com.cod3r.abstractfactory.apple.factory.IPhoneXFactory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.BrazilianRulesAbstractFactory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.USRulesAbstractFactory;
import br.com.cod3r.abstractfactory.apple.model.iphone.IPhone;

public class Client {
	
	public static void main(String[] args) {
		/*
			Abstract Factory => Lida com uma "família" de objetos, 
			e não com apenas um objeto como era o padrão Factory que 
			lidava apenas com o objeto IPhone. Neste exemplo vamos
			trabalhar com os objetos "Certificate" e "Packing".
		*/

		CountryRulesAbstractFactory rules = new USRulesAbstractFactory();
		IPhoneFactory genXFactory = new IPhoneXFactory(rules);
		IPhoneFactory gen11Factory = new IPhone11Factory(rules);

		System.out.println("### Ordering an IPhone X");
		IPhone iphone = genXFactory.orderIPhone("standard");

		System.out.println("\n### Ordering an IPhone 11 HighEnd");
		IPhone iphone2 = gen11Factory.orderIPhone("highEnd");
	}
}
