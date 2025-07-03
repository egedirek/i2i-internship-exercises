package net.ege;

import org.apache.kafka.clients.producer.*;

import java.util.Properties;

public class StudentProducer {
    public static void main(String[] args) {
        String topic = "students";

        Properties props = new Properties();
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringSerializer");
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, "net.ege.StudentSerializer");

        Producer<String, Student> producer = new KafkaProducer<>(props);

        Student student = new Student(42, "Ege");

        ProducerRecord<String, Student> record = new ProducerRecord<>(topic, "key1", student);
        producer.send(record, (metadata, exception) -> {
            if (exception == null) {
                System.out.println("Sent: " + student);
            } else {
                exception.printStackTrace();
            }
        });

        producer.close();
    }
}
