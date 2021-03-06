package com.sistema.model;
import javax.persistence.*;
import java.io.Serializable;

@Entity
public class RoupaUtensilios implements Serializable {
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codRoupaUtensilios;

    @Column
    private char tamanho;//deixar em char pois pode ser num ou palavra
    private float precoRoupaUtensilio;
    private String cor;

    public RoupaUtensilios(){

    }

    public RoupaUtensilios(Long codRoupaUtensilios, char tamanho, float precoRoupaUtensilio, String cor) {
        this.codRoupaUtensilios = codRoupaUtensilios;
        this.tamanho = tamanho;
        this.precoRoupaUtensilio = precoRoupaUtensilio;
        this.cor = cor;
    }

    public Long getCodRoupaUtensilios() {
        return codRoupaUtensilios;
    }

    public void setCodRoupaUtensilios(Long codRoupaUtensilios) {
        this.codRoupaUtensilios = codRoupaUtensilios;
    }

    public char getTamanho() {
        return tamanho;
    }

    public void setTamanho(char tamanho) {
        this.tamanho = tamanho;
    }

    public float getPrecoRoupaUtensilio() {
        return precoRoupaUtensilio;
    }

    public void setPrecoRoupaUtensilio(float precoRoupaUtensilio) {
        this.precoRoupaUtensilio = precoRoupaUtensilio;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
