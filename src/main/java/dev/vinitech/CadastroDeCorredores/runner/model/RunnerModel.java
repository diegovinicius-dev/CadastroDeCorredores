package dev.vinitech.CadastroDeCorredores.runner.model;
import dev.vinitech.CadastroDeCorredores.training.model.TrainingModel;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_runners")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RunnerModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int age;

    @Column(nullable = false)
    private String gender; // TODO: Fazer um Enum genero

    private double weight; // Em quilogramas(kg)
    private double height; // Em centimetros(cm)

    private String category; // TODO: Fazer um Enum de categoria (amador, profissional, casual etc)
    private String team; // Equipe de corrida ou Individual

    @OneToMany(mappedBy = "runner", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<TrainingModel> trainings = new ArrayList<>();

}
