package me.arkenum.leilao.user;

import me.arkenum.leilao.Constants;
import me.arkenum.leilao.command.Command;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public abstract class User {
    @Column(name = "password", nullable = false)
    private byte[] senha;
    @Column(name = "user_name", nullable = false)
    private String nome;

    @Id
    @Column(name = "user_id", nullable = false)
    private String id;

    public User() {
    }

    public User(String nome, String id, String senha) {
        this.nome = nome;
        this.id = id;
        this.senha = Constants.SHA256.digest(senha.getBytes());
    }

    public abstract boolean canExecute(Command command);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}