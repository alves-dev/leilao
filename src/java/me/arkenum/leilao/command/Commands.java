package me.arkenum.leilao.command;

public class Commands {
    public static final EncerrarLeilaoCommand ENCERRAR_LEILAO_COMMAND = new EncerrarLeilaoCommand();
    public static final RegisterCommand REGISTER_COMMAND = new RegisterCommand();
    public static final LoginCommand LOGIN_COMMAND = new LoginCommand();
    public static final Command[] KNOWN_COMMANDS = {
            ENCERRAR_LEILAO_COMMAND,
            REGISTER_COMMAND,
            LOGIN_COMMAND
    };

    public static <T extends Command> T getCommand(Class<T> type) {
        for (Command knownCommand : KNOWN_COMMANDS) {
            if (knownCommand.getClass().isAssignableFrom(type)) {
                return (T) knownCommand;
            }
        }
        return null;
    }

    public static Command getCommand(String op) {
        for (Command knownCommand : KNOWN_COMMANDS) {
            if (knownCommand.getName().equalsIgnoreCase(op)) {
                return knownCommand;
            }
        }
        return null;
    }
}
