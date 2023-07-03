package org.mapsa.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id ;
    private String title;
    @ManyToMany(fetch = FetchType.EAGER, cascade = {
            CascadeType.DETACH ,
            CascadeType.MERGE ,
            CascadeType.PERSIST,
            CascadeType.REFRESH} )
    @JoinTable(name = "role_permission" ,
            joinColumns = @JoinColumn(name="role_id" ) ,
            inverseJoinColumns = @JoinColumn(name="permission_id")
    )
    private List<Permission> permissions = new ArrayList<>();

    public Role() {
    }

    public Role(String title) {
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }
}
