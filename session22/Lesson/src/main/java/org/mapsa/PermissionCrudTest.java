package org.mapsa;

import org.mapsa.entities.Permission;
import org.mapsa.service.PermissionService;

public class PermissionCrudTest {

    public static final String ADD_PERSON = "add person";
    public static final String EDIT_PERSON = "edit person";
    public static final String VIEW_PERSON = "view person";

    public static void main(String[] args) {

        PermissionService permissionService = new PermissionService(SessionFactoryProvider.getSessionFactory());

        Permission addPersonPermission = permissionService.findByName(ADD_PERSON);
        if (addPersonPermission == null) {
            addPersonPermission = new Permission(ADD_PERSON);
            permissionService.create(addPersonPermission);
        }

        Permission editPersonPermission = permissionService.findByName(EDIT_PERSON);
        if (editPersonPermission == null) {
            editPersonPermission = new Permission(EDIT_PERSON);
            permissionService.create(editPersonPermission);
        }

        Permission viewPersonPermission = permissionService.findByName(VIEW_PERSON);
        if (viewPersonPermission == null) {
            viewPersonPermission = new Permission(VIEW_PERSON);
            permissionService.create(viewPersonPermission);
        }



        System.out.println("=========== number of roles have add person permission: " + addPersonPermission.getRoles().size());
        System.out.println("=========== number of roles have edit person permission: " + editPersonPermission.getRoles().size());
        System.out.println("=========== number of roles have view person permission: " + viewPersonPermission.getRoles().size());


    }


}
