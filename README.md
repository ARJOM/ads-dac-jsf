# JSF

Este projeto está estruturado com os assuntos relacionados ao JSF.

[Repositório com as configurações do banco.](https://github.com/ARJOM/ads-dac-db)
### Compilando Código
```
mvn clean package
```

### Construindo Imagem
```
docker image build . -t projeto/jsf
```

### Criando Container
```
docker container run -p 8080:8080 -d --name app --link banco:host-banco projeto/jsf
```

### Iniciando container*
```
docker container start app
```


\* O passo de criação já executa na primeira vez, portanto só precisa iniciar o container após a segunda vez usando-o.


OBS: pode ser necessário executar os comandos acima com privilégios admnistrativos.


### Ou simplesmente execute o arquivo `start.sh`
```
sudo bash start.sh
```


**Aulas**

*[Aula 1 - Conceitos Básicos ](https://github.com/ifpb-disciplinas-2021-1/ads-dac-jsf/commit/)*