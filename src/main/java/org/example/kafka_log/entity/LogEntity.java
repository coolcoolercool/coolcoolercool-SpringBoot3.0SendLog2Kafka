package org.example.kafka_log.entity;

import java.io.Serializable;

public class LogEntity implements Serializable {
    private String time;
    private String projectArtifactId;
    private String logLevel;
    private String content;

}
