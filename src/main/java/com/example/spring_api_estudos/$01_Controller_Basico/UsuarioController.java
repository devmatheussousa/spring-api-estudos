package com.example.spring_api_estudos.$01_Controller_Basico;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @GetMapping("mock")
    public String mock(){
        return "mock";
    }

    // Parâmetros de Requisição

    //1. @PathVariable - Variáveis no Caminho da URL

    //Variaveis
    @GetMapping("{id}")
    public String buscar(@PathVariable String id){
        return "buscar";
    }

    //Multiplas Variaveis
    @GetMapping("/usuario/{userId}/post/{idPost}")
    public String buscarPost(
            @PathVariable Long userId,
            @PathVariable Long idPost
    ){
        return "buscar";
    }

    // Nomear variável explicitamente:
    @GetMapping("/usuarios/{id}")
    public String buscar(@PathVariable("id") Long usuarioId){
        return "buscar";
    }

    //2. @RequestParam - Parâmetros de Query String

    @GetMapping("/get")
    public List<String> buscar(
            @RequestParam String nome,
            @RequestParam(required = false) Integer idade,
            @RequestParam(defaultValue = "0") int page
    ){
        return List.of("mock", "buscar");
    }


    //3. @RequestBody - Corpo da Requisição (JSON/XML)

    @PostMapping("/usuarios")
    public String criar(@Valid @RequestBody String name){
        return "criar";
    }

    //4. @RequestHeader - Cabeçalhos HTTP

    @GetMapping("/usuarios2")
    public String buscar2(
            @RequestHeader("Authrization") String token,
            @RequestHeader(value = "X-Custom-Header", required = false) String xCustomHeader
    ){
        return "buscar";
    }
}
