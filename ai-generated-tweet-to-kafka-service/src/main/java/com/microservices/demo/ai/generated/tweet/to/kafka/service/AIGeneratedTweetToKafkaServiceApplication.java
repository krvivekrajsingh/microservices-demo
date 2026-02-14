package com.microservices.demo.ai.generated.tweet.to.kafka.service;


import com.microservices.demo.ai.generated.tweet.to.kafka.service.config.AIGeneratedTweetToKafkaServiceConfigData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@Slf4j
@SpringBootApplication
public class AIGeneratedTweetToKafkaServiceApplication implements CommandLineRunner {

    private final AIGeneratedTweetToKafkaServiceConfigData configData;

    public AIGeneratedTweetToKafkaServiceApplication(AIGeneratedTweetToKafkaServiceConfigData configData) {
        this.configData = configData;
    }


    public static void main(String[] args){
        SpringApplication.run(AIGeneratedTweetToKafkaServiceApplication.class,args);
    }


    @Override
    public void run(String... args) throws Exception {
       log.info("Application is Starting.....");
       log.info("Keywords {} ",configData.getStreamingDataKeywords());
    }
}
