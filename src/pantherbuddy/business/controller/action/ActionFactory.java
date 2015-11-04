package pantherbuddy.business.controller.action;

import javax.servlet.http.HttpServletRequest;

/**
 * The class follows the factory pattern and is used to get the specific
 * implementation of the {@link Action} class.
 *
 * @author ALLAN
 *
 */
public class ActionFactory {

	/**
	 * The method returns an implementation of the {@link Action} interface
	 * based on the information provided by the request.
	 *
	 * @param request
	 *            An instance of {@link HttpServletRequest}
	 * @return An instance of {@link Action}
	 */
	public Action getAction(HttpServletRequest request) {
		// TODO Auto-generated method
		return null;
	}

}
