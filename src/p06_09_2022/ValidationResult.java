package p06_09_2022;

import java.util.ArrayList;

public class ValidationResult {
	private boolean hasErrors;
	ArrayList<String> errors = new ArrayList<String>();

	public boolean isHasErrors() {
		return hasErrors;
	}

	public void addError(String error) {
		this.hasErrors = true;
		this.errors.add(error);
	}

	public void print() {
		if (this.hasErrors) {
			for (int i = 0; i < errors.size(); i++) {
				System.out.println(this.errors.get(i));
			}
		} else {
			System.out.println("No validation errors.");

		}
	}
}