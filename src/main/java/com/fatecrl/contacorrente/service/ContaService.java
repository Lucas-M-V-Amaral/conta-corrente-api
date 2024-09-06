package com.fatecrl.contacorrente.service;

import java.util.ArrayList;
import java.util.List;

import com.fatecrl.contacorrente.model.Conta;

public class ContaService {
    private static List<Conta> contas = new ArrayList<Conta>();
    
    public ContaService(){
        contaFake();
    }

    private void contaFake(){
        Conta conta = new Conta();
        conta.setAgencia(1234);
        conta.setId(1L);
        conta.setNumero("1234");
        conta.setSaldo(1000.00);
        conta.setTitular("Lucas Amaral");
        contas.add(conta);
    }

    public List<Conta> findAll(){
        return contas;
    }

    public Conta find(Conta conta){ // pesq por fora
        // Conta _conta = contas.stream().filter(c -> c.equals(conta)).findFirst().get();
        // return  _conta;
        // .orElse() ou .get()

        return contas.stream().filter(c -> c.equals(conta)).findFirst().get();
    }

    public Conta find(Long id){
        return find(new Conta(id));
    }

    public void create(Conta conta){
        //conta.setId(new Random().nextLong());
        Long newId = (long) (contas.size() + 1);
        conta.setId(newId);
        contas.add(conta);
    }

    public Boolean delete(Long id){
        // Conta _conta = this.find(id);
        // if (_conta != null){
        //     contas.remove(_conta);
        // }

        Conta _conta = this.find(id);
        if (_conta != null){
            contas.remove(_conta);
            return true;
        }
        return false;
    }

    public Boolean update(Conta conta){
        Conta _conta = find(conta);
        if(_conta != null){
            if (conta.getAgencia() != null && conta.getAgencia() > 0)
                _conta.setAgencia(conta.getAgencia());

            if (conta.getNumero().isBlank())
            _conta.setNumero(conta.getNumero());

            if (conta.getSaldo() != null && conta.getSaldo() > 0)
            _conta.setSaldo(conta.getSaldo());

            if (conta.getTitular().isBlank())
            _conta.setTitular(conta.getTitular());
        }
        return false;
    }

}
