package br.com.cod3r.factory.app.dbadapter;

import br.com.cod3r.factory.app.dbadapter.db.DB;
import br.com.cod3r.factory.app.dbadapter.db.OracleDB;
import br.com.cod3r.factory.app.dbadapter.db.PostgresDB;

public class Client {

	public static void main(String[] args) {
		//Factory => Lida com a construção de um objeto, no nosso caso, o objeto DB.

		DB oracle = new OracleDB();
		DB postgresql = new PostgresDB();

		System.out.println("*** Databases ***");

		System.out.println("\nORACLE DB");
		oracle.query("SELECT * FROM products");
		oracle.update("UPDATE products WHERE id = 752 SET name = 'PS5'");

		System.out.println("\nPOSTGRESQL DB");
		postgresql.query("SELECT * FROM cars");
		postgresql.update("UPDATE cars WHERE id = 216 SET manufacturer = 'Ford'");
	}
}
