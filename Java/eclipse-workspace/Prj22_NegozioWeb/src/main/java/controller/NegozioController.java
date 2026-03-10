package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Colore;
import model.Logo;
import model.TShirt;
import model.Taglia;

@WebServlet("/crea")
public class NegozioController extends HttpServlet {

	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Colore[] colori = Colore.values();
		Taglia[] taglie = Taglia.values();
		
		req.setAttribute("colori", colori);
		req.setAttribute("taglie", taglie);
		
		req.getRequestDispatcher("crea.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String colore = req.getParameter("colore");
		String taglia = req.getParameter("taglia");
		String logoName = req.getParameter("logoName");
		String imgLogo = req.getParameter("imgLogo");
		
		TShirt tShirt = new TShirt(0, 
				Colore.valueOf(colore), 
				Taglia.valueOf(taglia), 
				new Logo(0, imgLogo, logoName),
				10
				);
		
		System.out.println(tShirt);
		doGet(req, resp);
	}
	
	
}
