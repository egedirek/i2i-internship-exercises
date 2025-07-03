package net.ege;

import org.apache.kafka.common.serialization.Deserializer;

import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;

public class StudentDeserializer implements Deserializer<Student> {
    @Override
    public Student deserialize(String topic, byte[] data) {
        try {
            ByteArrayInputStream bis = new ByteArrayInputStream(data);
            ObjectInputStream in = new ObjectInputStream(bis);
            return (Student) in.readObject(); // deserialize
        } catch (Exception e) {
            throw new RuntimeException("Deserialization failed", e);
        }
    }

    @Override
    public void close() {}
}
