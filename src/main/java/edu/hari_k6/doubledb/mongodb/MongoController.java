package edu.hari_k6.doubledb.mongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/mongo/model")
@Profile("mongo")
public class MongoController {
    @Autowired
    private MongoRepo mongoRepo;

    @GetMapping
    public List<MongoModel> getUsers() {
        return mongoRepo.findAll();
    }

    @GetMapping("/new")
    public MongoModel postUser() {
        int rand = new Random().nextInt();
        MongoModel model = new MongoModel();
        model.setName("mongo-user-"+rand);
        return mongoRepo.save(model);
    }
}
