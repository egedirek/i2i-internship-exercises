# Hello There! 👋

For today my assignement was : Create 2 sample java programs; one for Producer one for Consumer. Publish java objects ( you can use following class ) from Producer app. Read those objects from Consumer app and print them to the console.

## Steps 
 
## 1-First create a project folder in your IDE and use Maven for Kafka.


## 2-Create a folder include compose.yml file for attach our code to Kafka and Kafka to Docker Dektop with ZooKeeper.
![Screenshot_19](https://github.com/user-attachments/assets/274aa744-84ad-4507-bbd9-4f3d0dcd1ade)

## 3-Create classes for this project. And config pom.xml (Maven) file for Kafka install and run.


## 4- Create Kafka topic on your terminal and list for check.

![Screenshot_11](https://github.com/user-attachments/assets/ed36953e-e8e4-49c4-83af-b82a5720f9e8)

## 5- Lastly, for execute our project first run StudentConsumer class for connection to Kafka and listen new incoming messages; then run StudentProducer class for sent 'Student' object to Kafka.

![Screenshot_17](https://github.com/user-attachments/assets/2d0f1e6b-4336-4401-a5ab-42af5c1b04e5)
![Screenshot_18](https://github.com/user-attachments/assets/29bca6aa-679a-4f7c-8e5e-c75de5a09a1a)
![Screenshot_21](https://github.com/user-attachments/assets/344112ec-6fa6-4a79-9552-95d687ebf02d)

## 6- Conclusion: You should see these messages on order in your terminals. Our producer app successfully read and print our object.🎉🎉

* Waiting for messages..  // message in your StudentConsumer terminal
* Sent: Student{id=42, name='Ege'}  // message in your StudentProducer terminal
* Received: Student{id=42, name='Ege'}  // message in your StudentConsumer terminal

  
