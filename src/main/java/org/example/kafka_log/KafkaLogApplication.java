package org.example.kafka_log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaLogApplication {
	public static void main(String[] args) {
		SpringApplication.run(KafkaLogApplication.class, args);
	}

}
