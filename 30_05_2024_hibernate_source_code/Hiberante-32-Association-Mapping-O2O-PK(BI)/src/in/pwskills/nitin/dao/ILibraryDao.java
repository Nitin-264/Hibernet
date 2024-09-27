package in.pwskills.nitin.dao;

public interface ILibraryDao {
	//performing insert operation using parent
	public void saveRecordUsingParent();
	public void saveRecordUsingChild();
	
	//performing select operation using parent
	public void loadRecordUsingParent();
		
}
