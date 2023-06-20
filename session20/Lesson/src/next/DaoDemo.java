package next;

import next.dto.UserDto;
import next.impl.MySqlJdbcUserDao;

public class DaoDemo {
	
	public static void main(String[] args) {
		
		UserDao userDao = new MySqlJdbcUserDao();
		UserDto user = userDao.getUserById(1);
		
		System.out.println(user);
		System.out.println(user.getRole().getRoleNmae());
		System.out.println(userDao.getUserByEmail(user.getEmail()));
		/*
		
		UserDto newUser = new UserDto();
		newUser.setFirstName("Evheniy");
		newUser.setLastName("Kachanov");
		newUser.setEmail("e.kachanov@email.com");
		newUser.setMoney(BigDecimal.valueOf(1000));
		
		userDao.saveUser(newUser);
		
		System.out.println(userDao.getUserByEmail("e.kachanov@email.com"));*/
		
		
		
	}

}
