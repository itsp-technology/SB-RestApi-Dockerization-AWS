Runing This application on docker container using docker file 
Steps 
```
1 . Create AWS EC2 instance
2 . install Required software
    i. git -> for clone source code for github
    ii. maven -> for build the source code on VM (AWS EC2 machine )
   iii. docker -> for runing buidl and run docker file and image
```
Command to install these Software 
```
yum install git  ||  sudo yum install git
yum install maven || sudo yum install maven
yum install docker || sudo yum install docker
```

Command to build docker file 
```
(root user) ># docker build -t <tag_name_of_you_image>  
(normal user) >$ sudo docker build -t <tag_name_of_you_image>
```
Command to build multiple  docker file with name  
```
(root user) ># docker build -f <DockerFile_name> -t <tag_name_of_you_image>  
(normal user) >$ sudo docker build -f <DockerFile_name> -t <tag_name_of_you_image>
```

Run Docker image 
```
> docker run -p <host_port>:<container_running_port> <image_id> 
```

Run Docker image with detached mode 
```
> docker run -d -p <host_port>:<container_running_port> <image_id> 
```

Run java Maven project on docker  in interative mode
```
> docker run -it  <image_id> 
```
