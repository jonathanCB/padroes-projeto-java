package br.com.cod3r.factory.apple;

import br.com.cod3r.factory.apple.factory.meiocomplexa.IPhone11Factory;
import br.com.cod3r.factory.apple.factory.meiocomplexa.IPhoneXFactory;
import br.com.cod3r.factory.apple.factory.simples.IPhoneFactory;
import br.com.cod3r.factory.apple.model.IPhone;

public class Client {
	
	public static void main(String[] args) {
		//Factory => Lida com a construção de um objeto, no nosso caso, o objeto IPhone.

		/***** Forma complexa - Factory para cada versão de IPhone *****/
		// IPhone11ProFactory iPhone11Factory = new IPhone11ProFactory();
		// IPhoneXFactory iPhoneXFactory = new IPhoneXFactory();
		
		// System.out.println("### Ordering an iPhone X");
		// iPhoneXFactory.orderIPhone();
		
		// System.out.println("\n\n### Ordering an iPhone 11");
		// iPhone11ProFactory.orderIPhone();

		/***** Forma meio complexa - Factory para cada conjunto de versões de IPhone *****/
		// IPhoneFactory iPhone11Factory = new IPhone11Factory();
		// IPhoneFactory iPhoneXFactory = new IPhoneXFactory();

		// System.out.println("### Ordering an iPhone X");
		// iPhoneXFactory.orderIPhone("highEnd");

		// System.out.println("\n\n### Ordering an iPhone 11");
		// iPhone11Factory.orderIPhone("standard");

		/***** Forma simples - Uma factory para qualquer IPhone *****/


		System.out.println("### Ordering an iPhone X");
		IPhone device = IPhoneFactory.orderIPhone("X", "highEnd");
		System.out.println(device);

		System.out.println("### Ordering an iPhone X");
		IPhone device2 = IPhoneFactory.orderIPhone("X", "standard");
		System.out.println(device2);

		System.out.println("\n\n### Ordering an iPhone 11");
		IPhone device3 = IPhoneFactory.orderIPhone("11", "standard");
		System.out.println(device3);
	}
}
