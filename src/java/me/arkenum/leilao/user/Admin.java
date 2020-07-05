package me.arkenum.leilao.user;

import me.arkenum.leilao.command.Command;

import javax.persistence.Entity;

@Entity(name = "ADMIN")
public class Admin extends User {

    @Override
    public boolean canExecute(Command command) {
        return true;
    }
}
