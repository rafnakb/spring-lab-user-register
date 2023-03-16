package br.unesp.rc.springtutorial.repositories;

import br.unesp.rc.springtutorial.models.Fisica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FisicaRepository extends JpaRepository<Fisica, Long> {
    Fisica findByCpf(String cpf);
}
