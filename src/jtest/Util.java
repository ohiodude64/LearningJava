package jtest;
import java.util.Scanner;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Util {
	public static void main(String[] args) 
	{
	  Tools tool = new Tools();
	  String n = tool.getName(3);
	  DMWindows win = new DMWindows();
	  win.popWindow();
	  Connection conn = null;
	  try {
		  conn = DriverManager.getConnection("jdbc:mysql://haven.hopto.org:53306/haven?user=dude&password=dgl8rt8r");
	      System.out.println("Loaded");	 
		  String url = "jdbc:mysql://haven.hopto.org:53306/haven";
		  String username = "pi";
		  String qry = "select * from monsters limit 100;";
		  Statement stmt = null;
		  stmt = conn.createStatement();
		  ResultSet rs = stmt.executeQuery(qry);
		  while(rs.next()) {
			  System.out.println("Name: " + rs.getString(2));
			  System.out.println("Type: " + rs.getString(3));
			  System.out.println("Size: " + rs.getString(5));
			  System.out.println("Rating: " + rs.getString(6));
			  System.out.println("--------------------------");
			 }
	      
	      
	  } catch (SQLException ex)
	  	{
			  System.out.println("Expt: " + ex.getMessage());
			  System.out.println("State: " + ex.getSQLState());
			  System.out.println("Error: " + ex.getErrorCode());
	  	}

	  	Toon t = new Toon();
	  	System.out.println("Stat: " + t.s);
	  	t.showToon();
	  
	  
	  
	}
	

}
