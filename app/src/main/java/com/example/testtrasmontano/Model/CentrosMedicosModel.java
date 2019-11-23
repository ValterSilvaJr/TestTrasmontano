package com.example.testtrasmontano.Model;

import android.content.Context;

public class CentrosMedicosModel {
    private String localidade;
    private String endereco;
    private String numero;
    private String bairro;
    private String horaInicial;
    private String horaFinal;
    private Context context;

    public CentrosMedicosModel(String localidade, String endereco,
                               String numero, String bairro,
                               String horaInicial, String horaFinal, Context context) {
        this.localidade = localidade;
        this.endereco = endereco;
        this.numero = numero;
        this.bairro = bairro;
        this.horaInicial = horaInicial;
        this.horaFinal = horaFinal;
        this.context = context;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getHoraInicial() {
        return horaInicial;
    }

    public void setHoraInicial(String horaInicial) {
        this.horaInicial = horaInicial;
    }

    public String getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(String horaFinal) {
        this.horaFinal = horaFinal;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}