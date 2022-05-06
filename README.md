# docker-mongo-springboot
springBootWothMongodbandDocker

  Steps & Commands

	 pull mongo image from docker hub docker pull mongo:latest
	 run mongo image docker run -d -p 27017:27017 --name javatechiemongodb mongo:latest
	 dockerize spring boot application docker build -t springboot-mongodb:1.0 .
	 run spring boot docker image and link that container to mongo container docker run -p 8080:8080 --name springboot-mongodb --link javatechiemongodb:mongo -d          springboot-mongodb:1.0
	 check docker running containers docker ps it should display two container ids
	 check logs of spring boot image docker logs springboot-mongodb
 
 
  Use Docker Compose
  
	 Kill running container:
	 docker rm <containerId>
  
  
  docker-compose.yml
  
	version: "3"
	services:
	  sanjaymongodb:
		image: mongo:latest
		container_name: "sanjaymongodb"
		ports:
		  - 27017:27017
		environment: 
		   MONGO_INITDB_ROOT_USERNAME: #your mongodb username
		   MONGO_INITDB_ROOT_PASSWORD: #your mongodb password
		   MONGO_INITDB: admin
		restart: always
		volumes:
		  - /home/data/db:/data/db
	  springboot-mongodb:
		image: springboot-mongodb:1.0
		container_name: springboot-mongodb
		ports:
		  - 8080:8080
		links:
		  - sanjaymongodb
