package net.ege;

import org.apache.kafka.clients.consumer.*;
import java.util.Collections;
import java.util.Properties;

public class StudentConsumer {
    public static void main(String[] args) {
        String topic = "students";

        Properties props = new Properties();
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        props.put(ConsumerConfig.GROUP_ID_CONFIG, "student-group");
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringDeserializer");
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, "net.ege.StudentDeserializer");
        props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");

        Consumer<String, Student> consumer = new KafkaConsumer<>(props);
        consumer.subscribe(Collections.singletonList(topic));

        System.out.println("Waiting for messages...");
        while (true) {
            ConsumerRecords<String, Student> records = consumer.poll(java.time.Duration.ofMillis(1000));
            for (ConsumerRecord<String, Student> record : records) {
                Student student = record.value();
                System.out.println("Received: " + student);
            }
        }
    }
}
