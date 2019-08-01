package main;

import java.sql.Connection;
import java.util.List;

public interface StudentDao {
	
	public List<Student> getAllStudents(Connection conn);
	
	public Student getStudent(int id,Connection conn);
	
	public void insertStudent(Student st,Connection conn);
	
	public void updateStudent(Student st,Connection conn);
	
	public void deleteStudent(int id,Connection conn);
	
	public void deleteStudents(Connection conn);
	
	public void dropTableStudent(Connection conn);

	public void createTable(Connection conn); // temp

	public void insertData(Connection conn);  // temp
	
}
