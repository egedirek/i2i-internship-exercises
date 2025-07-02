# Hello There! 👋

For today my task is: Please pull & run hazelcast and man-center conatiners in your local machine. 


## Steps:

## 1-  Open your local terminal and pull the Hazelcast and Managment Center services.


docker pull hazelcast/hazelcast:latest 

docker pull hazelcast/management-center:latest


![Screenshot_10](https://github.com/user-attachments/assets/3fffef01-b292-4302-aed4-eb06af61e24f)

## 2-  And then run the serviceses with two seperate local terminal for each.

for Managment Center (docker run --rm -p 8080:8080 hazelcast/management-center:latest)

![Screenshot_12](https://github.com/user-attachments/assets/afb69a28-dfae-4466-9c79-40bc55ed40b6)

for Hazelcast (docker run hazelcast/hazelcast:latest)

![Screenshot_13](https://github.com/user-attachments/assets/5ac44b8d-74f8-4a6b-ba17-8eadaef9b3d6)

## 3- If your setup is ready your Docker Desktop screen should be look like this

![Screenshot_10](https://github.com/user-attachments/assets/a1d81f37-0001-4414-b558-4b68145415cd)

## 4- Conclusion: I can manage to go Managment Center site and run for but my machine couldn't find the port path so my result screen is like this. As soon as possible I'll figure it out what is missing and update this repository.

![Screenshot_3](https://github.com/user-attachments/assets/386a4a57-2953-470e-8b21-1d75f4f57b1d)

