package com.jmhreif.pouringcoffeeintomatrix;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/versions")
@AllArgsConstructor
public class JavaVersionController {
    private final JavaVersionRepo javaVersionRepo;

    @GetMapping
    Iterable<JavaVersionProjection> findAllJavaVersions() { return javaVersionRepo.findAllJavaVersions(); }
}
