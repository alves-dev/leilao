package me.arkenum.leilao;

import me.arkenum.leilao.data.Lance;
import me.arkenum.leilao.data.Leilao;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

public class Constants {
    public static final String PRODUCT_NAME = "product";
    public static final String BID_NAME = "big";
    public static final MessageDigest SHA256 = loadSHA();
    public static final String USER_NAME_PARAM_KEY = "user";
    public static final String USER_PASSWORD_PARAM_KEY = "password";
    public static final String MSG_PARAMETER_KEY = "msg";
    public static final Message ERROR_INVALID_USER_REGISTER = new Message((byte) 1, "Usuário inválido");
    public static final Message ERROR_INVALID_PASS_REGISTER = new Message((byte) 2, "Senha inválida");
    private static final Message[] ERROR_MESSAGES = new Message[]{
            ERROR_INVALID_USER_REGISTER,
            ERROR_INVALID_PASS_REGISTER
    };
    public static final String ERROR_PARAMETER_KEY = "error";
    public static final List<Leilao> LEILOES = ListUtil.listOf(
            new Leilao("item1", 10, false, ListUtil.listOf(
                    new Lance(30, "")
            )),
            new Leilao("item2", 10, true, ListUtil.listOf(
                    new Lance(30, "")
            )),
            new Leilao("item3", 10, false, ListUtil.listOf(
                    new Lance(30, "")
            ))
    );

    private static MessageDigest loadSHA() {
        try {
            return MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            //hmmm
        }
        return null;
    }

    public static String getErrorMsg(byte b) {
        for (Message message : ERROR_MESSAGES) {
            if (message.getId() == b) {
                return message.getMessage();
            }
        }
        return "Erro desconhecido";
    }
}
