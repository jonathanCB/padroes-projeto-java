package br.com.cod3r.factory.app.dbadapter.db;

public class PostgresDB implements DB {

	public void query(String sql) {
		System.out.println("Querying => " + sql + " in Postgres database");
	}
	
	public void update(String sql) {
		System.out.println("Update query => " + sql + " in Postgres database");
	}
}
