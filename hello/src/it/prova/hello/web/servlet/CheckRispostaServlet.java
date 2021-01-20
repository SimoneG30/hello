package it.prova.hello.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CheckRispostaServlet")
public class CheckRispostaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CheckRispostaServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String rispostaDellUtenteMaledetto = request.getParameter("risposta");

		RequestDispatcher rd = null;
		if (rispostaDellUtenteMaledetto.equalsIgnoreCase("roma"))
			rd = request.getRequestDispatcher("rispostaOK.jsp");
		else
			rd = request.getRequestDispatcher("sbagliato.jsp");
		
		request.setAttribute("risposta_capitale_attr", rispostaDellUtenteMaledetto);
		rd.forward(request, response);
		
	}

}
