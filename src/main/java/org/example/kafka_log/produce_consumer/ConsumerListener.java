package org.example.kafka_log.produce_consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**   
 * 消费者监听topic=kafka的消息
 */
@Component
@Slf4j
public class ConsumerListener {
    @KafkaListener(topics = "kafka")
    public void onMessage(String message){
        log.debug("开始消费消息: {}\n", message);
        log.debug("insert db success");
    }
}