package com.company.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class userdaoimp implements userdao {
	
	public boolean isvalid(String username, String password) {
		
		String query="SELECT * FROM USER WHERE USERNAME=? AND PASSWORD = ?";
		
		try(Connection c=util.getconnection(); 
				PreparedStatement ps=c.ps(query)){
			ps.setString(1,username);
			ps.setString(2, password);
			
		}
	}
	
	
}