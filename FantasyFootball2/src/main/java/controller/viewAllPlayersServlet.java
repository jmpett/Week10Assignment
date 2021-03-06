package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/viewAllPlayersServlet")
public class viewAllPlayersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public viewAllPlayersServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		footballPlayerDao dao = new footballPlayerDao();
		request.setAttribute("allPlayers", dao.showAllPlayers());
		
		if(dao.showAllPlayers().isEmpty()) {
			request.setAttribute("allPlayers", " ");
			
		} 
		getServletContext().getRequestDispatcher("/football-list.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}