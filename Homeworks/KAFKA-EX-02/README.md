# Hello There! 👋

For today my assignment is : Pull & run Kafka container from Docker Hub in your GCP or AWS cloud machine. (You can use confluent oﬀcial docker- repo ). For being more practical, you can run in your local machine first, and then, you can switch to cloud machine.

## Steps:

## 1-First in SSH terminal we update our terminal and tools then install Docker in our VM and create .yml file for install Kafka and ZooKeeper.

![kafka (1)](https://github.com/user-attachments/assets/97469574-ac82-475f-8f66-6e18a8794a38)


## 2- Then in the opened file-write terminal screen we bring up commands for installing  Kafka and ZooKeeper with configuration.

![kafka (5)](https://github.com/user-attachments/assets/a8e4eceb-c0da-467c-b290-396ffd601b26)


## 3- Checking Docker

![Screenshot_6](https://github.com/user-attachments/assets/a4d3f567-b762-49d8-9ee8-5bf69995aaf1)

## 4- For external access to Kafka we have to create a firewall rule for our VM.

![Screenshot_7](https://github.com/user-attachments/assets/c6ab3ccd-89fb-44aa-9063-4271bd4d35a4)

## 5- Lastly to launch our services; we use "sudo docker-compose up -d" command and finisihing our task with checking proccess status.

![Screenshot_9](https://github.com/user-attachments/assets/f55cf018-d4c4-4f3d-94bf-312e88d7ca55)
