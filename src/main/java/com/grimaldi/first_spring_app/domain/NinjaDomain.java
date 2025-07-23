package com.grimaldi.first_spring_app.domain;

import jakarta.persistence.*;

//Essa anotação transforma uma classe em uma entidade do banco de dados
@Entity
@Table(name = "tb_cadastro")
public class NinjaDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String email;
    private int age;

    public NinjaDomain() {
    }

    public NinjaDomain(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
