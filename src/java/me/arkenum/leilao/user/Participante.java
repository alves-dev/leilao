package me.arkenum.leilao.user;

import me.arkenum.leilao.command.Command;

import javax.persistence.Entity;

@Entity(name = "PARTICIPANTE")
public class Participante extends User {
    public Participante() {
    }

    public Participante(String nome, String id, String senha) {
        super(nome, id, senha);
    }

    @Override
    public boolean canExecute(Command command) {
        return !command.isAdminOnly();
    }
}
