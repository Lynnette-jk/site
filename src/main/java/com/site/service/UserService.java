package com.site.service;
import com.site.model.User;
public interface UserService {
	void insertStudent(User user);
	boolean getStudentByLogin(String userName, String password);
	boolean getStudentByUserName(String userName);

}
