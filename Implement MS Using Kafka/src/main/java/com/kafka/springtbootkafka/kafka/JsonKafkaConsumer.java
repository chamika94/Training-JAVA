package com.kafka.springtbootkafka.kafka;

import com.kafka.springtbootkafka.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaProducer.class);

    @KafkaListener(topics = "javaguied_json", groupId = "myGroup")
    public void Consumer(User user){
        LOGGER.info(String.format("Json Message received -> %s", user.toString()));
    }
}
