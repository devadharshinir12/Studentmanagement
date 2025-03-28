package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Students_DAO_DTO.StudentDTO;

public class StudentDAO {
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql:/office", "root", "root");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;

	}

	public static int saveStudent(StudentDTO s) throws SQLException {
		Connection con = getConnection();
		PreparedStatement pst = con.prepareStatement("insert into student values(?,?,?,?,?,)");
		pst.setInt(1, s.getId());
		pst.setString(2, s.getName());
		pst.setInt(3, s.getPhysics());
		pst.setInt(4, s.getChemistry());
		pst.setInt(5, s.getMaths());
		return pst.executeUpdate();
	}

	public static StudentDTO findStudent(int id) throws SQLException {
		Connection con = getConnection();
		PreparedStatement pst = con.prepareStatement("select *from student where id=?");
		pst.setInt(1, id);
		ResultSet rs = pst.executeQuery();
		if (rs.next()) {
			StudentDTO s = new StudentDTO(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5));
			return s;
		}
		return null;

	}

	public static int deleteStudent(int id) throws SQLException {
		Connection con = getConnection();
		PreparedStatement pst = con.prepareStatement("delete from student where id=?");
		pst.setInt(1, id);
		return pst.executeUpdate();

	}
	
	public static List<StudentDTO> findAllStudent() throws SQLException{
		Connection con = getConnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select*from student");
		List<StudentDTO> StudentList=new ArrayList<>();
		while(rs.next()) {
			StudentDTO s = new StudentDTO(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5));
			StudentList.add(s);
		}
		return StudentList;		
	}
	public static boolean findAdmin(String email,String password) throws SQLException {
		Connection con=getConnection();
		PreparedStatement pst=con.prepareStatement("select * from admin where email=? and password=?");
		pst.setString(1,email);
		pst.setString(2,password);
		ResultSet rs=pst.executeQuery();
		if(rs.next()) {
			return true;
		}
		else {
			return false;
		}
	}
	public static int saveAdmin(int id,String name,Long contact,String email,String password) throws SQLException {
			Connection con=getConnection();
			PreparedStatement pst=con.prepareStatement("insert into admin value(?,?,?,?,?)");
			pst.setInt(1,id);
			pst.setString(2,name);
			pst.setLong(3, contact);
			pst.setString(4,email);
			pst.setString(5, password);

			return pst.executeUpdate();
			
		}


		
	}
	
