package mypack;

import java.util.HashMap;

public class LoginService {
    HashMap<String,String> user=new HashMap<String,String>();

	public LoginService(){
		user.put("Johndoe", "JohnDoe");
		user.put("Johndoe", "Jane Doe");
		user.put("Jguru", "JAVA Guru");
	}
	public boolean authenticate(String userId,String password){
		if(password ==null ||password.trim() == ""){
			return false;
		}
		return true;
	}
	public User getUserDetails(String userId){
		User user=new User();
		user.setUserName(user.getUserId());
		user.setUserId(userId);
		return user;
	}
	
}