package pantherbuddy.business.controller.message;

import java.util.List;

import pantherbuddy.business.controller.exceptions.InvalidInputException;
import pantherbuddy.business.model.MessageModel;

/**
 * The business object class that implements the logic for all operations
 * related to the messages.
 *
 * @author ALLAN
 *
 */
public class MessageBO {

	/**
	 * The method checks for Cross Site Scripting in the input {@link String}
	 *
	 * @param message
	 *            An instance of {@link String} representing the input message.
	 * @throws InvalidInputException
	 *             Exception thrown if invalid input was found.
	 */
	private void checkXSS(String message) throws InvalidInputException {
		// TODO Auto-generated method
	}

	public void saveMessage(MessageModel message) {
		// TODO Auto-generated method
	}

	public List<MessageModel> getMessagesToShow(Integer rangeFrom) {
		// TODO Auto-generated method
		return null;
	}

	public void deleteMessage(Integer id) {
		// TODO Auto-generated method
	}

}
