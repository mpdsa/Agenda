package com.trybe.acc.java;

import java.util.ArrayList;
import java.util.List;

/** Classe Agenda. */
public class Agenda {
  private List<String> contatos = new ArrayList<>();

  void incluirContato(String pessoa) {
    contatos.add(pessoa);
  }
  
  void excluirContato(String pessoa) {
    contatos.remove(pessoa);
  }
  
  boolean verificaContato(String pessoa) {
    return contatos.contains(pessoa);
  }
  
  int tamanhoAgenda() {
    return contatos.size();
  }
}
