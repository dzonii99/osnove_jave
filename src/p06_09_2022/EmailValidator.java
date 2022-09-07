package p06_09_2022;

public class EmailValidator extends Validator {
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public EmailValidator(String email) {
		super();
		this.email = email;
	}

	@Override
	public ValidationResult validnost() {
		ValidationResult validan = new ValidationResult();
		if (!email.contains("@") || !email.endsWith(".com") && !email.endsWith(".net")) {
			validan.addError("Email is invalid");
		}
		return validan;

	}

}
