package org.example.kafka_log.produce_consumer;

import lombok.extern.slf4j.Slf4j;
import org.example.kafka_log.common.Constants;
import org.example.kafka_log.component.KafkaProduce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka/")
@Slf4j
public class KafkaController {
    @Autowired
    private KafkaProduce kafkaProduce;

    @GetMapping("send")
    @ResponseBody
    public boolean send(@RequestParam String message) {
        kafkaProduce.sendMessage(Constants.TOPIC_NAME, message);
        return true;
    }
}
