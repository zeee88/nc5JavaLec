package com.bit.springboard.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Repository;

import com.bit.springboard.common.JDBCUtil;
import com.bit.springboard.dto.UserDTO;
import com.mysql.cj.jdbc.JdbcConnection;

@Repository("userDAO")
public class UserDAO {

	private Connection conn = null;
	private PreparedStatement stmt = null;
	private ResultSet rs = null;
	
	
	
	private final String JOIN = "INSERT INTO T_USER ("
			+ " USER_ID,"
			+ " USER_PW,"
			+ " USER_NAME,"
			+ " USER_EMAIL,"
			+ " USER_TEL)"
			+ " VALUES (?, ?, ?, ?, ?)";
	
	
	private final String GETUSER = "SELECT "
			+ "ID, "
			+ "USER_ID, "
			+ "USER_PW, "
			+ "USER_NAME, "
			+ "USER_EMAIL, "
			+ "USER_TEL, "
			+ "USER_REGDATE "
			+ " FROM T_USER "
			+ "WHERE ID = ? ";
	
	public void join(UserDTO userDTO) {
		// TODO Auto-generated method stub

		System.out.println("join");
		
		try {
			conn = JDBCUtil.getConnection();
			
			stmt = conn.prepareStatement(JOIN);
			
			stmt.setString(2, userDTO.getUserId());
			stmt.setString(3, userDTO.getUserPw());
			stmt.setString(4, userDTO.getUserName());
			stmt.setString(5, userDTO.getUserEmail());
			stmt.setString(6, userDTO.getUserTel());
			
			stmt.executeUpdate();
			
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}finally {
			JDBCUtil.close(stmt, conn);
		}
		
		
	}

	public UserDTO getUser(int id) {
		// TODO Auto-generated method stub
		
		System.out.println("getUser");
		
		UserDTO userDTO = new UserDTO();
		
		try {
			conn = JDBCUtil.getConnection();
			
			stmt = conn.prepareStatement(GETUSER);
			
			stmt.setInt(1, id);
			
			rs = stmt.executeQuery();
			
			if(rs.next()) {
				userDTO.setId(rs.getInt("ID"));
				userDTO.setUserId(rs.getString("USER_ID"));
				userDTO.setUserPw(rs.getString("USER_PW"));
				userDTO.setUserName(rs.getString("USER_NAME"));
				userDTO.setUserEmail(rs.getString("USER_EMAIL"));
				userDTO.setUserTel(rs.getString("USER_TEL"));
				userDTO.setUserRegdate(rs.getDate("USER_REGDATE"));
				
			}
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}finally {
			JDBCUtil.close(rs, stmt, conn);
		}
		return userDTO;
	}

}
