package br.com.fiap.notepadsaaswe.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.fiap.notepadsaaswe.model.Nota;

public interface NotaRepository extends MongoRepository<Nota, String> {

}
