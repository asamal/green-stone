package com.samal.greenstone.user.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;
import java.util.UUID;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "gs_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private UUID uuid;
    private String name;
    private String email;

    public User(String firstName, String lastName) {
        this.name = firstName + " " + lastName;
    }

    @Override
    public String toString() {
        return "Use[id=%d, name='%s']".formatted(
                id, name);
    }
}

