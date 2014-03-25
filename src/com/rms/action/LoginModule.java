
/**
 * This action class invoked for login purpose which will make use of the Login class in logic package for database interaction
 * 
 * @author anup
 * @version 1.0
 */

package com.rms.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.rms.dao.User;
import com.rms.logic.Login;

public class LoginModule extends ActionSupport  implements SessionAware, ModelDriven<User>
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String errorMessage;
	String username;
	String password;
	private User user = new User();
	Map mapSession;
	
	public String execute()  {  // default name for method attribute in action tag
		
		com.rms.logic.Login login = new Login(user.getUser(), user.getPassword());
		setErrorMessage("Invalid username of password");
		String route = login.validate();
		
		if(!route.equals("error"))	{
			mapSession.put("user", route);
			setErrorMessage(route);
			route = "success";
		}
		else
			route = "error";
		
		return route; 
	}
	
	
	
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}



	@Override
	public void setSession(Map mapSession) {
		this.mapSession = mapSession;
	}


	@Override
	public User getModel() {
		return user;
	}
	
}
