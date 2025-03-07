package dev.vinitech.CadastroDeCorredores.runner.repository;

import dev.vinitech.CadastroDeCorredores.runner.model.RunnerModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RunnerRepository extends JpaRepository<RunnerModel, Long> {
}
