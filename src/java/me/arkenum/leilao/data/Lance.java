package me.arkenum.leilao.data;

import javax.persistence.Embeddable;

@Embeddable
public class Lance {
    private float valor;
    private String id;

    public Lance() {
    }

    public Lance(float valor, String id) {
        this.valor = valor;
        this.id = id;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
