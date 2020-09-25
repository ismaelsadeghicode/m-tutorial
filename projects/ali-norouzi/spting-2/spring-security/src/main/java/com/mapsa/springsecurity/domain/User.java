package com.mapsa.springsecurity.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "User")
public class User {
    @Column
    private String username;
    @Column
    @JsonIgnore
    private String password;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}
