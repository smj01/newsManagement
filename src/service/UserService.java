package com.hbase.test.servlet.Dao;

import java.sql.SQLException;
import java.util.List;
import com.hbase.test.servlet.entities.User;


public interface UserService {
	public User getUserByUserName(String userName) throws SQLException;
	public void addUser(User user) throws SQLException;
	public boolean checkUserNameIsExit(String userName) throws SQLException;
}
