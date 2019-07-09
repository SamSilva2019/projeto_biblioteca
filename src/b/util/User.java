package b.util;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class User {

	public static void verifica (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	HttpSession session = request.getSession();
	User.verifica(request , response);
	
	if(session .getAttribute("nome") == null)
		request.getRequestDispatcher("EfetuarLogin").forward(request, response);
			}
}
