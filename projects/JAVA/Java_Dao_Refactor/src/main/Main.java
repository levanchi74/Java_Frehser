package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class Main {
	
	public static final String DB_URL_MYSQL = "jdbc:mysql://localhost:3306/crud55"
			+"?useUnicode=true"
			+"&useJDBCCompliantTimezoneShift=true"
			+"&useLegacyDatetimeCode=false&serverTimezone=UTC";
	public static final String DB_URL_H2 = "jdbc:h2:" + "./Database/test";
	//public static final String DB_URL_ORACLE = "jdbc:oracle:thin:localhost:3306";
	
	static {
		System.setProperty("DB_URL",DB_URL_H2);
		System.setProperty("DB_USER", "root");
		System.setProperty("DB_PASS", "");
	}
	

	public static void main(String[] args) {
		
		String url  	= 	System.getProperty("DB_URL");
		String user		= 	System.getProperty("DB_USER");
		String password = 	System.getProperty("DB_PASS");
		
		try (Connection conn = DriverManager.getConnection(url, user, password);){
			
			StudentDao studentDao = new StudentDaoImpl();
			
			//studentDao.createTable(conn);
			//studentDao.insertData(conn);
			
//			List<Student> students =  studentDao.getAllStudents(conn);
//			for(Student st:students) {
//				System.out.println(st.getId() + st.getName());
//			}
			
		
			Student chile = new Student(3,"chi bao dep trai");
			//studentDao.insertStudent(chile, conn);
			
			/*
			 * Student student = studentDao.getStudent(3, conn); if(student != null)
			 * System.out.println(student.getId()+ student.getName()); else
			 * System.out.println("Student not found");
			 */
			
//			chile.setName("chi xau trai");
//			studentDao.updateStudent(chile, conn);
			
			//studentDao.deleteStudent(3, conn);
			
			//studentDao.deleteStudents(conn);
			
			studentDao.dropTableStudent(conn);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
		
		
		
		
	}
}
