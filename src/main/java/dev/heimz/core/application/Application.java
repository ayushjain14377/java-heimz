package dev.heimz.core.application;

import dev.heimz.core.role.Role;

import java.util.List;

public class Application {

    private String name;

    private List<Role> roles;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
