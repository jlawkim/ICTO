package com.samsung.biz.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.samsung.biz.utils.JDBCUtils;
import com.samsung.biz.vo.Husers;

public class HusersDAO {
	
	public void insertUser(Husers user){
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			conn=JDBCUtils.getConnection();
			String sql = "insert into husers(seq, name, password, email, age, gender) "+
			"values( (select nvl(max(seq), 0)+1 from husers), ?, ?, ?, ?, ?)";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, user.getName());
			stmt.setString(2, user.getPassword());
			stmt.setString(3, user.getEmail());
			stmt.setInt(4,user.getAge());
			stmt.setInt(5, user.getGender());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.close(conn, stmt);
		}
	}
	
	public List<Husers> getUserList(){
		List<Husers> list = new ArrayList<Husers>();
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = JDBCUtils.getConnection();
			String sql = "select * from husers";
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			while(rs.next()){
				Husers user = new Husers();
				
				user.setSeq(rs.getInt("seq"));
				user.setName(rs.getString("name"));
				user.setPassword(rs.getString("password"));
				user.setEmail(rs.getString("email"));
				user.setAge(rs.getInt("age"));
				user.setGender(rs.getInt("gender"));
				
				list.add(user);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCUtils.close(conn, stmt, rs);
		}
		return list;
	}
}
