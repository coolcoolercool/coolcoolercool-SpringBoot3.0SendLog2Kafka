package org.example.kafka_log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping
public class KafkaLogController {

    private Logger log = LoggerFactory.getLogger("KafkaLogController.class");

    @GetMapping
    public void testKafkaLog() {
        log.debug("debug log ------------------------");
        log.info("info log ------------------------");
        log.warn("warn log ------------------------");
        log.error("error log ------------------------");
    }
}
