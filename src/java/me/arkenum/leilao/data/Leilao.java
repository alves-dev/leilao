package me.arkenum.leilao.data;

import java.util.ArrayList;

public class Leilao {
    private String descricaoProduto;
    private float lanceMinimo;
    private boolean fechado;
    private ArrayList<Lance> lances;
    private float valorLance;

    public Leilao() {
    }

    public Leilao(String descricaoProduto, float lanceMinimo, boolean fechado, ArrayList<Lance> lances) {
        this.descricaoProduto = descricaoProduto;
        this.lanceMinimo = lanceMinimo;
        this.fechado = fechado;
        this.lances = lances;
        this.valorLance = lanceMinimo + 10;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public float getLanceMinimo() {
        return lanceMinimo;
    }

    public boolean isFechado() {
        return fechado;
    }

    public void addLance(String id, float valorLance) {
        if (fechado) {
            return;
        }
        lances.add(new Lance(valorLance, id));
        valorLance += 10;
    }

    public ArrayList<Lance> getLances() {
        return lances;
    }

    public float getValorLance() {
        return valorLance;
    }
}
