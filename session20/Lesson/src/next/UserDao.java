package next;

import next.dto.UserDto;

public interface UserDao {
	
	UserDto getUserById(int id); 
	UserDto getUserByEmail(String email);
	void saveUser(UserDto user);

}
