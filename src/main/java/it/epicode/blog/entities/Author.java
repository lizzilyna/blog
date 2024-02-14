package it.epicode.blog.entities;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Author {
    private Long id;
    private String nome;
    private String cognome;
    private String email;
    private LocalDate dataDiNascita;
    private byte avatar;
}
