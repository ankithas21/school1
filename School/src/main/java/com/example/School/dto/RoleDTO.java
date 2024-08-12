package com.example.School.dto;

import com.example.School.models.User;


import java.util.Set;

public class RoleDTO {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RoleDTO(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public RoleDTO() {
    }

}
