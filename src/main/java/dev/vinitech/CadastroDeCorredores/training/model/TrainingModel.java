package dev.vinitech.CadastroDeCorredores.training.model;

import dev.vinitech.CadastroDeCorredores.runner.model.RunnerModel;
import jakarta.persistence.*;
import lombok.*;
import java.time.Duration;
import java.time.LocalDate;

@Entity
@Table(name = "tb_trainings")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TrainingModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name = "data_treino")
    private LocalDate date;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, name = "tipo_treino")
    private TrainingType type; // TODO: Enum com tipos de treino(Longão, Ritmo, Intervalado, Aclive...)

    @Column(nullable = false, name = "distancia")
    private double distance; // em KM

    @Column(nullable = false, name = "duracao")
    private Duration duration;

    @Column(name = "pace")
    private double pace; // ritmo médio (min/km), TODO: criar formula depois

    @ManyToOne
    @JoinColumn(name = "runner_id", nullable = false) // Aqui cria a chave estrangeira
    private RunnerModel runner;

    @Enumerated(EnumType.STRING)
    private TrainingZone zone; // TODO: Criar classe zona de treinamento

}
