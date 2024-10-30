package com.jmhreif.pouringcoffeeintomatrix;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.time.LocalDate;
import java.util.List;

@Node
public record JavaVersion(@Id @Property("version") String javaVersion,
                          String name,
                          String codeName,
                          String status,
                          LocalDate gaDate,
                          LocalDate eolDate,
                          @Relationship("INCLUDES")List<Feature> features) {
}
