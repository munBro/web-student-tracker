package com.mamun.web.jdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	@Resource(name="jdbc/web_student_tracker")
	
	private DataSource datasource;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		Connection myCon = null;
		Statement myStat = null;
		ResultSet myRs = null;
		
		
		
		String nid =  request.getParameter("pid");
		
		
		try {
			
			myCon = datasource.getConnection();
			
			String sql = "select *from Book where id="+nid;
			
			myStat = myCon.createStatement();
			
			myRs = myStat.executeQuery(sql);
			
			
			//response.getContentType("text/html");
			
			 
			
			
			while(myRs.next()) {
				//String email = myRs.getString("email");
				String name = myRs.getString("name");
				String age = myRs.getString("age");
				int id = myRs.getInt("id");
				
		    
				
			out.println("<table style=\"border: 1px solid black; width:75%\"><tr>"
					+ "<th style=\"border: 1px solid black;\">ID</th>"
					+ "<th style=\"border: 1px solid black;\">Name</th>"
					+ "<th style=\"border: 1px solid black;\">AGE</th>"
					
					+ "</tr>"
					+ "<tr>"
					+ "<td style=\"border: 1px solid black;\">"+id+"</td>"
					+ "<td style=\"border: 1px solid black;\">"+name+"</td>"
					+ "<td style=\"border: 1px solid black;\">"+age+"</td>"
					+ "</tr>"
					
					+ "</table>");
				
		  
				
			}
			
			
			
			
			
			
			
			
			
			
			
		}catch(Exception exc) {
			exc.printStackTrace();
		}
		
	}

}
