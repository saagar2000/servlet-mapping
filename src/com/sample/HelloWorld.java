package com.sample;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({"/admin/display/course"})
public class HelloWorld extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException{
				PrintWriter out = response.getWriter();
				out.println("<html>");
				out.println("<body>");
				out.println("<h1>Hello Servlet Get</h1>");
				out.println("</body>");
				out.println("</html>");
			}

}
