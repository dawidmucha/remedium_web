package com.remedium.user;

import java.util.HashMap;

@Named
@RequestScoped
public class PersonListBB {
	private static final String PAGE_USER_EDIT = "userEdit?faces-redirect=true";
	private static final String PAGE_STAY_AT_THE_SAME = null;
	
	private String user;
	
	@Inject
	ExternalContext extcontext;
	
	@Inject
	Flash flash;
	
	@EJB
	UserDAO UserDAO;
	
	public String getUser() {
		return user
	}
	
	public void setUser(String user) {
		this.user = user;
	}
	
	public List<User> getFullList() {
		return UserDAO.getFullList();
	}
	
	public List<User> getList() {
		List<User> list = null;
		
		Map<String,Object> searchParams = new HashMap<String, Object>();
	}
}