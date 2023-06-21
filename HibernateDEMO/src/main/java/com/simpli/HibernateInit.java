package com.simpli;

 

import java.io.IOException;
import java.io.PrintWriter;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

 

@SuppressWarnings("serial")
@WebServlet("/init")

public class HibernateInit extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response)

			throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		out.println("<html><body>");

 

		// STEP 1: Get a Session (connection) from the Session Factory class

		SessionFactory factory = HibernateUtil.getSessionFactory();

 

		// STE2 Create the session object

		Session session = factory.openSession();

 

		out.println("Hibernate Session opened.<br>");

 

		session.close();

 

		out.println("Hibernate Session closed.<br>");

 

		out.println("</body></html>");

	}

 

}