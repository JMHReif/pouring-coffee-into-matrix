package com.jmhreif.pouringcoffeeintomatrix;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;

public interface JavaVersionRepo extends Neo4jRepository<JavaVersion, String> {
    @Query("MATCH (j:JavaVersion)-[r:INCLUDES]->(f:Feature) " +
            "RETURN j, collect(r), collect(f);")
    Iterable<JavaVersionProjection> findAllJavaVersions();
}