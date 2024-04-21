package edu.hari_k6.doubledb.mysql;

import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Profile("mysql")
public interface MysqlRepo extends JpaRepository<Model,String> {
}
