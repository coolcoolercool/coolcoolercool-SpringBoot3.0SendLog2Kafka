package org.example.kafka_log.component;


import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class KafkaProduce {

    private final KafkaTemplate<String,String> kafkaTemplate;

    public KafkaProduce(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String topic, String msg) {
        log.info("sendMessage, topic:{}, msg: {}", topic, msg);
        kafkaTemplate.send(topic, msg);
        log.info("send msg success");
    }

}
