package br.com.cod3r.factory.app.dbadapter.factory;

import br.com.cod3r.factory.app.dbadapter.db.DB;
import br.com.cod3r.factory.app.dbadapter.db.OracleDB;
import br.com.cod3r.factory.app.dbadapter.db.PostgresDB;

public class DBFactory {

	public static DB getDatabase(String database) {
		DB db = null;

		if ("oracle".equals(database.toLowerCase())) {
			db = new OracleDB();
		} else if ("postgresql".equals(database.toLowerCase())) {
			db = new PostgresDB();
		}

		return db;
	}
	
}
