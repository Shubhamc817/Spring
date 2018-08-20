package com.shubham.SpringJDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 * Hello world!
 *
 */
public class StudentDAOImpl implements StudentDAO
{
	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void save(Student student) {
		// TODO Auto-generated method stub
		
		String sql= "insert into student values(?,?,?)";
		
try{
	JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		Object[] args = new Object[] {student.getStudentId(), student.getStudentName(), student.getStudentAddress()};
		
		int out = jdbcTemplate.update(sql, args);
		
			
			
		if(out !=0){
			System.out.println("Student saved with id="+student.getStudentName());
		}else System.out.println("Student save failed with id="+student.getStudentName());
	
	}catch(Exception e){
		e.printStackTrace();
	}
		
	}

	public Student getById(int id) {
		// TODO Auto-generated method stub
		
		String sql="select id,name,address from student where id=?";
JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		//using RowMapper anonymous class, we can create a separate RowMapper for reuse
		Student stu = jdbcTemplate.queryForObject(sql, new Object[]{id}, new RowMapper<Student>(){

		
			public Student mapRow(ResultSet rs, int id)
					throws SQLException {
				Student stu = new Student();
				stu.setStudentId(id);
				stu.setStudentName(rs.getString("name"));
				stu.setStudentAddress(rs.getString("address"));

				return stu;
			}});
		
		return stu;
	}

	public List<Student> getAll() {
		// TODO Auto-generated method stub
		
		String query = "select id, name, address from Student";
		List<Student> stuList = new ArrayList<Student>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try{
			con = dataSource.getConnection();
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()){
				Student stu = new Student();
				stu.setStudentId(rs.getInt("id"));
				stu.setStudentName(rs.getString("name"));
				stu.setStudentAddress(rs.getString("address"));
				stuList.add(stu);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return stuList;
	}
}
