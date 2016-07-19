package br.marcel.melo.crud;

import java.util.ArrayList;

public class UserBean {
	private ArrayList<User> users;
	private User user;
	private UserDAO userDao;
	

	public UserBean() {
		super();
		users = new ArrayList<User>();
		user = new User();
		userDao = new UserDAO();
	}

	public ArrayList<User> getUsers() {
		this.carregaListaUsuarios();
		return users;
	}

	public void setUsers(ArrayList<User> users) {
		this.users = users;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	private void carregaListaUsuarios(){
		this.users = userDao.getAllUsers();
	}
	
	public boolean saveUser(User usuario){
		return userDao.saveUser(usuario);
	}
	
	public boolean editUser(User usuario){
		return userDao.updateUser(usuario);
	}
	
}
