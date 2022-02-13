package com.base.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/userAction")
public class UserAction extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{

	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{

		System.out.println("Hello WORLD IN POST");

		res.setContentType("text/html");//setting the content type  
		PrintWriter pw = res.getWriter();//get the stream to write the data  

		//writing html in the stream  
		pw.println("<html><body>");
		pw.println("Welcome to servlet");
		pw.println("</body></html>");

		pw.close();//closing the stream  
	}
}