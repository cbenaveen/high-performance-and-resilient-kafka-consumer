package org.cbenaveen.hpr.consumer;

import org.apache.kafka.clients.consumer.ConsumerConfig;

import java.util.Properties;

public class HPRKafkaConsumerApplication {
    public static void main(String[] args) {
        Properties properties = new Properties();

        // Configuration that tells the consumer fetch request will wait until min of
        // 10 bytes available to read from the server
        properties.put(ConsumerConfig.FETCH_MIN_BYTES_CONFIG, "10");

    }
}
