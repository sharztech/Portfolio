package main;

import lib.Name;
import lib.Register;

public class RegisterApp {

	public static String execute(Name nm, Register regst) {

		if (regst.sizeOfRegister() > 1) {
			regst.removeName(1);
		}

		regst.addName(nm);

		StringBuilder result = new StringBuilder();

		for (Name name : regst.getNames()) {
			String firstName = name.getFirstName().toLowerCase();
			String familyName = name.getFamilyName().substring(0, 3);
			if (firstName.contains("e") || (firstName.contains("a"))) {
				String initials = firstName.charAt(0) + "." + familyName;
				String email = initials + "@email.com";
				result.append(email.toLowerCase()).append("\n");
			}
		}
		return result.toString();

	}
}
