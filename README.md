# pagcarne
Tarefa 5 FIAP - Grupo 1

# Rodar
Utilizar `docker run -d -p 8080:8080 gacrta/pagcarne:0.0.1-SNAPSHOT` para baixar a imagem docker e iniciá-la.

# Contribuir
1- Baixar esse repositório e fazer alterações necessárias
2- Preparar imagem com `mvn clean install`
3- Rodar webserver com `mvn spring-boot:run`
4- Preparar imagem docker com `mvn spring-boot:image-build`
5- Subir nova imagem docker com `docker push gacrta/pagcarne`
