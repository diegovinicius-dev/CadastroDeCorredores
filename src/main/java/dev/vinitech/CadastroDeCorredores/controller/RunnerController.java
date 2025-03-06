package dev.vinitech.CadastroDeCorredores.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/runners")
public class RunnerController {

    @GetMapping("/teste")
    public String testApi() {
        return "Corredor API está funcionando!";
    }

}
