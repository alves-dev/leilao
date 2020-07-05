package me.arkenum.leilao;

public class Message {
    private final byte id;
    private final String message;

    public Message(byte id, String message) {
        this.id = id;
        this.message = message;
    }

    public byte getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", message='" + message + '\'' +
                '}';
    }
}
