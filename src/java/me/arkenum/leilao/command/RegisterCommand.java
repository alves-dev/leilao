package me.arkenum.leilao.command;

import me.arkenum.leilao.Constants;
import me.arkenum.leilao.UserUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterCommand implements Command {
    @Override
    public String getName() {
        return "register";
    }

    @Override
    public boolean isAdminOnly() {
        return false;
    }

    private boolean isInvalid(String s) {
        return s == null || s.isEmpty();
    }

    @Override
    public String execute(HttpServletRequest rq, HttpServletResponse rs) throws ServletException {
        String user = rq.getParameter(Constants.USER_NAME_PARAM_KEY);
        String pw = rq.getParameter(Constants.USER_PASSWORD_PARAM_KEY);
        if (isInvalid(user)) {
            return "register.jsp?error=" + Constants.ERROR_INVALID_USER_REGISTER.getId();
        }
        if (isInvalid(pw)) {
            return "register.jsp?error=" + Constants.ERROR_INVALID_PASS_REGISTER.getId();
        }
        UserUtil.createNewUser(user, pw);
        return "index.jsp?msg=Registrado!";
    }
}
