package com.metagxd.metashop.userservice.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;

import java.io.Serializable;
import java.sql.Date;

@Entity
@Getter
@Setter
@Table(name = "users")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false, length = 64)
    private String name;

    @Column(nullable = false, length = 64)
    private String secondName;

    @Column(length = 64)
    private String thirdName;

    private Date registered;

    @CreatedBy
    private String registeredBy;
}
