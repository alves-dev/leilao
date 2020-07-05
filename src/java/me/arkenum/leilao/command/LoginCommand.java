package me.arkenum.leilao.command;

import me.arkenum.leilao.Constants;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginCommand implements Command {
    @Override
    public String getName() {
        return "login";
    }

    @Override
    public boolean isAdminOnly() {
        return false;
    }

    @Override
    public String execute(HttpServletRequest rq, HttpServletResponse rs) throws ServletException {
        rq.setAttribute("leiloes", Constants.LEILOES);
        System.out.println(rq.getAttribute("leiloes"));
        return "dashboard.jsp";
    }
}
