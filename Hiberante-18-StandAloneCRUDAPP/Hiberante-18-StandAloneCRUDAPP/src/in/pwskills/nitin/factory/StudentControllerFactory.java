package in.pwskills.nitin.factory;

import in.pwskills.nitin.controller.IStudentController;
import in.pwskills.nitin.controller.StudentControllerImpl;

public class StudentControllerFactory {

	private static IStudentController controller = null;

	public static IStudentController getStudentControllerObj() {
		if (controller == null) {
			controller = new StudentControllerImpl();
		}
		return controller;
	}

}
