package br.com.cwi.reset.exemploreset;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NomeController {

    private static String nome = "Nome Qualquer";

    @GetMapping ("/nome")
    public String exibeNome (){
        return nome;
    }

    @PutMapping ("/nome/{novoNome}")
    public String alterarNome (@PathVariable String novoNome){
        this.nome = novoNome;
        return this.nome;
    }

    @DeleteMapping("/nome")
    public void deleteNome (){
        this. nome = null;

    }

}
