package jtest;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Tools {

	
	// Methods
	private Connection getCon() {

		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://haven.hopto.org:53306/haven?user=dude&password=dgl8rt8r");
		    }catch (SQLException ex)
	  			{
				  System.out.println("Expt: " + ex.getMessage());
				  System.out.println("State: " + ex.getSQLState());
				  System.out.println("Error: " + ex.getErrorCode());
	  			}
		return conn;
	}
	
	private int rollDice(int faces, int rolls) {
		int ttl = 0;
		for(int x=0;x < rolls;x++) {
			ttl = ttl + (int)(Math.random() * faces) + 1;
		}
		return ttl;
	}
	
	public String getName(int id)
	{
		return "Some name";
	}
	
	public String getRndMob(int mobId)
	{
		// Get mob by level #, count Mobs, then get rnd 1 - mob.array.len
		return "String";
	}
	

	
}
