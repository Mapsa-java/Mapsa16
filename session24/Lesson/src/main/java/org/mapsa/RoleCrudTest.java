package org.mapsa;

import org.mapsa.entities.Permission;
import org.mapsa.entities.Role;
import org.mapsa.service.PermissionService;
import org.mapsa.service.RoleService;

import static org.mapsa.PermissionCrudTest.*;

public class RoleCrudTest {


    public static void main(String[] args) {

        PermissionService permissionService = new  PermissionService(SessionFactoryProvider.getSessionFactory()) ;
        Permission addPersonPermission = permissionService.findByName(ADD_PERSON) ;
        Permission editPersonPermission = permissionService.findByName(EDIT_PERSON) ;
        Permission viewPersonPermission = permissionService.findByName(VIEW_PERSON) ;

        RoleService roleService = new  RoleService(SessionFactoryProvider.getSessionFactory()) ;

        Role adminRole = new Role("Admin") ;
        adminRole.getPermissions().add(addPersonPermission) ;
        adminRole.getPermissions().add(editPersonPermission) ;
        adminRole.getPermissions().add(viewPersonPermission) ;

        Role userRole = new Role("User") ;
        adminRole.getPermissions().add(viewPersonPermission) ;

        roleService.create(adminRole);
        roleService.create(userRole);


    }


}
