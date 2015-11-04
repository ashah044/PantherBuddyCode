package pantherbuddy.business.controller.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pantherbuddy.business.model.MessageModel;

/**
 * Represents the view for View Messages.
 *
 * @author ALLAN
 *
 */
public class ViewMessagesAction implements Action {

	/**
	 * {@link List} of {@link MessageModel} to display to user.
	 */
	public List<MessageModel> messages;

	/**
	 * Is used for pagination on the view messages view. Represents the starting
	 * number of the range of messages displayed on the page.
	 */
	public Integer rangeFrom;

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) {
		// TODO Auto-generated method
		return null;
	}

}
