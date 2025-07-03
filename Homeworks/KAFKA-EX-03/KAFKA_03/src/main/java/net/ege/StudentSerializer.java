package net.ege;

import org.apache.kafka.common.serialization.Serializer;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.util.Map;

public class StudentSerializer implements Serializer<Student> {
    @Override
    public byte[] serialize(String topic, Student student) {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream out = new ObjectOutputStream(bos);
            out.writeObject(student); // serialize
            out.flush();
            return bos.toByteArray();
        } catch (Exception e) {
            throw new RuntimeException("Serialization failed", e);
        }
    }

    @Override
    public void close() {}
}
