package dev.vinitech.CadastroDeCorredores.runner.repository;

import dev.vinitech.CadastroDeCorredores.runner.model.RunnerModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RunnerRepository extends JpaRepository<RunnerModel, Long> {
}
