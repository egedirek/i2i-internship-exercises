# Hello there! 👋

In this homework my task was: Please create an account in one of Cloud Service Providers ( Google Cloud Platform – GCP or Amazon  – AWS ) and create a simple machine. And then, make ping test from your local machine to cloud machine.

## Steps:
1- Sign up for GCP ( Google Cloud Platform).  

2- Create a virtaul machine via GCP and start. 

3- Go to your local terminal and type " ping <your VM's external IP> "

4- Then press Enter now you should see in your terminal every packet that sent to your VM with their packet loss % and ping.

Note: For addition step 4 in this task I guide you for ping test your local machine to cloud machine but if you want full access to your commands you can use Google Cloud Shell ore SSH on GCP website you can add , "-c <x>" for how many packet you want it to send and  "-s <x>" for config byte size your packets, after "ping". For example if you want send 4 packages with 512 bytes you should type " ping -c 4 -s 512 <your IP>"


## Result Command Prompt Screen:

![Screenshot_1](https://github.com/user-attachments/assets/9e34fb02-7b00-496e-985c-bcb1d1a9eff5)
