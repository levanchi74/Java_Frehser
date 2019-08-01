package main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao{

	private List<Student> students;
	
	public void createTable(Connection conn) {
		String createTableSql =  "CREATE TABLE student"
								+ "(id INT NOT NULL, "
								+ "name VARCHAR(255),"
								+ "PRIMARY KEY (id))";
		try {
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(createTableSql);
			System.out.println("create table success");
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}
	
	public void insertData(Connection conn) {
		String insert0 = "INSERT INTO student(id,name) values (0,'chile')";
		String insert1 = "INSERT INTO student(id,name) values (1,'thohuynh')";
		String insert2 = "INSERT INTO student(id,name) values (2,'chilevan')";
		try {
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(insert1);
			System.out.println("insert data success");
		} catch (SQLException e) {
			e.printStackTrace();
		}			
	}
	
	@Override
	public List<Student> getAllStudents(Connection conn) {
		students = new ArrayList<Student>();
		String selectSql = "SELECT * FROM student";
		
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(selectSql);
			
			int id;
			String name;
			Student st;
			while(rs.next()) {
				id = rs.getInt("id");
				name = rs.getString("name");
				st = new Student(id,name);
				students.add(st);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return students;
	}

	@Override
	public Student getStudent(int id, Connection conn) {
		
		String selectWithIdSql = "SELECT * FROM student WHERE id = ?";
		Student st = null;
		try {
			PreparedStatement preparedStatement = conn.prepareStatement(selectWithIdSql);
			preparedStatement.setInt(1, id);
			ResultSet rs = preparedStatement.executeQuery();
			
			if(rs.next()) {
				st = new Student(rs.getInt("id"),rs.getString("name"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return st;
	}

	@Override
	public void insertStudent(Student st, Connection conn) {
		String insertSql = "INSERT INTO student(id,name) VALUES (?,?)";
		
		try {
			PreparedStatement preparedStatement = conn.prepareStatement(insertSql);
			preparedStatement.setInt(1, st.getId());
			preparedStatement.setString(2, st.getName());
			preparedStatement.executeUpdate();
			System.out.println("insert success");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateStudent(Student st, Connection conn) {
		String updateSql = "UPDATE student SET name = ? WHERE id = ?";
		
		try {
			PreparedStatement stmt = conn.prepareStatement(updateSql);
			stmt.setString(1, st.getName());
			stmt.setInt(2, st.getId());
			
			int count = stmt.executeUpdate();
			if(count > 0 ) {
				System.out.println("Update success");
			}else {
				System.out.println("Update not success");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void deleteStudent(int id, Connection conn) {
		
		String deleteSql = "DELETE FROM student WHERE id = ?";
		
		try {
			PreparedStatement stmt = conn.prepareStatement(deleteSql);
			stmt.setInt(1, id);
			int count = stmt.executeUpdate();
			System.out.println("Delete success");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void deleteStudents(Connection conn) {
		
		String truncateSql = "TRUNCATE TABLE student";
		try {
			PreparedStatement preparedStatement = conn.prepareStatement(truncateSql);
			preparedStatement.executeUpdate();
			System.out.println("deleted all students in table");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void dropTableStudent(Connection conn) {
		
		String dropSql = "DROP TABLE student";
		
		
		try {
			PreparedStatement preparedStatement = conn.prepareStatement(dropSql);
			preparedStatement.executeUpdate();
			System.out.println("Student table droped");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	
}
