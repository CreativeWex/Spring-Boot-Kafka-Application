package com.bereznev.config;
/*
    =====================================
    @author Bereznev Nikita @CreativeWex
    =====================================
 */

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic testTopic() {
        return TopicBuilder.name("messageTopic")
                // .partitions() - Количество партиций, которое будет у топика
                .build();
    }
}
