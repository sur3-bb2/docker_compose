package com.example.rewrds.repo;

import com.example.rewrds.model.Reward;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RewardRepository extends MongoRepository<Reward, String> {

}
