package com.sistema.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
//essa classe o hibernate irá automaticamente se torna a tabela
@Entity
public class Cliente implements Serializable {
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idCli;

    private String nomeCli;
    private String sobrenomeCli;
    private String emailCli;
    private String senhaCli;
    private float foneCli;
    private String ruaCli;
    private String cepCli;
    private String bairroCli;
    private String numeroCli;
    private String sexo;
    private String cpfCli;
    private String nascimentoCli;
    private String EstadoCli;
    private String cidadeCli;

    public Cliente(int idCli, String nomeCli, String sobrenomeCli, String emailCli, String senhaCli, float foneCli, String ruaCli, String cepCli, String bairroCli, String numeroCli, String sexo, String cpfCli, String nascimentoCli, String estadoCli, String cidadeCli) {
        this.idCli = idCli;
        this.nomeCli = nomeCli;
        this.sobrenomeCli = sobrenomeCli;
        this.emailCli = emailCli;
        this.senhaCli = senhaCli;
        this.foneCli = foneCli;
        this.ruaCli = ruaCli;
        this.cepCli = cepCli;
        this.bairroCli = bairroCli;
        this.numeroCli = numeroCli;
        this.sexo = sexo;
        this.cpfCli = cpfCli;
        this.nascimentoCli = nascimentoCli;
        EstadoCli = estadoCli;
        this.cidadeCli = cidadeCli;
    }

    public int getIdCli() {
        return idCli;
    }

    public void setIdCli(int idCli) {
        this.idCli = idCli;
    }

    public String getNomeCli() {
        return nomeCli;
    }

    public void setNomeCli(String nomeCli) {
        this.nomeCli = nomeCli;
    }

    public String getSobrenomeCli() {
        return sobrenomeCli;
    }

    public void setSobrenomeCli(String sobrenomeCli) {
        this.sobrenomeCli = sobrenomeCli;
    }

    public String getEmailCli() {
        return emailCli;
    }

    public void setEmailCli(String emailCli) {
        this.emailCli = emailCli;
    }

    public String getSenhaCli() {
        return senhaCli;
    }

    public void setSenhaCli(String senhaCli) {
        this.senhaCli = senhaCli;
    }

    public float getFoneCli() {
        return foneCli;
    }

    public void setFoneCli(float foneCli) {
        this.foneCli = foneCli;
    }

    public String getRuaCli() {
        return ruaCli;
    }

    public void setRuaCli(String ruaCli) {
        this.ruaCli = ruaCli;
    }

    public String getCepCli() {
        return cepCli;
    }

    public void setCepCli(String cepCli) {
        this.cepCli = cepCli;
    }

    public String getBairroCli() {
        return bairroCli;
    }

    public void setBairroCli(String bairroCli) {
        this.bairroCli = bairroCli;
    }

    public String getNumeroCli() {
        return numeroCli;
    }

    public void setNumeroCli(String numeroCli) {
        this.numeroCli = numeroCli;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCpfCli() {
        return cpfCli;
    }

    public void setCpfCli(String cpfCli) {
        this.cpfCli = cpfCli;
    }

    public String getNascimentoCli() {
        return nascimentoCli;
    }

    public void setNascimentoCli(String nascimentoCli) {
        this.nascimentoCli = nascimentoCli;
    }

    public String getEstadoCli() {
        return EstadoCli;
    }

    public void setEstadoCli(String estadoCli) {
        EstadoCli = estadoCli;
    }

    public String getCidadeCli() {
        return cidadeCli;
    }

    public void setCidadeCli(String cidadeCli) {
        this.cidadeCli = cidadeCli;
    }
}