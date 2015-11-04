package pantherbuddy.business.controller.account;

import pantherbuddy.business.controller.exceptions.InvalidInputException;
import pantherbuddy.business.controller.exceptions.LoginException;
import pantherbuddy.business.controller.exceptions.UserAlreadyExistsException;
import pantherbuddy.business.controller.exceptions.UserNotFoundException;
import pantherbuddy.business.model.UserModel;

/**
 * The business object class that implements the logic for all operations
 * related to the account user.
 *
 * @author ALLAN
 *
 */
public class AccountBO {

	/**
	 * The method checks if the user with provided data already exusts or not.
	 *
	 * @param user
	 *            An instance of {@link UserModel}
	 * @return <code>true</code> if the user with simmilar data already exists
	 *         else <code>false</code>
	 */
	private boolean checkUserExists(UserModel user) {
		// TODO Auto-generated method
		return false;
	}

	/**
	 * Checks for SQL injection in the entered data.
	 *
	 * @param user
	 *            An instance of {@link UserModel}
	 * @throws InvalidInputException
	 *             Exception thrown if invalid data was found in input by user.
	 */
	private void checkSQLInjection(UserModel user) throws InvalidInputException {
		// TODO Auto-generated method
	}

	/**
	 * The method is used to activate a user on his first login.
	 *
	 * @param user
	 *            An instance of {@link UserModel}
	 */
	private void activateUser(UserModel user) {
		// TODO Auto-generated method
	}

	public void loginUser(UserModel user) throws LoginException {
		// TODO Auto-generated method
	}

	public void registerUser(UserModel user) throws UserAlreadyExistsException {
		// TODO Auto-generated method
	}

	public UserModel getUser(Integer id) {
		// TODO Auto-generated method
		return null;
	}

	public void recoverPassword(String email) throws UserNotFoundException {
		// TODO Auto-generated method
	}

	public void updateUser(UserModel user) {
		// TODO Auto-generated method
	}

}
