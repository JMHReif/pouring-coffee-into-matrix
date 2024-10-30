package com.jmhreif.pouringcoffeeintomatrix;

import org.springframework.data.neo4j.core.schema.Id;

public record Category(@Id String name) {
}
