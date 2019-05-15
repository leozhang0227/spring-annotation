package com.athangzhou.tx;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	public void insert()
	{
		String sql = "INSERT INTO `tbl_user`(user_name,age)VALUES(?,?);";
		String user = UUID.randomUUID().toString().subSequence(0, 5).toString();
		int age = 20;
		jdbcTemplate.update(sql,user,age);
	}
}
