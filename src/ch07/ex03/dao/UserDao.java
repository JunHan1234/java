package ch07.ex03.dao;

import ch07.ex03.domain.User;

public interface UserDao {
	public User selectUser(); //Read
	public void insertUser(User user); //Create
	public void updateUser(String userName); //Update
	public void deleteUser(); //Delete
}
