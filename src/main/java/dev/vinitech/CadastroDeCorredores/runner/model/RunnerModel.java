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

    @Column(unique = true)
    private String email;

    @Column(nullable = false, name = "idade")
    private int age;

    @Column(nullable = false, name = "genero")
    private String gender; // TODO: Fazer um Enum genero

    @OneToMany(mappedBy = "runner")
    private List<TrainingModel> trainings = new ArrayList<>();

}
