package com.jmhreif.pouringcoffeeintomatrix;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/versions")
public class JavaVersionController {
    private final JavaVersionRepo javaVersionRepo;

    public JavaVersionController(JavaVersionRepo javaVersionRepo) {
        this.javaVersionRepo = javaVersionRepo;
    }

    @GetMapping
    Iterable<JavaVersion> findAll() {
        return javaVersionRepo.findAll();
    }

    @GetMapping("/subset")
    Iterable<JavaVersion> findSubset() {
        return javaVersionRepo.findJavaVersionsSubset();
    }

    @GetMapping("/projection")
    Iterable<JavaVersionProjection> findJavaVersionsProjection() {
        return javaVersionRepo.findJavaVersionsProjection();
    }
}
