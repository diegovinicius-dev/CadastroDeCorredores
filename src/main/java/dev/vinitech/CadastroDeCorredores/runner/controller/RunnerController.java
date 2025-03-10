package dev.vinitech.CadastroDeCorredores.runner.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/runners")
public class RunnerController {

    @GetMapping("/teste")
    public String testApi() {
        return "Runner API funcionando!";
    }

    // Adicionar Corredor (CREATE)
    @PostMapping("/criar")
    public String criarCorredor() {
        return "Corredor criado";
    }

    // Mostrar todos os corredores (READ)
    @GetMapping("/listar")
    public String mostrarTodosOsCorredores() {
        return "Mostrar corredores";
    }

    // Mostrar corredores por ID (READ)
    @GetMapping("/listarID")
    public String mostrarTodosOsCorredoresPorId() {
        return "Mostrar corredores por ID";
    }

    // Alterar dados dos corredores (UPDATE)
    @PutMapping("/alterarID")
    public String alterarCorredorPorId() {
        return "Alterar corredor por ID";
    }

    // Deletar Corredor (DELETE)
    @DeleteMapping("/deletarID")
    public String deletarCorredorPorId() {
        return "Corredor deletado por ID";
    }

}
