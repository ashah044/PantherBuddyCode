package pantherbuddy.business.controller.control;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * This is the entry point into the controller of the MVC architecture. It
 * follows the Front Controller pattern (which is a specialized kind of Mediator
 * pattern). It provides a centralized entry point of all requests. It will
 * create the Model based on information available by the request
 *
 * @author ALLAN
 *
 */
public class MainController extends HttpServlet {

	/**
	 * Used to service the get request
	 *
	 * @param request
	 *            An instance of {@link HttpServletRequest}
	 * @param response
	 *            An instance of {@link HttpServletResponse}
	 */
	@Override
	public void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) {
		// TODO Auto-generated method
	}

	/**
	 * Used to service the post request
	 *
	 * @param request
	 *            An instance of {@link HttpServletRequest}
	 * @param response
	 *            An instance of {@link HttpServletResponse}
	 */
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method
	}

}
