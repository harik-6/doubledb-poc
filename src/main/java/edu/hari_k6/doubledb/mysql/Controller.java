package edu.hari_k6.doubledb.mysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/mysql/model")
@Profile("mysql")
public class Controller {

    @Autowired
    private MysqlRepo mysqlRepo;

    @GetMapping
    public List<Model> getUsers() {
        return mysqlRepo.findAll();
    }

    @GetMapping("/new")
    public Model postUser() {
        int rand = new Random().nextInt();
        Model model = new Model(Integer.toString(rand),"mysql-user-"+rand);
        return mysqlRepo.save(model);
    }

}
