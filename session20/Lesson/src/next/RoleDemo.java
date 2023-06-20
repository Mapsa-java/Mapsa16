package next;

import next.impl.MySqlJdbcRoleDao;

public class RoleDemo {

    public static void main(String[] args) {
        RoleDao rd = new MySqlJdbcRoleDao() ;
        var role= rd.getRoleById(4) ;
        System.out.println("role name of id 4 is  : " + role.getRoleNmae());

        System.out.println("delete id 4 result : " + rd.deleteById(5));
    }
}
