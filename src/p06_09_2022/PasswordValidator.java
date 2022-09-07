package p06_09_2022;

public class PasswordValidator extends Validator {
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public PasswordValidator(String password) {
		super();
		this.password = password;
	}

	private boolean isUpperCase() {
		for (int i = 0; i < password.length(); i++) {
			if (Character.isUpperCase(this.password.charAt(i))) {
				return true;
			}
		}
		return false;
	}

	private boolean isLowerCase() {
		for (int i = 0; i < password.length(); i++) {
			if (Character.isLowerCase(this.password.charAt(i))) {
				return true;
			}
		}
		return false;
	}

	private boolean isDigit() {
		for (int i = 0; i < password.length(); i++) {
			if (Character.isDigit(this.password.charAt(i))) {
				return true;
			}
		}
		return false;
	}

	private boolean specialChar() {
		if (this.password.contains("@") || this.password.contains("#") || this.password.contains("*")
				|| this.password.contains("/")) {
			return true;
		}
		return false;
	}

	@Override
	public ValidationResult validnost() {
		ValidationResult validan = new ValidationResult();
		if (this.specialChar() == false) {
			validan.addError("Password must contain at least one special character @, # or *");
		}
		if (this.password.length() < 8)

		{
			validan.addError("Password must be minimum 8 characters");
		}
		if (this.isUpperCase() == false) {
			validan.addError("Password must contain at least one uppercase letter");
		}
		if (this.isLowerCase() == false) {
			validan.addError("Password must contain at least one lowercase letter");
		}
		if (this.isDigit() == false) {
			validan.addError("Password must contain at least one digit");
		}

		return validan;
	}

}
