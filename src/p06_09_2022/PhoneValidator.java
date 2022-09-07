package p06_09_2022;

public class PhoneValidator extends Validator {
	private String brojTelefona;

	public PhoneValidator(String brojTelefona) {
		super();
		this.brojTelefona = brojTelefona;
	}

	public String getBrojTelefona() {
		return brojTelefona;
	}

	public void setBrojTelefona(String brojTelefona) {
		this.brojTelefona = brojTelefona;
	}

	private boolean isDigit() {
		String regex = "^\\+\\d";
		if (this.brojTelefona.matches(regex)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public ValidationResult validnost() {
		ValidationResult validan = new ValidationResult();
		{
			if (!this.brojTelefona.startsWith("+")) {
				validan.addError("Phone number must start with +");
			}
			if (this.brojTelefona.contains(" ")) {
				validan.addError("Phone number cannot contain spaces");
			}
			if (this.isDigit() == false) {
				validan.addError("Phone number can only contain numbers");
			}
			return validan;
		}
	}
}
