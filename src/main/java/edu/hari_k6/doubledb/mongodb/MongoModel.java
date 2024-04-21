package edu.hari_k6.doubledb.mongodb;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("app_builds")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Profile("mongo")
public class MongoModel {
    @Id
    private String id;
    private String name;
}
