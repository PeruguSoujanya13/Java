package com.simple;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final String UNUSED = "unused";
	private static final long serialVersionUID = 1L;
	@SuppressWarnings(UNUSED)
	private String p;
	@SuppressWarnings(UNUSED)
	private String n;
	private Connection con2222;
       
    
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:8082/db1","root","Perugu@1329#13")) {
			}
			n = request.getParameter("txtName");
			p = request.getParameter("txtpwd");
			Connection con = null;
			Connection con2 = con;
			Connection con22 = con2;
			Connection con222 = con22;
			con2222 = con222;
			PreparedStatement ps=con2222.prepareStatement("select uname from login where uname=? and password=?");
		ps.setString(1, n);
		ps.setString(1, p);
		ResultSet rs=ps.executeQuery();
		if(rs.next())
		{
			RequestDispatcher rd=request.getRequestDispatcher("Welcome.jsp");
			rd.forward(request, response);
		}
		else {
			DriverManager out = null;
			extracted(out);
		}
		} 
	
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
	}



	private void extracted(DriverManager out) {
		DriverManager.println("<font color=red size=18>Login Faled!!<br>");
	}

}
