package next;


import next.dto.RoleDto;

public interface RoleDao {
	//data access object
	
	RoleDto getRoleById(int id);
	boolean deleteById(int id) ;

}
