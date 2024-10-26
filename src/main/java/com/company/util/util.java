package com.company.util;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/util")
public class util extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final String URL="jdbc:mysql://localhost:3306/HACKTHON";
	private final String USERNAME="root";
	private final String PASSWORD="7033934792rR@";
	
			static {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
				}
				catch(ClassNotFoundException e){
					e.printStackTrace();
					
				}
				
			}
	
		
	}
   
