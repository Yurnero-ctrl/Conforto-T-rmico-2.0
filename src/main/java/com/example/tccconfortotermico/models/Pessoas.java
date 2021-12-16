package com.example.tccconfortotermico.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity

public class Pessoas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nome;
    String sexo;
    Integer idade;
    Float peso;
    Integer altura;
    String moradia;
    String andar;
    String sencacao;
    String preferencia;
    String ambiente;
    String movimentoAr;
    String estar;
    String parede;
    String janela;
    String roupa;
    String atividade;
    String anoPassado;
    String mesPassado;
    String mesmoPeriodo;
    String temperaturaWindows;
}
