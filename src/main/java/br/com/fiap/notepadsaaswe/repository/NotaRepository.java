package br.com.fiap.notepadsaaswe.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.fiap.notepadsaaswe.model.Nota;

import java.util.List;

public interface NotaRepository extends MongoRepository<Nota, String> {

    List<Nota> findByTitulo(String q);
}
