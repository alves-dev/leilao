package me.arkenum.leilao;

import me.arkenum.leilao.command.Command;
import me.arkenum.leilao.command.Commands;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CommandController")
public class CommandController extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("Command Controller init!");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String op = request.getParameter("cmd");
        Command c = Commands.getCommand(op);
        if (c == null) {
            response.sendRedirect("/notfound.jsp");
            return;
        }
        String resultado = c.execute(request, response);
        response.sendRedirect(resultado);
    }
}
