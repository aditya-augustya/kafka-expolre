package com.pwc.vm;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import javax.servlet.http.HttpServletRequest;


@RestController
@RequestMapping("/tour")
public class ControllerWare {

    @Autowired
    SpecService spec ;

    @GetMapping("/save")
    public ResponseEntity<?> saveBook(HttpServletRequest req) {
        spec.getMatters();
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }

}
