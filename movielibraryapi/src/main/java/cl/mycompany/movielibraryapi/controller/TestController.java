package cl.mycompany.movielibraryapi.controller;

import cl.mycompany.movielibraryapi.entity.Test;
import cl.mycompany.movielibraryapi.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TestController {

    @Autowired
    private TestRepository testRepository;

    @GetMapping("/tests")
    public ResponseEntity<List<Test>> getTests(){
        List<Test> listTest = testRepository.findAll();

        if(listTest.isEmpty()){
            return new ResponseEntity<>(listTest, HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(listTest, HttpStatus.OK);
    }
}
