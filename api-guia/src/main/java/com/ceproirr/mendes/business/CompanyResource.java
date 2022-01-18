package com.ceproirr.mendes.business;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/companys")
public class CompanyResource {

    private final CompanyRepository repository;
    public CompanyResource(CompanyRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Company> companys(){
        return repository.findAll();
    }

    // Rota de Retorno por Id
    @GetMapping("{id}")
    public ResponseEntity getOne(@PathVariable long id){
        Optional<Company> optional = repository.findById(id);
        if(optional.isPresent()){
            return ResponseEntity.ok().body(optional.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
