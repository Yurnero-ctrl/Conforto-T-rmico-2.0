package com.example.tccconfortotermico.services;


import com.example.tccconfortotermico.PessoasRepository.PessoasRepository;
import com.example.tccconfortotermico.models.Pessoas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoasService {

    PessoasRepository repository;

    @Autowired
    public void setRepository(PessoasRepository repository) {
        this.repository = repository;
    }
    public void save(Pessoas pessoas){
        repository.save(pessoas);
    }
}
