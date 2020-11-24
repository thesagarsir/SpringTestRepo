package com.javabysagar.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Repository;

@Repository
public class SagarDao {

	Connection connection;
	public Connection getConnection() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		} catch (Exception e) {
			System.out.println("Sql Exception....");
		}
		return connection;
	}
	
	public  Set<String> getAllEmploee() throws Exception {
		// TODO Auto-generated method stub
		//JDBC
		 SagarDao dao = new SagarDao();
		 Connection connection =  dao.getConnection();
		 Statement stmt = connection.createStatement();
		 String sql = "select * from demo";
		 ResultSet rs = stmt.executeQuery(sql);
		 Set<String> listOfEmp = new HashSet<>();
		 while (rs.next()) {
			String id = rs.getString(1);
			String name = rs.getString(2);
			listOfEmp.add(id);
			listOfEmp.add(name);
		}
		 return listOfEmp;
	}

}
