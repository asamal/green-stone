package com.samal.greenstone.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.UUID;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Tree {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private UUID uuid;
    private String desc;
    @OneToMany
    private Collection<Note> notes = new HashSet<>();
}
