package com.LDH.entity;

import javax.persistence.*;

@Entity
public class member {

    @Id
    @Column(name = "member_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String password;

    private String name;

    @Column(unique = true)
    private String email;

    private String role;

}
