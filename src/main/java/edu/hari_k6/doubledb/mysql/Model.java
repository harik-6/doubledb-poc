package edu.hari_k6.doubledb.mysql;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Profile;

@Entity(name="app_builds")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Profile("mysql")
public class Model {
    @Id
    private String id;
    private String name;
}
