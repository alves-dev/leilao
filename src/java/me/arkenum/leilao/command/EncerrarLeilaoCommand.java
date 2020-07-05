package me.arkenum.leilao.command;

import me.arkenum.leilao.data.Leilao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EncerrarLeilaoCommand implements Command {
    @Override
    public String getName() {
        return "encerrar";
    }

    @Override
    public boolean isAdminOnly() {
        return true;
    }

    @Override
    public String execute(HttpServletRequest rq, HttpServletResponse rs) throws ServletException {

        //Leilao le = (Leilao) rq.getSession().getAttribute("leilao");
        //le.fecharLeilao();

        return "encerrado.jsp";
    }

}