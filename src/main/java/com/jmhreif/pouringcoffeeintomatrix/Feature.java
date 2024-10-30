package com.jmhreif.pouringcoffeeintomatrix;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Relationship;

public record Feature(@Id String title,
                      @Relationship("BELONGS_TO") Category category) {
}
