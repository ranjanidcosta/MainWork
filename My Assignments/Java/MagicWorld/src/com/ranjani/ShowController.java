package com.ranjani;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ranjani.bean.Show;
import com.ranjani.exception.MovieException;
import com.ranjani.service.MovieService;
import com.ranjani.service.MovieServiceImpl;

/**
 * Servlet implementation class ShowController
 */
@WebServlet(urlPatterns= {"/show","/getShowDetails"})
public class ShowController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private MovieService mService;
	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("In init");
		mService = new MovieServiceImpl();
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("In doGet");
		String path = request.getServletPath();
		switch (path) {
		case "/show":
			List<Show> showList = null;
			try {
				showList = mService.getShowDetails();
				System.out.println(showList);
				request.setAttribute("showList", showList);
				request.getRequestDispatcher("showdetails.jsp").forward(request, response);
			} catch (MovieException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
			break;
		case "/getShowDetails":
			System.out.println("In show details:  ");
			String showId = request.getParameter("showid");
			System.out.println("show id: "+showId);
			try {
				Show showObj = mService.getShowObject(showId);
				System.out.println(showObj);
				if (showObj!=null) {
				request.setAttribute("showObj", showObj);
				}
				else {
					System.out.println("No Details found for : "+ showId);
				}
				request.getRequestDispatcher("bookNow.jsp").forward(request, response);
			} catch (MovieException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		default:
			break;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
