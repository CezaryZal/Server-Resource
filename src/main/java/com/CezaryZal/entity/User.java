package com.CezaryZal.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "user")
@Data
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String loginName;
    private String password;
    private boolean active;
    private String roles;
    private String permissions;

    private Long userId;
}
