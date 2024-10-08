package com.fatecrl.contacorrente.model;

import java.io.Serializable;

//ctrl .
public class Conta implements Serializable{

    private long id;
    private Integer agencia;
    private String numero;
    private String titular;
    private Double saldo;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public Integer getAgencia() {
        return agencia;
    }
    public void setAgencia(Integer agencia) {
        this.agencia = agencia;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public Double getSaldo() {
        return saldo;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    


    public Conta() {
    }

    public Conta(Long id){
        this.id = id;
    }



    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Conta other = (Conta) obj;
        if (id != other.id)
            return false;
        return true;
    }

    

    
    
}
