package in.pwskills.nitin.controller;

import in.pwskills.nitin.bean.StudentVo;

public interface IStudentController {
	public String insertRecord(StudentVo student);

	public StudentVo readRecord(String sid);

	public String deleteRecord(String sid);

	public String updateRecord(StudentVo student);
}
