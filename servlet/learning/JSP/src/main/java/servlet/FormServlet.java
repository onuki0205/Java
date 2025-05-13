package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormServlet
 */
@WebServlet("/FormServlet")
public class FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		
		String errorMsg = "";
		if(name == null || name.length() == 0) {
			errorMsg += "no name<br>";
		}
		if(gender == null || gender.length() == 0) {
			errorMsg += "no gender<br>";
		} else {
			if(gender.equals("0")) {
				gender = "male";
			} else if(gender.equals("1")) {
				gender = "female";
			}
		}
		
		String msg = "registed" + name + ".";
		if (errorMsg.length() != 0) {
			msg = errorMsg;
		}
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>registration result</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>"+msg+"</p>");
		out.println("</body>");
		out.println("</html>");
	}

}
