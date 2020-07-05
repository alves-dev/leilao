package me.arkenum.leilao.command;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Command {
    String getName();

    boolean isAdminOnly();

    String execute(HttpServletRequest rq, HttpServletResponse rs) throws ServletException;
}