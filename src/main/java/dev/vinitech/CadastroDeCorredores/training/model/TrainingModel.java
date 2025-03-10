package dev.vinitech.CadastroDeCorredores.training.model;

import dev.vinitech.CadastroDeCorredores.runner.model.RunnerModel;
import jakarta.persistence.*;
import lombok.*;



@Entity
@Table(name = "tb_trainings")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TrainingModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_treino", nullable = false)
    private TrainingType trainingType;

    @ManyToOne
    @JoinColumn(name = "runner_id", nullable = false)
    private RunnerModel runner;

    public enum TrainingType {
        VELOCIDADE,
        FORCA_ESPECIFICA,
        LONGAO,
        RITMO,
        INTERVALADO
    }

}
