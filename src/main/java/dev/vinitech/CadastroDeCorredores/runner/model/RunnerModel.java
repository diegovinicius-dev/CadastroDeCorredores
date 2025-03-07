package dev.vinitech.CadastroDeCorredores.runner.model;
import dev.vinitech.CadastroDeCorredores.training.model.TrainingModel;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_runners")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RunnerModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name = "nome")
    private String name;

    @Column(unique = true, name = "e-mail")
    private String email;

    @Column(nullable = false, name = "idade")
    private int age;

    @Column(nullable = false, name = "genero")
    private String gender; // TODO: Fazer um Enum genero

    @Column(nullable = false, name = "peso_corporal")
    private double weight; // Em quilogramas(kg)

    @Column(nullable = false, name = "altura")
    private double height; // Em centimetros(cm)

    @Column(nullable = false, name = "categoria")
    private String category; // TODO: Fazer um Enum de categoria (amador, profissional, casual etc)

    @Column(nullable = false, name = "equipe")
    private String team; // Equipe de corrida ou Individual

    @OneToMany(mappedBy = "runner", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<TrainingModel> trainings = new ArrayList<>();

}
