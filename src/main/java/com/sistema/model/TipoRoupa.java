package com.sistema.model;
import javax.persistence.*;
import java.io.Serializable;
@Entity
public class TipoRoupa implements Serializable{
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column
    private Long codTipoRoupa;
    private String descricao;

    public TipoRoupa(){

    }

    public TipoRoupa(Long codTipoRoupa, String descricao) {
        this.codTipoRoupa = codTipoRoupa;
        this.descricao = descricao;
    }

    public Long getCodTipoRoupa() {
        return codTipoRoupa;
    }

    public void setCodTipoRoupa(Long codTipoRoupa) {
        this.codTipoRoupa = codTipoRoupa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
