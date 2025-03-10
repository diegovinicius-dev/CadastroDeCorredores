package dev.vinitech.CadastroDeCorredores.training.controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/treinos")
public class TrainingController {

    // GET -- Mandar uma requisição para mostrar os treinos
    @GetMapping("/listar")
    public String listarTreinos() {
        return "Treinos listados com sucesso";
    }

    // POST -- Mandar uma requisição para criar os treinos
    @PostMapping("/criar")
    public String criarTreino() {
        return "Treino criado com sucesso!";
    }

    // PUT -- Mandar uma requisição para alterar os treinos
    @PutMapping("/alterar")
    public String alterarTreino() {
        return "Treino alterado com sucesso";
    }

    // DELETE -- Mandar uma requisição para deletar os treinos
    @DeleteMapping("/deletar")
    public String deletarTreino() {
        return "Treino deletado com sucesso";
    }

}
