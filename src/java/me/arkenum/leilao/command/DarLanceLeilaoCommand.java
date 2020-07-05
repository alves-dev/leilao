package me.arkenum.leilao.command;

import me.arkenum.leilao.Constants;
import me.arkenum.leilao.data.Leilao;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DarLanceLeilaoCommand implements Command {

    @Override
    public String getName() {
        return "bid";
    }

    @Override
    public boolean isAdminOnly() {
        return false;
    }

    @Override
    public String execute(HttpServletRequest rq, HttpServletResponse rs) throws ServletException {
        float valor = Float.parseFloat(rq.getParameter(Constants.BID_NAME));

        Leilao le = (Leilao) rq.getSession().getAttribute(Constants.PRODUCT_NAME);
        /*if (!le.addLance(produto, valor)) {
            msg = "Lance não processado!";
            rq.setAttribute("erro", msg);
        }*/
        return "aberto.jsp";
    }

}