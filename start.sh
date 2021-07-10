#!/bin/bash
app_image="projeto/jsf"
app_name="app"
db_container="banco"
docker container stop ${app_name}
docker container rm ${app_name}
mvn clean package
docker image build -t ${app_image} .
docker container run -d -p 8080:8080 \
  --name ${app_name} --link ${db_container}:host-banco \
  ${app_image}  