package com.newlecture.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class add
 */
@WebServlet("/calcpage")
public class CalcPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalcPage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie[] cookies = request.getCookies();
		
		String exp = "0";
		if(cookies != null)
			for(Cookie c : cookies) {
				if(c.getName().equals("exp"))
					exp = c.getValue();
				break;
			}
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		out.write("<!DOCTYPE html>");
		out.write("<html>");
		out.write("<head>");
		out.write("<meta charset=\"EUC-KR\">");
		out.write("<title>Insert title here</title>");
		out.write("<style type=\"text/css\">");
		out.write("input {");
		out.write("width: 50px;");
		out.write("height: 50px;");
		out.write("}");
		out.write(".output{");
		out.write("height: 50px;");
		out.write("background: #e9e9e9;");
		out.write("font-size: 24px;");
		out.write("font-weight: bold;");
		out.write("text-align: right;");
		out.write("pading : 0px 5px;");
		out.write("}");
		out.write("</style>");
		out.write("</head>");
		out.write("<body>");
		out.write("<form action=\"calc3\" method=\"post\">");
		out.write("<table>");
		out.write("<tr>");
		out.printf("<td class=\"output\" colspan=\"4\">%s</td>" , 3+4);
		out.write("</tr>");
		out.write("<tr>");
		out.write("<td><input type=\"submit\" name = \"operator\" value=\"CE\" /></td>");
		out.write("<td><input type=\"submit\" name = \"operator\" value=\"C\" /></td>");
		out.write("<td><input type=\"submit\" name = \"operator\" value=\"BS\" /></td>");
		out.write("<td><input type=\"submit\" name = \"operator\" value=\"/\" /></td>");
		out.write("</tr>");
		out.write("<tr>");
		out.write("<td><input type=\"submit\" name = \"value\" value=\"7\" /></td>");
		out.write("<td><input type=\"submit\" name = \"value\" value=\"8\" /></td>");
		out.write("<td><input type=\"submit\" name = \"value\" value=\"9\" /></td>");
		out.write("<td><input type=\"submit\" name = \"operator\" value=\"X\" /></td>");
		out.write("</tr>");
		out.write("<tr>");
		out.write("<td><input type=\"submit\" name = \"value\" value=\"4\" /></td>");
		out.write("<td><input type=\"submit\" name = \"value\" value=\"5\" /></td>");
		out.write("<td><input type=\"submit\" name = \"value\" value=\"6\" /></td>");
		out.write("<td><input type=\"submit\" name = \"operator\" value=\"-\" /></td>");
		out.write("</tr>");
		out.write("<tr>");
		out.write("<td><input type=\"submit\" name = \"value\" value=\"1\" /></td>");
		out.write("<td><input type=\"submit\" name = \"value\" value=\"2\" /></td>");
		out.write("<td><input type=\"submit\" name = \"value\" value=\"3\" /></td>");
		out.write("<td><input type=\"submit\" name = \"operator\" value=\"+\" /></td>");
		out.write("</tr>");
		out.write("<tr>");
		out.write("<td><input type=\"submit\" name = \"value\" value=\"0\" /></td>");
		out.write("<td><input type=\"submit\" name = \"operator\" value=\".\" /></td>");
		out.write("<td><input type=\"submit\" name = \"operator\" value=\"=\" /></td>");
		out.write("</tr>");
		out.write("</table>");
		out.write("</form>");
		out.write("</body>");
		out.write("</html>");
		
		
		
		
		
		
			
			
		
		
		
	}
}
